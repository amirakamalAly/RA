package RTA;

import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.CompleteVehicleDataScreen;

public class ContinueVehicleTest extends Base {

	@Test(priority = 1)
	public void confirmVehicleTest() {
		CompleteVehicleDataScreen confirm = new CompleteVehicleDataScreen();
		confirm.ContinueVehicle();
	}
	
	@Test(priority = 2)
	public void finishTest() {
		CompleteVehicleDataScreen finsh = new CompleteVehicleDataScreen();
		finsh.finish();
	}
	}

//
