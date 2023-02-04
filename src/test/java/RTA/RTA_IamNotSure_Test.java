package RTA;

import org.testng.annotations.Test;

import com.ERA.base.Base;
import com.ERA.screens.RTAScreen;


public class RTA_IamNotSure_Test extends Base {
	
	@Test(priority = 2)
	public void confirmlocation()

	{
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RTAScreen confm = new RTAScreen();
		confm.Selectconfirmbtn();

	}
	
	@Test(priority = 3)
	public void selectIamnotsure()

	{
		RTAScreen notsure = new RTAScreen();
		notsure.SelectIamnotsure();

	}
	

}
