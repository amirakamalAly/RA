package RTA;

import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.CompleteVehicleDataScreen;

public class InvalidVehicleDataInfoTest extends Base {

//	@Test(priority = 1)
//	public void dragsheetTest() {
//		CompleteVehicleDataScreen make = new CompleteVehicleDataScreen();
//		make.dragsheet();
//	}
	
	
	@Test(priority = 2)
	public void scrolldownTest() {
		CompleteVehicleDataScreen Scrolldown = new CompleteVehicleDataScreen();
		Scrolldown.scrolldown();
	}
	
	@Test(priority = 3)
	public void confirmVehicleTest() {
		CompleteVehicleDataScreen confirm = new CompleteVehicleDataScreen();
		confirm.ConfirmVehicle();
	}
	
	@Test(priority = 4)
	public void AssertMandatoryModelTest() {
		CompleteVehicleDataScreen assertModel = new CompleteVehicleDataScreen();
		assertModel.assertModelValidation();
	}
	
	@Test(priority = 5)
	public void AssertMandatoryChassisNumberTest() {
		CompleteVehicleDataScreen assertChassis = new CompleteVehicleDataScreen();
		assertChassis.assertChassisValidation();
	}	
	
	@Test(priority = 6)
	public void scrollUpTest() {
		CompleteVehicleDataScreen ScrollUp = new CompleteVehicleDataScreen();
		ScrollUp.scrollUp();
	}	
	@Test(priority = 7)
	public void AssertMandatoryMakeTest() {
		CompleteVehicleDataScreen assertMake = new CompleteVehicleDataScreen();
		assertMake.assertMakeValidation();
	}
	
	@Test(priority = 8)
	public void AssertMandatoryImageTest() {
		CompleteVehicleDataScreen assertImage = new CompleteVehicleDataScreen();
		assertImage.assertImageValidation();
	}
	
	
}

