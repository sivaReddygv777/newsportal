package com.gofortrainings.newsportal.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class)
public class Topbar {

	@ValueMapValue
	private String text;

	public String getText() {
		return text;
	}
@ValueMapValue
private String Email1;

public String getEmail1() {
	return Email1;
}
@ValueMapValue
private String phonenumber;

public String getPhonenumber() {
	return phonenumber;
}

}
