package common;
import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.ScrollActionScreen;


public class ScrollupAction extends Base {
@Test(priority =1)
public void preformScrollAction()

	{
	ScrollActionScreen scroll = new ScrollActionScreen();
	scroll.Scroll_PageUp_Vehicledetails();
	
	}

@Test(priority =2)
public void preformScrollAction2()

	{
	ScrollActionScreen scroll = new ScrollActionScreen();
	scroll.Scroll_PageUp_Vehicledetails2();
	
	}
}
	
