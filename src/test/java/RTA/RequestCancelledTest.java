package RTA;

import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.RequestHistoryScreen;

public class RequestCancelledTest extends Base {

	@Test(priority = 1)
	public void confirmRequestCancelledTest() {
		RequestHistoryScreen canceled = new RequestHistoryScreen();
		canceled.checkCancelledStatus();
	}

}
//
