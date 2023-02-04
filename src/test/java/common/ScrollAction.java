package common;
import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.ScrollActionScreen;


public class ScrollAction extends Base {
@Test(priority =1)
public void preformScrollAction()

	{
	ScrollActionScreen scroll = new ScrollActionScreen();
	scroll.ScrollPageDown();
	}


}
	
