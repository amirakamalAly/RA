package com.ERA.screens;

import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import com.ERA.base.Base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CancelRequestFromAppScreen extends Base {

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageView")
	private MobileElement FristItemList;

	public void ClickFristItemRequestHistory() {
		// TODO Auto-generated method stub
		FristItemList.click();
	}

//	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Ø¥Ù„ØºØ§Ø¡ Ø§Ù„Ø·Ù„Ø¨\")")
	@AndroidFindBy(id = "com.eci.era:id/cancelImpoundRequest")
	public MobileElement cancel;

	public void clickcancel() {
		// TODO Auto-generated method stub
		cancel.click();
	}

	@AndroidFindBy(id = "com.eci.era:id/cancelBtn")
	public MobileElement confirmcancel;

	public void confirmCancel() {
		// TODO Auto-generated method stub
		confirmcancel.click();
	}
	@AndroidFindBy (uiAutomator = "new UiSelector().text(\"ملغى\")")
	//@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView")
	public MobileElement assertCancel;

	public void assertCancel() {
try {
	Thread.sleep(10000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		SoftAssert softAssert = new SoftAssert();
		String assertCancelText  = assertCancel.getText();
		System.out.println("cancelledStatus " + assertCancelText);
		String validText = "ملغى";
		softAssert.assertEquals(validText,assertCancelText);
		softAssert.assertEquals(assertCancelText, validText, "valid text");
		softAssert.assertNotNull(assertCancelText);
		softAssert.assertAll();
	}

	@AndroidFindBy(id = "com.eci.era:id/tripImage")
	public MobileElement To3;
	@AndroidFindBy(id = "com.eci.era:id/viewVehiclesBtn")
	public MobileElement From3;

	public void ScrollAction() {

		Actions act = new Actions(driver);

		act.dragAndDrop(From3, To3).build().perform();
	}

}
