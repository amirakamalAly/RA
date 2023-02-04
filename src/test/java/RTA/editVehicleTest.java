package RTA;

import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.CompleteVehicleDataScreen;

public class editVehicleTest extends Base {

	@Test(priority = 1)
	public void ClickEditvehicledataTest() {
		CompleteVehicleDataScreen editicon = new CompleteVehicleDataScreen();
		editicon.SelectVehicleEditIcon();
	}

}
	
	