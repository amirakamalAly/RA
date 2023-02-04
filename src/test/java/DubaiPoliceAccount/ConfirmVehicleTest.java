package DubaiPoliceAccount;

import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.CompleteVehicleDataScreen;

public class ConfirmVehicleTest extends Base {

	@Test(priority = 1)
	public void confirmVehicleTest() {
		CompleteVehicleDataScreen confirm = new CompleteVehicleDataScreen();
		confirm.ConfirmVehicle();
	}
	
	}
//
