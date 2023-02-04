package com.ERA.screens;

import com.ERA.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;






public class allowLocationPermission extends Base{

	//@AndroidFindBy (id="com.android.packageinstaller:id/permission_allow_button")
	@AndroidFindBy (id="com.android.permissioncontroller:id/permission_allow_foreground_only_button")

	private MobileElement allowLocation;

	public void ClickallowLocation() {
		allowLocation.click();
	}
	

	@AndroidFindBy(id = "com.eci.era:id/turnOnLocationTxt")

	private MobileElement Locationbutton;

	public void allowLocationbutton() {

		Locationbutton.click();
	}

	
	
	@AndroidFindBy(id = "android:id/button1")

	private MobileElement Locationbutton2;

	public void allowLocationbutton2() {

		Locationbutton2.click();
	}
//sumsung device 
	@AndroidFindBy (id="com.eci.era:id/btnTurnOnLocationService")

	private MobileElement HomeallowLocation;

	public void Home_ClickallowLocation() {
		HomeallowLocation.click();
	}
}


