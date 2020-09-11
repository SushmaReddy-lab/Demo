package restAssuredAutomationProject;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_002_POST_Request {
	@Test
	public void GET() {
		RestAssured.baseURI="https://reqres.in";
		RequestSpecification httprequest=RestAssured.given();
		JSONObject reqparms=new JSONObject();
		reqparms.put("name", "morpheus");
		reqparms.put("job", "leader");
		reqparms.put("id", "468");
		httprequest.body(reqparms.toJSONString());
		
		Response response=httprequest.request(Method.POST, "/api/users");
		System.out.println(response.getBody().toString());
		System.out.println(response.getStatusCode());
		
	}


}
