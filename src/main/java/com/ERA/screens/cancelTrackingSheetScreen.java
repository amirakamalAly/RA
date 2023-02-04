package com.ERA.screens;


import org.testng.asserts.SoftAssert;

import com.ERA.base.Base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class cancelTrackingSheetScreen  extends Base {

	@AndroidFindBy(id ="com.eci.era:id/tv_cancel_request")
	public MobileElement cancel;
	public void cancelTrackingSheet() {
		
		cancel.click();

	}
	@AndroidFindBy(id = "com.eci.era:id/firstMessageTxt")
	private MobileElement Message1;
	@AndroidFindBy(id = "com.eci.era:id/youWillNotBeAbleTxt")
	private MobileElement Message2;
	public void AssertOutstandingText() {

		SoftAssert softAssert = new SoftAssert();
		String Message11 = Message1.getText();
		String Message22 = Message2.getText();
		System.out.println("here is MessageText " + Message11);

		String validText = "Ø³ÙŠØªÙ… ØªØ­Ù…ÙŠÙ„ Ø±Ø³ÙˆÙ… Ø§Ù„Ø¥Ù„ØºØ§Ø¡ Ø¹Ù„Ù‰ Ø¥Ø¬Ù…Ø§Ù„ÙŠ Ø·Ù„Ø¨Ùƒ Ø§Ù„Ù‚Ø§Ø¯Ù…";
		String validText2 = "Ù„Ù† ØªØ³ØªØ·ÙŠØ¹ Ø¯Ù Ø¹ Ø·Ù„Ø¨Ùƒ Ø§Ù„ØªØ§Ù„ÙŠ Ù†Ù‚Ø¯Ù‹Ø§";
		softAssert.assertEquals(Message11, validText);
		softAssert.assertEquals(Message22, validText2);
		softAssert.assertNotNull(Message11);
		softAssert.assertNotNull(Message22);
		softAssert.assertAll();
	}




	
	@AndroidFindBy(id ="com.eci.era:id/btnCancel")
	public MobileElement confirmcancel;
	

	public void confirmcancelTrackingSheet() {
		
		confirmcancel.click();

	}
	
	
}
