package com.ERA.screens;

import org.testng.asserts.SoftAssert;

import com.ERA.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ImageScreen extends Base {

	@AndroidFindBy(id = "com.eci.era:id/continueBtn")

	public MobileElement continueButton;

	public void clcikContinue() {
		continueButton.click();

	}

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"يرجى التقاط صورة واحدة على الأقل\")")
	public MobileElement errormessage;

	public void validateerrormessage() {
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

//Oppodevice
	// @AndroidFindBy(id =
	// "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	// SumsSung device
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
	public MobileElement allowcameraPermission;

	public void allowcameraPermission() {
		// TODO Auto-generated method stub
		allowcameraPermission.click();
	}

//Oppo device
	// @AndroidFindBy(id = "com.oppo.camera:id/shutter_button")
//sumsung device 
	@AndroidFindBy(xpath = "(//GLButton[@content-desc=\"NONE\"])[2]")
	public MobileElement cameraTakeImage;

	public void cameraTakeImage() {
		// TODO Auto-generated method stub
		cameraTakeImage.click();
	}

//oppo device
	// @AndroidFindBy(id = "com.oppo.camera:id/done_button")
//sumsung device
	@AndroidFindBy(id = "com.sec.android.app.camera:id/okay")
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

	@AndroidFindBy(id = "com.eci.era:id/continueBtn")

	public MobileElement confirmImagebutton;

	public void ConfirmImagebutton() {
		// TODO Auto-generated method stub
		confirmImagebutton.click();
	}

	@AndroidFindBy(id = "com.eci.era:id/continueBtn")

	public MobileElement confirmImagebuttonEdit;

	public void ConfirmImagebuttonEdit() {
		// TODO Auto-generated method stub
		confirmImagebuttonEdit.click();

	}

	//oppo device
		// @AndroidFindBy(id = "com.oppo.camera:id/done_button")
	//sumsung device
		@AndroidFindBy(id = "com.sec.android.app.camera:id/okay")
	public MobileElement confirmImageEdit;

	public void confirmImageEdit() {
		// TODO Auto-generated method stub
		confirmImageEdit.click();
	}


	//Oppo device
		// @AndroidFindBy(id = "com.oppo.camera:id/shutter_button")
	//sumsung device 
		@AndroidFindBy(xpath = "(//GLButton[@content-desc=\"NONE\"])[2]")
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


	@AndroidFindBy(id = "com.eci.era:id/hasPlateSwitch")
	public MobileElement switchon;
	public void switchOn() {
		// TODO Auto-generated method stub
		switchon.click();
	}
}
