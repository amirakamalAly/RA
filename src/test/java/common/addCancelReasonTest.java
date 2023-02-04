package common;

import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.cancelPopupScreen;

public class addCancelReasonTest extends Base {
	@Test(priority = 1)
	public void SelectReason()

	{
		cancelPopupScreen reason = new cancelPopupScreen();
		reason.selectreason();
	}

	@Test(priority = 2)
	public void AddReasonTextBox()

	{
		cancelPopupScreen text = new cancelPopupScreen();
		text.addreasonText();
	}

	@Test(priority = 3)

	public void ConfirmAddReason()

	{
		cancelPopupScreen confirmcancel = new cancelPopupScreen();
		confirmcancel.confirmcancel();
	}

}
