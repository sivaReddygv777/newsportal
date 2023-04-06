package com.gofortrainings.newsportal.core.servlets;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.jcr.Node;
import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.ModifiableValueMap;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ValueMap;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service = Servlet.class, immediate = true)
@SlingServletResourceTypes(resourceTypes = "newsportal/components/page",extensions = "json")
public class SecondClass extends SlingSafeMethodsServlet {
	
	private static final Logger log = LoggerFactory.getLogger(SecondClass.class);
	
	@Override
	protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
			throws ServletException, IOException {
		
		
		try {
			ResourceResolver resolver = request.getResourceResolver();
			
			
			
			Resource nodeRes = resolver.getResource("newsportal/components/page");
			
		//	List<Resource> childRes = (List<Resource>) nodeRes.listChildren();
			
			//for(Resource res : childRes){
				
			//}
			
			// JCR7
			Node infoNode = nodeRes.adaptTo(Node.class);
			infoNode.getProperties("name");					// useful to read the node properties
			infoNode.setProperty("testNode", "nodeval");	// useful to write the node properties
			
			
			//sling
			ValueMap infoVM = nodeRes.getValueMap();
			infoVM.get("name", String.class);
			
			ModifiableValueMap map = nodeRes.adaptTo(ModifiableValueMap.class);
			map.put("modifyVM", "This is a modify VM");
			nodeRes.getResourceResolver().commit();
			
			response.getWriter().write("From node : " + infoNode.getProperties("name").toString() + "from sling : " + infoVM.get("name", String.class));
		} catch (Exception e) {
			log.info("There is an error in NewsportalNodeRetrive : " + e.getMessage());
		}
		
		
		
		
		
	}

}