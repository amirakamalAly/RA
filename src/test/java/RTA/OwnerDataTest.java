package RTA;

import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.OwnerDataScreen;

public class OwnerDataTest extends Base {

	@Test(dataProvider = "CompleteVehicleData",priority = 1)
	public void AddOwnerNameTest(String vinnumber,String ownerfullname,String ownermobilenumber,String ownerlicencenumber,String plateNumber,String morgateto,String reason,String casenumber,String notes,String custodynotes) {
		OwnerDataScreen ownername = new OwnerDataScreen();
		ownername.addRTAOwnerName(ownerfullname);
	}
	}
//
