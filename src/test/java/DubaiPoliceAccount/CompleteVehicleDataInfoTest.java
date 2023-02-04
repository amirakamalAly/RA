package DubaiPoliceAccount;

import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.CompleteVehicleDataScreen;

public class CompleteVehicleDataInfoTest extends Base {

	@Test(priority = 1)
	public void confirmRequestCompletedTest() {
		CompleteVehicleDataScreen viewdata = new CompleteVehicleDataScreen();
		viewdata.ViewRequestdata();
	}
	
	@Test(priority = 2)
	public void clcikcompletebuttonTest() {
		CompleteVehicleDataScreen viewdata = new CompleteVehicleDataScreen();
		viewdata.clcikcompletebutton();
	}
}
//
