package PolicedriverApi;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ERA.base.Base;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class API_Driver_GetUpdateLocation_Test extends Base{

	@Test(dataProvider = "LocationdataProivder", priority = 9)

	public void LocationdataProivder(String latitude,String longitude) throws IOException {

		String dispatureBaseURL = (String) new driverApi.API_GetBaseURLTest().centraldispatcherBaseUrl();
		//String access_token = (String) new driverApi.API_Driver_Login_Test(). driverLogin();
System.out.println(latitude);
System.out.println(longitude);

////////////////////////////////Get Request///////////////////////////////////	
		RestAssured.baseURI =dispatureBaseURL + "/api/CommandCenter";
		RequestSpecification httpRequest = RestAssured.given();
		Response res = httpRequest
				.queryParam("internalToken", "secretToken")
				.queryParam("jobId", "356030")
				.queryParam("longtitude", "31.483515000000004")
				.queryParam("latitude", "31.483515000000004")
				.get("/UpdateRequestLiveLocation");
////////////////////////////////Response ///////////////////////////////////
	
		String responsebody1 = res.getBody().asString();
		System.out.println("responsebody is  - " + responsebody1);
		JsonPath path = new JsonPath(responsebody1);
		boolean Success = path.get("success");
		
		Assert.assertEquals(Success, true);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		////////////////////////////////objectdata ////////////////
		// workbook object
//		XSSFWorkbook workbook = new XSSFWorkbook();
//
//		// spreadsheet object
//		XSSFSheet spreadsheet
//			= workbook.createSheet("DriverAccessToken");
//
//		// creating a row object
//		XSSFRow row;
//String s=String.valueOf(RequestId);
//		// This data needs to be written (Object[])
//		Map<String, Object[]> Requestetails
//			= new TreeMap<String, Object[]>();
//System.out.println("//////////////////name is "+Name);
//			Requestetails.put(
//			"1",
//			new Object[] { "Name", "MobileNumber", "RequestId","JoborderId" ,"access_token"});
//			
//			
//			Requestetails.put(
//					"2",
//					new Object[] { Name, MobileNumber,RequestId,JoborderId,access_token });
//					
//	
//
//		Set<String> keyid = Requestetails.keySet();
//
//		int rowid = 0;
//
//		// writing the data into the sheets...
//
//		for (String key : keyid) {
//
//			row = spreadsheet.createRow(rowid++);
//			Object[] objectArr = Requestetails.get(key);
//			int cellid = 0;
//
//			for (Object obj : objectArr) {
//				Cell cell = row.createCell(cellid++);
//				cell.setCellValue((String)obj);
//			}
//		}
//
//		// .xlsx is the format for Excel Sheets...
//		// writing the workbook into the file...
//		FileOutputStream out = new FileOutputStream(
//			new File("C:\\Users\\amira\\eclipse-workspace\\Automater\\src\\test\\testdata\\driverAccessToken.xlsx"));
//
//		workbook.write(out);
//		out.close();
//	
//
//


	
		
	}
}
