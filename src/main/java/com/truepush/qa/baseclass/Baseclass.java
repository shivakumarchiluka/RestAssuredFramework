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
				+ "RGF0ZSI6MTY2Nzc5NzM5NDE3NSwiaWQiOiI2MzY4OTE5MWVmNzg5M2MzMmQ5NzM0OTkiLCJ1c2VySWQiOiI2MzViOT"
				+ "U2MWJlM2I1ZTFkNTBlYTk0NmYiLCJpYXQiOjE2Njc3OTczOTR9.V987nDZKH93hNjqus_70bI6Ntr6xZ7xOLPP_VxIdFp8");
		
		
		
		httpsrequest.header("Content-Type","application/json");
		
		



	}

	
}
