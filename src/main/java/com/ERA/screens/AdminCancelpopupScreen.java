package com.ERA.screens;

import com.ERA.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AdminCancelpopupScreen extends Base{
	@AndroidFindBy(id = "com.eci.era:id/btnCancel")
	private MobileElement cancel;
	
	public void ClickdismissCancelpopup() {
		// TODO Auto-generated method stub
		cancel.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}