package restAssuredAutomationProject;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_001_GET_Request {
	@Test
	
	void GET() {
		RestAssured.baseURI="https://reqres.in";
		RequestSpecification httprequest=RestAssured.given();
		Response response=httprequest.request(Method.GET, "/api/users?page=2");
		System.out.println(response.getBody().toString());
		System.out.println(response.getStatusCode());
		Headers allheaders=response.headers();
		for(Header header:allheaders) {
			System.out.println(header.getName()+"     "+ header.getValue());
		}
		
	}
}
