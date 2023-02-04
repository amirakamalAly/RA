package visa;

import org.testng.annotations.Test;
import com.ERA.base.Base;
import driverApi.API_GetBaseURLTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VisaBaymentTest extends Base {
	WebDriver VISA;

	@Test(dataProvider = "loginUsers", priority = 11)
	public void Visa(String Name, String MobileNumber) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\amira\\eclipse-workspace\\Automater2\\Driver\\chromedriver.exe");
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

		VISA.findElement(By.xpath("/html/body/div[1]/form/div[2]/div[3]/div[3]/div[3]/div[2]/span[6]/a/span[2]"))
				.click();
		VISA.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		VISA.findElement(By.xpath("//*[@id=\"creditCardNumber\"]")).sendKeys("5204740009900014");
		VISA.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		VISA.findElement(By.xpath("//*[@id=\"CVVNumberCreditCard\"]")).sendKeys("123");
		VISA.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
//		VISA.findElement(By.xpath("//*[@id=\"expiryMonthCreditCard\"]")).click();
//		VISA.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
////		Keys cmdCtrl = Platform.getCurrent().is(Platform.MAC) ? Keys.COMMAND : Keys.CONTROL;
//		new Actions(driver).sendKeys(textField).keyDown(Keys.SHIFT).sendKeys(Keys.ARROW_DOWN);
		VISA.findElement(By.xpath("/html/body/div[1]/form/div[2]/div[3]/div[3]/div[2]/span[1]")).click();

		VISA.findElement(By.xpath("//*[@id=\"expiryMonthCreditCard\"]")).sendKeys(Keys.ARROW_DOWN);
		VISA.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		VISA.findElement(By.xpath("//*[@id=\"expiryYearCreditCard\"]")).sendKeys(Keys.ARROW_DOWN);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		VISA.findElement(By.xpath("//*[@id=\"expiryYearCreditCard\"]")).click();
		VISA.findElement(By.xpath("//*[@id=\"expiryYearCreditCard\"]")).sendKeys(Keys.ARROW_DOWN);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		VISA.findElement(By.xpath("//*[@id=\"expiryYearCreditCard\"]")).click();
		VISA.findElement(By.xpath("//*[@id=\"expiryYearCreditCard\"]")).sendKeys(Keys.ARROW_DOWN);
		VISA.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
//
		VISA.findElement(
				By.xpath("/html/body/div[1]/form/div[2]/div[3]/div[3]/div[4]/div/div/div/div/div[6]/a[1]/span"))
				.click();
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

	}

}
