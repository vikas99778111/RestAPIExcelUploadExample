package com.vkt.group.ess.api.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.support.BasicAuthorizationInterceptor;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import com.rclgroup.dolphin.ess.api.model.EssJsonRequestMapper;
import com.rclgroup.dolphin.ess.api.model.TokenResponse;
import com.rclgroup.dolphin.ess.api.utils.PropertiesCache;

@Service
public class EssDocApiServiceImpl implements EssDocsApiService {
	private static final Logger log = LoggerFactory.getLogger(EssDocApiServiceImpl.class);
	
	private RestTemplate restTemplate= new RestTemplate();
	 
	//@Value("${essDocs.api.token.username}")
	private String userName = PropertiesCache.getInstance().getProperty("essDocs.api.token.username");

	//@Value("${essDocs.api.token.password}")
	private String password = PropertiesCache.getInstance().getProperty("essDocs.api.token.password");

	//@Value("${essDocs.api.token.endpoint}")
	private String tokenUrl = PropertiesCache.getInstance().getProperty("essDocs.api.token.endpoint");

	//@Value("${essDocs.api.shipment.endpoint}")
	private String shipmentUrl = PropertiesCache.getInstance().getProperty("essDocs.api.shipment.endpoint");

	@Override
	public String getBearerToken() {
		//This line newly added 
	    restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter()); 
	   
		restTemplate.getInterceptors().add(new
				BasicAuthorizationInterceptor(userName, password)); 
		ResponseEntity<TokenResponse> response = this.restTemplate.exchange(tokenUrl,
				HttpMethod.GET, null, TokenResponse.class);
		return response.getBody().getToken();
	}

	@Override
	public String postShipments(final String accessToken, final EssJsonRequestMapper essJsonRequestMapper)throws HttpServerErrorException {
		HttpHeaders headers = new HttpHeaders();
		String response =null;
		
		  RestTemplate restTemplate1 = new RestTemplate();
		  restTemplate1.getMessageConverters().add(new
		  MappingJackson2HttpMessageConverter());
		 
		headers.add("Authorization", "Bearer "+accessToken);
		headers.add("Content-Type", MediaType.APPLICATION_JSON.toString());
		//headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		
		//headers.setContentType(MediaType.APPLICATION_JSON);
			
			HttpEntity<String> entity = new HttpEntity<String>(essJsonRequestMapper.toString(), headers);
			log.info(" Shipment API Request entity = " + entity.toString());
			String url = shipmentUrl.replace("##IMPORT_REF##", essJsonRequestMapper != null ? essJsonRequestMapper.getShipmentReference()
					: "");
			response =restTemplate1.postForObject(url, entity, String.class); 
			//response = this.restTemplate.exchange(url, HttpMethod.POST, entity, String.class);
			log.info(" Shipment API response = " + response);
		
		return response != null ? response.toString() : "";
	}

}
