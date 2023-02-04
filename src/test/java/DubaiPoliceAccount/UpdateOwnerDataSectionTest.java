package DubaiPoliceAccount;

import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.OwnerDataScreen;

public class UpdateOwnerDataSectionTest extends Base {

	@Test(dataProvider = "UpdateVehicleData",priority = 1)
	public void AddOwnerNameTest(String vinnumber,String ownerfullname,String ownermobilenumber,String ownerlicencenumber,String plateNumber,String morgateto,String reason,String casenumber,String notes,String custodynotes) {
		OwnerDataScreen ownername = new OwnerDataScreen();
		ownername.addOwnerName(ownerfullname);
	}
	
	@Test(dataProvider = "UpdateVehicleData",priority = 2)
	public void AddOwnerMobileNumberTest(String vinnumber,String ownerfullname,String ownermobilenumber,String ownerlicencenumber,String plateNumber,String morgateto,String reason,String casenumber,String notes,String custodynotes) {
		OwnerDataScreen ownermobile = new OwnerDataScreen();
		ownermobile.addOwnerMobileNumber(ownermobilenumber);
	}
	@Test(dataProvider = "UpdateVehicleData",priority = 3)
	public void AddLicenceNumberTest(String vinnumber,String ownerfullname,String ownermobilenumber,String ownerlicencenumber,String plateNumber,String morgateto,String reason,String casenumber,String notes,String custodynotes) {
		OwnerDataScreen licencenumber = new OwnerDataScreen();
		licencenumber.addownerlicencenumber(ownerlicencenumber);
	}
	
	@Test(priority = 4)
	public void AddLicenceIssueDate() {
		OwnerDataScreen calender = new OwnerDataScreen();
		calender.clcikcalenderdate();
		
	}

	
	@Test(priority = 6)
	public void Clcikcalenderday() {
		OwnerDataScreen calenderday = new OwnerDataScreen();
		calenderday.clcikcalenderday();
		
	}

	@Test(priority = 7)
	public void Clcikconfirmcalendar() {
		OwnerDataScreen confirm = new OwnerDataScreen();
		confirm.clcikconfirmcalendar();
		
	}
	
	@Test(priority = 8)
	public void ConfirmOwnerdata() {
		OwnerDataScreen confirm = new OwnerDataScreen();
		confirm.confirmOwnerdata();
		
	}
}
//
