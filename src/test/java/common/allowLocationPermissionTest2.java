package common;
import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.allowLocationPermission;

public class allowLocationPermissionTest2 extends Base {

	@Test(priority = 1)
	public void clcallowLocationbutton() 
	
	
	{
		allowLocationPermission clickallowLocation= new allowLocationPermission();
	
		clickallowLocation.allowLocationbutton();
		
		
			}
@Test(priority = 2)
	public void clickallowLocationbutton2() 
	
	
	{
		allowLocationPermission clickallowLocation= new allowLocationPermission();
	
		clickallowLocation.allowLocationbutton2();
		
		
			}
}
