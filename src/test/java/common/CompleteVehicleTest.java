package common;

import org.testng.annotations.Test;

import com.ERA.base.Base;
import com.ERA.screens.CompleteVehicleDataScreen;


public class CompleteVehicleTest extends Base {





	@Test(priority = 1)
	public void EditVehInfoData()

	{
		CompleteVehicleDataScreen item = new CompleteVehicleDataScreen();
		item.completeVehicleInfoata();
	}
	

}
	
