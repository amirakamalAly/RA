package common;

import org.testng.annotations.Test;

import com.ERA.base.Base;
import com.ERA.screens.RequestHistoryScreen;
import com.ERA.screens.TowingRateButtomsheetScreen;

public class RatesheetTest extends Base {
@Test(priority =1)
public void ratedriver()

	{
		RequestHistoryScreen rate = new RequestHistoryScreen();
		rate.ratedriver();
	}
	@Test(priority = 2)
	public void clickratingBarButton()

	{
		TowingRateButtomsheetScreen bar = new TowingRateButtomsheetScreen();
		bar.clickratingBar();
	}
	@Test(priority = 3)
	public void submitRateButton()

	{
		TowingRateButtomsheetScreen submitRateButton = new TowingRateButtomsheetScreen();
		submitRateButton.ClickButton();
	}
	

	@Test(priority = 4)
	public void assertError()
	{
		TowingRateButtomsheetScreen assertErrormessage = new TowingRateButtomsheetScreen();
		assertErrormessage.errorMessage();
	}

	@Test(priority = 5)
	public void SelectReason()
	{		TowingRateButtomsheetScreen Reason = new TowingRateButtomsheetScreen();
	Reason.SelectReason();
}
	@Test(priority = 6)
	public void IssuesTextAssert()
	{
		TowingRateButtomsheetScreen IssuesTextAssert = new TowingRateButtomsheetScreen();
		IssuesTextAssert.driverIssuesQuestion();
	}
	@Test(priority = 7)
	public void allstarts() throws InterruptedException
	{
		TowingRateButtomsheetScreen IssuesTextAssert = new TowingRateButtomsheetScreen();
		IssuesTextAssert.allstarts();
	}
	@Test(priority = 8)
public void submit5RateButton()

	{
		TowingRateButtomsheetScreen submitRateButton = new TowingRateButtomsheetScreen();
		submitRateButton.ClickButton();
	}
	@Test(priority = 9)
	public void doneRequestBtn()

	{
		TowingRateButtomsheetScreen btn = new TowingRateButtomsheetScreen();
		btn.doneRequestBtn();
	}

}
	
