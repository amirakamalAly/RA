package DubaiPoliceAccount;

import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.CompleteVehicleDataScreen;

public class SelectColorTest extends Base {

	@Test(priority = 1)
	public void ClickColorTest() {
		CompleteVehicleDataScreen color = new CompleteVehicleDataScreen();
		color.SelectColor();
	}
	
	@Test(priority = 2)
	public void SelectColorItemTest() {
		CompleteVehicleDataScreen ColorItem = new CompleteVehicleDataScreen();
		ColorItem.SelectColorItem();
	}
}
	
	