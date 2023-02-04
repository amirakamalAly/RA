package common;

import com.ERA.base.Base;
import com.ERA.screens.MenuScreen;
import org.testng.annotations.Test;


public class ProfilefromMenuTest extends Base {

	@Test(priority = 1)
	public void ClickProfile()

	{
		MenuScreen profile = new MenuScreen();
		profile.ClickProfileMenuIcon();

	}
	

}

