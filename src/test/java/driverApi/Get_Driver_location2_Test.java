package driverApi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ERA.PageObject.GetRequestAndJobOrderID;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get_Driver_location2_Test  {
//	public String JoborderId = (String) new GetRequestAndJobOrderID(). getJobOrderId();
//	public String access_token =  (String) new driverApi.API_Driver_Login_Test().getAccess_token();

	@Test(priority = 1)

	public void LocationdataProivder1() throws IOException {
		String driverBaseURL = (String) new driverApi.API_GetBaseURLTest().GetrdriverBaseUrl();
		String access_token = (String) new driverApi.API_Driver_Login_Test().getAccess_token();
		String JoborderId = (String) new GetRequestAndJobOrderID().getJobOrderId();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Map<String, String> sk3 = new HashMap<>();
		sk3.put("jobId", JoborderId);
		sk3.put("gx", "25.019461499538863");
		sk3.put("gy", "55.548423285940984");
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

	@Test(priority = 2)

	public void LocationdataProivder2() throws IOException {
		String driverBaseURL = (String) new driverApi.API_GetBaseURLTest().GetrdriverBaseUrl();
		String access_token = (String) new driverApi.API_Driver_Login_Test().getAccess_token();
		String JoborderId = (String) new GetRequestAndJobOrderID().getJobOrderId();
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Map<String, String> sk4 = new HashMap<>();
		sk4.put("jobId", JoborderId);
		sk4.put("gx", "25.018360468257697");
		sk4.put("gy", "55.54646527341915");
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
		System.out.println("responsebody is  - " + responsebody1);

	}

	@Test(priority = 3)
	public void LocationdataProivder33() throws IOException {
		String driverBaseURL = (String) new driverApi.API_GetBaseURLTest().GetrdriverBaseUrl();
		String access_token = (String) new driverApi.API_Driver_Login_Test().getAccess_token();
		String JoborderId = (String) new GetRequestAndJobOrderID(). getJobOrderId();
		Map<String, String> sk1 = new HashMap<>();
		sk1.put("jobId", JoborderId);
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sk1.put("gx", "25.018315901532194");
		sk1.put("gy", "55.54600024214719");
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
	
	@Test(priority = 4)
	public void LocationdataProivder4() throws IOException {
		String driverBaseURL = (String) new driverApi.API_GetBaseURLTest().GetrdriverBaseUrl();
		String access_token = (String) new driverApi.API_Driver_Login_Test().getAccess_token();
		String JoborderId = (String) new GetRequestAndJobOrderID(). getJobOrderId();
		Map<String, String> sk1 = new HashMap<>();
		sk1.put("jobId", JoborderId);
		try {
			Thread.sleep(40000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sk1.put("gx", "25.018145711526024");
		sk1.put("gy", "55.54531543574477");
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




	@Test(priority = 5)

	public void LocationdataProivder5() throws IOException {
		String driverBaseURL = (String) new driverApi.API_GetBaseURLTest().GetrdriverBaseUrl();
		String access_token = (String) new driverApi.API_Driver_Login_Test().getAccess_token();
		String JoborderId = (String) new GetRequestAndJobOrderID(). getJobOrderId();
try {
	Thread.sleep(50000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		Map<String, String> sk2 = new HashMap<>();
		sk2.put("jobId", JoborderId);
		sk2.put("gx", "25.017782187884045");
		sk2.put("gy", "55.54509536423547");
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

	@Test(priority = 6)

	public void LocationdataProivder6() throws IOException {
		String driverBaseURL = (String) new driverApi.API_GetBaseURLTest().GetrdriverBaseUrl();
		String access_token = (String) new driverApi.API_Driver_Login_Test().getAccess_token();
		String JoborderId = (String) new GetRequestAndJobOrderID(). getJobOrderId();
		try {
			Thread.sleep(60000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Map<String, String> sk3 = new HashMap<>();
		sk3.put("jobId", JoborderId);
		sk3.put("gx", "25.017203749201748");
		sk3.put("gy", "55.54398169981782");
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

	@Test(priority = 7)

	public void LocationdataProivder7() throws IOException {
		String driverBaseURL = (String) new driverApi.API_GetBaseURLTest().GetrdriverBaseUrl();
		String access_token = (String) new driverApi.API_Driver_Login_Test().getAccess_token();
		String JoborderId = (String) new GetRequestAndJobOrderID(). getJobOrderId();
		try {
			Thread.sleep(70000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Map<String, String> sk4 = new HashMap<>();
		sk4.put("jobId", JoborderId);
		sk4.put("gx", "25.017246666666665");
		sk4.put("gy", "55.543595");
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
	
	@Test(priority =8)
	public void LocationdataProivder8() throws IOException {
		String driverBaseURL = (String) new driverApi.API_GetBaseURLTest().GetrdriverBaseUrl();
		String access_token = (String) new driverApi.API_Driver_Login_Test().getAccess_token();
		String JoborderId = (String) new GetRequestAndJobOrderID(). getJobOrderId();
		
		try {
			Thread.sleep(80000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}Map<String, String> sk5 = new HashMap<>();
		sk5.put("jobId", JoborderId);
		sk5.put("gx", "25.018027604502027");
		sk5.put("gy", "55.544315606564844");
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

	@Test(priority = 9)

	public void LocationdataProivder9() throws IOException {
		String driverBaseURL = (String) new driverApi.API_GetBaseURLTest().GetrdriverBaseUrl();
		String access_token = (String) new driverApi.API_Driver_Login_Test().getAccess_token();
		String JoborderId = (String) new GetRequestAndJobOrderID(). getJobOrderId();
try {
	Thread.sleep(90000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		Map<String, String> sk2 = new HashMap<>();
		sk2.put("jobId", JoborderId);
		sk2.put("gx", "25.01799310521753");
		sk2.put("gy", "55.54436133541626");
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

	@Test(priority = 10)

	public void LocationdataProivder10() throws IOException {
		String driverBaseURL = (String) new driverApi.API_GetBaseURLTest().GetrdriverBaseUrl();
		String access_token = (String) new driverApi.API_Driver_Login_Test().getAccess_token();
		String JoborderId = (String) new GetRequestAndJobOrderID(). getJobOrderId();
		try {
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Map<String, String> sk3 = new HashMap<>();
		sk3.put("jobId", JoborderId);
		sk3.put("gx", "25.018006666666665");
		sk3.put("gy", "55.54448000000001");
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

	@Test(priority = 11)

	public void LocationdataProivder11() throws IOException {
		String driverBaseURL = (String) new driverApi.API_GetBaseURLTest().GetrdriverBaseUrl();
		String access_token = (String) new driverApi.API_Driver_Login_Test().getAccess_token();
		String JoborderId = (String) new GetRequestAndJobOrderID(). getJobOrderId();
		try {
			Thread.sleep(101000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Map<String, String> sk4 = new HashMap<>();
		sk4.put("jobId", JoborderId);
		sk4.put("gx", " 25.018114999999998");
		sk4.put("gy", "55.54446333333333");
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
	
@Test( priority = 12)
	public void completejob() throws IOException {

	
	try {
		Thread.sleep(102000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		String driverBaseURL = (String) new driverApi.API_GetBaseURLTest().GetrdriverBaseUrl();
		String access_token = (String) new driverApi.API_Driver_Login_Test().getAccess_token();
		String JoborderId = (String) new GetRequestAndJobOrderID(). getJobOrderId();
	
////////////////////////////////Get Request///////////////////////////////////	
		RestAssured.baseURI =driverBaseURL + "/api/v1/fleetjobs";
		RestAssured.urlEncodingEnabled = false;
		RequestSpecification httpRequest = RestAssured.given();
		Response res = httpRequest
				.queryParam("access_token", access_token)
				.queryParam("gx", "25.018114999999998")
				.queryParam("jobId", JoborderId)
				.queryParam("gy", "55.54446333333333")
			//	.queryParam("qrCode", "http%3A%2F%2Feca.ae%2Fq%2FYBMOBHSL")
				.get("/completejob");

////////////////////////////////Response ///////////////////////////////////
		String responsebody1 = res.getBody().asString();
		System.out.println("responsebody is  - " + responsebody1);
		JsonPath path = new JsonPath(responsebody1);
		boolean Success = path.get("success");
		
		Assert.assertEquals(Success, true);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
}
