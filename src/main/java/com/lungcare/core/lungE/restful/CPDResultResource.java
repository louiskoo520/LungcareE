package com.lungcare.core.lungE.restful;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.lungcare.core.lungE.model.CPDResult;
import com.lungcare.core.lungE.service.CPDResultService;
import com.lungcare.core.lungE.service.impl.CPDResultServiceImpl;



@Path("cpd")
public class CPDResultResource {

	
	@Path("/list")
	   @GET
		@Produces(MediaType.TEXT_PLAIN)
	   public String list()
	   {
		
		  return "hello world";
	   }
	
	   CPDResultService cpdResultService;
	   @GET
		@Path("get")
		@Produces(MediaType.APPLICATION_JSON)
		@Consumes(MediaType.APPLICATION_JSON)
	   public String getCPD()
	   {
		   cpdResultService = new CPDResultServiceImpl();
		   return cpdResultService.LoadCPDResult().toString();
	   }
	
}
