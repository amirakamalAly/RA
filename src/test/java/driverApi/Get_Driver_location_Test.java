package driverApi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import com.ERA.PageObject.GetRequestAndJobOrderID;
import com.ERA.base.Base;

import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.config.HttpClientConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get_Driver_location_Test extends Base {

	@Test(dataProvider = "LocationdataProivder", priority = 1)
	
	//https://admin.emiratesroadsideassistance.com/Requests/GetRequestCoordinates?jobId=653370

	//public void LocationdataProivder(String latitude, String longitude, String requesterTypeId,String latitude2, String longitude2, String requesterTypeId2) throws IOException {
		public void LocationdataProivder(String latitude, String longitude, String requesterTypeId) throws IOException {

		String driverBaseURL = (String) new driverApi.API_GetBaseURLTest().GetrdriverBaseUrl();
		String access_token = (String) new driverApi.API_Driver_Login_Test().getAccess_token();
		System.out.println("access_token" + access_token);
	//	String JoborderId = (String) new GetRequestAndJobOrderID(). getJobOrderId();
	String JoborderId = "363194";
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
		
		////////////////////////////////////////////
		
//		Map<String,String> req2 = new HashMap<>();
//		req2.put("jobId",JoborderId );
//		req2.put("gx", latitude2);
//		req2.put("gy",longitude2 );
//		req2.put("requesterTypeId", requesterTypeId2);
//		ArrayList<Object> reqlist2=new ArrayList<>();
//		reqlist2.add(0, req2);
		
//		Map<String, Object> testmap2 = new HashMap<>();
//		testmap2.put("access_token", access_token);
//		testmap2.put("data", reqlist2);
		/////////////////////
		Map<String, Object> testmap = new HashMap<>();
		testmap.put("access_token", access_token);
		testmap.put("data", aaa);
		
       System.out.println(testmap.toString());
       
   
		RestAssured.baseURI = driverBaseURL + "/api/v1/gps";
		Map<String, String> requestHeaders = new HashMap<>();
		requestHeaders.put("Content-Type", "application/json");
		requestHeaders.put("charset", "utf-8");
		RequestSpecification httpRequest = RestAssured.given().headers(requestHeaders);
		//.config(RestAssuredConfig.config() .httpClient(HttpClientConfig.httpClientConfig() .setParam("http.connection.timeout",50)));
	//	Response res = 
//		long MAX_TIMEOUT=50001;
//		try {
//			httpRequest.wait(MAX_TIMEOUT);
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//	
				httpRequest.body(testmap).post("/addgpslocationmultiple");
		
//		Response res2 = httpRequest.body(testmap2).post("/addgpslocationmultiple");
			//	ResponseSpecBuilder resBuilder = new ResponseSpecBuilder();
			//	long MAX_TIMEOUT=1001;
			//	httpRequest.wait(MAX_TIMEOUT);
			   //    RESBUILDER.EXPECTRESPONSETIME(MATCHERS.LESSTHAN(MAX_TIMEOUT));
//			       try {
//					resBuilder.wait(2);
//					resBuilder.expectResponseTime(Matchers.lessThan(MAX_TIMEOUT));
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//////////////////////////////////Response ///////////////////////////////////
//		String responsebody1 = res.getBody().asString();
//		String responsebody2 = res2.getBody().asString();
//		System.out.println("responsebody is  - " + responsebody1);
//		System.out.println("responsebody2 is  - " + responsebody2);
//	}
	}
}
