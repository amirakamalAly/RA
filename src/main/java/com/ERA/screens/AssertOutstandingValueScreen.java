package com.ERA.screens;

import org.testng.asserts.SoftAssert;

import com.ERA.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AssertOutstandingValueScreen extends Base {

	@AndroidFindBy(id ="com.eci.era:id/tvOutStandingBalance")
	public MobileElement outstanding;

	public void AssertOutstandingValue() {
		
		SoftAssert softAssert = new SoftAssert();
		String outstandingText = outstanding.getText();

		System.out.println("text///////////" + outstandingText);

		

		softAssert.assertNotNull(outstandingText);
		softAssert.assertAll();

	}
}
