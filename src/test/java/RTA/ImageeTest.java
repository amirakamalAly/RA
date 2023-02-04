package RTA;

import org.testng.annotations.Test;

import com.ERA.base.Base;
import com.ERA.screens.ImageScreen;


public class ImageeTest extends Base {
	
	@Test(priority = 1)
	public void showimagevalidation()

	{
		
		
		ImageScreen image = new ImageScreen();
		image.clcikContinue();

	}	
	

	@Test(priority = 2)
	public void validateerror()

	{
		
		
		ImageScreen image = new ImageScreen();
		image.validateerrormessage();

	}
	
	@Test(priority = 3)
	public void takeImage()

	{
		
		
		ImageScreen image = new ImageScreen();
		image.addPhoto();

	}

	
	@Test(priority = 4)
	public void allowcameraPermission()

	{
		ImageScreen allowpermission = new ImageScreen();
		allowpermission.allowcameraPermission();

	}
		
		@Test(priority = 5)
		public void cameraTakeImage1()

		{
			ImageScreen cameraTakeImage = new ImageScreen();
			cameraTakeImage.cameraTakeImage();

		}
		
		@Test(priority = 6)
		public void ConfirmImage()

		{
			ImageScreen confirmImage = new ImageScreen();
			confirmImage.confirmImage();

		}
		

		@Test(priority = 7)
		public void ClcikImage()

		{
			ImageScreen clcikImage = new ImageScreen();
			clcikImage.ClickImage();

		}
		
		@Test(priority = 8)
		public void RetakeImage()

		{
			ImageScreen retake = new ImageScreen();
			retake.RetakeImage();

		}
		@Test(priority =9)
		public void cameraTakeImage2()

		{
			ImageScreen cameraTakeImage = new ImageScreen();
			cameraTakeImage.cameraTakeImage();

		}
		
		@Test(priority = 10)
		public void ConfirmImage2()

		{
			ImageScreen confirmImage = new ImageScreen();
			confirmImage.confirmImage();

		}
		

		@Test(priority = 11)
		public void ClcikImage2()

		{
			ImageScreen clcikImage = new ImageScreen();
			clcikImage.ClickImage();

		}
		
		@Test(priority = 12)
		public void deleteImage()

		{
			ImageScreen delete = new ImageScreen();
			delete.delImage();

		}
		
		@Test(priority = 13)
		public void takeImage3()

		{
			ImageScreen image = new ImageScreen();
			image.addPhoto();

		}
		
		
		@Test(priority = 14)
		public void takeallphotos()

		{
			ImageScreen Takeallphotos = new ImageScreen();
			for (int i = 0; i < 2; i++) {
				
				
				Takeallphotos.cameraTakeImage();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				Takeallphotos.confirmImage();
				  System.out.println(i);
				  try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}  
				  
				  Takeallphotos.addPhoto();
				}
		}
		
		
	@Test(priority = 15)
		public void cameraTakeImage3()

		{
			ImageScreen cameraTakeImage = new ImageScreen();
			cameraTakeImage.cameraTakeImage();

		}
		
		@Test(priority = 16)
		public void ConfirmImage3()

		{
			ImageScreen confirmImage = new ImageScreen();
			confirmImage.confirmImage();

		}
		
		
	
			
			

		
		@Test(priority = 17)
		public void CoonfirmImagebutton()

		{
			ImageScreen confirmImagebutton = new ImageScreen();
			confirmImagebutton.ConfirmImagebutton();

		}

	}


