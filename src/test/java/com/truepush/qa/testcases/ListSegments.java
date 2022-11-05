package com.truepush.qa.testcases;

import org.testng.annotations.Test;

import com.truepush.qa.baseclass.Baseclass;


import io.restassured.http.Method;
import io.restassured.response.Response;

public class ListSegments extends Baseclass{

	
	@Test
	
	public void validatePostSegment() {
		
		validateApi();


	Response response = httpsrequest.request(Method.GET,"/listSegment/1");
	
String responsebody = response.getBody().asString();

System.out.println("response body is :"+responsebody);
		
		
	}
}
