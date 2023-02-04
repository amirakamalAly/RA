package SandPullOut;

import org.testng.annotations.Test;

import com.ERA.base.Base;
import com.ERA.screens.addBatteryRequestTestScreen;

public class cautionSandPullOutRequestTest extends Base {
	@Test(priority = 1)
	public void DragServiceSheet()

	{
		addBatteryRequestTestScreen Battery = new addBatteryRequestTestScreen();
		Battery.dragsheetSummery();

	}

	@Test(priority = 2)
	public void clickBackarrrow2()

	{
		addBatteryRequestTestScreen backarrow = new addBatteryRequestTestScreen();
		backarrow.clcikBackarrow();

	}

	@Test(priority = 3)
	public void confirmbackome()

	{
		addBatteryRequestTestScreen confirmbackome = new addBatteryRequestTestScreen();
		confirmbackome.comfirmbackhome();

	}
}
