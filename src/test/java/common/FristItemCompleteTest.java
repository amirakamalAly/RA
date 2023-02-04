package common;

import org.testng.annotations.Test;

import com.ERA.base.Base;
import com.ERA.screens.CompleteVehicleDataScreen;


public class FristItemCompleteTest extends Base {
@Test(priority =1)
public void ClickFristItem()

	{
	CompleteVehicleDataScreen item = new CompleteVehicleDataScreen();
	item.itemclick();
	}
	@Test(priority = 2)
	public void completeData()

	{
		CompleteVehicleDataScreen item = new CompleteVehicleDataScreen();
		item.clcikitemclick();
	}

	@Test(priority = 3)
	public void completeVehData()

	{
		CompleteVehicleDataScreen item = new CompleteVehicleDataScreen();
		item.completeVehicleclcik();
	}


}
	
