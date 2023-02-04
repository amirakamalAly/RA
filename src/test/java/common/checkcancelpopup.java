package common;

import com.ERA.base.Base;
import com.ERA.screens.cancelPopupScreen;

import org.testng.annotations.Test;


public class checkcancelpopup extends Base {

	@Test(priority = 1)
	public void cancelLink()

	{
		cancelPopupScreen cancel = new cancelPopupScreen();
		cancel.clcikCancel();

	}
	@Test(priority = 2)
	public void cancelPopup()

	{
		cancelPopupScreen cancel = new cancelPopupScreen();
		cancel.clcikButton();

	}
	

}

