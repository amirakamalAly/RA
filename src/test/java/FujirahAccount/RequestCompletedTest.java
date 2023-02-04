package FujirahAccount;

import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.RequestHistoryScreen;

public class RequestCompletedTest extends Base {

	@Test(priority = 1)
	public void clickfristitemTest() {
		RequestHistoryScreen item = new RequestHistoryScreen();
		item.fristitemclick();
	}

	@Test(priority = 2)
	public void confirmRequestCompletedTest() {
		RequestHistoryScreen completed = new RequestHistoryScreen();
		completed.checkCompletedStatus1();
	}

}

