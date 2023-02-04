/**
 * 
 */
package Dubai_FleetAndAdmin;

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
public class Check_Status_Cancel_In_Fleet_Test extends BaseClass {

	@Test(priority = 2)
	public void setup() throws IOException {
		String FleetURL = (String) new API_GetBaseURLTest().fleetBaseDubaiUrl();
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
	public void check_Request_is_Cancelled() {
		Log.startTestCase("check Request Not Found in list");
		SearchCriteria Req = new SearchCriteria();
		Req.checkRequestNotFoundinlist();
		Log.info("\"check Request Not Found in list\" is Sucess");
		Log.endTestCase("check Request Not Found in list");
	}

}
