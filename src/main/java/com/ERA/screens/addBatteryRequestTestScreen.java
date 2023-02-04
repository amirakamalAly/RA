package com.ERA.screens;

import org.openqa.selenium.interactions.Actions;

import com.ERA.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class addBatteryRequestTestScreen extends Base {

	@AndroidFindBy(id = "com.eci.era:id/TotalTitleTxT")
	public MobileElement From;
	@AndroidFindBy(id = "com.eci.era:id/ivBack")
	public MobileElement To;

	public void dragsheetSummery() {
		Actions act = new Actions(driver);
		//act.dragAndDrop(From, To).build().perform();
		act.clickAndHold(To).perform();

	}

	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.view.ViewGroup/android.widget.LinearLayout")
	public MobileElement From2;
	@AndroidFindBy(id = "com.eci.era:id/imageView2")
	public MobileElement To2;

	public void dragsheetHome() {
		Actions act = new Actions(driver);
		act.dragAndDrop(From2, To2).build().perform();
		act.clickAndHold(To2).perform();
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"إعادة تشغيل البطارية\")")
	public MobileElement Battery;

	public void selectBattery() {
		Battery.click();

	}

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"حدد طريقة الدفع\")")

	public MobileElement ConfirmSummery;

	public void cnfirmSummery() {

		ConfirmSummery.click();

	}

	@AndroidFindBy(id = "com.eci.era:id/continueBtn")
	public MobileElement ConfirmBaymnet;

	public void ConfmBaymnet() {

		ConfirmBaymnet.click();

	}

	@AndroidFindBy(id = "com.eci.era:id/tvCancelRequest")
	public MobileElement CancelLk;

	public void Cancellink() {

		CancelLk.click();

	}

	@AndroidFindBy(id = "com.eci.era:id/btnCancel")
	public MobileElement cnclBn;

	public void CancelBn() {

		cnclBn.click();

	}

	@AndroidFindBy(id = "com.eci.era:id/clAddress")
	public MobileElement MapElement1;
	@AndroidFindBy(id = "com.eci.era:id/marker")
	public MobileElement MapElement2;

	public void mapmove() {
		Actions act = new Actions(driver);
		act.dragAndDrop(MapElement2, MapElement1).build().perform();

	}

	@AndroidFindBy(id = "com.eci.era:id/ivBack")
	private MobileElement backarrow;

	public void clcikBackarrow() {
		// TODO Auto-generated method stub
		backarrow.click();
	}

	@AndroidFindBy(id = "com.eci.era:id/completeRequestBtn")
	private MobileElement comfirmbackhome;

	public void comfirmbackhome() {
		// TODO Auto-generated method stub
		comfirmbackhome.click();
	}

	@AndroidFindBy(id = "com.eci.era:id/closeImg")
	private MobileElement dissmisscaution;

	public void dissmisscaution() {
		// TODO Auto-generated method stub
		dissmisscaution.click();
	}

	@AndroidFindBy(id = "com.eci.era:id/continueBtn")
	private MobileElement confirm;

	public void confrim_location() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		confirm.click();
	}

	@AndroidFindBy(id = "com.eci.era:id/continueBtn")
	private MobileElement cofirm_summery;

	public void confrim_Summery() {
		// TODO Auto-generated method stub
		confirm.click();
	}

	@AndroidFindBy(id = "com.eci.era:id/continueBtn")
	private MobileElement cofirm_payment;

	public void confrim_Payment() {
		// TODO Auto-generated method stub
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cofirm_payment.click();
	}

}
