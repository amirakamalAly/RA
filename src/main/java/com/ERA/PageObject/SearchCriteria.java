/**
 * 
 */
package com.ERA.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.ERA.base.Action;
import com.ERA.base.BaseClass;

/**
 * @author Amira
 * 
 */
public class SearchCriteria extends BaseClass {

	@FindBy(xpath = "//*[@data-rel='collapse']")
	private WebElement arrow;
	@FindBy(xpath = "//*[@id='checkbox1']")
	private WebElement checkbox;
	@FindBy(xpath = "/html/body/div[2]/div[2]/div[2]/div[1]/div/div/div[2]/div/form/div[1]/div[6]/div/input")
	private WebElement mobileNumberele;
	@FindBy(xpath = "/html/body/div[2]/div[2]/div[2]/div[1]/div/div/div[2]/div/form/div[2]/div/button")
	private WebElement Searchbutton;

	@FindBy(xpath = "//*[@class='btn btn-primary dropdown-toggle'][@data-toggle='dropdown']")
	private WebElement Action;

	@FindBy(xpath = "/html/body/div[2]/section/div[3]/div[2]/div/table/tbody/tr[1]/td[12]/div/a")
	private WebElement RTAAction;
	@FindBy(xpath = "//*[@class='btn btn-primary dropdown-toggle'][@data-toggle='dropdown']")
	private WebElement RTAIamnotsureaction;
	@FindBy(xpath = "//input[@placeholder='Search ']")
	private WebElement serchJoborderId;

	@FindBy(xpath = "/html/body/div[2]/section/div[3]/div[2]/div/table/tbody/tr[1]/td[12]/div/ul/input")
	private WebElement RTAdetails;
	
	

	@FindBy(xpath = "//a[contains(text(),'Change Recovery Type')]")
	private WebElement changetype;
	@FindBy(xpath = "//*[@class2='btn btn-default btn-block'][@value='Details']")

	private WebElement details;

	@FindBy(xpath = "//input[@class='btn btn-primary fleet-job-detail-btn'][@value='Assign driver/Schedule Job']")
	private WebElement assign;

	@FindBy(xpath = "/html/body/div[6]/div/div/div[2]/div/form/div[11]/div/input[3]")
	private WebElement assignBattery;

	@FindBy(xpath = "/html/body/div[9]/div/div/div[2]/div/form/div[5]/div[1]/span/span")
	private WebElement assigntobattery;

	@FindBy(xpath = "/html/body/div[8]/div/div/div[2]/div/form/div[5]/div[1]/span/span/input")
	private WebElement assignto;

	@FindBy(xpath = "//*[@id=\'txtDistance\']")
	private WebElement elm2;

	@FindBy(xpath = "//input[@value='Assign driver/Schedule Job']")
	private WebElement assignbuttonRTA;

	@FindBy(xpath = "/html/body/div[12]/div/div[3]/ul/li/span[4]")
	private WebElement list;

	@FindBy(xpath = "/html/body/div[7]/div/div/div[2]/div/form/div[8]/div[2]/input[1]")

	private WebElement confirmAssign;

	@FindBy(xpath = "//*[@id=\'txtRecVehicleId\']")	
	private WebElement elm1;

	@FindBy(className = "btn-success")
	private WebElement elm6;

	@FindBy(xpath = "//input[contains(@name, 'txtRecDriverName_input')]")
	private WebElement drivername1;

	@FindBy(xpath = "/html/body/div[2]/div[2]/div[2]/div[3]/div/div/div[3]/button[2]/i")
	private WebElement Confirmcancelwitoutfees;

	@FindBy(xpath = "/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/div/table/tbody/tr[1]/td[15]/div/ul/li[5]/a")
	private WebElement cancelwitoutfees;

	@FindBy(xpath = "/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/div/table/tbody/tr[1]/td[15]/div/button")
	private WebElement actionbutton;

	@FindBy(xpath = "/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/div/table/tbody/tr[1]/td[3]")
	private WebElement CancelStatus;

	@FindBy(xpath = "//td[@class='dataTables_empty']")
	private WebElement NoFound;

	@FindBy(xpath = "//*[@class='dataTables_empty'][text()='No matching records found']")
	private WebElement ele;

	@FindBy(xpath = "//input[contains(@type, 'button')][@value='Cancel Request']")
	private WebElement cancel;

