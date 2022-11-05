package com.truepush.qa.testcases;

import org.testng.annotations.Test;

import com.truepush.qa.baseclass.Baseclass;

import org.json.simple.JSONObject;


import io.restassured.http.Method;
import io.restassured.response.Response;

public class Postcampaign extends Baseclass{

	@SuppressWarnings("unchecked")
	@Test
	
	public void validatePostCampaignAPI() {
		
	
      validateApi();
	//request pay load along with the post request
	
	JSONObject parameters = new JSONObject();
	
	parameters.put("title","BookMyShow");
	
	parameters.put("message", "BookMyShow offers showtimes, movie tickets, reviews and trailers");
	
	parameters.put("link","https://in.bookmyshow.com/");
	
	parameters.put("image", "http://commondatastorage.googleapis.com/codeskulptor-demos/riceracer_assets/img/tree_3.png");
	
	parameters.put("icon", "http://commondatastorage.googleapis.com/codeskulptor-assets/lathrop/asteroid_blue.png");
	

	 // parameters.put("scheduled", "false"); 

//	parameters.put("campaignExpiryTime", 20);
	

  httpsrequest.body(parameters.toJSONString()); // it will attach parameters data to the request
	
  Response response = httpsrequest.request(Method.POST,"/createCampaign");
  
	//print response
	
String responsebody = response.getBody().asString();

System.out.println("response body = :"+responsebody);


//validate status code

int status_code = response.getStatusCode();

System.out.println("status code is:"+status_code);



// validate status line


String statusline = response.getStatusLine();

System.out.println("status line is:"+statusline);


// validate Json data

String resdata = response.jsonPath().get("data");

System.out.println(resdata);

/* //basic authentication
 * 
 PreemptiveBasicAuthScheme auth = new PreemptiveBasicAuthScheme();
 
 auth.setusername("");
 auth.setpassword("");
RestAsssured.authentication = auth;

 response.getTime();
 
//getting all the headers of a request

Headers Allheaders = response.headers();

for(Header header:Allheaders) 
{
	
System.out.println(header.getName()+"    "+header.getValue());
}

//getting json response for individual parameter
 * 
JsonPath json =  response.jsonPath();

System.out.println(json.get(""));


Assert.assertEquals(json.get(""), "");  */

}
	
	
}
//C:\Users\Admin\AppData\Local\Android\Sdk

//set autocommit = 0;
//rollback

//SET SQL_SAFE_UPDATES = 0;

