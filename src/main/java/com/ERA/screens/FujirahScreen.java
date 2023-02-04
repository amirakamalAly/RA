package com.ERA.screens;

import com.ERA.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class FujirahScreen extends Base {
	@AndroidFindBy(id = "com.eci.era:id/upcomingTxt")
	private MobileElement upcomingfilter;

	public void upcomingFilter() {
		// TODO Auto-generated method stub
		upcomingfilter.click();
	}
}
