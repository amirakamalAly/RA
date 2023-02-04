package RTA;

import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.CompleteVehicleDataScreen;
import com.ERA.screens.OwnerDataScreen;

public class InvalidOwnerDataTest extends Base {
	@Test(priority = 1)
	public void ConfirmOwnerdatawithoutAddValue() {
		OwnerDataScreen confirm = new OwnerDataScreen();
		confirm.confirmOwnerdata();

	}
	@Test(priority = 2)
	public void AssertMobileNumberTest() {
		CompleteVehicleDataScreen assertMobileNumber = new CompleteVehicleDataScreen();
		assertMobileNumber.assertMobileNumberValidation();
	}	
	
	
	@Test(priority = 3)
	public void AssertOwnerNameTest() {
		CompleteVehicleDataScreen assertOwnerName = new CompleteVehicleDataScreen();
		assertOwnerName.assertOwnerNameValidation();
	}

	@Test(dataProvider = "InvalidvehicleData",priority = 4)
	public void AddOwnerNameTest(String vinnumber,String ownerfullname,String ownermobilenumber,String ownerlicencenumber,String plateNumber,String morgateto,String reason,String casenumber,String notes,String custodynotes) {
		OwnerDataScreen ownername = new OwnerDataScreen();
		ownername.addOwnerName(ownerfullname);
	}
	
	@Test(dataProvider = "InvalidvehicleData",priority = 5)
	public void AddOwnerMobileNumberTest(String vinnumber,String ownerfullname,String ownermobilenumber,String ownerlicencenumber,String plateNumber,String morgateto,String reason,String casenumber,String notes,String custodynotes) {
		OwnerDataScreen ownermobile = new OwnerDataScreen();
		ownermobile.addOwnerMobileNumber(ownermobilenumber);
	}
	@Test(dataProvider = "InvalidvehicleData",priority = 6)
	public void AddLicenceNumberTest(String vinnumber,String ownerfullname,String ownermobilenumber,String ownerlicencenumber,String plateNumber,String morgateto,String reason,String casenumber,String notes,String custodynotes) {
		OwnerDataScreen licencenumber = new OwnerDataScreen();
		licencenumber.addownerlicencenumber(ownerlicencenumber);
	}
	
	@Test(priority = 7)
	public void AddLicenceIssueDate() {
		OwnerDataScreen calender = new OwnerDataScreen();
		calender.clcikcalenderdate();
		
	}
	
	
//	@Test(priority = 5)
//	public void SelectcalendarDate() {
//		OwnerDataScreen calenderdate = new OwnerDataScreen();
//		calenderdate.clcikcalenderdate();
//		
//	}
	
	@Test(priority = 8)
	public void Clcikcalenderday() {
		OwnerDataScreen calenderday = new OwnerDataScreen();
		calenderday.clcikcalenderday();
		
	}

	@Test(priority = 9)
	public void Clcikconfirmcalendar() {
		OwnerDataScreen confirm = new OwnerDataScreen();
		confirm.clcikconfirmcalendar();
		
	}
	
	@Test(priority = 10)
	public void ConfirmOwnerdata() {
		OwnerDataScreen confirm = new OwnerDataScreen();
		confirm.confirmOwnerdata();
		
		
	}
	

	

	
	@Test(priority = 11)
	public void AssertIssueLicenseTest() 
	{
		CompleteVehicleDataScreen assertIssueLicense = new CompleteVehicleDataScreen();
		assertIssueLicense.assertIssueLincenseValidation();
		}	

	
}

