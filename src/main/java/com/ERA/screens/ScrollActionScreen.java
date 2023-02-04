package com.ERA.screens;

import org.openqa.selenium.interactions.Actions;
import com.ERA.base.Base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ScrollActionScreen extends Base {

	@AndroidFindBy(id = "com.eci.era:id/pageTitle")
	public MobileElement To;
	@AndroidFindBy(id = "com.eci.era:id/rankTitle")
	public MobileElement From;

	public void ScrollPageDown() {

		Actions act = new Actions(driver);

		act.dragAndDrop(From, To).build().perform();

	}

	@AndroidFindBy(id = "com.eci.era:id/btnSave")
	public MobileElement To2;
	@AndroidFindBy(id = "com.eci.era:id/rankDropMenu")
	public MobileElement From2;

	public void ScrollPageUp() {

		Actions act = new Actions(driver);

		act.dragAndDrop(From2, To2).build().perform();
//		act.clickAndHold(From2).moveByOffset(500, 1770);
//		
//		act.clickAndHold(From2).release(To2);

	}

	@AndroidFindBy(id = "com.eci.era:id/touch_outside")
	public MobileElement To3;
	@AndroidFindBy(id = "com.eci.era:id/handle")
	public MobileElement From3;

	public void dragsheetout() {

		Actions act = new Actions(driver);

		act.dragAndDrop(From3, To3).build().perform();
	}

	@AndroidFindBy(id = "com.eci.era:id/marker")
	public MobileElement To4;
	@AndroidFindBy(id = "com.eci.era:id/continueBtn")
	public MobileElement From4;

	public void preformScrollAction() {
		// TODO Auto-generated method stub
		Actions act = new Actions(driver);

		act.dragAndDrop(From4, To4).build().perform();

	}

	@AndroidFindBy(id = "com.eci.era:id/VehicleOwnerData")
	public MobileElement vehicleto;
	@AndroidFindBy(id = "com.eci.era:id/impoundInfoData")
	public MobileElement vehicledown;

	public void Scroll_PageUp_Vehicledetails() {
		Actions act = new Actions(driver);
		act.dragAndDrop(vehicleto, vehicledown).build().perform();
		act.perform();

	}

	public void Scroll_PageUp_Vehicledetails2() {

		Actions act1 = new Actions(driver);
		act1.moveToElement(vehicleto);
		act1.perform();

	}

}
