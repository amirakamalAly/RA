package RTA;

import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.CancelRequestFromAppScreen;


public class RequestCancelFromAppTest extends Base {

	@Test(priority = 1)
	public void ClickFristItemRequestHistory()

	{
		CancelRequestFromAppScreen item = new CancelRequestFromAppScreen();
		item.ClickFristItemRequestHistory();
	}
	@Test(priority = 2)
	public void preformScrollAction()

	{
		CancelRequestFromAppScreen scroll = new CancelRequestFromAppScreen();
		scroll.ScrollAction();
	}
	@Test(priority = 3)
	public void CancelRequestFromAppTest() {
		CancelRequestFromAppScreen cancel = new CancelRequestFromAppScreen();
		cancel.clickcancel();
	}

	@Test(priority = 4)
	public void confirmCancelRequestFromAppTest() {
		CancelRequestFromAppScreen cancel = new CancelRequestFromAppScreen();
		cancel.confirmCancel();
	}
	
	@Test(priority = 5)
	public void AssertCancelStatus() {
		CancelRequestFromAppScreen cancel = new CancelRequestFromAppScreen();
		cancel.assertCancel();
	}

}
//
