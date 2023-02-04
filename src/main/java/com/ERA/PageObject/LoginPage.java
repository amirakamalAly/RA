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
public class LoginPage extends BaseClass {

	Action action = new Action();

	@FindBy(id = "UserName")
	private WebElement userName;

	@FindBy(id = "Password")
	private WebElement password;

	@FindBy(xpath = "/html/body/div[2]/div/form/div[3]")
	private WebElement signInBtn;

	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public void login() throws Throwable {
		String adminuser = (String) new API_GetBaseURLTest().getadminUser();

		String adminpassword = (String) new API_GetBaseURLTest().getadminPasword();
		System.out.println(adminuser);
		action.scrollByVisibilityOfElement(getDriver(), userName);
		action.type(userName, adminuser);
		action.type(password, adminpassword);
		action.click(getDriver(), signInBtn);
		
	}
	
	

}
