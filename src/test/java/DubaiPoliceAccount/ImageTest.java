package DubaiPoliceAccount;

import org.testng.annotations.Test;

import com.ERA.base.Base;
import com.ERA.screens.ImageScreen;


public class ImageTest extends Base {

	@Test(priority = 1)
	public void takeImage()

	{
		
		
		ImageScreen image = new ImageScreen();
		image.addPhoto();

	}
	
	
	
	@Test(priority = 2)
	public void allowcameraPermission()

	{
		ImageScreen allowpermission = new ImageScreen();
		allowpermission.allowcameraPermission();

	}
	
	@Test(priority = 3)
	public void cameraTakeImage()

	{
		ImageScreen cameraTakeImage = new ImageScreen();
		cameraTakeImage.cameraTakeImage();

	}
	
	@Test(priority = 4)
	public void ConfirmImage()

	{
		ImageScreen confirmImage = new ImageScreen();
		confirmImage.confirmImage();

	}
	

	@Test(priority = 5)
	public void ClcikImage()

	{
		ImageScreen clcikImage = new ImageScreen();
		clcikImage.ClickImage();

	}
	
	@Test(priority = 6)
	public void RetakeImage()

	{
		ImageScreen retake = new ImageScreen();
		retake.RetakeImage();

	}
	@Test(priority = 7)
	public void cameraTakeImage2()

	{
		ImageScreen cameraTakeImage = new ImageScreen();
		cameraTakeImage.cameraTakeImage();

	}
	
	@Test(priority = 8)
	public void ConfirmImage2()

	{
		ImageScreen confirmImage = new ImageScreen();
		confirmImage.confirmImage();

	}
	

	@Test(priority = 9)
	public void ClcikImage2()

	{
		ImageScreen clcikImage = new ImageScreen();
		clcikImage.ClickImage();

	}
	
	@Test(priority = 10)
	public void deleteImage()

	{
		ImageScreen delete = new ImageScreen();
		delete.delImage();

	}
	
	@Test(priority = 11)
	public void takeImage3()

	{
		ImageScreen image = new ImageScreen();
		image.addPhoto();

	}
	
	
	
@Test(priority = 12)
	public void cameraTakeImage3()

	{
		ImageScreen cameraTakeImage = new ImageScreen();
		cameraTakeImage.cameraTakeImage();

	}
	
	@Test(priority = 13)
	public void ConfirmImage3()

	{
		ImageScreen confirmImage = new ImageScreen();
		confirmImage.confirmImage();

	}
	
	
	@Test(priority = 1)
	public void takeallphotos()

	{
		ImageScreen Takeallphotos = new ImageScreen();
		for (int i = 0; i < 5; i++) {
			Takeallphotos.addPhoto();
			Takeallphotos.ConfirmImagebutton();
			  System.out.println(i);
			}
		
		

	}
	@Test(priority = 14)
	public void ConfirmImagebutton()

	{
		ImageScreen confirmImagebutton = new ImageScreen();
		confirmImagebutton.ConfirmImagebutton();

	}

}
