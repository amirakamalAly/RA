/**
 * 
 */
package Fujirah_FleetAndAdmin;

import java.io.IOException;

import org.testng.annotations.Test;

import com.ERA.PageObject.Fleet_LoginPage;
import com.ERA.PageObject.SearchCriteria;
import com.ERA.base.BaseClass;
import com.ERA.utils.Log;

import driverApi.API_GetBaseURLTest;

/**
 * @author Amira
 *
 */
public class Fleet_Towing_AssignRequest_Test extends BaseClass {

	@Test(priority = 2)
	public void setup() throws IOException {
		String FleetURL = (String) new API_GetBaseURLTest().fleetBaseFujirahUrl();
		String browsertype = (String) new API_GetBaseURLTest().driverbrowser();
		System.out.println(browsertype);
		System.out.println(FleetURL);
		launchApp(browsertype, FleetURL);
	}

	@Test(priority = 3)
	public void loginTest() throws Throwable {
		Log.startTestCase("loginTest");
		Log.info("user is going to click on SignIn");
		Log.info("Enter Username and Password");
		Fleet_LoginPage Lin = new Fleet_LoginPage();
		Lin.LoginPage();
		Log.info("Verifying if user is able to login");
		Log.info("Login is Sucess");
		Log.endTestCase("loginTest");
	}

//	@Test(priority = 1)
//	public void minimizeScreen() throws Throwable {
//		Log.startTestCase("minimize Screen");
//		Log.info("minimize Screen");
//		minScreen scr = new minScreen();
//		scr.minScreenAction();
//		Log.info("minimize Screen is Sucess");
//		Log.endTestCase("minimize Screen");
//	}
//	@Test(priority = 4)
//	public void OpenRequest() throws Throwable {
//		Log.startTestCase("OpenRequest");
//		Log.info("Open Menu");
//		
//		RequestScreen Req = new RequestScreen();
//		Req.GoToRequest();
//		Log.info("open menu then request");
//		Log.info("OpenRequest is Sucess");
//		Log.endTestCase("OpenRequest");
//	}

	@Test(priority = 5)
	public void SearchWithjoborderId() throws Throwable {
		Log.startTestCase("SearchWithjoborderId");
		Log.info("addSearchata");

		SearchCriteria Req = new SearchCriteria();
		Req.SearchWithjoborderId();
		

		Log.info("SearchWithjoborderId is Sucess");
		Log.endTestCase("SearchWithjoborderId");
	}

//	@Test(priority = 6)
//	public void clcikAction() {
//		Log.startTestCase("clcik Action Button");
//		SearchCriteria Req = new SearchCriteria();
//		Req.ClickRTAAction();
//		Log.info("clcik Action Button is Sucess");
//		Log.endTestCase("clcik Action Button");
//	}
	@Test(priority = 7)
	public void Clickdetails() {
		Log.startTestCase("clcik details Button");
		SearchCriteria Req = new SearchCriteria();
		Req.Click_Fujirah_details();
		Log.info("clcik details Button is Sucess");
		Log.endTestCase("clcik details Button");
	}

	
	@Test(priority = 9)
	public void clcikAssignbutton() {
		Log.startTestCase("clcik Assign Button");
		SearchCriteria Req = new SearchCriteria();
		Req.clcik_RTA_Assignbutton();
		Log.info("clcik Assign Button is Sucess");
		Log.endTestCase("clcik Assign Button");
	}

	@Test(priority = 10)
	public void SerchWithdriverName() throws Throwable {
		Log.startTestCase("Search With driver Name");
		SearchCriteria Req = new SearchCriteria();
		Req.SerchWithdriverName();
		Log.info("Search With driver Name is done ");
		Log.endTestCase("Search With driver Name");
	}

	@Test(priority = 11)
	public void selectdriverfromList() {
		Log.startTestCase("select driver from List");
		SearchCriteria Req = new SearchCriteria();
		Req.selectdriverfromList();
		Log.info("clcik on driver from List");
		Log.endTestCase("select driver from List");
	}
	@Test(priority = 12)
	public void confirmAssign() {
		Log.startTestCase("confirm Assign ");
		SearchCriteria Req = new SearchCriteria();
		Req.confirmAssign();
		Log.info("clcik confirm assign is Sucess");
		Log.endTestCase("confirm Assign");
	}
}
