package fleetAndAdminDubai;

import org.testng.annotations.Test;

import com.ERA.base.Base;

import driverApi.API_GetBaseURLTest;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenFleetAndCancelPoliceRequestTest extends Base {
	WebDriver FleetMangement;

	@Test(dataProvider = "loginPoliceAccount", priority = 11)
	public void OpenFleetURL(String Name, String MobileNumber, String ValidMilitaryNumber, String ValidDepartment,
			String InValidMilitaryNumber, String InValidDepartment, String InvalidName) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\amira\\eclipse-workspace\\Automater\\Driver\\chromedriver.exe");
		FleetMangement = new ChromeDriver();
		String fleetDubaiBaseURL = (String) new API_GetBaseURLTest().fleetBaseDubaiUrl();
		FleetMangement.get(fleetDubaiBaseURL);

		FleetMangement.manage().window().maximize();

//		try {
//			((JavascriptExecutor) FleetMangement).executeScript("document.body.style.zoom='80%';");
//			FleetMangement.navigate().refresh();
//			Thread.sleep(5000);
//
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}

		FleetMangement.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String fleetUser = (String) new API_GetBaseURLTest().getFleetUser();

		FleetMangement.findElement(By.id("UserName")).sendKeys(fleetUser);
		FleetMangement.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		String fleetpassword = (String) new API_GetBaseURLTest().getfleetPasword();

		FleetMangement.findElement(By.id("Password")).sendKeys(fleetpassword);
		FleetMangement.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		FleetMangement.findElement(By.xpath("//input[@value='Log in']")).click();
		FleetMangement.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String Jobid;
	
		Jobid= (String) new fleetAndAdminDubai.OpenAdminAndGetJobOrderIdDubaiRequestITest().getJobOrderId();
				
		System.out.println("joborderId  " + Jobid);
		
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		FleetMangement.findElement(By.xpath("//input[@placeholder='Search ']")).sendKeys(Jobid);
		try {
			((JavascriptExecutor) FleetMangement).executeScript("document.body.style.zoom='80%';");
			FleetMangement.navigate().refresh();
			Thread.sleep(5000);

		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
//////////////////////////////click Action Button \\\\\\\\\\\\\\\\\\\\\\\\
FleetMangement.findElement(By.xpath("/html/body/div[2]/section/div[3]/div/div/table/tbody/tr[1]/td[12]/div/a"))
.click();
FleetMangement.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
////////////////////////////click details option\\\\\\\\\\\\\\\\\\\\\\\\\

FleetMangement
.findElement(
	By.xpath("/html/body/div[2]/section/div[3]/div/div/table/tbody/tr[1]/td[12]/div/ul/li[1]/a"))
.click();
FleetMangement.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

////////////////////////////////////////
//		FleetMangement.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		try {
//			Thread.sleep(10000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//				
//		try {
//			WebElement wb;
//			JavascriptExecutor js = (JavascriptExecutor) FleetMangement; 
//			 		                                             
//			wb = FleetMangement.findElement(By.xpath("/html/body/div[2]/section/div[3]/div/div/table/tbody/tr/td[12]/input"));
//			js.executeScript("arguments[0].click();", wb);
//		} catch (Exception b) {
//
//			throw new NoSuchElementException("kunne ikke finde ");
//		}
		FleetMangement.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		FleetMangement.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/div/form/div[11]/div/input[4]")).click();
		FleetMangement.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		FleetMangement.findElement(By.id("txtRequestRemarks")).sendKeys("cancelReason");
		System.out.println("******************" + "add cancel Reason");
		FleetMangement.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/div/form/div[7]/div[2]/input[1]")).click();
		FleetMangement.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		FleetMangement.close();
	}

}
