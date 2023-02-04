package RTA;

import org.testng.annotations.Test;

import com.ERA.base.Base;
import com.ERA.screens.EditLocationScreen;

public class SummeryHappyPathTest extends Base {

	
	@Test(priority = 1)
	public void confirmSummery() {
		EditLocationScreen confirmSummery = new EditLocationScreen();
		confirmSummery.confirmSummery();
	}
	
	
}
