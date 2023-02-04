package SandPullOut;

import org.testng.annotations.Test;

import com.ERA.base.Base;
import com.ERA.screens.addSandPullOutRequestTestScreen;

public class SuitablecarTest  extends Base {

	
	@Test(priority = 1)
	public void selectSuitableCarOption()

	{
		addSandPullOutRequestTestScreen option = new addSandPullOutRequestTestScreen();
		option.selectNearTheRoad();
		

	}
   
	@Test(priority = 2)
	public void confirmOption()

	{
		addSandPullOutRequestTestScreen confirm = new addSandPullOutRequestTestScreen();
		confirm.confirmSelectedOption();
		

	}


}
