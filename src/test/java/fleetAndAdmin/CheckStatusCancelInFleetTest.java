package fleetAndAdmin;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ERA.base.Base;

import driverApi.API_GetBaseURLTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckStatusCancelInFleetTest extends Base {
	WebDriver FleetMangement;

	@Test(dataProvider = "loginUsers", priority = 11)
	public void OpenFleetURL(String Name, String MobileNumber) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\amira\\eclipse-workspace\\Automater\\Driver\\chromedriver.exe");
		FleetMangement = new ChromeDriver();
		String fleetBaseURL = (String) new API_GetBaseURLTest().fleetBaseUrl();
		FleetMangement.get(fleetBaseURL);
		FleetMangement.manage().window().maximize();
		((JavascriptExecutor) FleetMangement).executeScript("document.body.style.zoom='80%';");
		FleetMangement.navigate().refresh();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		FleetMangement.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String fleetuser = (String) new API_GetBaseURLTest().getFleetUser();
		FleetMangement.findElement(By.id("UserName")).sendKeys(fleetuser);
		FleetMangement.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String fleetpassword = (String) new API_GetBaseURLTest().getfleetPasword();
		FleetMangement.findElement(By.id("Password")).sendKeys(fleetpassword);
		FleetMangement.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		FleetMangement.findElement(By.xpath("//input[@value='Log in']")).click();
		FleetMangement.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		String Jobid = CheckStatusCancelInAdminTest.getJobOrderId();
//		try {
//			Jobid = (String) new OpenAdminAndGetJobOrderIdRequestIDTest().OpenAdminURL(Name, MobileNumber);
//			System.out.println("joborderId  " + Jobid);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		FleetMangement.findElement(By.xpath("//input[@placeholder='Search ']")).sendKeys(Jobid);

		FleetMangement.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
//////////////////////////////get empty state text  \\\\\\\\\\\\\\\\\\\\\\\\
		String NoFound = FleetMangement.findElement(By.xpath("//td[@class='dataTables_empty']")).getText();
		System.out.println("check joborder id   " + NoFound);
		FleetMangement.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(NoFound, "No matching records found", "request is cancelled successfully");

		softAssert.assertAll();

		FleetMangement.close();
	}

}
