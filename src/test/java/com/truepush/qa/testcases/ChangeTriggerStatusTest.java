package com.truepush.qa.testcases;

import org.testng.annotations.Test;

import com.truepush.qa.baseclass.Baseclass;

import org.json.simple.JSONObject;

import io.restassured.http.Method;
import io.restassured.response.Response;

public class ChangeTriggerStatusTest extends Baseclass {
	
	@SuppressWarnings("unchecked")
	@Test
	
	public void validateTriggerStatus() {
		
		validateApi();
	
		JSONObject parameters = new JSONObject();
		
		
		parameters.put("status", "active");

	//	parameters.put("status", "inactive");
		 
		
	
	
	
	
	Response response = httpsrequest.request(Method.PUT,"/triggerStatus/636210eb45cf213d8a9d7f1e");
	
String body = response.getBody().asString();
	
	System.out.println("response body is :"+body);
	
	
	}

}
