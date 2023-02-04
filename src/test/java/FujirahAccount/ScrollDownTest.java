package FujirahAccount;

import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.PlateDataScreen;

public class ScrollDownTest extends Base {

	

	@Test(priority = 1)
	public void ScrollDown() {
		PlateDataScreen Scroll = new PlateDataScreen();
		Scroll.VehicleScrolldown();
		
	}	}
//
