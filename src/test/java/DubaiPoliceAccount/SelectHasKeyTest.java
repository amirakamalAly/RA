package DubaiPoliceAccount;

import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.CompleteVehicleDataScreen;

public class SelectHasKeyTest extends Base {

	@Test(priority = 1)
	public void HasKeyTest() {
		CompleteVehicleDataScreen key = new CompleteVehicleDataScreen();
		key.SelectHasKeySwitch();
	}
	
	}
//
