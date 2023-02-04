package login;

import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.AssertInvalidLoginMobileNumberScreen;
import com.ERA.screens.ClickloginbuttonfromHomescreen;


public class LoginWithInvalidMobileNumberTest extends Base {

	@Test(priority = 3)
	public void clcikLogin()

	{
		ClickloginbuttonfromHomescreen clicklogin = new ClickloginbuttonfromHomescreen();
		clicklogin.Clickloginbutton();

	}

	@Test(priority = 4)

	public void SelectCountyCode()

	{
		ClickloginbuttonfromHomescreen countrycode = new ClickloginbuttonfromHomescreen();
		countrycode.Clickcounrtycode();

	}

	@Test(priority = 5)

	public void Searchforcounrty()

	{

		ClickloginbuttonfromHomescreen Search = new ClickloginbuttonfromHomescreen();
		Search.Searchcounrtycode();

	}

	@Test(priority = 6)

	public void SelectEgypt()

	{
		ClickloginbuttonfromHomescreen countryEgypt = new ClickloginbuttonfromHomescreen();
		countryEgypt.ClickEgypt();

	}

	@Test(dataProvider = "InvalidMobileNumber", priority = 7)

	public void addMobileNumber(String Name, String MobileNumber)

	{
		System.out.println(
				"entring  mobile number from excel sheet to mobile number verfication screen  " + MobileNumber);
		ClickloginbuttonfromHomescreen MobileNumberq = new ClickloginbuttonfromHomescreen();
		MobileNumberq.AddMobileNumberScreen(Name, MobileNumber);

	}

	@Test(priority = 8)
	public void clickContinue()


	{
		ClickloginbuttonfromHomescreen continueBtn = new ClickloginbuttonfromHomescreen();
		continueBtn.continueBtnclk();

	}

	
	@Test(priority = 9)
	public void AssertInvalidLoginMobileNumber()

	{
		AssertInvalidLoginMobileNumberScreen Dvw = new AssertInvalidLoginMobileNumberScreen();
		Dvw.AssertInvalidLoginMobileNumber();

	}
	
	@Test(priority = 10)
	public void ClickBackTOHome()

	{
		ClickloginbuttonfromHomescreen Back = new ClickloginbuttonfromHomescreen();
		Back.ClickBackHome();
		
}

}
