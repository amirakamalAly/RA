package driverApi;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ERA.base.Base;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class API_Driver_StartDay_Test extends Base{

	@Test(dataProvider = "access_token", priority = 1)
	
	public void startday(String Name,String MobileNumber,String RequestId,String JoborderId,String access_token) throws IOException {

		String driverBaseURL = (String) new driverApi.API_GetBaseURLTest().GetrdriverBaseUrl();
		String access_tokenn = (String) new driverApi.API_Driver_Login_Test().getAccess_token();
		String recoveryQrCode = (String) new driverApi.API_GetBaseURLTest().getrecoveryQrCode();
		String	odoMeterReading=(String) new driverApi.API_GetBaseURLTest().getodoMeterReading();
		System.out.print("start work of today access token "+ access_tokenn);
		
////////////////////////////////Get Request///////////////////////////////////	
		RestAssured.baseURI =driverBaseURL + "/api/v1/user";
		RestAssured.urlEncodingEnabled = false;
		RequestSpecification httpRequest = RestAssured.given();
		Response res = httpRequest
				.queryParam("access_token", access_tokenn)
				.queryParam("gx", "30.239421666666665")
				.queryParam("jobId", JoborderId)
				.queryParam("gy", "31.483515000000004")
				.queryParam("qrCode", recoveryQrCode)
				.queryParam("odoMeterReading", "33305")
				.get("/startworkfortheday");
////////////////////////////////Response ///////////////////////////////////
		String responsebody1 = res.getBody().asString();
		System.out.println("responsebody is  - " + responsebody1);
		
		System.out.println("/////////////////////////////////////////////////  - " + responsebody1);

		
	}
		
}
