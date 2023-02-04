package common;

import org.testng.annotations.Test;

import com.ERA.base.Base;
import com.ERA.screens.CompleteVehicleDataScreen;


public class FristItemDetailsTest extends Base {
@Test(priority =1)
public void ClickFristItem()

	{
	CompleteVehicleDataScreen item = new CompleteVehicleDataScreen();
	item.itemclick();
	}

}
	
