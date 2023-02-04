/**
 * 
 */
package NormalUser_FleetAndAdmin;

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
public class Cancel_From_Fleet_Test extends BaseClass {

	@Test(priority = 2)
	public void setup() throws IOException {
		String FleetURL = (String) new API_GetBaseURLTest().fleetBaseUrl();
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
	public void clcikAction() {
		Log.startTestCase("clcik Action Button");
		SearchCriteria Req = new SearchCriteria();
		Req.ClickAction();
		Log.info("clcik Action Button is Sucess");
		Log.endTestCase("clcik Action Button");
	}
	@Test(priority = 7)
	public void Clickdetails() {
		Log.startTestCase("clcik details Button");
		SearchCriteria Req = new SearchCriteria();
		Req.Clickdetails();
		Log.info("clcik details Button is Sucess");
		Log.endTestCase("clcik details Button");
	}

	

	
	@Test(priority = 9)
	public void clcikCancelbutton() {
		Log.startTestCase("clcik cancel Button");
		SearchCriteria Req = new SearchCriteria();
		Req.clcikCancelbutton();
		Log.info("clcik cancel Button is Sucess");
		Log.endTestCase("clcik cancel Button");
	}

	@Test(priority = 10)
	public void  addnote() throws Throwable {
		Log.startTestCase("Search With driver Name");
		SearchCriteria Req = new SearchCriteria();
		Req.addNote();
		Log.info("Search With driver Name is done ");
		Log.endTestCase("Search With driver Name");
	}

	@Test(priority = 11)
	public void canceljob() {
		Log.startTestCase("select driver from List");
		SearchCriteria Req = new SearchCriteria();
		Req.cancelJob();
		Log.info("clcik on driver from List");
		Log.endTestCase("select driver from List");
	}

}
