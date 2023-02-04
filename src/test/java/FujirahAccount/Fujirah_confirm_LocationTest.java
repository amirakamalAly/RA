package FujirahAccount;

import org.testng.annotations.Test;

import com.ERA.base.Base;
import com.ERA.screens.DubaiPoliceLocationScreen;

public class Fujirah_confirm_LocationTest extends Base {

	@Test(priority = 1)
	public void confirmlocation()

	{
		DubaiPoliceLocationScreen confm = new DubaiPoliceLocationScreen();
		confm.Selectconfirmbtn();

	}

}
