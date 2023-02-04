package com.ERA.screens;

import org.openqa.selenium.interactions.Actions;

import com.ERA.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class DubaiPoliceLocationScreen extends Base{
	
	
	@AndroidFindBy(id ="com.eci.era:id/floatingMyMap")
	public MobileElement From;
	@AndroidFindBy(id = "com.eci.era:id/clAddress")
	public MobileElement To;

	public void MoveMap() {
		Actions act = new Actions(driver);
		act.dragAndDrop(From, To).build().perform();

	}
	
	//@AndroidFindBy (id = "com.eci.era:id/btnDropOff")
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"تأكيد موقع الرفع\")")
	public MobileElement confirmbtn;

    public void Selectconfirmbtn()
{
    try {
		Thread.sleep(7000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    	confirmbtn.click();	

}
    
    
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ImageView")
    public MobileElement subservice1;
	public void SelectSubService() {
		// TODO Auto-generated method stub
		subservice1.click();	
	}
	
@AndroidFindBy (id = "com.eci.era:id/continueBtn")
	
	public MobileElement confirmsubservicebutton;
	public void confirmSubService() {
		// TODO Auto-generated method stub
		confirmsubservicebutton.click();
	}
	
	
	
	 
    @AndroidFindBy(xpath = "//android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView")
    public MobileElement dropOFF;
	public void selctropOFF() {
		// TODO Auto-generated method stub
		dropOFF.click();
	}
	
	
@AndroidFindBy (id = "com.eci.era:id/continueBtn")
	
	public MobileElement cofirmdropoff;
	public void Confirmropoff() {
		// TODO Auto-generated method stub
		cofirmdropoff.click();
	}
	
	
@AndroidFindBy (id = "com.eci.era:id/eimg")
		public MobileElement EditSubService;
	
	public void editsubserviceIcon() {
		// TODO Auto-generated method stub
		EditSubService.click();
	}
	
@AndroidFindBy (xpath = "//android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[3]/android.widget.ImageView")
	public MobileElement ImageIcon;

	public void editImageIcon() {
		// TODO Auto-generated method stub
		ImageIcon.click();
	}
	
	
	 @AndroidFindBy(xpath = "//android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView")
	    public MobileElement dropOFF2;
		public void selctropOFF2() {
			// TODO Auto-generated method stub
			dropOFF2.click();
		}
		
		
		
    
		@AndroidFindBy (id = "com.eci.era:id/editBtn")
		public MobileElement EditropOffIcon;

		public void editdropoffIcon() {
			// TODO Auto-generated method stub
			EditropOffIcon.click();
		}


		@AndroidFindBy (id = "com.eci.era:id/container")
		public MobileElement FujirahEditropOffIcon;
		
		public void fujirahselctropOFF() {
			// TODO Auto-generated method stub
			FujirahEditropOffIcon.click();
		}

		
		@AndroidFindBy (id = "com.eci.era:id/ivBack")
		public MobileElement back;
		public void ClickBack() {
			// TODO Auto-generated method stub
			back.click();
		}
		
		@AndroidFindBy (id = "com.eci.era:id/btnCancel")
		public MobileElement draft;
		public void SaveAsraft() {
			// TODO Auto-generated method stub
			draft.click();
		}
   
	}
