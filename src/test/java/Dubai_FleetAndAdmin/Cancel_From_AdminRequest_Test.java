/**
 * 
 */
package Dubai_FleetAndAdmin;

import java.io.IOException;
import org.testng.annotations.Test;
import com.ERA.PageObject.LoginPage;
import com.ERA.base.BaseClass;
import com.ERA.utils.Log;

import com.ERA.PageObject.RequestScreen;
import com.ERA.PageObject.SearchCriteria;
import com.ERA.dataprovider.DataProviders;
import driverApi.API_GetBaseURLTest;
import com.ERA.PageObject.GetRequestAndJobOrderID;

/**
 * @author Amira
 *
 */
public class Cancel_From_AdminRequest_Test extends BaseClass {

	@Test(priority = 2)
	public void setup() throws IOException {
		String adminBaseURL = (String) new API_GetBaseURLTest().adminBaseUrl();
		String browser = (String) new API_GetBaseURLTest().driverbrowser();
		System.out.println(browser);
		System.out.println(adminBaseURL);
		launchApp(browser, adminBaseURL);
	}

	@Test(priority = 3)
	public void loginTest() throws Throwable {
		Log.startTestCase("loginTest");
		Log.info("user is going to click on SignIn");
		Log.info("Enter Username and Password");
		LoginPage Lin = new LoginPage();
		Lin.login();
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
	@Test(priority = 4)
	public void OpenRequest() throws Throwable {
		Log.startTestCase("OpenRequest");
		Log.info("Open Menu");

		RequestScreen Req = new RequestScreen();
		Req.GoToRequest();
		Log.info("open menu then request");
		Log.info("OpenRequest is Sucess");
		Log.endTestCase("OpenRequest");
	}

	@Test(priority = 5, dataProvider = "loginPoliceAccount", dataProviderClass = DataProviders.class)
	public void SearchWithMobileNumber(String Name, String MobileNumber,String ValidMilitaryNumber, String ValidDepartment,String InValidMilitaryNumber, String InValidDepartment,String InvalidName) throws Throwable {
		Log.startTestCase("SearchWithMobileNumber");
		Log.info("addSearchata");

		SearchCriteria Req = new SearchCriteria();
		Req.SearchCriteriaAction(Name, MobileNumber);
		Log.info("open SearchWithMobileNumber");
		Log.info("SearchWithMobileNumber is Sucess");
		Log.endTestCase("SearchWithMobileNumber");
	}

	@Test(priority = 6, dataProvider = "loginPoliceAccount", dataProviderClass = DataProviders.class)
	public void GetRequestAndJobOrderID(String Name, String MobileNumber,String ValidMilitaryNumber, String ValidDepartment,String InValidMilitaryNumber, String InValidDepartment,String InvalidName) {
		Log.startTestCase("GetRequestAndJobOrderID");
		Log.info("addSearchata");

		GetRequestAndJobOrderID Req = new GetRequestAndJobOrderID();

		try {
			Req.GetGobOrderID(Name, MobileNumber);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String orderId = Req.getJobOrderId();
		Log.info("execute GetRequestAndJobOrderID=" + orderId);

		Log.info("GetRequestAndJobOrderID is Sucess");
		Log.endTestCase("GetRequestAndJobOrderID");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 6)
	public void OpenAction() throws Throwable {
		Log.startTestCase("OpenAction");
		Log.info("OpenAction");
		SearchCriteria Req = new SearchCriteria();
		Req.OpenAction();
		Log.info("OpenAction is Sucess");
		Log.endTestCase("End OpenAction");
	}

	@Test(priority = 7)
	public void Cancel() throws Throwable {
		Log.startTestCase("cancel");
		Log.info("click cancel");
		SearchCriteria Req = new SearchCriteria();
		Req.cancel();
		Log.info("click cancel is Sucess");
		Log.endTestCase("cancel");
	}

	@Test(priority = 8)
	public void Confirm_cancel() throws Throwable {
		Log.startTestCase("Confirm_cancel");
		Log.info("Confirm_cancel");
		SearchCriteria Req = new SearchCriteria();
		Req.confirm_cancel();
		Log.info("Confirm_cancel is Sucess");
		Log.endTestCase("Confirm_cancel");
	}
}
