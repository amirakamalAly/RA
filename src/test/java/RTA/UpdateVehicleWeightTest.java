package RTA;

import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.CompleteVehicleDataScreen;

public class UpdateVehicleWeightTest extends Base {

	@Test(priority = 1)
	public void ClickWeightTest() {
		CompleteVehicleDataScreen weightlist = new CompleteVehicleDataScreen();
		weightlist.Selectweightlist();
	}
	
	@Test(priority = 2)
	public void SelectweightListItemTest() {
		CompleteVehicleDataScreen weightlistItem = new CompleteVehicleDataScreen();
		weightlistItem.UpdateweightlistItem();
	}
	}
//
