package common;

import com.ERA.base.Base;
import com.ERA.screens.submittedRequestScreen;

import org.testng.annotations.Test;


public class SubmittedRequestTest extends Base {

	@Test(priority = 1)
	public void ClickSubmittedRequest()

	{
		submittedRequestScreen submittedRequest = new submittedRequestScreen();
		submittedRequest.ClickSubmittedRequest();

	}
	

}

