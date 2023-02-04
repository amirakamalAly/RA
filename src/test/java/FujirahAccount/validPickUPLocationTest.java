package FujirahAccount;

import org.testng.annotations.Test;

import com.ERA.base.Base;

import com.ERA.screens.validpickuplocationScreen;

public class validPickUPLocationTest extends Base {

	@Test(priority = 1)
	public void Addingvalidpickup()

	{
		validpickuplocationScreen Ds = new validpickuplocationScreen();
		Ds.pickupBox();

	}

	
	

	@Test(dataProvider = "validFujirahLocations", priority = 2)
	public void SendFujirahPickupLocation(String Description, String LocationValue)

	{
		System.out.println("get validlocation fromExcelsheet  " + LocationValue);
		validpickuplocationScreen Dv = new validpickuplocationScreen();
		Dv.SendvalidLocation(Description, LocationValue);

	}

	@Test(priority = 3)
	public void ClickSearchresultItem()

	{
		validpickuplocationScreen Dv = new validpickuplocationScreen();
		Dv.ClickSearchresultItem();

	}

	



}
