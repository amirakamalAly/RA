package DubaiPoliceAccount;

import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.PlateDataScreen;

public class ScrollDownTest extends Base {

	

	@Test(priority = 1)
	public void SwitchToggleOffTest() {
		PlateDataScreen Scroll = new PlateDataScreen();
		Scroll.Scrolldown();
		
	}	}
//
