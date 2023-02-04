package com.ERA.screens;

import com.ERA.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class DownloadAndShareScreen extends Base {

	@AndroidFindBy(id = "com.eci.era:id/downloadBtn")
	private MobileElement download;

	public void clcikownload() {
		// TODO Auto-generated method stub
		download.click();
	}

	@AndroidFindBy(id = "com.eci.era:id/shareTitle")
	private MobileElement share;

	public void clcikShare() {
		// TODO Auto-generated method stub
		share.click();
	}
//oppo device 
	//@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ImageView")
	// sunsumg note device 
	@AndroidFindBy(id = "android:id/sem_chooser_chip_button1")
	
	

	private MobileElement path;

	public void clcikCopy() {
		// TODO Auto-generated method stub
		path.click();
	}

}
