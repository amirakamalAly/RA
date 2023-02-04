package com.ERA.screens;

import org.testng.asserts.SoftAssert;

import com.ERA.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class NormalUserImageScreen extends Base {

@AndroidFindBy (id= "com.eci.era:id/continueBtn")
	
	public MobileElement continueButton;

    public void clcikContinue()
{
    	continueButton.click();	

}

@AndroidFindBy (uiAutomator = "new UiSelector().text(\"يرجى التقاط صورة واحدة على الأقل\")")
		public MobileElement errormessage;

    public void validateerrormessage()
{
    	errormessage.click();	
    	SoftAssert softAssert = new SoftAssert();
		String errormessagee = errormessage.getText();

		System.out.println("text///////////" + errormessagee);

		

		softAssert.assertNotNull(errormessagee);
		softAssert.assertAll();

}
	
	@AndroidFindBy(id = "com.eci.era:id/addPhotoTxt")

	public MobileElement addphoto;

	public void addPhoto() {
		addphoto.click();

	}

	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")

	public MobileElement allowcameraPermission;

	public void allowcameraPermission() {
		// TODO Auto-generated method stub
		allowcameraPermission.click();
	}

	@AndroidFindBy(id = "com.oppo.camera:id/shutter_button")

	public MobileElement cameraTakeImage;

	public void cameraTakeImage() {
		// TODO Auto-generated method stub
		cameraTakeImage.click();
	}

	@AndroidFindBy(id = "com.oppo.camera:id/done_button")

	public MobileElement confirmImage;

	public void confirmImage() {
		// TODO Auto-generated method stub
		confirmImage.click();
	}

	@AndroidFindBy(xpath = "//android.view.ViewGroup[2]/android.widget.FrameLayout/android.widget.ImageView")

	public MobileElement clickImage;

	public void ClickImage() {
		// TODO Auto-generated method stub
		clickImage.click();
	}

	@AndroidFindBy(id = "com.eci.era:id/deletePhotoTV")
	public MobileElement delImage;

	public void delImage() {
		// TODO Auto-generated method stub
		delImage.click();
	}

	@AndroidFindBy(id = "com.eci.era:id/retakeTV")
	public MobileElement retakeImage;

	public void RetakeImage() {
		// TODO Auto-generated method stub
		retakeImage.click();
	}
	
@AndroidFindBy (id = "com.eci.era:id/continueBtn")
	
	public MobileElement confirmImagebutton;
	public void ConfirmImagebutton() {
		// TODO Auto-generated method stub
		confirmImagebutton.click();
	}
	
@AndroidFindBy (id = "com.eci.era:id/continueBtn")
	
	public MobileElement confirmImagebuttonEdit;
	public void ConfirmImagebuttonEdit() {
		// TODO Auto-generated method stub
		confirmImagebuttonEdit.click();
		
	}
	
	@AndroidFindBy(id = "com.oppo.camera:id/done_button")
	public MobileElement confirmImageEdit;
	public void confirmImageEdit() {
		// TODO Auto-generated method stub
		confirmImageEdit.click();
	}
	
	@AndroidFindBy(id = "com.oppo.camera:id/shutter_button")
	public MobileElement cameraTakeImageEdit;
	public void cameraTakeImageEdit() {
		// TODO Auto-generated method stub
		cameraTakeImageEdit.click();
	}
	
	@AndroidFindBy(id = "com.eci.era:id/ContentImage")
	public MobileElement takenImage;
	
	public void clcikContentImage() {
		// TODO Auto-generated method stub
		takenImage.click();
		
	}
}