	@FindBy(xpath = "//*[@class='btn btn-default btn-block'][@value='Details']")
	private WebElement Fujirahdetails;
	@FindBy(id = "txtRequestRemarks")
	private WebElement addnote;

	@FindBy(xpath = "//input[contains(@type, 'button')][@value='Cancel Job']")
	private WebElement cancelbtn;

	Action action = new Action();

	public SearchCriteria() {
		PageFactory.initElements(getDriver(), this);
	}

	public void SearchCriteriaAction(String name, String mobileNumber) throws Exception {

		action.implicitWait(getDriver(), 1);
		action.clickarrow(getDriver(), arrow);
		action.implicitWait(getDriver(), 3);
		action.click(getDriver(), checkbox);
		action.implicitWait(getDriver(), 1);
		action.selectBySendkeys(mobileNumber, mobileNumberele);
		action.implicitWait(getDriver(), 1);
		action.click(getDriver(), Searchbutton);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public void SearchWithjoborderId() {

		String Jobid;
		try {
			Jobid = (String) new GetRequestAndJobOrderID().getJobOrderId();
			JavascriptExecutor jse = (JavascriptExecutor) getDriver();
			jse.executeScript("arguments[0].value='" + Jobid + "';", serchJoborderId);
			serchJoborderId.sendKeys(Keys.ENTER);

		} catch (Exception e1) {
			e1.printStackTrace();
		}

	}

	public void ClickAction() {
		// TODO Auto-generated method stub

		action.implicitWait(getDriver(), 1);
		action.click(getDriver(), Action);
	}

	public void Clickdetails() {
		// TODO Auto-generated method stub
		action.implicitWait(getDriver(), 1);
		action.click(getDriver(), details);
	}

	public void clcikAssignbutton() {
		// TODO Auto-generated method stub
		action.implicitWait(getDriver(), 1);
		action.click(getDriver(), assign);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void SerchWithdriverName() throws Throwable {
		String drivername = (String) new API_GetBaseURLTest().getassignedriver();
		System.out.println(drivername);
		action.type(assignto, drivername);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@FindBy(xpath = "//*[@class='k-input form-control ddlRecDriverName txtRecDriverId'][@name='txtRecDriverName_input']")
	private WebElement assigntoNotsure;

	public void NotsureSerchWithdriverName() throws Throwable {
		String drivername = (String) new API_GetBaseURLTest().getassignedriver();
		System.out.println(drivername);
		action.type(assigntoNotsure, drivername);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void SerchWithdriverNamebattery() throws Throwable {
		String drivername = (String) new API_GetBaseURLTest().getassignedriver();
		System.out.println(drivername);

//		WebDriverWait wait = new WebDriverWait(getDriver(), 5);
//		wait.until(ExpectedConditions.elementToBeClickable(drivername1));

		// wait.until(ExpectedConditions.textToBePresentInElementValue(drivername1,
		// drivername));
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		action.type(drivername1, drivername);
	}

	public void selectdriverfromList() {
		// TODO Auto-generated method stub
		action.implicitWait(getDriver(), 1);
		assignto.sendKeys(Keys.ARROW_DOWN);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		action.click(getDriver(), elm2);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		action.click(getDriver(), elm1);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		elm1.sendKeys(Keys.ARROW_DOWN);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}
	
	public void selectdriverfromListnotsure() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		action.implicitWait(getDriver(), 1);
		assignbuttonRTA.sendKeys(Keys.ARROW_DOWN);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		action.click(getDriver(), elm2);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		action.click(getDriver(), elm1);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		elm1.sendKeys(Keys.ARROW_DOWN);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

	public void selectdriverfromListbattery() {
		action.implicitWait(getDriver(), 1);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		drivername1.sendKeys(Keys.ARROW_DOWN);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		action.click(getDriver(), elm2);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		action.click(getDriver(), elm1);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		elm1.sendKeys(Keys.ARROW_DOWN);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

	public void confirmAssign() {
		// TODO Auto-generated method stub
		action.implicitWait(getDriver(), 2);
		System.out.println("confirm assign driver button ");
		action.click(getDriver(), elm6);

	}

	public void clcikBatteryAssignbutton() {
		// TODO Auto-generated method stub action.implicitWait(getDriver(), 1);
		action.click(getDriver(), assignBattery);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void OpenAction() {
		JavascriptExecutor ex = (JavascriptExecutor) getDriver();
		ex.executeScript("arguments[0].click();", actionbutton);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void cancel() {
		// TODO Auto-generated method stub
		JavascriptExecutor ex = (JavascriptExecutor) getDriver();
		getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		ex.executeScript("arguments[0].click();", cancelwitoutfees);

		getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void confirm_cancel() {
		JavascriptExecutor ex = (JavascriptExecutor) getDriver();
		ex.executeScript("arguments[0].click();", Confirmcancelwitoutfees);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void CheckCancelStatus() {
		getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String status = CancelStatus.getText();
		String Statuscancelled = "Cancelled";
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(status, Statuscancelled, "status are equal");
		softAssert.assertAll();
	}

	public void checkRequestNotFoundinlist() {

		getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String NoFoundStatus = ele.getText();
		System.out.println("check joborder id   " + NoFoundStatus);
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(NoFoundStatus.matches("No data available in table|No matching records found"), "passed");
		System.out.println("passed");
		softAssert.assertAll();

	}

	public void ClickRTAAction() {
		action.implicitWait(getDriver(), 1);
		action.click(getDriver(), RTAAction);

	}

	public void ClickRTAdetails() {
		// TODO Auto-generated method stub
		action.implicitWait(getDriver(), 1);
		action.click(getDriver(), RTAdetails);
	}

	public void Click_Fujirah_details() {
		// TODO Auto-generated method stub
		action.implicitWait(getDriver(), 1);
		action.click(getDriver(), Fujirahdetails);
	}

	public void clcik_RTA_Assignbutton() {
		// TODO Auto-generated method stub
		action.implicitWait(getDriver(), 1);
		action.click(getDriver(), assignbuttonRTA);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clcikCancelbutton() {
		// TODO Auto-generated method stub
		action.implicitWait(getDriver(), 1);
		action.click(getDriver(), cancel);
	}

	public void addNote() {
		// TODO Auto-generated method stub
		action.implicitWait(getDriver(), 1);
		action.click(getDriver(), addnote);
		action.type(addnote, "cancel");
	}

	public void cancelJob() {
		// TODO Auto-generated method stub
		action.implicitWait(getDriver(), 1);
		action.click(getDriver(), cancelbtn);

	}

	public void Click_RTA_notSure_Action() {
		// TODO Auto-generated method stub
		action.implicitWait(getDriver(), 1);
		action.click(getDriver(), RTAIamnotsureaction);

	}
	@FindBy(xpath = "//*[@class='btn btn-primary dropdown-toggle'][@data-toggle='dropdown']")
	private WebElement RTAIamnotsureaction2;
	public void Click_RTA_notSure_Action2() {
		// TODO Auto-generated method stub
		
		
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		action.implicitWait(getDriver(), 1);
		action.click(getDriver(), RTAIamnotsureaction2);

	}
	public void Click_RTA_notSure_changetype() {
		// TODO Auto-generated method stub
		action.implicitWait(getDriver(), 1);
		action.click(getDriver(), changetype);

	}

	@FindBy(xpath = "//select[@id='ddlRecTypeRecVehicleTypeId']")
	private WebElement changedropdowntype;

	public void Click_RTA_notSure_changetype_dropdown() {
		// TODO Auto-generated method stub
		action.implicitWait(getDriver(), 1);
		action.click(getDriver(), changedropdowntype);

	}

	public void typeitem() {
		// TODO Auto-generated method stub
		action.implicitWait(getDriver(), 1);
		changedropdowntype.sendKeys(Keys.ARROW_DOWN);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@FindBy(xpath = "//input[@value='Save']")
	private WebElement save;
	
	public void save() {
		// TODO Auto-generated method stub
		save.click();
	}
	
	
	@FindBy(xpath = "//input[@value='Details']")
	private WebElement RTA_details;
	public void details() {
		// TODO Auto-generated method stub
		RTA_details.click();
	}
	@FindBy(xpath = "//body[1]/div[8]/div[1]/div[1]/div[2]/div[1]/form[1]/div[12]/div[1]/input[6]")
	private WebElement close;
	
	public void close() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		close.click();
	}

	public void refresh() {
		// TODO Auto-generated method stub
		getDriver().navigate().refresh();
		
	}
}
