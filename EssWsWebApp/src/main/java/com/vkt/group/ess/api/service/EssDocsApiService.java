package com.vkt.group.ess.api.service;

import com.rclgroup.dolphin.ess.api.model.EssJsonRequestMapper;

public interface EssDocsApiService {
	
	String getBearerToken();
	String postShipments(String token, EssJsonRequestMapper elEssJsonRequestMapper);
}
