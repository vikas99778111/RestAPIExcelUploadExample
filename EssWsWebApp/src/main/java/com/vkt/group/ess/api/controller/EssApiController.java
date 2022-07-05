package com.rclgroup.dolphin.ess.api.controller;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rclgroup.dolphin.ess.api.model.EssJsonRequestMapper;
import com.rclgroup.dolphin.ess.api.service.EssDocsApiService;
import com.rclgroup.dolphin.ess.api.utils.Constants;

@RestController
@RequestMapping("/essRequest")
public class EssApiController {
	
	private static final Logger log = LoggerFactory.getLogger(EssApiController.class);
	
	@Autowired
	private EssDocsApiService essDocsApiService;

	@PostMapping("/importBolSWBFile")
	public ResponseEntity<String> uplaodFile(@RequestParam("file") final MultipartFile file){
		log.info(" file name = "+ file.getOriginalFilename() + " || size = "+ file.getSize());
		EssJsonRequestMapper elEssJsonRequestMapper = new EssJsonRequestMapper();
		String uuid = "";
		try {
			if(file.isEmpty()) 
				return new ResponseEntity<>(Constants.FILE_MUST_NOT_BE_EMPTY, HttpStatus.BAD_REQUEST); 
			else
			{
				elEssJsonRequestMapper = parseEssRequestJSON(file);
				log.info("json file data :: " + elEssJsonRequestMapper.toString());
				String token = essDocsApiService.getBearerToken();
				log.info("Token = "+token);
				uuid = essDocsApiService.postShipments(token, elEssJsonRequestMapper);
				log.info("UUID = "+ uuid);
			}
		} catch (IOException e) {
			e.printStackTrace();
			return new ResponseEntity<>(Constants.SERVER_ERROR, HttpStatus.INTERNAL_SERVER_ERROR);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(Constants.SERVER_ERROR, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(uuid, HttpStatus.OK); 
	}

	private EssJsonRequestMapper parseEssRequestJSON(final MultipartFile file) throws JsonParseException, JsonMappingException, IOException {
		return new ObjectMapper().readValue(file.getBytes(), EssJsonRequestMapper.class);
	}

	@GetMapping
	public String hello()
	{
		return "hello";
	}

}


