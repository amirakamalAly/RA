package com.ERA.screens;


import com.ERA.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;




public class addNormalTowingRequest extends Base {
	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.LinearLayout")
	public MobileElement towingRequest;

    public void SelectTowing()
{
    	towingRequest.click();	

}

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"رافعة عادية\")")
	
	private MobileElement NormalTowing;

	public void SelectNormalTowing() {
		// TODO Auto-generated method stub
		String x =		NormalTowing.getText();
		
		

		NormalTowing.click();
	}
	

	@AndroidFindBy (id="com.eci.era:id/tvYourDestination")
	private MobileElement DEST;

	public void Destinationbox() {
		// TODO Auto-generated method stub
		DEST.click();
	}
	
	
	@AndroidFindBy (id="com.eci.era:id/tvAddress")
	private MobileElement Dest;

	public void DestinationSearch() {
		// TODO Auto-generated method stub
		Dest.click();
	}

    

	@AndroidFindBy (id="com.eci.era:id/etSearch")
	private MobileElement DestLocation;

	

	public void SendDestLocation(String Description,String LocationValue) {
		// TODO Auto-generated method stub
		DestLocation.sendKeys(LocationValue);
	}
	
	@AndroidFindBy (id="com.eci.era:id/details")
	private MobileElement SearchResultItem;
	
	
	public void ClickSearchItem() {
		// TODO Auto-generated method stub
		SearchResultItem.click();
	}

	@AndroidFindBy (id="com.eci.era:id/btnDropOff")
	private MobileElement confirmButton;
	
	
	public void ConfirmDestination() {
		// TODO Auto-generated method stub
		 confirmButton.click();
	}
	
	@AndroidFindBy (id="com.eci.era:id/continueBtn")
	private MobileElement confirmButton2;
	
	
	public void ConfirmDestinationTowing() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 confirmButton2.click();
	}
	
	@AndroidFindBy (id="com.eci.era:id/btnConfirmRequest")
	private MobileElement Confirm;

	public void confirmTowingRequest() {
		// TODO Auto-generated method stub
		Confirm.click();
	}

	@AndroidFindBy (id="com.eci.era:id/btnConfirmPayment")
	private MobileElement ConfirmPayment;

	public void confirmPaymrntTowingRequest() {
		// TODO Auto-generated method stub
		ConfirmPayment.click();
	}
	
	@AndroidFindBy (id="com.eci.era:id/tvCancelRequest")
	private MobileElement clickCancel;

	public void confirmCancelTowingRequest() {
     

		// TODO Auto-generated method stub
		clickCancel.click();
	}
	
	@AndroidFindBy (id="com.eci.era:id/btnCancel")
	private MobileElement clickCancelBn;

	public void ClickCancelTowingRequest() {
		// TODO Auto-generated method stub
    

		clickCancelBn.click();
	}

	@AndroidFindBy (id="com.eci.era:id/ivBack")
	private MobileElement backarrow;
	public void clcikBackarrow() {
		// TODO Auto-generated method stub
		backarrow.click();
	}	
	
	@AndroidFindBy (id="com.eci.era:id/completeRequestBtn")
	private MobileElement comfirmbackhome;
	public void comfirmbackhome() {
		// TODO Auto-generated method stub
		comfirmbackhome.click();
	}	
	
	@AndroidFindBy (id="com.eci.era:id/closeImg")
	private MobileElement dissmisscaution;
	public void dissmisscaution() {
		// TODO Auto-generated method stub
		dissmisscaution.click();
	}	

}


	


	

