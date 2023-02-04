package DubaiPoliceAccount;

import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.PlateDataScreen;

public class PlatedataTest extends Base {

	
	
	@Test(priority = 1)
	public void ClickEmirateListTest() {
		PlateDataScreen emirate = new PlateDataScreen();
		emirate.clickEmirateList();
	}
	
	@Test(priority = 2)
	public void ClickEmirateListItemTest() {
		PlateDataScreen emirate = new PlateDataScreen();
		emirate.clickEmirateItemList();
	}
	
	
	@Test(priority = 3)
	public void ClickCodeListTest() {
		PlateDataScreen code = new PlateDataScreen();
		code.clickCodeList();
	}
	@Test(priority = 4)
	public void ClickcodeItemListTest() {
		PlateDataScreen emirate = new PlateDataScreen();
		emirate.clickcodeItemList();
	}
	
	@Test(dataProvider = "CompleteVehicleData",priority = 5)
	public void AddPlateNumberTest(String vinnumber,String ownerfullname,String ownermobilenumber,String ownerlicencenumber,String plateNumber,String morgateto,String reason,String casenumber,String notes,String custodynotes) {
		PlateDataScreen licencenumber = new PlateDataScreen();
		licencenumber.addplatenumber(plateNumber);
	}
	
	@Test(priority = 6)
	public void SwitchToggleOffTest() {
		PlateDataScreen toggle = new PlateDataScreen();
		toggle.switchToggleOff();
		
	}
	@Test(priority = 7)
	public void SwitchToggleONTest() {
		PlateDataScreen toggle = new PlateDataScreen();
		toggle.switchToggleON();
		
	}
	
	@Test(priority = 8)
	public void ClickEmirateListTest2() {
		PlateDataScreen emirate = new PlateDataScreen();
		emirate.clickEmirateList2();
	}
	
	@Test(priority = 9)
	public void ClickEmirateListItemTest2() {
		PlateDataScreen emirate = new PlateDataScreen();
		emirate.clickEmirateItemList2();
	}
	
	
	
//	@Test(priority = 10)
//	public void ClickcodeItemListTest2() {
//		PlateDataScreen emirate = new PlateDataScreen();
//		emirate.clickEmirateItemList2();
//	}
	
	@Test(dataProvider = "CompleteVehicleData",priority = 11)
	public void AddPlateNumberTest2(String vinnumber,String ownerfullname,String ownermobilenumber,String ownerlicencenumber,String plateNumber,String morgateto,String reason,String casenumber,String notes,String custodynotes) {
		PlateDataScreen platenumber = new PlateDataScreen();
		platenumber.addplatenumber(plateNumber);
	}
	@Test(priority = 12)
	public void ConfirmplatedataTest() {
		PlateDataScreen emirate = new PlateDataScreen();
		emirate.Confirmplatedata();
	}
	
	
	}
//
