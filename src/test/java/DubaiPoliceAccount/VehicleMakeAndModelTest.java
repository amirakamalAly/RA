package DubaiPoliceAccount;

import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.CompleteVehicleDataScreen;

public class VehicleMakeAndModelTest extends Base {

	@Test(priority = 1)
	public void SelectMakeTest() {
		CompleteVehicleDataScreen make = new CompleteVehicleDataScreen();
		make.SelectMake();
	}
	
	@Test(priority = 2)
	public void dragsheetTest() {
		CompleteVehicleDataScreen make = new CompleteVehicleDataScreen();
		make.dragsheet();
	}
	
	@Test(priority = 3)
	public void SelectMakeItemTest() {
		CompleteVehicleDataScreen make = new CompleteVehicleDataScreen();
		make.selectMakeitem();
	}
	@Test(priority = 4)
	public void SelectModelTest() {
		CompleteVehicleDataScreen model = new CompleteVehicleDataScreen();
		model.selectModel();
	}
	
	
	
	@Test(priority = 5)
	public void SelectModelItemTest() {
		CompleteVehicleDataScreen modelItem = new CompleteVehicleDataScreen();
		modelItem.selectModelitem();
	}
	
	@Test(priority = 6)
	public void scrolldownTest() {
		CompleteVehicleDataScreen Scrolldown = new CompleteVehicleDataScreen();
		Scrolldown.scrolldown();
	}
}
//
