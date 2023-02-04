package RTA;

import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.PlateDataScreen;

public class UpdatePlatedataTest extends Base {

	

	@Test(priority = 1)
	public void SwitchToggleOffTest() {
		PlateDataScreen toggle = new PlateDataScreen();
		toggle.switchToggleOff();
		
	}
	@Test(priority = 2)
	public void SwitchToggleONTest() {
		PlateDataScreen toggle = new PlateDataScreen();
		toggle.switchToggleON();
		
	}
	
	@Test(priority = 3)
	public void ClickEmirateListTest() {
		PlateDataScreen emirate = new PlateDataScreen();
		emirate.clickEmirateList();
	}
	
	@Test(priority = 4)
	public void ClickEmirateListItemTest() {
		PlateDataScreen emirate = new PlateDataScreen();
		emirate.UpdateEmirateItemList();
	}
	
	
	@Test(priority = 5)
	public void ClickCodeListTest() {
		PlateDataScreen code = new PlateDataScreen();
		code.clickCodeList();
	}
	@Test(priority = 6)
	public void ClickcodeItemListTest() {
		PlateDataScreen emirate = new PlateDataScreen();
		emirate.UpdatecodeItemList();
	}
	
	@Test(dataProvider = "UpdateVehicleData",priority = 7)
	public void AddPlateNumberTest(String vinnumber,String ownerfullname,String ownermobilenumber,String ownerlicencenumber,String plateNumber,String morgateto,String reason,String casenumber,String notes,String custodynotes) {
		PlateDataScreen licencenumber = new PlateDataScreen();
		licencenumber.addplatenumber(plateNumber);
	}
	@Test(priority = 8)
	public void ConfirmPlateTest() {
		PlateDataScreen confirm = new PlateDataScreen();
		confirm.clickconfirm();
	}
	
	
	}
//
