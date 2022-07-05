package com.vkt.group.ess.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class AccessTokenResponse {
	
	@JsonProperty(value="token")
	private String bearerToken;
}
