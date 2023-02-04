package Battery;

import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.addBatteryRequestTestScreen;

public class NewFlow_addNormalBatteryRequestTest extends Base {

	@Test(priority = 1)
	public void DragServiceSheet() {
		addBatteryRequestTestScreen Battery = new addBatteryRequestTestScreen();
		Battery.dragsheetHome();
	}

	@Test(priority = 3)
	public void SelectBattery() {
		addBatteryRequestTestScreen Battery = new addBatteryRequestTestScreen();
		Battery.selectBattery();
	}

}
