package visa;

import org.testng.annotations.Test;

import com.ERA.base.Base;

import driverApi.API_GetBaseURLTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VisaBaymentWTest extends Base {
	WebDriver VISA;

	@Test(dataProvider = "loginUsers", priority = 11)
	public void Visa(String Name, String MobileNumber) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\amira\\eclipse-workspace\\Automater\\Driver\\chromedriver.exe");
		VISA = new ChromeDriver();
		String VisaBaseUrl = (String) new API_GetBaseURLTest().VisaBaseUrl();
		VISA.get(VisaBaseUrl);

		VISA.manage().window().maximize();
		((JavascriptExecutor) VISA).executeScript("document.body.style.zoom='80%';");
		VISA.navigate().refresh();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		VISA.findElement(By.xpath("/html/body/div[1]/form/div[2]/div[3]/div[3]/div[3]/div[2]/span[6]/a/span[2]")).click();
		VISA.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		VISA.findElement(By.xpath("//*[@id=\"creditCardNumber\"]")).click();
		VISA.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		VISA.findElement(By.xpath("//*[@id=\"creditCardNumber\"]")).sendKeys(Keys.ARROW_DOWN);
		VISA.findElement(By.xpath("//*[@id=\"creditCardNumber\"]")).sendKeys(Keys.ENTER);

		VISA.findElement(By.xpath("//*[@id=\"CVVNumberCreditCard\"]")).sendKeys("123");
		VISA.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
//
	VISA.findElement(By.xpath("/html/body/div[1]/form/div[2]/div[3]/div[3]/div[4]/div/div/div/div/div[6]/a[1]/span")).click();
	VISA.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	

	VISA.findElement(By.xpath("/html/body/div[1]/div/div[3]/center/form/table/tbody/tr[13]/td/input")).click();
	VISA.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
//		//VISA.sendKeys(Keys.ARROW_DOWN);
//		FleetMangement.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		String fleetUser = (String) new API_GetBaseURLTest().getFleetUser();
//		FleetMangement.findElement(By.id("UserName")).sendKeys(fleetUser);
//		FleetMangement.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		String fleetpassword = (String) new API_GetBaseURLTest().getfleetPasword();
//		FleetMangement.findElement(By.id("Password")).sendKeys(fleetpassword);
//		FleetMangement.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		FleetMangement.findElement(By.xpath("//input[@value='Log in']")).click();
//		FleetMangement.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		String Jobid;
//	
//			try {
//				Jobid = (String) new OpenAdminAndGetJobOrderIdRequestIDTest().OpenAdminURL(Name, MobileNumber);
//				System.out.println("joborderId  " + Jobid);
//				FleetMangement.findElement(By.xpath("//input[@placeholder='Search ']")).sendKeys(Jobid);
//
//				FleetMangement.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//			} catch (InterruptedException e2) {
//				// TODO Auto-generated catch block
//				e2.printStackTrace();
//			} catch (IOException e2) {
//				// TODO Auto-generated catch block
//				e2.printStackTrace();
//			}
//			
//	//////////////////////////////click Action Button \\\\\\\\\\\\\\\\\\\\\\\\
//			FleetMangement.findElement(By.xpath("/html/body/div[2]/section/div[3]/div/div/table/tbody/tr[1]/td[9]/div/a"))
//					.click();
//			FleetMangement.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	////////////////////////////click details option\\\\\\\\\\\\\\\\\\\\\\\\\
//
//			FleetMangement
//					.findElement(
//							By.xpath("/html/body/div[2]/section/div[3]/div/div/table/tbody/tr[1]/td[9]/div/ul/li[1]/a"))
//					.click();
//			FleetMangement.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//	////////////////////////////////////////
//
////		FleetMangement.findElement(By.xpath("/html/body/div[2]/section/div[3]/div/div/table/tbody/tr/td[9]/input"))
////				.click();
////		FleetMangement.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//		FleetMangement.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/div/form/div[11]/div/input[4]")).click();
//		FleetMangement.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
////FleetMangement.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/div/form/div[5]/div[1]/span/span/input"))
////.sendKeys("Egypt User  03");
//		String assignedriver = (String) new API_GetBaseURLTest().getassignedriver();
//		FleetMangement.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/div/form/div[5]/div[1]/span/span/input"))
//				.sendKeys(assignedriver);
//		FleetMangement.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//		FleetMangement.findElement(By.xpath("/html/body/div[9]/div/div[3]/ul/li/span[1]")).click();
//		FleetMangement.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//		FleetMangement.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/div/form/div[8]/div[2]/input[1]"))
//				.click();
//		FleetMangement.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		FleetMangement.close();
	}

}
