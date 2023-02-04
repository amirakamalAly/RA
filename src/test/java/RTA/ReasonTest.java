package RTA;

import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.PlateDataScreen;

public class ReasonTest extends Base {
	@Test(priority = 1)
	public void ClickReasondropdown() {
		PlateDataScreen reason = new PlateDataScreen();
		reason.clickreason();
	}

	@Test(priority = 2)
	public void SelectItem() {
		PlateDataScreen item = new PlateDataScreen();
		item.clickdropdown();
	}

	@Test(priority = 3)
	public void clickSave() {
		PlateDataScreen save = new PlateDataScreen();
		save.clicksave();
	}
}
