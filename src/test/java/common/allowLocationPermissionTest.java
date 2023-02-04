package common;
import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.allowLocationPermission;

public class allowLocationPermissionTest extends Base {

//	@Test(priority = 1)
//	public void clcallowLocationbutton() 
//	
//	
//	{
//		allowLocationPermission clickallowLocation= new allowLocationPermission();
//	
//		clickallowLocation.allowLocationbutton();
//		
//		
//			}
@Test(priority = 2)
	public void clcallowLocationPermissionTestLogin() 
	
	
	{
		allowLocationPermission clickallowLocation= new allowLocationPermission();
		clickallowLocation.ClickallowLocation();
		
					}
}
