package driverApi;

import java.io.IOException;
import org.testng.annotations.Test;

import com.ERA.base.Base;

import fleetAndAdmin.OpenAdminAndGetJobOrderIdRequestIDTest;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class API_Driver_GetUpdateLocationPickup_Test extends Base{

	@Test(dataProvider = "LocationdataProivderPickup", priority = 1)
	public void LocationdataProivder(String latitude,String longitude) throws IOException {

		String dispatureBaseURL = (String) new driverApi.API_GetBaseURLTest().centraldispatcherBaseUrl();
		//String access_token = (String) new driverApi.API_Driver_Login_Test(). driverLogin();
		String orderId =(String)new OpenAdminAndGetJobOrderIdRequestIDTest().getJoborderIdd();

System.out.println("pickup--------------------"+latitude);
System.out.println("pickup--------------------"+longitude);

////////////////////////////////Get Request///////////////////////////////////	

System.out.println("new job orderrrrrrrrrrrrrr"+orderId);

		RestAssured.baseURI =dispatureBaseURL + "/api/CommandCenter";
		RequestSpecification httpRequest = RestAssured.given();
		Response res = httpRequest
				.queryParam("internalToken", "secretToken")
				.queryParam("jobId", orderId)
				.queryParam("latitude", latitude)
				.queryParam("longtitude",longitude )
				
				.get("/UpdateRequestLiveLocation");
////////////////////////////////Response ///////////////////////////////////
		System.out.println("new job orderrrrrrrrrrrrrr pickup &&&&&&&&&&&&&&&&&&&&&&"+orderId);
		String responsebody1 = res.getBody().asString();
		System.out.println("responsebody is  - " + responsebody1);
		JsonPath path = new JsonPath(responsebody1);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
