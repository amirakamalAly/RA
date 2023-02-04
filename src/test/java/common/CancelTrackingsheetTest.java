package common;

import org.testng.annotations.Test;

import com.ERA.base.Base;
import com.ERA.screens.cancelTrackingSheetScreen;

public class CancelTrackingsheetTest extends Base {
	@Test(priority = 1)
	public void CancelTrackingSheet()

	{
		cancelTrackingSheetScreen cancel = new cancelTrackingSheetScreen();
		cancel.cancelTrackingSheet();
		AssertOutstandingText();
	}

	@Test(priority = 2)
	public void AssertOutstandingText()

	{
		cancelTrackingSheetScreen asert = new cancelTrackingSheetScreen();
		asert.AssertOutstandingText();
	}

	@Test(priority = 3)

	public void confirmCancelTrackingSheet()

	{
		cancelTrackingSheetScreen confirmcancel = new cancelTrackingSheetScreen();
		confirmcancel.confirmcancelTrackingSheet();
	}

}
