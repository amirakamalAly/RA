package SandPullOut;

import org.testng.annotations.Test;

import com.ERA.base.Base;
import com.ERA.screens.NoteScreen;
import com.ERA.screens.addSandPullOutRequestTestScreen;

public class addNormalSandPullOutRequestTest extends Base {

	@Test(priority = 1)
	public void DragServiceSheet()

	{
		addSandPullOutRequestTestScreen dragsheet = new addSandPullOutRequestTestScreen();
		dragsheet.dragsheetHome();

	}

	@Test(priority = 2)
	public void SelectSandPullOut()

	{
		addSandPullOutRequestTestScreen sandPullOut = new addSandPullOutRequestTestScreen();
		sandPullOut.selectSandPullOut();

	}

	
}
