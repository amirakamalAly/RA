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
public class Fleet_LoginPage extends BaseClass {

	Action action = new Action();

	@FindBy(id = "UserName")
	private WebElement userName;

	@FindBy(id = "Password")
	private WebElement password;

	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement signInBtn;

	public Fleet_LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public void LoginPage() throws Throwable {
		String Fleetuser = (String) new API_GetBaseURLTest().getFleetUser();

		String Fleetpassword = (String) new API_GetBaseURLTest().getfleetPasword();
		System.out.println(Fleetuser);
		action.scrollByVisibilityOfElement(getDriver(), userName);
		action.type(userName, Fleetuser);
		action.type(password, Fleetpassword);
		action.click(getDriver(), signInBtn);
		Thread.sleep(5000);
		
	}

	
	
	

}
