package com.gofortrainings.newsportal.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
//import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables=Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class PridhviRaj {
	@ValueMapValue
	private String media;
	
	@ValueMapValue
	private String news;
	
	@ValueMapValue
	private String social;
	

	public String getMedia() {
		return media;
	}

	public String getNews() {
		return news;
	}

	public String getSocial() {
		return social;
	}

	
	

}
