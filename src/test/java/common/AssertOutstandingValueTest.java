package common;

import org.testng.annotations.Test;

import com.ERA.base.Base;
import com.ERA.screens.AssertOutstandingValueScreen;


public class AssertOutstandingValueTest extends Base {
@Test(priority =1)
public void AssertOutstandingValue()

	{
	AssertOutstandingValueScreen Assert = new AssertOutstandingValueScreen();
	Assert.AssertOutstandingValue();
	}


}
