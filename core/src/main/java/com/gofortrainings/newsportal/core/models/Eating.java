package com.gofortrainings.newsportal.core.models;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate = true, service = Eating.class)
@Designate(ocd = TigerConfig.class)
public class Eating {
	
	private static final Logger logger = LoggerFactory.getLogger(Eating.class);
	
	@Reference
	private Lion Lion;

	TigerConfig tigerConfig;
	@Activate
	//public void active() 
		//logger.info("Newsportal Bundles is activated from Lion....");
		//logger.info("This is Lion : " + Lion.feeding("meat"));
		
		public void active(TigerConfig tigerConfig) {
		logger.info("Tiger config value : " + tigerConfig.food());
	}
	
}