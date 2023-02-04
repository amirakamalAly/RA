package driverApi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import com.ERA.PageObject.GetRequestAndJobOrderID;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get_Driver_location3_Test {
//	public String JoborderId = (String) new GetRequestAndJobOrderID(). getJobOrderId();
//	public String access_token =  (String) new driverApi.API_Driver_Login_Test().getAccess_token();

	@Test(priority = 1)
	public void LocationdataProivder() throws IOException {
		String driverBaseURL = (String) new driverApi.API_GetBaseURLTest().GetrdriverBaseUrl();
		String access_token = (String) new driverApi.API_Driver_Login_Test().getAccess_token();
		String JoborderId = (String) new GetRequestAndJobOrderID().getJobOrderId();
		Map<String, String> sk1 = new HashMap<>();
		sk1.put("jobId", JoborderId);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sk1.put("gx", "25.025740697731305");
		sk1.put("gy", "55.56016804103745");
		sk1.put("requesterTypeId", "6");
		ArrayList<Object> aaa = new ArrayList<>();
		aaa.add(0, sk1);
		////////////////////////////////////////////
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
		////////////////////////////// Response ///////////////////////////////////
		String responsebody1 = res.getBody().asString();
		System.out.println("responsebody is  - " + responsebody1);

	}

	@Test(priority = 2)

	public void LocationdataProivder2() throws IOException {
		String driverBaseURL = (String) new driverApi.API_GetBaseURLTest().GetrdriverBaseUrl();
		String access_token = (String) new driverApi.API_Driver_Login_Test().getAccess_token();
		String JoborderId = (String) new GetRequestAndJobOrderID().getJobOrderId();
		try {
			Thread.sleep(25000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Map<String, String> sk2 = new HashMap<>();
		sk2.put("jobId", JoborderId);
		sk2.put("gx", "25.02502129800271");
		sk2.put("gy", "55.558703555015455");
		sk2.put("requesterTypeId", "6");
		ArrayList<Object> aaa2 = new ArrayList<>();
		aaa2.add(0, sk2);
		Map<String, Object> testmap = new HashMap<>();
		testmap.put("access_token", access_token);
		testmap.put("data", aaa2);
		System.out.println(testmap.toString());
		RestAssured.baseURI = driverBaseURL + "/api/v1/gps";
		Map<String, String> requestHeaders = new HashMap<>();
		requestHeaders.put("Content-Type", "application/json");
		requestHeaders.put("charset", "utf-8");
		RequestSpecification httpRequest = RestAssured.given().headers(requestHeaders);

		Response res = httpRequest.body(testmap).post("/addgpslocationmultiple");
//////////////////////////////Response ///////////////////////////////////
		String responsebody1 = res.getBody().asString();

//	String responsebody2 = res2.getBody().asString();
		System.out.println("responsebody is  - " + responsebody1);
//	System.out.println("responsebody2 is  - " + responsebody2);
//}
	}

	@Test(priority = 3)

	public void LocationdataProivder3() throws IOException {
		String driverBaseURL = (String) new driverApi.API_GetBaseURLTest().GetrdriverBaseUrl();
		String access_token = (String) new driverApi.API_Driver_Login_Test().getAccess_token();
		String JoborderId = (String) new GetRequestAndJobOrderID().getJobOrderId();
		try {
			Thread.sleep(40000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Map<String, String> sk3 = new HashMap<>();
		sk3.put("jobId", JoborderId);
		sk3.put("gx", "25.024241133385512");
		sk3.put("gy", "55.557233704493626	");
		sk3.put("requesterTypeId", "6");
		ArrayList<Object> aaa3 = new ArrayList<>();
		aaa3.add(0, sk3);
		////////////////////////////////////////////
		Map<String, Object> testmap = new HashMap<>();
		testmap.put("access_token", access_token);
		testmap.put("data", aaa3);
		System.out.println(testmap.toString());
		RestAssured.baseURI = driverBaseURL + "/api/v1/gps";
		Map<String, String> requestHeaders = new HashMap<>();
		requestHeaders.put("Content-Type", "application/json");
		requestHeaders.put("charset", "utf-8");
		RequestSpecification httpRequest = RestAssured.given().headers(requestHeaders);

		Response res = httpRequest.body(testmap).post("/addgpslocationmultiple");
//////////////////////////////Response ///////////////////////////////////
		String responsebody1 = res.getBody().asString();

//	String responsebody2 = res2.getBody().asString();
		System.out.println("responsebody is  - " + responsebody1);
//	System.out.println("responsebody2 is  - " + responsebody2);
//}
	}

	@Test(priority = 4)

	public void LocationdataProivder4() throws IOException {
		String driverBaseURL = (String) new driverApi.API_GetBaseURLTest().GetrdriverBaseUrl();
		String access_token = (String) new driverApi.API_Driver_Login_Test().getAccess_token();
		String JoborderId = (String) new GetRequestAndJobOrderID().getJobOrderId();
		try {
			Thread.sleep(55000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Map<String, String> sk4 = new HashMap<>();
		sk4.put("jobId", JoborderId);
		sk4.put("gx", "25.02368456431458");
		sk4.put("gy", "55.556252015968646");
		sk4.put("requesterTypeId", "6");
		ArrayList<Object> aaa4 = new ArrayList<>();
		aaa4.add(0, sk4);
////////////////////////////////////////////
		Map<String, Object> testmap = new HashMap<>();
		testmap.put("access_token", access_token);
		testmap.put("data", aaa4);
		System.out.println(testmap.toString());
		RestAssured.baseURI = driverBaseURL + "/api/v1/gps";
		Map<String, String> requestHeaders = new HashMap<>();
		requestHeaders.put("Content-Type", "application/json");
		requestHeaders.put("charset", "utf-8");
		RequestSpecification httpRequest = RestAssured.given().headers(requestHeaders);
		Response res = httpRequest.body(testmap).post("/addgpslocationmultiple");
//////////////////////////////Response ///////////////////////////////////
		String responsebody1 = res.getBody().asString();

//String responsebody2 = res2.getBody().asString();
		System.out.println("responsebody is  - " + responsebody1);
//System.out.println("responsebody2 is  - " + responsebody2);
//}
	}

	@Test(priority = 5)
	public void LocationdataProivder5() throws IOException {
		String driverBaseURL = (String) new driverApi.API_GetBaseURLTest().GetrdriverBaseUrl();
		String access_token = (String) new driverApi.API_Driver_Login_Test().getAccess_token();
		String JoborderId = (String) new GetRequestAndJobOrderID().getJobOrderId();

		try {
			Thread.sleep(70000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Map<String, String> sk5 = new HashMap<>();
		sk5.put("jobId", JoborderId);
		sk5.put("gx", "25.02322521064671");
		sk5.put("gy", "55.55535615814671");
		sk5.put("requesterTypeId", "6");
		ArrayList<Object> aaa5 = new ArrayList<>();
		aaa5.add(0, sk5);
		////////////////////////////////////////////
		Map<String, Object> testmap = new HashMap<>();
		testmap.put("access_token", access_token);
		testmap.put("data", aaa5);
		System.out.println(testmap.toString());
		RestAssured.baseURI = driverBaseURL + "/api/v1/gps";
		Map<String, String> requestHeaders = new HashMap<>();
		requestHeaders.put("Content-Type", "application/json");
		requestHeaders.put("charset", "utf-8");
		RequestSpecification httpRequest = RestAssured.given().headers(requestHeaders);
		Response res = httpRequest.body(testmap).post("/addgpslocationmultiple");
		////////////////////////////// Response ///////////////////////////////////
		String responsebody1 = res.getBody().asString();
		System.out.println("responsebody is  - " + responsebody1);

	}

	@Test(priority = 6)

	public void LocationdataProivder6() throws IOException {
		String driverBaseURL = (String) new driverApi.API_GetBaseURLTest().GetrdriverBaseUrl();
		String access_token = (String) new driverApi.API_Driver_Login_Test().getAccess_token();
		String JoborderId = (String) new GetRequestAndJobOrderID().getJobOrderId();
		try {
			Thread.sleep(85000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Map<String, String> sk2 = new HashMap<>();
		sk2.put("jobId", JoborderId);
		sk2.put("gx", "25.0217053582391");
		sk2.put("gy", "55.55261195395644");
		sk2.put("requesterTypeId", "6");
		ArrayList<Object> aaa2 = new ArrayList<>();
		aaa2.add(0, sk2);
		Map<String, Object> testmap = new HashMap<>();
		testmap.put("access_token", access_token);
		testmap.put("data", aaa2);
		System.out.println(testmap.toString());
		RestAssured.baseURI = driverBaseURL + "/api/v1/gps";
		Map<String, String> requestHeaders = new HashMap<>();
		requestHeaders.put("Content-Type", "application/json");
		requestHeaders.put("charset", "utf-8");
		RequestSpecification httpRequest = RestAssured.given().headers(requestHeaders);

		Response res = httpRequest.body(testmap).post("/addgpslocationmultiple");
//////////////////////////////Response ///////////////////////////////////
		String responsebody1 = res.getBody().asString();

//	String responsebody2 = res2.getBody().asString();
		System.out.println("responsebody is  - " + responsebody1);
//	System.out.println("responsebody2 is  - " + responsebody2);
//}
	}

	
	@Test(priority = 8)

	public void LocationdataProivder8() throws IOException {
		String driverBaseURL = (String) new driverApi.API_GetBaseURLTest().GetrdriverBaseUrl();
		String access_token = (String) new driverApi.API_Driver_Login_Test().getAccess_token();
		String JoborderId = (String) new GetRequestAndJobOrderID().getJobOrderId();
		try {
			Thread.sleep(110000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Map<String, String> sk2 = new HashMap<>();
		sk2.put("jobId", JoborderId);
		sk2.put("gx", "25.021414145193354");
		sk2.put("gy", "55.552030682227105");
		sk2.put("requesterTypeId", "6");
		ArrayList<Object> aaa2 = new ArrayList<>();
		aaa2.add(0, sk2);
		Map<String, Object> testmap = new HashMap<>();
		testmap.put("access_token", access_token);
		testmap.put("data", aaa2);
		System.out.println(testmap.toString());
		RestAssured.baseURI = driverBaseURL + "/api/v1/gps";
		Map<String, String> requestHeaders = new HashMap<>();
		requestHeaders.put("Content-Type", "application/json");
		requestHeaders.put("charset", "utf-8");
		RequestSpecification httpRequest = RestAssured.given().headers(requestHeaders);

		Response res = httpRequest.body(testmap).post("/addgpslocationmultiple");
		////////////////////////////// Response ///////////////////////////////////
		String responsebody1 = res.getBody().asString();

//		String responsebody2 = res2.getBody().asString();
		System.out.println("responsebody is  - " + responsebody1);
//		System.out.println("responsebody2 is  - " + responsebody2);
		// }
	}

	@Test(priority = 8)

	public void LocationdataProivder9() throws IOException {
		String driverBaseURL = (String) new driverApi.API_GetBaseURLTest().GetrdriverBaseUrl();
		String access_token = (String) new driverApi.API_Driver_Login_Test().getAccess_token();
		String JoborderId = (String) new GetRequestAndJobOrderID().getJobOrderId();
		try {
			Thread.sleep(125000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Map<String, String> sk2 = new HashMap<>();
		sk2.put("jobId", JoborderId);
		sk2.put("gx", "25.02103494406037");
		sk2.put("gy", "55.551362830017034");
		sk2.put("requesterTypeId", "6");
		ArrayList<Object> aaa2 = new ArrayList<>();
		aaa2.add(0, sk2);
		Map<String, Object> testmap = new HashMap<>();
		testmap.put("access_token", access_token);
		testmap.put("data", aaa2);
		System.out.println(testmap.toString());
		RestAssured.baseURI = driverBaseURL + "/api/v1/gps";
		Map<String, String> requestHeaders = new HashMap<>();
		requestHeaders.put("Content-Type", "application/json");
		requestHeaders.put("charset", "utf-8");
		RequestSpecification httpRequest = RestAssured.given().headers(requestHeaders);

		Response res = httpRequest.body(testmap).post("/addgpslocationmultiple");
		////////////////////////////// Response ///////////////////////////////////
		String responsebody1 = res.getBody().asString();
		System.out.println("responsebody is  - " + responsebody1);

	}
}