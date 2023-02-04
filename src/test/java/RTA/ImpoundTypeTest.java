package RTA;

import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.RTAScreen;


public class ImpoundTypeTest extends Base {

	@Test(priority = 1)
	public void click_type_dropdown()

	{
		RTAScreen type = new RTAScreen();
		type.impoundtypedropdown();
	}

	@Test(priority = 2)
	public void Select_typeitem()

	{
		RTAScreen item = new RTAScreen();
		item.typeitem();
	}
		}
