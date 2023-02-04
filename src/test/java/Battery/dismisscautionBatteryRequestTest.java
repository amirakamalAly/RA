package Battery;

import org.testng.annotations.Test;

import com.ERA.base.Base;
import com.ERA.screens.addBatteryRequestTestScreen;
import com.ERA.screens.addNormalTowingRequest;


public class dismisscautionBatteryRequestTest  extends Base {

	
	@Test(priority = 1)
	public void DragServiceSheetSummery()

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
		public void dissmisscaution()

		{
			addNormalTowingRequest confirmbackome = new addNormalTowingRequest();
			confirmbackome.dissmisscaution();

		}

}
