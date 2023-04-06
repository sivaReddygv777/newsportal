package com.gofortrainings.newsportal.core.servlets;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;

@Component(service = Servlet.class, immediate = true)
@SlingServletResourceTypes(resourceTypes = "newsportal/components/page", extensions = "txt", methods = HttpConstants.METHOD_GET)
public class FirstServlet extends SlingAllMethodsServlet {

	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
			throws ServletException, IOException {
	
		response.getWriter().write("From the get: server name  is : " + request.getServerName() + "and server port is : " + request.getServerPort());
		
	}
	
	
	
	
	
}