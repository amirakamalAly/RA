package com.ERA.screens;

import com.ERA.base.Base;
import com.ERA.screens.cancelPopupScreen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class cancelPopupScreen extends Base {
	@AndroidFindBy(id = "com.eci.era:id/btnCancel")
	public MobileElement cancel;

	public void clcikButton() {
		cancel.click();
	}

	@AndroidFindBy(id = "com.eci.era:id/tvCancelRequest")
	public MobileElement cancellink;

	public void clcikCancel() {
		// TODO Auto-generated method stub
		cancellink.click();
	}

	@AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView")
	public MobileElement reason;
	public void selectreason() {
		// TODO Auto-generated method stub
		reason.click();
	}
	@AndroidFindBy(id = "com.eci.era:id/notesEditText")
	public MobileElement addtxt;

	public void addreasonText() {
		// TODO Auto-generated method stub
		addtxt.sendKeys("adding cancelation reason trxt");
	}
	
	@AndroidFindBy(id = "com.eci.era:id/saveBtn")
	public MobileElement confirm;

	public void confirmcancel() {
		// TODO Auto-generated method stub
		confirm.click();
	}
}
