package com.truepush.qa.testcases;

import org.testng.annotations.Test;


import com.truepush.qa.baseclass.Baseclass;

import io.restassured.http.Method;

public class CampaignstatsTest extends Baseclass{
	
	@Test
	
	public void validateCampaignStats() {
	
		validateApi();
      
     response =   httpsrequest.request(Method.GET,"/campaignStats/636242d635f4d3754abdee5b");
         
   String responsebody =    response.getBody().asString(); 

   System.out.println("response body is :"+responsebody);
   
	}
}
