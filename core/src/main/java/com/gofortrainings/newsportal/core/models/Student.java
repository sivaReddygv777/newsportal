package com.gofortrainings.newsportal.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables=Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Student {

	@ValueMapValue
	private String media1;
	
	public String getMedia1() {
		return media1;
	}

	public String getNews1() {
		return news1;
	}

	public String getSocial1() {
		return social1;
	}

	@ValueMapValue
	private String news1;
	
	@ValueMapValue
	private String social1;
}
