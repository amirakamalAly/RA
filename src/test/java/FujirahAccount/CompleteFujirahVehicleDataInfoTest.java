package FujirahAccount;

import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.CompleteVehicleDataScreen;

public class CompleteFujirahVehicleDataInfoTest extends Base {

	@Test(dataProvider = "FujirahVehicleData", priority = 1)
	public void AddRefrenceNumberTest(String vinnumber ,String refrencenumber) {
		CompleteVehicleDataScreen refNum = new CompleteVehicleDataScreen();
		refNum.addrefrencenumber(vinnumber,refrencenumber);
	}
	
//	@Test(dataProvider = "loginFujirahAccount", priority = 2)
//	public void clcikcompletebuttonTest() {
//		CompleteVehicleDataScreen viewdata = new CompleteVehicleDataScreen();
//		viewdata.clcikcompletebutton();
//	}
}
//
