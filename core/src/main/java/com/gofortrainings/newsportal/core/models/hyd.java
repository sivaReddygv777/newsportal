package com.gofortrainings.newsportal.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model (adaptables=Resource.class, defaultInjectionStrategy=DefaultInjectionStrategy.OPTIONAL)
public class hyd {
	

	public class Prudhvi {
		@ValueMapValue
		private String text;
		
		@ValueMapValue
		private String desc;
		
		@ValueMapValue
		private String num;
		
}
}