package com.vkt.group.ess.api.controller;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.rclgroup.dolphin.ess.api.exception.NotFoundException;
import com.rclgroup.dolphin.ess.api.utils.Constants;
import com.rclgroup.dolphin.ess.api.utils.PropertiesCache;
import com.rclgroup.dolphin.ess.api.utils.Utils;

@Component
public class EssDocs {

	private static final Logger log = LoggerFactory.getLogger(EssDocs.class);

	private static String dirReadPath = PropertiesCache.getInstance().getProperty(Constants.READ_PATH);

	public static void main(String[] args) {
		try {
			log.info("AllPropertyNames :"+PropertiesCache.getInstance().getAllPropertyNames());
			final File folder = new File(dirReadPath);
			log.info("Directory path for picking up json files"+dirReadPath);
			if(Utils.traverseFiles(folder))
				log.info(Constants.SUCCEEDED);
			else
				log.info("Partially completed");
		}
		catch (NotFoundException e) {
			log.info(Constants.CARGO_API_NOT_REACHABLE);
			//e.printStackTrace();
		}
		catch (NullPointerException e) {
			log.info(Constants.NO_FILES);
			//e.printStackTrace();
		}
		
		catch (Exception e) {
			log.info(Constants.PARTIALLY_COMPLETED);
			//e.printStackTrace();
		}
	}

	
}
