/**
 * 
 */
package RTA_FleetAndAdmin;

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
public class Fleet_IamNotSure_AssignRequest_Test extends BaseClass {

	@Test(priority = 2)
	public void setup() throws IOException {
		String FleetURL = (String) new API_GetBaseURLTest().RTA_fleetBaseUrl();
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

	@Test(priority = 5)
	public void SearchWithjoborderId() throws Throwable {
		Log.startTestCase("SearchWithjoborderId");
		Log.info("addSearchata");

		SearchCriteria Req = new SearchCriteria();
		Req.SearchWithjoborderId();
		

		Log.info("SearchWithjoborderId is Sucess");
		Log.endTestCase("SearchWithjoborderId");
	}

	@Test(priority = 6)
	public void clickAction() {
		Log.startTestCase("clcik Action Button");
		SearchCriteria Req = new SearchCriteria();
		Req.Click_RTA_notSure_Action();
		Log.info("clcik Action Button is Sucess");
		Log.endTestCase("clcik Action Button");
	}
	
	@Test(priority = 7)
	public void changeRecoverytype() {
		Log.startTestCase("change reqvery type");
		SearchCriteria Req = new SearchCriteria();
		Req.Click_RTA_notSure_changetype();
		Log.info("change reqvery type is Sucess");
		Log.endTestCase("change reqvery type");
	}
	
	@Test(priority = 8)
	public void selectrecoverytype() {
		Log.startTestCase("selectrecoverytype");
		SearchCriteria Req = new SearchCriteria();
		Req.Click_RTA_notSure_changetype_dropdown();
		Log.info("selectrecoverytypeis Sucess");
		Log.endTestCase("selectrecoverytype");
	}
	
	@Test(priority = 9)
	public void item_selection() {
		Log.startTestCase("item selection");
		SearchCriteria Req = new SearchCriteria();
		Req.typeitem();
		Log.info("item selection is Sucess");
		Log.endTestCase("item selection");
	}
	
	@Test(priority = 10)
	public void save() {
		Log.startTestCase("save selection");
		SearchCriteria Req = new SearchCriteria();
		Req.save();
		Log.info("save selection is Sucess");
		Log.endTestCase("save selection");
	}
	@Test(priority = 11)
	public void refresh() throws Throwable {
		

		SearchCriteria Req = new SearchCriteria();
		Req.refresh();
		

		Log.info("refresh is Sucess");
		
	}
	@Test(priority = 12)
	public void SearchWithjoborderId2() throws Throwable {
		Log.startTestCase("SearchWithjoborderId");
		Log.info("addSearchata");

		SearchCriteria Req = new SearchCriteria();
		Req.SearchWithjoborderId();
		

		Log.info("SearchWithjoborderId is Sucess");
		Log.endTestCase("SearchWithjoborderId");
	}
	@Test(priority =13)
	public void actionbutton2() {
		Log.startTestCase("change reqvery type");
		SearchCriteria Req = new SearchCriteria();
		Req.Click_RTA_notSure_Action2();
		Log.info("change reqvery type is Sucess");
		Log.endTestCase("change reqvery type");
	}
	@Test(priority =14)
	public void Clickdetails() {
		Log.startTestCase("clcik details Button");
		SearchCriteria Req = new SearchCriteria();
		Req.details();
		Log.info("clcik details Button is Sucess");
		Log.endTestCase("clcik details Button");
	}

	
	@Test(priority =15)
	public void clcikAssignbutton() {
		Log.startTestCase("clcik Assign Button");
		SearchCriteria Req = new SearchCriteria();
		Req.clcik_RTA_Assignbutton();
		Log.info("clcik Assign Button is Sucess");
		Log.endTestCase("clcik Assign Button");
	}
	
	


	
	@Test(priority =16)
	public void SerchWithdriverName() throws Throwable {
		Log.startTestCase("Search With driver Name");
		SearchCriteria Req = new SearchCriteria();
		Req.SerchWithdriverName();
		Log.info("Search With driver Name is done ");
		Log.endTestCase("Search With driver Name");
	}

	@Test(priority = 17)
	public void selectdriverfromList() {
		Log.startTestCase("select driver from List");
		SearchCriteria Req = new SearchCriteria();
		Req.selectdriverfromList();
		Log.info("clcik on driver from List");
		Log.endTestCase("select driver from List");
	}
	@Test(priority = 18)
	public void confirmAssign() {
		Log.startTestCase("confirm Assign ");
		SearchCriteria Req = new SearchCriteria();
		Req.confirmAssign();
		Log.info("clcik confirm assign is Sucess");
		Log.endTestCase("confirm Assign");
	}
}
