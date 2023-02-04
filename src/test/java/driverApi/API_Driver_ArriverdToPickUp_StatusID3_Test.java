package driverApi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import com.ERA.PageObject.GetRequestAndJobOrderID;
import com.ERA.base.Base;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class API_Driver_ArriverdToPickUp_StatusID3_Test extends Base{

	@Test(dataProvider = "arrivedTodestination", priority = 1)

	public void LocationdataProivder(String latitude, String longitude, String requesterTypeId) throws IOException {

		String driverBaseURL = (String) new driverApi.API_GetBaseURLTest().GetrdriverBaseUrl();
		String access_token = (String) new driverApi.API_Driver_Login_Test().getAccess_token();
		System.out.println("access_token" + access_token);
		String JoborderId = (String) new GetRequestAndJobOrderID(). getJobOrderId();
		//String JoborderId = "363108";
		System.out.println("--------------------" + latitude);
		System.out.println("--------------------" + longitude);
		System.out.println("--------------------" + requesterTypeId);
////////////////////////////////Pojo method ///////////////////////////////////	
		//Location ND = new Location();
//		ND.setAccess_token(access_token);
//		ND.setData(latitude, longitude, JoborderId, requesterTypeId);
//		Data locationcordinates = new Data();
//		locationcordinates.setGx(latitude);
//		locationcordinates.setGy(longitude);
//		locationcordinates.setJobId(JoborderId);
//		locationcordinates.setRequesterTypeId(requesterTypeId);
	//	System.out.println(ND.toString());
		

		
////////////////////////////////hash map method ///////////////////////////////////		
	
		
		Map<String,String> sk = new HashMap<>();
		sk.put("jobId",JoborderId );
		sk.put("gx", latitude);
		sk.put("gy",longitude );
		sk.put("requesterTypeId", requesterTypeId);
		ArrayList<Object> aaa=new ArrayList<>();
		aaa.add(0, sk);
		
		
		Map<String, Object> testmap = new HashMap<>();
		testmap.put("access_token", access_token);
		testmap.put("data", aaa);
		
       System.out.println(testmap.toString());
       
		RestAssured.baseURI = driverBaseURL + "/api/v1/gps";
		Map<String, String> requestHeaders = new HashMap<>();
		requestHeaders.put("Content-Type", "application/json");
		requestHeaders.put("charset", "utf-8");
		RequestSpecification httpRequest = RestAssured.given().headers(requestHeaders);
		Response res = httpRequest.body(testmap).post("/addgpslocationmultiple");
////////////////////////////////Response ///////////////////////////////////
		String responsebody1 = res.getBody().asString();
		System.out.println("responsebody is  - " + responsebody1);
		
	}
}
