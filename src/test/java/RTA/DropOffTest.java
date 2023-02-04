package RTA;

import org.testng.annotations.Test;

import com.ERA.base.Base;
import com.ERA.screens.DubaiPoliceLocationScreen;



public class DropOffTest extends Base {
//
//	@Test(priority = 1)
//	public void SelectropOff()
//
//	{
//		
//		
//		DubaiPoliceLocationScreen dropoff = new DubaiPoliceLocationScreen();
//		dropoff.selctropOFF();
//
//	}
	
	@Test(priority = 3)
	public void confirmdropOff()

	{
		DubaiPoliceLocationScreen confirm = new DubaiPoliceLocationScreen();
		confirm.Confirmropoff();

	}
	
	
}
