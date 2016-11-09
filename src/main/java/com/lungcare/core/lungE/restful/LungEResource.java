package com.lungcare.core.lungE.restful;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



@Path("lung")
public class LungEResource {

	
	@Path("/list")
	   @GET
		@Produces(MediaType.TEXT_PLAIN)
	   public String list()
	   {
		return "hello world";
	   }
}
