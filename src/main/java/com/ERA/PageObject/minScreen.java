/**
 * 
 */
package com.ERA.PageObject;

import org.openqa.selenium.support.PageFactory;
import com.ERA.base.Action;
import com.ERA.base.BaseClass;

/**
 * @author Amira
 * 
 */
public class minScreen extends BaseClass {

	Action action = new Action();

	public minScreen() {
		PageFactory.initElements(getDriver(), this);
	}

	public void minScreenAction() throws Throwable {

		action.minimizeAction(getDriver());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
