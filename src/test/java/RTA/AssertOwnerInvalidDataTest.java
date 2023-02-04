package RTA;

import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.OwnerDataScreen;

public class AssertOwnerInvalidDataTest extends Base {

	
	
	@Test(priority = 1)
	public void AssertValidationTest() {
		OwnerDataScreen textassert = new OwnerDataScreen();
		textassert.assertError();
	}
	
	}
//
