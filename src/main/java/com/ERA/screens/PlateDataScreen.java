package com.ERA.screens;

import org.openqa.selenium.interactions.Actions;

import com.ERA.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PlateDataScreen extends Base {

	@AndroidFindBy(id = "com.eci.era:id/emirateDropMenu")
	private MobileElement emirate;

	public void clickEmirateList() {
		// TODO Auto-generated method stub
		emirate.click();
	}

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.TextView")
	private MobileElement emirateitem;

	public void clickEmirateItemList() {
		// TODO Auto-generated method stub
		emirateitem.click();
	}

	@AndroidFindBy(id = "com.eci.era:id/codeDropMenu")
	private MobileElement code;

	public void clickCodeList() {
		// TODO Auto-generated method stub
		code.click();
	}

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView")
	private MobileElement listitem;

	public void clickcodeItemList() {
		// TODO Auto-generated method stub
		listitem.click();
	}

	@AndroidFindBy(id = "com.eci.era:id/plateNumberEdit")
	private MobileElement PlateNumber;

	public void addplatenumber(String plateNumber) {
		// TODO Auto-generated method stub
		PlateNumber.sendKeys(plateNumber);
	}

	@AndroidFindBy(id = "com.eci.era:id/hasPlateSwitch")
	private MobileElement toggle;

	public void switchToggleOff() {
		// TODO Auto-generated method stub
		toggle.click();
	}

	public void switchToggleON() {
		// TODO Auto-generated method stub
		toggle.click();

	}

	@AndroidFindBy(id = "com.eci.era:id/emirateDropMenu")
	private MobileElement emirate2;

	public void clickEmirateList2() {
		// TODO Auto-generated method stub
		emirate2.click();
	}

	@AndroidFindBy(id = "com.eci.era:id/codeDropMenu")
	private MobileElement code2;

	public void clickCodeList2() {
		// TODO Auto-generated method stub
		code2.click();
	}

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView")
	private MobileElement emirateitem2;

	public void clickEmirateItemList2() {
		// TODO Auto-generated method stub
		emirateitem2.click();
	}

	@AndroidFindBy(id = "com.eci.era:id/btnConfirmRequest")
	private MobileElement confirmplatedata;

	public void Confirmplatedata() {
		// TODO Auto-generated method stub
		confirmplatedata.click();
	}


	@AndroidFindBy(xpath = "//android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView")
	private MobileElement emirateitem3;
	public void UpdateEmirateItemList() {
		// TODO Auto-generated method stub
		emirateitem3.click();
	}
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView")
	private MobileElement code3;
	public void UpdatecodeItemList() {
		// TODO Auto-generated method stub
		code3.click();
	}
	@AndroidFindBy(id="com.eci.era:id/btnConfirmRequest")
	private MobileElement confirm;
	public void clickconfirm() {
		// TODO Auto-generated method stub
		confirm.click();
	}
	
	@AndroidFindBy(id = "com.eci.era:id/edtPlateInfoBtn")
	public MobileElement Too;
	@AndroidFindBy(id = "com.eci.era:id/downloadTitle")
	public MobileElement Froom;

	public void  Scrolldown(){
		// TODO Auto-generated method stub
		Actions act = new Actions(driver);
		act.dragAndDrop(Too, Froom).build().perform();
	}
	@AndroidFindBy(id = "com.eci.era:id/vehicleReferanceTitle")
	public MobileElement To;
	@AndroidFindBy(id = "com.eci.era:id/vehicleYearTitle")
	public MobileElement From;

	public void VehicleScrolldown() {
		// TODO Auto-generated method stub
		Actions act = new Actions(driver);
		act.dragAndDrop(From, To).build().perform();
	}
	@AndroidFindBy(id = "com.eci.era:id/reasonsDropMenu")
	public MobileElement reason;
	public void clickreason() {
		// TODO Auto-generated method stub
		reason.click();
	}

	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView")
	public MobileElement item;
	public void clickdropdown() {
		// TODO Auto-generated method stub
		item.click();
	}
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView")
	public MobileElement item2;
	public void clickdropdown2() {
		// TODO Auto-generated method stub
		item2.click();
	}
	@AndroidFindBy(id = "com.eci.era:id/btnConfirmRequest")
	public MobileElement save;
	public void clicksave() {
		// TODO Auto-generated method stub
		save.click();
	}

	@AndroidFindBy(id = "com.eci.era:id/edtReasonsBtn")
	public MobileElement edtReasonsBtn;
	public void updateicon() {
		// TODO Auto-generated method stub
		edtReasonsBtn.click();
	}

	@AndroidFindBy(id = "com.eci.era:id/edtItemInfoBtn")
	public MobileElement edt;
	public void edit() {
		// TODO Auto-generated method stub
		edt.click();
	}
	
	@AndroidFindBy(id = "com.eci.era:id/typeDropMenu")
	public MobileElement drp;
	public void clickitemtype() {
		// TODO Auto-generated method stub
		drp.click();
	}
	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.TextView")
	public MobileElement itm2;
	public void clickeitemfromdropdown() {
		// TODO Auto-generated method stub
		itm2.click();
	}
	@AndroidFindBy(id = "com.eci.era:id/ownerNameEdit")
	public MobileElement itmnme;
	public void edititemname(String name) {
		// TODO Auto-generated method stub
		itmnme.clear();
		itmnme.sendKeys(name);
	}
		
	

}
