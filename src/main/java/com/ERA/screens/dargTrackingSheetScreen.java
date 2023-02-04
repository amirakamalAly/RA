package com.ERA.screens;

import org.openqa.selenium.interactions.Actions;

import com.ERA.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class dargTrackingSheetScreen extends Base {

	@AndroidFindBy(xpath="//android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.ViewGroup[1]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button")
	public MobileElement From;
	@AndroidFindBy(id = "com.eci.era:id/btnMenu")
	public MobileElement To;

	public void dargTrackingSheet() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Actions act = new Actions(driver);
	//	act.dragAndDropBy(From, 649, 744).build().perform();
		act.dragAndDrop(From, To).build().perform();

	}
}
