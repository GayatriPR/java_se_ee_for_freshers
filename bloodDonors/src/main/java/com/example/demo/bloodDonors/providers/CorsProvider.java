package com.example.demo.bloodDonors.providers;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;

public class CorsProvider implements ContainerResponseFilter {

	@Override
	public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)
			throws IOException {

		      requestContext.getHeaders().add("Access-Control-Allow-Origin", "*");
		      
		      requestContext.getHeaders().add("Access-Control-Allow-Methods", "GET,POST");
		      
		      responseContext.getHeaders().add("Access-Control-Allow-Credentials", "true");
		      
		      responseContext.getHeaders().add("Access-Control-Allow-Headers","origin, content-type, accept, authorization");
		      
		      
	}

}
