package SandPullOut;

import org.testng.annotations.Test;

import com.ERA.base.Base;
import com.ERA.screens.addBatteryRequestTestScreen;

public class Confirm_SummeryTest extends Base {

	@Test(priority = 1)
	public void ConfirmSummery()

	{
		addBatteryRequestTestScreen con = new addBatteryRequestTestScreen();
		con.confrim_Summery();

	}

}
