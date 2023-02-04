package common;

import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.allowLocationPermission;

public class home_allowLocationPermissionTest extends Base {

	@Test(priority = 1)
	public void clickallowLocationbutton() {
		allowLocationPermission clickallowLocation = new allowLocationPermission();
		clickallowLocation.Home_ClickallowLocation();
	}

	@Test(priority = 2)
	public void clickallowlocationService() {
		allowLocationPermission clickallowLocation = new allowLocationPermission();
		clickallowLocation.allowLocationbutton2();
	}

}
