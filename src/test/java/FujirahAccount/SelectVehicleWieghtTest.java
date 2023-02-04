package FujirahAccount;

import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.CompleteVehicleDataScreen;

public class SelectVehicleWieghtTest extends Base {

	@Test(priority = 1)
	public void ClickweightlistTest() {
		CompleteVehicleDataScreen weightlist = new CompleteVehicleDataScreen();
		weightlist.Selectweightlist();
	}
	
	@Test(priority = 2)
	public void SelectweightlistItemTest() {
		CompleteVehicleDataScreen weightlistItem = new CompleteVehicleDataScreen();
		weightlistItem.SelectweightlistItem();
	}
	}
//
