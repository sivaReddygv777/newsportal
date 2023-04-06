package com.gofortrainings.newsportal.core.service;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Component(immediate=true, service=PrudhviService.class)
public class PrudhviService {
	
	private static final Logger logger = LoggerFactory.getLogger(PrudhviService.class);
	
	@Activate
	public void active() {
		logger.info("Newsportal Bundles is activated....");
	}
	
	@Modified
	public void modify() {
		logger.info("Newsportal Bundles is modified....");
	}
	
	@Deactivate
	public void deActivate() {
		logger.info("Newsportal Bundles is deactivated....");
	}
	
	public String feeding(String foodType) {
		logger.info("Animal is eatting " + foodType);
		return "Animal is eatting " + foodType;
	}
}
