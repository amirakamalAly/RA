package RTA;

import org.testng.annotations.Test;
import com.ERA.base.Base;

public class AddRTADataTest extends Base {

	@Test(dataProvider = "RTA_Account", priority = 1)
	public void addName(String Name, String MobileNumber, String ID, String InvalidID, String InvalidName)
			throws InterruptedException {
		RTAProfileScreen addname = new RTAProfileScreen();
		addname.addValidName(Name);
	}

	@Test(dataProvider = "RTA_Account", priority = 1)
	public void addInvalidName(String Name, String MobileNumber, String ID, String InvalidID, String InvalidName)
			throws InterruptedException {
		RTAProfileScreen addname = new RTAProfileScreen();
		addname.addInValidName(InvalidName);
	}

	@Test(dataProvider = "RTA_Account", priority = 2)
	public void addId(String Name, String MobileNumber, String ID, String InvalidID, String InvalidName)
			throws InterruptedException {
		RTAProfileScreen ValidMilitaryNumberr = new RTAProfileScreen();
		ValidMilitaryNumberr.addValidId(ID);
	}

	@Test(dataProvider = "RTA_Account", priority = 2)
	public void addInvalidId(String Name, String MobileNumber, String ID, String InvalidID, String InvalidName)
			throws InterruptedException {
		RTAProfileScreen invalidid = new RTAProfileScreen();
	
		invalidid.addIN_ValidId(InvalidID);
	}

	@Test(priority = 3)
	public void clciksave()

	{
		RTAProfileScreen save = new RTAProfileScreen();
		save.clciksave();

	}
	
	

	@Test(priority = 4)
	public void clickclose()

	{
		RTAProfileScreen close = new RTAProfileScreen();
		close.Closepopup();

	}

}
