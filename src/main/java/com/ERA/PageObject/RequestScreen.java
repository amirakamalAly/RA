/**
 * 
 */
package com.ERA.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.ERA.base.Action;
import com.ERA.base.BaseClass;

/**
 * @author Amira
 * 
 */
public class RequestScreen extends BaseClass {
	
	@FindBy(xpath = "/html/body/div[2]/div[1]/ul/li[2]/a/span")
	private WebElement Operation;
	@FindBy(xpath = "/html/body/div[2]/div[1]/ul/li[2]/ul/li[1]/a/span")
	private WebElement Requests;

	Action action = new Action();

	public RequestScreen() {
		PageFactory.initElements(getDriver(), this);
	}

	public void GoToRequest() throws Throwable {

		action.implicitWait(getDriver(), 1);
		action.click(getDriver(), Operation);
		action.implicitWait(getDriver(), 1);
		action.click(getDriver(), Requests);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}

	

}
