package FujirahAccount;

import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.CompleteVehicleDataScreen;

public class SelectNowCollectDateTest extends Base {

	@Test(priority = 1)
	public void SelectNowCollectDate() {
		CompleteVehicleDataScreen collectdate = new CompleteVehicleDataScreen();
		collectdate.selectcollectdate();
	}
	
	}
//
