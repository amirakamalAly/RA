package DubaiPoliceAccount;

import org.testng.annotations.Test;

import com.ERA.base.Base;
import com.ERA.screens.DubaiPoliceProfileScreen;
import com.ERA.screens.MenuScreen;
import com.ERA.screens.ScrollActionScreen;

public class checkProfileValidationTest extends Base {

	@Test(priority = 1)

	public void CheckProfileDataIsIncompleteMessage() throws InterruptedException
	{
		DubaiPoliceProfileScreen CompleteProfile = new DubaiPoliceProfileScreen();
		CompleteProfile.validateProfileDataIsIncompleteMessage();
	}

	@Test(priority = 2)
	public void AClickSave() throws InterruptedException
	{
		DubaiPoliceProfileScreen save = new DubaiPoliceProfileScreen();
		save.clciksave();
	}

	@Test(priority =2)
	public void BpreformScrollUpAction()

	{
	ScrollActionScreen scroll = new ScrollActionScreen();
	scroll.ScrollPageUp();
	}
	

	@Test(priority = 3)
	public void validateNameError()

	{
		DubaiPoliceProfileScreen nameError = new DubaiPoliceProfileScreen();
		nameError.validateNameMandatoryMessage();
	}

	@Test(priority = 4)
	public void validateMilitaryError()

	{
		DubaiPoliceProfileScreen MilitaryError = new DubaiPoliceProfileScreen();
		MilitaryError.validateMilitaryNumberMandatoryMessage();
	}
	
	
	@Test(priority = 5)
	public void preformScrollAction()

	{
	ScrollActionScreen scroll = new ScrollActionScreen();
	scroll.ScrollPageDown();
	}
	

	@Test(priority = 6)
	public void validateRankError()

	{
		DubaiPoliceProfileScreen RankError = new DubaiPoliceProfileScreen();
		RankError.validateRankMandatoryMessage();
	}
	@Test(priority = 7)
	public void validatedepartmentError()

	{
		DubaiPoliceProfileScreen departmentError = new DubaiPoliceProfileScreen();
		departmentError.validatedepartmentMandatoryMessage();
	}

	@Test(priority = 8)
	public void validateStationError()

	{
		DubaiPoliceProfileScreen StationError = new DubaiPoliceProfileScreen();
		StationError.validateStationMandatoryMessage();
	}
	@Test(priority = 9)
	public void validateSignitureError()

	{
		DubaiPoliceProfileScreen SigntureError = new DubaiPoliceProfileScreen();
		SigntureError.validatSignitureMandatoryMessage();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(priority =10)
	public void preformScrollUpAction()

	{
	ScrollActionScreen scroll = new ScrollActionScreen();
	scroll.ScrollPageUp();
	}
	
//	@Test(priority = 11)
//	public void ClickMenu()
//
//	{
//		MenuScreen Menu = new MenuScreen();
//		Menu.ClickMenuIcon();
//
//	}
//	@Test(priority = 12)
//	public void ClickProfile()
//
//	{
//		MenuScreen profile = new MenuScreen();
//		profile.ClickProfileMenuIcon();
//
//	}	
}
