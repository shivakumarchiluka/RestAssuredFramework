package com.truepush.qa.testcases;

import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteTemplate {

	@Test
	
	public void validateDeleteTemplate( ) {
		
		RestAssured.baseURI = "https://app.truepush.com/api/v1";
		
	RequestSpecification httprequest =	RestAssured.given();
	
	
	httprequest.header("Content-Type","application/json");


	httprequest.header("Authorization","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjcmVhdGVkRGF0ZSI6MTY1MTg5NjgzNzU"
			+ "xNSwiaWQiOiI2MTk3MjhjNmVhMzRkY2EyMjUxN2YyYTgiLCJ1c2VySWQiOiI2MTkyMjkyZWQ3"
			+ "Y2ZhMWExY2ZmY2IxZjEiLCJpYXQiOjE2NTE4OTY4Mzd9.uDQas-m_Xd3EmKECT82jJ-l2YnoES6bXUa36wQ8cR5M");

	
	Response response = httprequest.request(Method.DELETE,"/deleteTemplate/627e019be3666953d65d4622");
	
	String responsebody = response.getBody().asString();
		
	System.out.println("response body is :"+responsebody);
	}
	
	
	
}
