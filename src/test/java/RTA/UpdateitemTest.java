package RTA;

import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.PlateDataScreen;

public class UpdateitemTest extends Base {
	@Test(priority = 1)
	public void UpdateIcon() {
		PlateDataScreen editicon = new PlateDataScreen();
		editicon.edit();
	}

	@Test(priority = 2)
	public void ClickReasondropdown() {
		PlateDataScreen item = new PlateDataScreen();
		item.clickitemtype();
	}

	@Test(priority = 3)
	public void SelectItem() {
		PlateDataScreen item = new PlateDataScreen();
		item.clickeitemfromdropdown();
	}
	@Test(priority = 4,dataProvider = "UpdateVehicleData")
	public void SEdititemname(String vinnumber, String ownerfullname, String ownermobilenumber,
			String ownerlicencenumber, String plateNumber, String morgateto, String reason, String casenumber,
			String notes, String custodynotes) {
		PlateDataScreen itemname = new PlateDataScreen();
		itemname.edititemname(ownerfullname);
	}
	@Test(priority =5)
	public void clickSave() {
		PlateDataScreen save = new PlateDataScreen();
		save.clicksave();
	}
}
