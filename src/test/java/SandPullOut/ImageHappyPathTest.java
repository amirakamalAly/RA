package SandPullOut;

import org.testng.annotations.Test;

import com.ERA.base.Base;
import com.ERA.screens.ImageScreen;
import com.ERA.screens.NormalUserImageScreen;

public class ImageHappyPathTest extends Base {

	@Test(priority = 1)
	public void takeImage()

	{
		NormalUserImageScreen image = new NormalUserImageScreen();
		image.addPhoto();
	}

	@Test(priority = 2)
	public void allowcameraPermission() {
		NormalUserImageScreen allowpermission = new NormalUserImageScreen();
		allowpermission.allowcameraPermission();

	}

	@Test(priority = 3)
	public void cameraTakeImage() {
		NormalUserImageScreen cameraTakeImage = new NormalUserImageScreen();
		cameraTakeImage.cameraTakeImage();
	}

	@Test(priority = 4)
	public void ConfirmImage() {
		NormalUserImageScreen confirmImage = new NormalUserImageScreen();
		confirmImage.confirmImage();
	}

	@Test(priority = 5)
	public void ConfirmImagebutton() {
		NormalUserImageScreen confirmImagebutton = new NormalUserImageScreen();
		confirmImagebutton.ConfirmImagebutton();
	}

}
