package com.gofortrainings.newsportal.core.models;

import java.util.List;

import javax.annotation.PostConstruct;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model (adaptables=Resource.class, defaultInjectionStrategy=DefaultInjectionStrategy.OPTIONAL)
public class Prudhvi {
	final static Logger logger = LoggerFactory.getLogger(Prudhvi.class);
	
	@ValueMapValue
	private String text;
	
	@ValueMapValue
	private String desc;
	
	@ValueMapValue
	private String num;
	
	
	
	@ChildResource
	List<PridhviRaj> field;
	
	@OSGiService
	private TigerService tigerService;
	private String message;
	
	
	
	
	
	
	
	public String getMale() {
		return male;
	}

	public String getFemale() {
		return female;
	}
	@ValueMapValue
	private String  dropdown;
	
	@ValueMapValue
	private String  male;
	
	@ValueMapValue
	private String  female;
	

	public List<PridhviRaj> getField() {
		return field;
	}

	public String getText() {
		return text;
	}

	public String getDesc() {
		return desc;
	}

	public String getNum() {
		return num;
	}
	public String getDropdown() {
		return dropdown;
	}
	@PostConstruct
	public void init() {
		
	logger.info("desc");
	message=tigerService.food();
	
		
	}

	public String getMessage() {
		return message;
	}
	
}
