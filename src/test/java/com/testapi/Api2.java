package com.testapi;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Api2 {

	
	@Test
	
	void getweatherDetails(){
		
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
		
		RequestSpecification httpRequest =  RestAssured.given();
		
		Response response = httpRequest.request(Method.GET,"/Hyderabad");
		
		String str = response.getBody().asString();
		
		System.out.println(str);
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
