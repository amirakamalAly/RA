package RTA;

import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.RequestHistoryScreen;

public class RequestCompletedTest extends Base {

	@Test(priority = 1)
	public void confirmRequestCompletedTest() {
		RequestHistoryScreen completed = new RequestHistoryScreen();
		completed.checkStatuscompleted();
	}

}

