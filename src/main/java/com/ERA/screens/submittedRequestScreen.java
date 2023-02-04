package com.ERA.screens;

import com.ERA.base.Base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class submittedRequestScreen extends Base {

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"طلباتي\")")
	public MobileElement Historty;

	public void ClickSubmittedRequest() {
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		Historty.click();

	}
}
