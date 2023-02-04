package FujirahAccount;

import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.CompleteVehicleDataScreen;

public class SelectYearTest extends Base {

	@Test(priority = 1)
	public void ClickYearTest() {
		CompleteVehicleDataScreen year = new CompleteVehicleDataScreen();
		year.SelectYear();
	}
	
	@Test(priority = 2)
	public void SelectYearItemTest() {
		CompleteVehicleDataScreen YearItem = new CompleteVehicleDataScreen();
		YearItem.SelectYearItem();
	}
	
	}
//
