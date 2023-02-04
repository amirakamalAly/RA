package RTA;

import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.CompleteVehicleDataScreen;

public class UpdatechassisNumberTest extends Base {

	@Test(dataProvider = "UpdateVehicleData",priority = 1)
	public void ChassisNumberTest(String vinnumber,String ownerfullname,String ownermobilenumber,String ownerlicencenumber,String plateNumber,String morgateto,String reason,String casenumber,String notes,String custodynotes) {
		CompleteVehicleDataScreen ChassisNumber = new CompleteVehicleDataScreen();
		ChassisNumber.UpdateChassisNumber(vinnumber);
	}
	
	}
//
