package profile;

import com.ERA.base.Base;
import com.ERA.screens.MenuScreen;
import com.ERA.screens.profile.profiletabFromMenu;

import org.testng.annotations.Test;

public class Profile_TakeCameraImageTest extends Base {


	@Test(priority = 1)
	public void clickprofiletabFromMenu()

	{
		profiletabFromMenu profile = new profiletabFromMenu();
		profile.clickprofiletabFromMenu();

	}
	@Test(priority = 2)
	public void ImageOtionscenterIcon()

	{
		profiletabFromMenu ImageOtions = new profiletabFromMenu();
		ImageOtions.ClickImageOptionscenteredIcon();
	
	}
//	@Test(priority = 3)
//	public void AllowPermissionImageTake()
//
//	{
//		profiletabFromMenu allowPermission = new profiletabFromMenu();
//		allowPermission.ClickAllowPermission();
//	
//	}
//	
//	@Test(priority = 4)
//	public void AllowPermissionaccessFiles()
//
//	{
//		profiletabFromMenu allowPermissionaccessFiles = new profiletabFromMenu();
//		allowPermissionaccessFiles.ClickAllowPermission();
//	
//	}
	
	@Test(priority = 5)
	public void CaptureImage()

	{
		profiletabFromMenu CaptureImage = new profiletabFromMenu();
		CaptureImage.ClickTakeImage();

	}
	
	@Test(priority = 6)
	public void camera()

	{
		profiletabFromMenu CaptureImage = new profiletabFromMenu();
		CaptureImage.Clickcamera();

	}	
	@Test(priority = 7)
	public void confirmImage()

	{
		profiletabFromMenu confirmImage = new profiletabFromMenu();
		confirmImage.confirmImage();

	}	
		
	@Test(priority = 8)
	public void scrollitems()

	{
		profiletabFromMenu scroll = new profiletabFromMenu();

		scroll.scrollitems();
	}

	@Test(priority = 9)
	public void SaveButton()

	{
		profiletabFromMenu save = new profiletabFromMenu();
		save.clickSave();

	}
	@Test(priority = 10)
	public void dissmissPopup()

	{
		profiletabFromMenu dismiss = new profiletabFromMenu();
		dismiss.clickdissmissPopup();

	}
	@Test(priority = 11)
	public void ClickMenu()

	{
		MenuScreen Menu = new MenuScreen();
		Menu.ClickMenuIcon();

	}
	
}
