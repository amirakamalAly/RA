package com.ERA.screens;

import org.testng.Assert;

import com.ERA.base.Base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class OwnerDataScreen extends Base {

	@AndroidFindBy(id = "com.eci.era:id/userNameEdit")
	private MobileElement name;

	public void addOwnerName(String ownerfullname) {
		// TODO Auto-generated method stub
		name.clear();
		name.sendKeys(ownerfullname);
	}
	
	@AndroidFindBy(id = "com.eci.era:id/ownerNameEdit")
	private MobileElement RTAOwnername;

	public void UpdateRTAOwnerName(String ownerfullname) {
		// TODO Auto-generated method stub
		RTAOwnername.clear();
		RTAOwnername.sendKeys(ownerfullname);
	}

	@AndroidFindBy(id = "com.eci.era:id/ownerNameEdit")
	private MobileElement ownername;

	public void addRTAOwnerName(String ownerfullname) {
		// TODO Auto-generated method stub
		ownername.clear();
		ownername.sendKeys(ownerfullname);
	}

	@AndroidFindBy(id = "com.eci.era:id/userMobileEdit")
	private MobileElement MobileNumber;

	public void addOwnerMobileNumber(String ownermobilenumber) {
		// TODO Auto-generated method stub
		MobileNumber.clear();
		MobileNumber.sendKeys(ownermobilenumber);
	}

	public void addOwnerMobileNumber() {
		// TODO Auto-generated method stub
		MobileNumber.clear();
		MobileNumber.sendKeys("");
	}

	@AndroidFindBy(id = "com.eci.era:id/licenseNumberEdit")
	private MobileElement licenseNumber;

	public void addownerlicencenumber(String ownerlicencenumber) {
		// TODO Auto-generated method stub
		licenseNumber.clear();
		licenseNumber.sendKeys(ownerlicencenumber);
	}

	@AndroidFindBy(id = "com.eci.era:id/licenseIssuedEdit")
	private MobileElement licensedate;

	public void clcikcalenderdate() {
		// TODO Auto-generated method stub
		licensedate.click();
	}

	@AndroidFindBy(accessibility = "01 January 2023")
	private MobileElement date;

	public void clcikcalenderday() {
		// TODO Auto-generated method stub
		date.click();
	}

	@AndroidFindBy(id = "android:id/button1")
	private MobileElement confirmcalendar;

	public void clcikconfirmcalendar() {
		// TODO Auto-generated method stub
		confirmcalendar.click();
	}

	@AndroidFindBy(id = "com.eci.era:id/btnConfirmRequest")
	private MobileElement confirm;

	public void confirmOwnerdata() {
		// TODO Auto-generated method stub
		confirm.click();
	}

	@AndroidFindBy(id = "com.eci.era:id/ownerNameErrorMessage")
	private MobileElement error;

	public void assertError() {
		// TODO Auto-generated method stub
		String ValidationMessageText = error.getText();
		System.out.println("here is error " + ValidationMessageText);
		String validValidationErrorText = "يجب أن يتكون الاسم من 4 وحتى 35 حرفًا";
		Assert.assertEquals(ValidationMessageText, validValidationErrorText);

	}
}
