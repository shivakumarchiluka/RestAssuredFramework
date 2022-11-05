package com.truepush.qa.testcases;

import org.json.simple.JSONObject;


import org.testng.annotations.Test;

import com.truepush.qa.baseclass.Baseclass;

import io.restassured.http.Method;
import io.restassured.response.Response;

public class PostTrigger extends Baseclass {
	
	
	@SuppressWarnings("unchecked")
	@Test
	
	public void validateTriggerAPI() {
		
		
		validateApi();

	
	JSONObject parameters = new JSONObject();

	
	parameters.put("name", "trigger API of truepush");

	
	parameters.put("templateId", "635b967d6c60a81d6e8d270as");
	
	parameters.put("type", "repeated");
	
	parameters.put("note", "amazon multinational company");
	
	 parameters.put("timings","daily/repeated/multiple");
	 
	
	parameters.put("sub_type","daily");

	parameters.put("hours","17");

	parameters.put("minutes","20"); 

	
	
		httpsrequest.body(parameters.toJSONString());
		
	Response response = httpsrequest.request(Method.POST,"/createTrigger/");
	
String responsebody = 	response.getBody().asString();
	
	System.out.println("response body is:"+responsebody);
		
		
	}

}
