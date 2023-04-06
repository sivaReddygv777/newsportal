package com.gofortrainings.newsportal.core.models;

import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables=Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Ram {
	
@ValueMapValue
private String text;

@ValueMapValue
private String desc;

@ValueMapValue
private int num;
@ChildResource
List<Student> field;


public List<Student> getField() {
	return field;
}

public String gettext() {
	return text;
}

public String getdesc() {
	return desc;
}

public int getnum() {
	return num;
}



}
