package RTA;

import org.testng.annotations.Test;
import com.ERA.base.Base;

public class checkProfileValidationTest extends Base {

	@Test(priority = 1)
	public void AClickSave() throws InterruptedException {
		RTAProfileScreen save = new RTAProfileScreen();
		save.clciksave();
	}

	@Test(priority = 2)
	public void validateNameError() {
		RTAProfileScreen nameError = new RTAProfileScreen();
		nameError.validateNameMandatoryMessage();
	}

	@Test(priority = 3)
	public void validateIDError()

	{
		RTAProfileScreen IdError = new RTAProfileScreen();
		IdError.validateIDMandatoryMessage();
	}

	
	

}
