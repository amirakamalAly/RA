package driverApi;

import java.io.IOException;
import org.testng.annotations.Test;

import com.ERA.base.Base;

import fleetAndAdmin.OpenAdminAndGetJobOrderIdRequestIDTest;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class API_Driver_GetUpdateLocationAssigned_Test extends Base{

	@Test(dataProvider = "LocationdataProivderassigned", priority = 1)
	public void LocationdataProivder(String latitude,String longitude) throws IOException {

		String dispatureBaseURL = (String) new driverApi.API_GetBaseURLTest().centraldispatcherBaseUrl();
		String orderId =(String)new OpenAdminAndGetJobOrderIdRequestIDTest().getJoborderIdd();
		System.out.println("passed job orderid value ==================="+orderId);

		//String access_token = (String) new driverApi.API_Driver_Login_Test(). driverLogin();
System.out.println("--------------------"+latitude);
System.out.println("--------------------"+longitude);

////////////////////////////////Get Request///////////////////////////////////	
		RestAssured.baseURI =dispatureBaseURL + "/api/CommandCenter";
		RequestSpecification httpRequest = RestAssured.given();
		Response res = httpRequest
				.queryParam("internalToken", "secretToken")
				.queryParam("jobId", orderId)
				.queryParam("longtitude", longitude)
				.queryParam("latitude", latitude)
				.get("/UpdateRequestLiveLocation");
////////////////////////////////Response ///////////////////////////////////
	
		String responsebody1 = res.getBody().asString();
		System.out.println("responsebody is  - " + responsebody1);
		JsonPath path = new JsonPath(responsebody1);

		
	}
}
