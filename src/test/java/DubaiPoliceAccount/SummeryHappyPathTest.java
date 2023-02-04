package DubaiPoliceAccount;

import org.testng.annotations.Test;

import com.ERA.base.Base;
import com.ERA.screens.DubaiPoliceLocationScreen;
import com.ERA.screens.EditLocationScreen;
import com.ERA.screens.ImageScreen;
import com.ERA.screens.PoliceSubServiceScreen;

public class SummeryHappyPathTest extends Base {

	
	@Test(priority = 1)
	public void confirmSummery() {
		EditLocationScreen confirmSummery = new EditLocationScreen();
		confirmSummery.confirmSummery();
	}
	
	@Test(priority = 2)
	public void viewRequestetails() {
		EditLocationScreen viewRequestetails = new EditLocationScreen();
		viewRequestetails.viewRequestetails();
	}
	
	@Test(priority = 3)
	public void finish() {
		EditLocationScreen finish = new EditLocationScreen();
		finish.clickfinish();
	}
}
