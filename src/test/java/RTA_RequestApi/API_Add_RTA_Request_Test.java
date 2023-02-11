package RTA_RequestApi;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import com.ERA.base.Base;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class API_Add_RTA_Request_Test extends Base{

	@Test(dataProvider = "RTA_Account", priority = 1)

	public void Login(String Name, String MobileNumber, String ID,String InvalidID, String InvalidName) throws IOException {

		String Baseurl = (String) new driverApi.API_GetBaseURLTest().GetBaseUrl();
		//String access_token = (String) new driverApi.API_Driver_Login_Test(). driverLogin();
		String mobileNumwithCode = "+20" + MobileNumber;
		System.out.println("mobileNumwithCode is  - " + mobileNumwithCode);
		Map<String, String> sk3 = new HashMap<>();
		sk3.put("mobileNumber", mobileNumwithCode);
////////////////////////////////Get Request///////////////////////////////////	
		Map<String, String> requestHeaders = new HashMap<>();
		requestHeaders.put("Content-Type", "application/json");
		requestHeaders.put("charset", "utf-8");
		RestAssured.baseURI = Baseurl;
		RequestSpecification httpRequest = RestAssured.given().headers(requestHeaders);
		Response res = httpRequest.body(sk3).post("/api/userlogin/SignIn");
		
				
////////////////////////////////Response ///////////////////////////////////
	
		String responsebody1 = res.getBody().asString();
		
		res.getBody().jsonPath().prettyPrint();
	}


}
