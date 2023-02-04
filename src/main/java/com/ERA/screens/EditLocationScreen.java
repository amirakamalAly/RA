package com.ERA.screens;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ERA.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class EditLocationScreen extends Base{

	
	@AndroidFindBy(id ="com.eci.era:id/floatingMyMap")
	public MobileElement From;
	@AndroidFindBy(id = "com.eci.era:id/clAddress")
	public MobileElement To;

	public void MoveMap() {
		Actions act = new Actions(driver);
		act.dragAndDrop(From, To).build().perform();

	}

	
	@AndroidFindBy(id = "com.eci.era:id/edtBtn")
	public MobileElement EditLocation;
	public void EditLocationIcon() {
		// TODO Auto-generated method stub
		EditLocation.click();
		
	}
	
	@AndroidFindBy(id = "com.eci.era:id/ivBack")
	public MobileElement back1;
	public void BackIcon1() {
		// TODO Auto-generated method stub
		back1.click();
	}
	@AndroidFindBy(id = "com.eci.era:id/continueBtn")
	public MobileElement confirmSummery;
	
	public void confirmSummery() {
		// TODO Auto-generated method stub
	    WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.eci.era:id/continueBtn")));
//driver.wait().until(ExpectedConditions.elementToBeClickable(confirmSummery));
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		confirmSummery.click();
	}
	@AndroidFindBy(id = "com.eci.era:id/completeRequestBtn")
	public MobileElement Requestetails;
	public void viewRequestetails() {
		// TODO Auto-generated method stub
		Requestetails.click();
	}
	
	@AndroidFindBy(id = "com.eci.era:id/finishRequestBtn")
	public MobileElement finish;
	public void clickfinish() {
		// TODO Auto-generated method stub
		finish.click();
	}
	
	
}
