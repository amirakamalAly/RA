package FujirahAccount;

import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.CompleteVehicleDataScreen;

public class chassisNumberTest extends Base {

	@Test(dataProvider = "FujirahVehicleData",priority = 1)
	public void ChassisNumberTest(String vinnumber ,String refrencenumber) {
		CompleteVehicleDataScreen ChassisNumber = new CompleteVehicleDataScreen();
		ChassisNumber.AddChassisNumber(vinnumber);
	}
	
	}
//
