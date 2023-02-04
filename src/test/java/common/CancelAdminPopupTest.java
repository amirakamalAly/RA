package common;

import org.testng.annotations.Test;

import com.ERA.base.Base;
import com.ERA.screens.AdminCancelpopupScreen;
import com.ERA.screens.MenuScreen;
import com.ERA.screens.RequestHistoryScreen;

public class CancelAdminPopupTest extends Base {
@Test(priority =1)
public void ratedriver()

	{
		AdminCancelpopupScreen rate = new AdminCancelpopupScreen();
		rate.ClickdismissCancelpopup();
	}
@Test(priority = 2)
public void ClickMenu()

{
	MenuScreen Menu = new MenuScreen();
	Menu.ClickMenuIcon();

}
@Test(priority = 3)
public void MenuRequestHistory()

{
	RequestHistoryScreen History = new RequestHistoryScreen();
	History.MenuRequestHistory();
}




@Test(priority =4)
public void ClickFristItemRequestHistory()

{
	RequestHistoryScreen FristItem = new RequestHistoryScreen();
	FristItem.ClickFristItemRequestHistory();
}
@Test(priority = 5)
public void confirmRequestStatusCanceledTest() {
	RequestHistoryScreen completed = new RequestHistoryScreen();
	completed.checkStatus();
}

}
	
