package com.truepush.qa.testcases;

import org.testng.annotations.Test;


import com.truepush.qa.baseclass.Baseclass;

import io.restassured.http.Method;

public class ListCampaigns extends Baseclass {

	
	@Test
	
	public  void validateListCampaigns(){
		
		
	validateApi();

		
	response =	httpsrequest.request(Method.GET,"/listCampaign/1");
	
	String responsebody = response.getBody().asString();

		
	System.out.println("response body is:"+responsebody);
	}
}
