package Battery;

import org.testng.annotations.Test;

import com.ERA.base.Base;
import com.ERA.screens.addBatteryRequestTestScreen;

public class Confirm_PaymentTest extends Base {

	@Test(priority = 1)
	public void ConfirmPayment()

	{
		addBatteryRequestTestScreen con = new addBatteryRequestTestScreen();
		con.confrim_Payment();

	}

}
