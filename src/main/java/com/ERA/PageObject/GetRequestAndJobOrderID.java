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
public class GetRequestAndJobOrderID extends BaseClass {
	static String JobOrderId;

	/**
	 * @return the JobOrderId
	 */
	public String getJobOrderId() {
		return JobOrderId;
	}

	/**
	 * 
	 * @param JobOrderId
	 */
	public void setJobOrderId(String JobOrderId) {
		GetRequestAndJobOrderID.JobOrderId = JobOrderId;
	}

	@FindBy(xpath = "/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/div/table/tbody/tr[1]/td[5]")
	private WebElement JoborderId;
	@FindBy(xpath = "/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/div/table/tbody/tr[1]/td[1]")
	private WebElement RequesttId;

	Action action = new Action();

	public GetRequestAndJobOrderID() {
		PageFactory.initElements(getDriver(), this);
	}

	public void  GetGobOrderID(String name, String mobileNumber) throws Exception {

		action.implicitWait(getDriver(), 5);
		JobOrderId = action.getElementText(getDriver(), JoborderId);
		// action.getElementText(getDriver(), JoborderId);
		action.implicitWait(getDriver(), 5);
		action.getElementText(getDriver(), RequesttId);

	//return JobOrderId;
		


	}
}