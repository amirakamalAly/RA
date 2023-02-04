package DubaiPoliceAccount;

import org.testng.annotations.Test;

import com.ERA.base.Base;
import com.ERA.screens.DubaiPoliceLocationScreen;


public class DubaiPoliceTest extends Base {

//	@Test(priority = 1)
//	public void MoveMap() throws InterruptedException
//
//	{
//		DubaiPoliceLocationScreen Map = new DubaiPoliceLocationScreen();
//		Map.MoveMap();
//		Thread.sleep(5000);
//
//	}
//	
	
	
	@Test(priority = 2)
	public void confirmlocation()

	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DubaiPoliceLocationScreen confm = new DubaiPoliceLocationScreen();
		confm.Selectconfirmbtn();

	}
	
	@Test(priority = 3)
	public void selectSubService()

	{
		DubaiPoliceLocationScreen subservice = new DubaiPoliceLocationScreen();
		subservice.SelectSubService();

	}
	
	@Test(priority = 4)
	public void confirmSubService()

	{
		DubaiPoliceLocationScreen confirm = new DubaiPoliceLocationScreen();
		confirm.confirmSubService();

	}
}
