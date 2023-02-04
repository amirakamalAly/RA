package FujirahAccount;

import org.testng.annotations.Test;

import com.ERA.base.Base;
import com.ERA.screens.DubaiPoliceLocationScreen;



public class DropOffTest extends Base {

	@Test(priority = 1)
	public void SelectropOff()

	{
		
		
		DubaiPoliceLocationScreen dropoff = new DubaiPoliceLocationScreen();
		dropoff.fujirahselctropOFF();

	}
	
	
	@Test(priority = 2)
	public void SelectropOff2()

	{
		
		
		DubaiPoliceLocationScreen dropoff2 = new DubaiPoliceLocationScreen();
		dropoff2.selctropOFF2();

	}
	
	@Test(priority = 3)
	public void confirmdropOff()

	{
		DubaiPoliceLocationScreen confirm = new DubaiPoliceLocationScreen();
		confirm.Confirmropoff();

	}
	
	
}
