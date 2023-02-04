package RTA;

import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.OwnerDataScreen;

public class UpdateOwnerDataSectionTest extends Base {

	@Test(dataProvider = "UpdateVehicleData", priority = 1)
	public void UpdateRTAOwnerName(String vinnumber, String ownerfullname, String ownermobilenumber,
			String ownerlicencenumber, String plateNumber, String morgateto, String reason, String casenumber,
			String notes, String custodynotes) {
		OwnerDataScreen ownername = new OwnerDataScreen();
		ownername.UpdateRTAOwnerName(ownerfullname);
	}

}
//
