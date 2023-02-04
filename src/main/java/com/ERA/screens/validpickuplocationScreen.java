package com.ERA.screens;

import com.ERA.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class validpickuplocationScreen  extends Base {

	@AndroidFindBy(id = "com.eci.era:id/tvAddress")
	public MobileElement pickuplocation;


	public void pickupBox() {
		pickuplocation.click();
	}
	@AndroidFindBy(id = "com.eci.era:id/etSearch")
	private MobileElement SearchResultItem;

	public void SendvalidLocation(String Description, String LocationInvalidValue) {

		SearchResultItem.sendKeys(LocationInvalidValue);
	}

	@AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.LinearLayout")
	//@AndroidFindBy(id = "com.eci.era:id/currentLocation")
	private MobileElement SearchresultItem;

	public void ClickSearchresultItem() {

		SearchresultItem.click();
	}
	
}
