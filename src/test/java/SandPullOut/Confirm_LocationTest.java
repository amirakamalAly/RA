package SandPullOut;

import org.testng.annotations.Test;

import com.ERA.base.Base;
import com.ERA.screens.addBatteryRequestTestScreen;

public class Confirm_LocationTest extends Base {

	@Test(priority = 1)
	public void Confirm_location()

	{
		addBatteryRequestTestScreen con = new addBatteryRequestTestScreen();
		con.confrim_location();

	}

}
