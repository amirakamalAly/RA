package RTA;

import org.testng.annotations.Test;

import com.ERA.base.Base;
import com.ERA.screens.CompleteVehicleDataScreen;

public class AssertVehicleDataTest extends Base {

	@Test(priority = 1)

	public void  AssertVehicleDataSection() throws InterruptedException {
		CompleteVehicleDataScreen vehicledata = new CompleteVehicleDataScreen();
		vehicledata.AssertVehicleData();
	}

//	}	
}
