package FujirahAccount;

import org.testng.annotations.Test;

import com.ERA.base.Base;
import com.ERA.screens.FujirahScreen;

public class UpcomingFilterTest extends Base {

	@Test(priority = 1)
	public void EditLocationIcon()

	{

		FujirahScreen EditLocationIcon = new FujirahScreen();
		EditLocationIcon.upcomingFilter();

	}

}
