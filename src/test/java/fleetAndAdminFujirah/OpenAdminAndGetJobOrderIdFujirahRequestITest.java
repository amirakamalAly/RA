package fleetAndAdminFujirah;

import org.testng.annotations.Test;

import com.ERA.base.Base;


import driverApi.API_GetBaseURLTest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenAdminAndGetJobOrderIdFujirahRequestITest extends Base {
	WebDriver Admindriver;
	static String JobOrderId;

	
	
	/**
	 * @return the JobOrderId
	 */
	public String getJobOrderId() {
		return JobOrderId;
	}

	/**
	
	 * @param JobOrderId 
	 */
	public void setJobOrderId(String JobOrderId) {
		OpenAdminAndGetJobOrderIdFujirahRequestITest.JobOrderId = JobOrderId;
	}

	@Test(dataProvider = "loginPoliceAccount", priority = 11)
	public void OpenAdminURL(String Name, String MobileNumber,String ValidMilitaryNumber, String ValidDepartment,String InValidMilitaryNumber, String InValidDepartment,String InvalidName) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\amira\\eclipse-workspace\\Automater\\Driver\\chromedriver.exe");
		Admindriver = new ChromeDriver();
		String adminBaseURL = (String) new API_GetBaseURLTest().adminBaseUrl();
		Admindriver.get(adminBaseURL);
	

		Admindriver.manage().window().maximize();

		Admindriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String adminuser = (String) new API_GetBaseURLTest().getadminUser();

		Admindriver.findElement(By.id("UserName")).sendKeys(adminuser);

		Admindriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String adminpassword = (String) new API_GetBaseURLTest().getadminPasword();
		Admindriver.findElement(By.id("Password")).sendKeys(adminpassword);
		Admindriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Admindriver.findElement(By.xpath("/html/body/div[2]/div/form/div[3]")).click();
		Admindriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Admindriver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[2]/a")).click();
		Admindriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Admindriver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[2]/ul/li[1]/a/span")).click();
		Admindriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Admindriver.navigate().refresh();
		Thread.sleep(3000);
		Admindriver.navigate().refresh();

		try {
			WebElement wb;
			JavascriptExecutor js = (JavascriptExecutor) Admindriver;
			wb = Admindriver.findElement(By.xpath("//*[@data-rel='collapse']"));
			js.executeScript("arguments[0].click();", wb);
		} catch (Exception b) {

			throw new NoSuchElementException("kunne ikke finde ");
		}
		//Thread.sleep(3000);

		System.out.println("/////////////////////////////////////////////////////////////////////" + MobileNumber);
//		Admindriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Admindriver
//				.findElement(By.xpath(
//						"/html/body/div[2]/div[2]/div[2]/div[1]/div/div/div[2]/div/form/div[1]/div[1]/div/input"))
//				.sendKeys(RequestId);
		///////////////////// search with mobile number
		///////////////////// //////////////////////////////////
		Thread.sleep(3000);
		Admindriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		
		Admindriver.findElement(By.xpath("//*[@id='checkbox1']")).click();
		Thread.sleep(3000);
		
		System.out.println("/////////////////////////////////////////////////////////////////checkbox////");


		Admindriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Admindriver
				.findElement(By.xpath(
						"/html/body/div[2]/div[2]/div[2]/div[1]/div/div/div[2]/div/form/div[2]/div/button"))
				.sendKeys(MobileNumber);

		Thread.sleep(3000);

		///////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
			Admindriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement myelement = Admindriver.findElement(
				By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div/div/div[2]/div/form/div[2]/div/button"));
//		JavascriptExecutor jse2 = (JavascriptExecutor) Admindriver;
//		jse2.executeScript("arguments[0].scrollIntoView()", myelement);
		Thread.sleep(3000);

		myelement.click();

		Admindriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		JobOrderId = Admindriver
				.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/div/table/tbody/tr[1]/td[5]"))
				.getText();
		System.out.println("////////////////////////////////////////////////rrrrrrrr/////////////////////" + JobOrderId);
		//////////////////////////////// RequestID///////////////////////////////////////////////
		Admindriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String RequesttId = Admindriver
				.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/div/table/tbody/tr[1]/td[1]"))
				.getText();
		System.out.println("/////////////////////////////////////////////////////////////////////" + RequesttId);

		//////////////////////////////////////////////////////////////////////////////////////////////
		Admindriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("JobOrderIduuuuuuuuuuuuuuuuuuuuuuu"+JobOrderId);

		System.out.println("//////////////////name is " + Name);

		// workbook object
		XSSFWorkbook workbook = new XSSFWorkbook();

		// spreadsheet object
		XSSFSheet spreadsheet = workbook.createSheet("RequestetailswithjobOrderId");

		// creating a row object
		XSSFRow row;

		// This data needs to be written (Object[])
		Map<String, Object[]> Requestetails = new TreeMap<String, Object[]>();

		Requestetails.put("1", new Object[] { "Name", "MobileNumber", "RequestId", "JoborderId" });

		Requestetails.put("2", new Object[] { Name, MobileNumber, RequesttId, JobOrderId });

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
		FileOutputStream out = new FileOutputStream(
				new File("C:\\Users\\amira\\eclipse-workspace\\Automater2\\src\\test\\testdata\\Request.xlsx"));

		workbook.write(out);
		out.close();

		Admindriver.close();
//		return JoborderId;

	}

}
