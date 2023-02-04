package RTA;

import org.testng.annotations.Test;

import com.ERA.base.Base;
import com.ERA.screens.DubaiPoliceLocationScreen;

public class SaveAsDraftTest extends Base {

	@Test(priority = 1)
	public void clickBack()

	{

		DubaiPoliceLocationScreen back = new DubaiPoliceLocationScreen();
		back.ClickBack();

	}

	@Test(priority = 2)
	public void SaveAsdraft() throws InterruptedException

	{
		DubaiPoliceLocationScreen draft = new DubaiPoliceLocationScreen();
		draft.SaveAsraft();
		

	}

}
