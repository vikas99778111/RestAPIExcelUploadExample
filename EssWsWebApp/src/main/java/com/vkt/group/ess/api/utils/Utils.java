package com.vkt.group.ess.api.utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.http.HttpException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.HttpServerErrorException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rclgroup.dolphin.ess.api.exception.NotFoundException;
import com.rclgroup.dolphin.ess.api.model.EssJsonRequestMapper;
import com.rclgroup.dolphin.ess.api.service.EssDocApiServiceImpl;

public class Utils {
	private static final Logger log = LoggerFactory.getLogger(Utils.class);

	private static String dirBackupPath = PropertiesCache.getInstance().getProperty(Constants.BACKUP_PATH);

	private static String dirStatusPath = PropertiesCache.getInstance().getProperty(Constants.STATUS_PATH);

	private static EssDocApiServiceImpl essDocApiServiceImpl = new EssDocApiServiceImpl();
	
	public static boolean traverseFiles(File folder) throws Exception {
		boolean smoothlyTraverse = true;
		String token=null;
		try {
			token = essDocApiServiceImpl.getBearerToken();
		}catch (Exception e) {
			throw new NotFoundException("Token not Generated");
		}
		log.info("Token = "+token);
		for (final File file : folder.listFiles()) {
			log.info("*************************************************");
			if (!file.isDirectory()) 
			{
				try {
					FileReader fileReader = new FileReader(file);
					log.info(" file name = "+ file.getName() + " || totalSpace = "+ file.getTotalSpace());
					EssJsonRequestMapper elEssJsonRequestMapper = new EssJsonRequestMapper();
					StringBuffer uuid = new StringBuffer();
					if(file.getName().toLowerCase().contains(Constants.JSON)||file.getName().toLowerCase().contains(Constants.TXT)) 
					{
						elEssJsonRequestMapper = parseEssRequest(fileReader);
						uuid.append(essDocApiServiceImpl.postShipments(token, elEssJsonRequestMapper));
						log.info("UUID = "+ uuid);
						if(file.renameTo(new File(dirBackupPath + Constants.FORWARD_SLASH + file.getName())))
						{
							StringBuffer result = new StringBuffer();
							if(uuid.length() >= 0)
								result.append(uuid);
							else
								result.append(Constants.SERVER_ERROR);
							writeToStsFolder(result.toString(), file.getName());
							file.delete();
						}
						else
							file.delete();

					}
				}
				catch (IOException e) {
					log.error("Getting error while creating sts filename "+ file.getAbsolutePath() + " || " + e.getMessage());
					
					moveFile(file,Constants.NO_FILES);
					smoothlyTraverse = false;
					e.printStackTrace();
				}
				catch(HttpServerErrorException ne) {					
					log.error(ne.getMessage()+ ":- Please try with new refrence number!!");
					smoothlyTraverse = false;
						
				}catch (Exception e) {
					log.error(e.getMessage());
					e.printStackTrace();
					smoothlyTraverse = false;
				}
			}
		}
		return smoothlyTraverse;
	}

	public static void moveFile(File file, String updateRefNumber) throws IOException {
		if(file.renameTo(new File(dirBackupPath + Constants.FORWARD_SLASH + file.getName())))
		{
			writeToStsFolder(updateRefNumber, file.getName());
			file.delete();
		}
		else
			file.delete();
	}

	public static EssJsonRequestMapper parseEssRequest(final FileReader fileReader) throws JsonParseException, JsonMappingException, IOException {
		return new ObjectMapper().readValue(fileReader, EssJsonRequestMapper.class);
	}

	public static void writeToStsFolder(String content, String filename) throws IOException
	{
		Path path = Paths.get(dirStatusPath + Constants.FORWARD_SLASH + filename.substring(0, filename.lastIndexOf(Constants.DOT)) + Constants.STS);
		Files.write(path, content.getBytes());
	}
}
