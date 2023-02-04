package driverApi;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ERA.PageObject.GetRequestAndJobOrderID;
import com.ERA.base.Base;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class API_Driver_Startjob_Test extends Base {

	
	@Test( priority = 1)

	public void Startjob_Test()
			throws IOException {
		String driverBaseURL = (String) new driverApi.API_GetBaseURLTest().GetrdriverBaseUrl();
		String access_token = (String) new driverApi.API_Driver_Login_Test().getAccess_token();
		String recoveryQrCode = (String) new driverApi.API_GetBaseURLTest().getrecoveryQrCode();
		String JoborderId = (String) new GetRequestAndJobOrderID(). getJobOrderId();
		System.out.println("start job access token " + access_token);
		
		System.out.println("job order id to start job by driver  " + JoborderId);

////////////////////////////////Get Request///////////////////////////////////	
//		RestAssured.baseURI = driverBaseURL + "/api/v1/fleetjobs";
//		RequestSpecification httpRequest = RestAssured.given();
//		Response res = httpRequest.queryParam("access_token", access_token).queryParam("gx", "30.239421666666665")
//				.queryParam("jobId", JoborderId).queryParam("gy", "31.483515000000004")
//				.queryParam("recoveryQrCode", "12345678901234562")
//
//				.get("/startjob");
//////////////////////////////////live///////////////////////////
		RestAssured.baseURI = driverBaseURL + "/api/v1/fleetjobs";
		RequestSpecification httpRequest = RestAssured.given();
		Response res = httpRequest.queryParam("access_token", access_token).queryParam("gx", "30.239421666666665")
				.queryParam("jobId", JoborderId).queryParam("gy", "31.483515000000004")
				// .queryParam("recoveryQrCode", "12345678901234562")
				.queryParam("recoveryQrCode", recoveryQrCode).get("/startjob");//////////////////////////////// Response
																				//////////////////////////////// ///////////////////////////////////
		String responsebody1 = res.getBody().asString();
		System.out.println("responsebody is  - " + responsebody1);
		JsonPath path = new JsonPath(responsebody1);
		boolean Success = path.get("success");
	//	Assert.assertEquals(Success, true);
		
		try {
			Thread.sleep(50000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		//////////////////////////////// objectdata ////////////////
		// workbook object
		XSSFWorkbook workbook = new XSSFWorkbook();

		// spreadsheet object
		XSSFSheet spreadsheet = workbook.createSheet("DriverAccessToken");

		// creating a row object
		XSSFRow row;
		Map<String, Object[]> Requestetails = new TreeMap<String, Object[]>();
		String orderid=JoborderId+"&";
		System.out.println("//////////////////orderid is " + orderid);
				Requestetails.put("1", new Object[] { "JoborderId", "access_token" });

		Requestetails.put("2", new Object[] { orderid, access_token });

		Set<String> keyid = Requestetails.keySet();

		int rowid = 0;

		// writing the data into the sheets...

		for (String key : keyid) {

			row = spreadsheet.createRow(rowid++);
			Object[] objectArr = Requestetails.get(key);
			int cellid = 0;

			for (Object obj : objectArr) {
				Cell cell = row.createCell(cellid++);
				cell.setCellValue((String) obj);
			}
		}

		// .xlsx is the format for Excel Sheets...
		// writing the workbook into the file...
		FileOutputStream out = new FileOutputStream(new File(
				"C:\\Users\\amira\\eclipse-workspace\\Automater2\\src\\test\\testdata\\driverAccessToken.xlsx"));

		workbook.write(out);
		out.close();

	}

}
