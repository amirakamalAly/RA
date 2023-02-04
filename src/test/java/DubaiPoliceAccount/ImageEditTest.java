package DubaiPoliceAccount;

import org.testng.annotations.Test;

import com.ERA.base.Base;
import com.ERA.screens.ImageScreen;


public class ImageEditTest extends Base {

	@Test(priority = 1)
	public void takeImage()

	{
		
		
		ImageScreen image = new ImageScreen();
		image.addPhoto();

	}
	
	
	
	
	@Test(priority = 2)
	public void cameraTakeImage()

	{
		ImageScreen cameraTakeImage = new ImageScreen();
		cameraTakeImage.cameraTakeImage();

	}
	
	@Test(priority = 3)
	public void ConfirmImage()

	{
		ImageScreen confirmImage = new ImageScreen();
		confirmImage.confirmImage();

	}
	
	@Test(priority = 4)
	public void ConfirmImagebutton()

	{
		ImageScreen confirmImagebutton = new ImageScreen();
		confirmImagebutton.ConfirmImagebutton();

	}

}
