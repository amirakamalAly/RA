/**
 * 
 */
package NormalUser_FleetAndAdmin;

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
public class Check_Status_Cancel_In_Admin_Test extends BaseClass {

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

	@Test(priority = 5, dataProvider = "webloginUsers", dataProviderClass = DataProviders.class)
	public void SearchWithMobileNumber(String Name, String MobileNumber) throws Throwable {
		Log.startTestCase("SearchWithMobileNumber");
		Log.info("addSearchata");

		SearchCriteria Req = new SearchCriteria();
		Req.SearchCriteriaAction(Name, MobileNumber);
		Log.info("open SearchWithMobileNumber");
		Log.info("SearchWithMobileNumber is Sucess");
		Log.endTestCase("SearchWithMobileNumber");
	}

	@Test(priority = 6, dataProvider = "webloginUsers", dataProviderClass = DataProviders.class)
	public void GetRequestAndJobOrderID(String Name, String MobileNumber) {
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
	public void checkCancelStatus() throws Throwable {
		Log.startTestCase("check Cancel Status");
		Log.info("check Cancel Status");
		SearchCriteria Req = new SearchCriteria();
		Req.CheckCancelStatus();
		Log.info("check Cancel Status is Sucess");
		Log.endTestCase("End check Cancel Status");
	}

	}
