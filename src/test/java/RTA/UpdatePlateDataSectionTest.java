package RTA;

import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.CompleteVehicleDataScreen;

public class UpdatePlateDataSectionTest extends Base {

	@Test(priority = 1)
	public void ClickownerdataTest() {
		CompleteVehicleDataScreen editPlateicon = new CompleteVehicleDataScreen();
		editPlateicon.editPlateIcon();
	}
	
	
}
	
	