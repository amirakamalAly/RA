package DubaiPoliceAccount;

import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.ImageScreen;

public class CaptureVehicleImageTest extends Base {

	@Test(priority = 1)
	public void ClicktakeImage()

	{
		ImageScreen image = new ImageScreen();
		image.addPhoto();
	}

	@Test(priority = 3)
	public void cameraTakeImage() {
		ImageScreen cameraTakeImage = new ImageScreen();
		cameraTakeImage.cameraTakeImage();
	}

	@Test(priority = 4)
	public void ConfirmImage() {
		ImageScreen confirmImage = new ImageScreen();
		confirmImage.confirmImage();
	}

	@Test(priority = 5)
	public void clcikContentImage() {
		ImageScreen Imagebutton = new ImageScreen();
		Imagebutton.clcikContentImage();
	}

	@Test(priority = 6)
	public void delImage() {
		ImageScreen Image = new ImageScreen();
		Image.delImage();
	}

	@Test(priority = 7)
	public void ClicktakeImage2()

	{
		ImageScreen image = new ImageScreen();
		image.addPhoto();
	}

	@Test(priority = 8)
	public void cameraTakeImage2() {
		ImageScreen cameraTakeImage = new ImageScreen();
		cameraTakeImage.cameraTakeImage();
	}

	@Test(priority = 9)
	public void ConfirmImage2() {
		ImageScreen confirmImage = new ImageScreen();
		confirmImage.confirmImage();
	}

	@Test(priority = 10)
	public void clcikContentImage2() {
		ImageScreen Imagebutton = new ImageScreen();
		Imagebutton.clcikContentImage();
	}

	@Test(priority = 11)
	public void RetakeImage() {
		ImageScreen retakeImage = new ImageScreen();
		retakeImage.RetakeImage();
	}

	@Test(priority = 12)
	public void cameraTakeImage3() {
		ImageScreen cameraTakeImage = new ImageScreen();
		cameraTakeImage.cameraTakeImage();
	}

	@Test(priority = 13)
	public void ConfirmImage3() {
		ImageScreen confirmImage = new ImageScreen();
		confirmImage.confirmImage();
	}

}
