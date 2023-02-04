package com.ERA.screens;

import org.testng.annotations.Test;

import com.ERA.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PoliceSubServiceScreen extends Base {

	@AndroidFindBy(xpath = "//android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ImageView")
	public MobileElement plusIcon1;

	public void editsubserviceIcon1() throws InterruptedException {
		// TODO Auto-generated method stub
		plusIcon1.click();
		Thread.sleep(1000);
		plusIcon1.click();

		
	}

	@AndroidFindBy(xpath = "//android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ImageView")
	public MobileElement plusIcon2;

	public void editsubserviceIcon2() {
		// TODO Auto-generated method stub
		plusIcon2.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		plusIcon2.click();
	}

	@AndroidFindBy(xpath = "//android.view.ViewGroup[3]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ImageView")
	public MobileElement plusIcon3;

	public void editsubserviceIcon3() {
		// TODO Auto-generated method stub
		plusIcon3.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		plusIcon3.click();
	}

	@AndroidFindBy(xpath = "//android.view.ViewGroup[4]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ImageView")
	public MobileElement plusIcon4;

	public void editsubserviceIcon4() {
		// TODO Auto-generated method stub
		plusIcon4.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		plusIcon4.click();
	}

	@AndroidFindBy(xpath = "//android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]")
	public MobileElement minusicon1;

	public void editsubserviceminusIcon1() {
		// TODO Auto-generated method stub
		minusicon1.click();
	
	}
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]")
	public MobileElement minusicon2;

	public void editsubserviceminusIcon2() {
		// TODO Auto-generated method stub
		minusicon2.click();
	
	}
	@AndroidFindBy(xpath = "//android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.LinearLayout/android.widget.LinearLayout[1]")
	public MobileElement minusicon3;

	public void editsubserviceminusIcon3() {
		// TODO Auto-generated method stub
		minusicon3.click();
	
	}
	@AndroidFindBy(xpath = "//android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.LinearLayout/android.widget.LinearLayout[1]")
	public MobileElement minusicon4;

	public void editsubserviceminusIcon4() {
		// TODO Auto-generated method stub
		minusicon4.click();
	
	}

	
	@AndroidFindBy(id = "com.eci.era:id/continueBtn")
	public MobileElement confirmSubservice;

	public void confirmEditSubService() {
		// TODO Auto-generated method stub
		confirmSubservice.click();
	
	}
}
