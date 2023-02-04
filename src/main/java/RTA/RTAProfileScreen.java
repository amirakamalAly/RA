package RTA;

import org.testng.Assert;

import com.ERA.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class RTAProfileScreen extends Base {

	@AndroidFindBy(id = "com.eci.era:id/nameEdit")
	private MobileElement validname;
	public void addValidName(String name) {
		// TODO Auto-generated method stub
		validname.clear();
		validname.sendKeys(name);
	}

	@AndroidFindBy(id = "com.eci.era:id/nameEdit")
	private MobileElement in_validname;
	public void addInValidName(String invalidName) {
		// TODO Auto-generated method stub
		in_validname.clear();
		in_validname.sendKeys(invalidName);
	}

	@AndroidFindBy(id = "com.eci.era:id/requesterIdEdit")
	private MobileElement ID;
	public void addValidId(String id) {
		// TODO Auto-generated method stub
		ID.clear();
		ID.sendKeys(id);
	}

	
	public void addIN_ValidId(String invalidID) {
		// TODO Auto-generated method stub
		ID.clear();
		//ID.sendKeys(invalidID);
	}

	

	
	@AndroidFindBy(id = "com.eci.era:id/btnSave")
	private MobileElement save;
	public void clciksave() {
		// TODO Auto-generated method stub
		save.click();
	}
	
	@AndroidFindBy(id = "com.eci.era:id/nameError")
	private MobileElement errorname;
	public void validateNameMandatoryMessage() {
		// TODO Auto-generated method stub
		String ValidationMessageText = errorname.getText();
		System.out.println("here is error " + ValidationMessageText);
		String validValidationErrorText = "يجب أن يتكون الاسم من 4 وحتى 35 حرفًا";
		Assert.assertEquals(ValidationMessageText, validValidationErrorText);
		
	}
	@AndroidFindBy(id = "com.eci.era:id/requesterIdError")
	private MobileElement iderror;
	public void validateIDMandatoryMessage() {
		// TODO Auto-generated method stub
		String ValidationMessageText = iderror.getText();
		System.out.println("here is error " + ValidationMessageText);
		String validValidationErrorText = "يرجى إدخال من 1 وحتى 6 أرقام";
		Assert.assertEquals(ValidationMessageText, validValidationErrorText);
		
	}

	
	
	@AndroidFindBy(id = "com.eci.era:id/closeImg")
	private MobileElement closepopup;
	public void Closepopup() {
		// TODO Auto-generated method stub
		closepopup.click();
	}
}
