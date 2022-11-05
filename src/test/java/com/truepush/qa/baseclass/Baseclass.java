package com.truepush.qa.baseclass;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Baseclass {
	
	
	public static RequestSpecification httpsrequest ;
	
	public static Response response;
	
	public Logger log;
	
	@BeforeClass 
	
	public void setup() {
		
		log = LogManager.getLogger();
		
	}
	
	
	public  void validateApi() {
		
		RestAssured.baseURI = "https://app.truepush.com/api/v1";
		
	
		// creating request 

		httpsrequest = RestAssured.given();
		
		httpsrequest.header("Authorization","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjcmVhdGVk"
				+ "RGF0ZSI6MTY2Njk0NjU1OTE4NiwiaWQiOiI2MzViOTVmZTY0NTkxMTFkMzBjNjhiMmQiLCJ1c2VySWQiOiI2MzViOTU2MWJlM2"
				+ "I1ZTFkNTBlYTk0NmYiLCJpYXQiOjE2NjY5NDY1NTl9.JXZwo5jnpHDXnb7isbfufVpEifpJjyN4jDkvTQbzwws");
				
		
		httpsrequest.header("Content-Type","application/json");
		
		



	}

	
}
