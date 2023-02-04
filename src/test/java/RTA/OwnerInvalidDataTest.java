package RTA;

import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.OwnerDataScreen;

public class OwnerInvalidDataTest extends Base {

	@Test(dataProvider = "InvalidvehicleData",priority = 1)
	public void AddOwnerInvalidNameTest(String vinnumber,String ownerfullname,String ownermobilenumber,String ownerlicencenumber,String plateNumber,String morgateto,String reason,String casenumber,String notes,String custodynotes) {
		OwnerDataScreen ownername = new OwnerDataScreen();
		ownername.addRTAOwnerName(ownerfullname);
	}
	

	
	}
//
