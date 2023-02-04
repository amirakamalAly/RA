package towing;

import org.testng.annotations.Test;

import com.ERA.base.Base;
import com.ERA.screens.addNormalTowingRequest;

public class validDestLocationTest extends Base {


	@Test(priority = 4)
	public void ClickSearchDest()

	{
		addNormalTowingRequest Dv = new addNormalTowingRequest();
		Dv.DestinationSearch();

	}
	
	


	
	@Test(dataProvider ="Locations",priority = 5)
	public void SendDestLocation(String Description,String LocationValue)

	{System.out.println("get location fromExcelsheet  "+ LocationValue );
	addNormalTowingRequest Dv = new addNormalTowingRequest();
		Dv.SendDestLocation(Description,LocationValue);

		
	}

	@Test(priority = 6)
	public void ClickSearchItem()

	{
		addNormalTowingRequest Dvw = new addNormalTowingRequest();
		Dvw.ClickSearchItem();

		
	}
	@Test(priority = 7)
	public void ConfirmDestination()

	{
		addNormalTowingRequest Dvw = new addNormalTowingRequest();
		Dvw.ConfirmDestinationTowing();

		
	}
	


}
