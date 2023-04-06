package com.gofortrainings.newsportal.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Test {

	@ValueMapValue
	private String text;
	
	
	@ValueMapValue
	private String desc;


	public String getText() {
		return text;
	}


	public String getDesc() {
		return desc;
	}
	


}
