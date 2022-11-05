package com.truepush.qa.testcases;

import org.testng.annotations.Test;

import com.truepush.qa.baseclass.Baseclass;

import org.json.simple.JSONObject;

import io.restassured.http.Method;
import io.restassured.response.Response;

public class PostTemplate extends Baseclass {
	
	
	@SuppressWarnings("unchecked")
	@Test
	
	public void validateTemplateAPI() {
		
  validateApi();
  
JSONObject parameters = new JSONObject();

parameters.put("name", "amazon in india");
	
parameters.put("title","grab the deals");

parameters.put("message", "find out the products with low cost");

parameters.put("link", "https://amazon.com");



	httpsrequest.body(parameters.toJSONString());
	
	Response response = httpsrequest.request(Method.POST,"/createTemplate");
	
String responsebody = 	response.getBody().asString();
	
	System.out.println("response body is:"+responsebody);
	
		
		
	}
	
	
}
