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

public class OpenAdminAndCancelDubaiRequestITest extends Base {
	WebDriver Admindriver;

	@Test(dataProvider = "loginPoliceAccount", priority = 11)
	public void OpenAdminURL(String Name, String MobileNumber, String ValidMilitaryNumber, String ValidDepartment,
			String InValidMilitaryNumber, String InValidDepartment, String InvalidName)
			throws InterruptedException, IOException {
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

		Admindriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

//Admindriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//Admindriver
//		.findElement(By.xpath(
//				"/html/body/div[2]/div[2]/div[2]/div[1]/div/div/div[2]/div/form/div[1]/div[1]/div/input"))
//		.sendKeys(RequestId);
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
						"/html/body/div[2]/div[2]/div[2]/div[1]/div/div/div[2]/div/form/div[1]/div[6]/div/input"))
				.sendKeys(MobileNumber);

		Thread.sleep(3000);

///////////////////////////////////////////////////////////////////////////////////////////////////////

		Admindriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement myelement = Admindriver.findElement(
				By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div/div/div[2]/div/form/div[2]/div/button"));
//JavascriptExecutor jse2 = (JavascriptExecutor) Admindriver;
//jse2.executeScript("arguments[0].scrollIntoView()", myelement);
		Thread.sleep(3000);

		myelement.click();
		Thread.sleep(3000);

		((JavascriptExecutor) Admindriver).executeScript("document.body.style.zoom='67%';");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		Admindriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String JoborderId = Admindriver
				.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/div/table/tbody/tr[1]/td[5]"))
				.getText();

//////////////////////////////// RequestID///////////////////////////////////////////////
		Admindriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String RequesttId = Admindriver
				.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/div/table/tbody/tr[1]/td[1]"))
				.getText();
		System.out.println("/////////////////////////////////////////////////////////////////////" + RequesttId);

//////////////////////////////////////////////////////////////////////////////////////////////
		Admindriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(JoborderId);

		System.out.println("//////////////////name is " + Name);

		WebElement actionbutton = Admindriver.findElement(
				By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/div/table/tbody/tr[1]/td[15]/div/button"));
		Thread.sleep(3000);
		JavascriptExecutor ex = (JavascriptExecutor) Admindriver;
		ex.executeScript("arguments[0].click();", actionbutton);
		Thread.sleep(1000);

		WebElement cancelwitoutfees = Admindriver.findElement(By.xpath(
				"/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/div/table/tbody/tr[1]/td[15]/div/ul/li[5]/a"));
		Admindriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		ex.executeScript("arguments[0].click();", cancelwitoutfees);
		Admindriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement Confirmcancelwitoutfees = Admindriver
				.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/div/div/div[3]/button[2]/i"));
		Thread.sleep(1000);
		ex.executeScript("arguments[0].click();", Confirmcancelwitoutfees);
		Thread.sleep(1000);

	Admindriver.close();
//	return JoborderId;

	}
}