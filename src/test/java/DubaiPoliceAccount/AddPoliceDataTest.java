package DubaiPoliceAccount;

import org.testng.annotations.Test;

import com.ERA.base.Base;
import com.ERA.screens.DubaiPoliceProfileScreen;
import com.ERA.screens.ScrollActionScreen;

public class AddPoliceDataTest extends Base {

	@Test(dataProvider = "loginPoliceAccount", priority = 1)
	public void addName(String Name, String MobileNumber,String ValidMilitaryNumber, String ValidDepartment,String InValidMilitaryNumber, String InValidDepartment,String InvalidName) throws InterruptedException {
		DubaiPoliceProfileScreen addname = new DubaiPoliceProfileScreen();
		addname.addValidName(Name);
	}

	@Test(dataProvider = "loginPoliceAccount", priority = 1)
	public void addInvalidName(String Name, String MobileNumber,String ValidMilitaryNumber, String ValidDepartment,String InValidMilitaryNumber, String InValidDepartment,String InvalidName) throws InterruptedException {
		DubaiPoliceProfileScreen addname = new DubaiPoliceProfileScreen();
		addname.addInValidName(InvalidName);
	}

	
	@Test(dataProvider = "loginPoliceAccount", priority = 2)
	public void addmilitaryNumber(String Name, String MobileNumber,String ValidMilitaryNumber, String ValidDepartment,String InValidMilitaryNumber, String InValidDepartment,String InvalidName) throws InterruptedException {
		DubaiPoliceProfileScreen ValidMilitaryNumberr = new DubaiPoliceProfileScreen();
		ValidMilitaryNumberr.addValidMilitaryNumber(ValidMilitaryNumber);
	}
	
	@Test(dataProvider = "loginPoliceAccount", priority = 2)
	public void addInvalidmilitaryNumber(String Name, String MobileNumber,String ValidMilitaryNumber, String ValidDepartment,String InValidMilitaryNumber, String InValidDepartment,String InvalidName) throws InterruptedException {
		DubaiPoliceProfileScreen ValidMilitaryNumberr = new DubaiPoliceProfileScreen();
		ValidMilitaryNumberr.addInValidMilitaryNumber(InValidMilitaryNumber);
	}


	@Test(priority = 3)
	public void clickRank()

	{
		DubaiPoliceProfileScreen rank = new DubaiPoliceProfileScreen();
		rank.clickRank();
	}

	@Test(priority = 4)
	public void preformdragsheetout()

	{
		ScrollActionScreen scroll = new ScrollActionScreen();
		scroll.dragsheetout();
	}

	@Test(priority = 5)
	public void selectRankItem()

	{
		DubaiPoliceProfileScreen rankitem = new DubaiPoliceProfileScreen();
		rankitem.clickRankItem();
	}

	
	@Test(priority = 6)
	public void preformScrollDownAction()

	{
		ScrollActionScreen scroll = new ScrollActionScreen();
		scroll.ScrollPageDown();
	}
	
	
	@Test(dataProvider = "loginPoliceAccount", priority = 7)
	public void addValidepartment(String Name, String MobileNumber,String ValidMilitaryNumber, String ValidDepartment,String InValidMilitaryNumber, String InValidDepartment,String InvalidName) throws InterruptedException {
		DubaiPoliceProfileScreen addValidepartment = new DubaiPoliceProfileScreen();
		addValidepartment.addValiddepartment(ValidDepartment);
	}
	@Test(dataProvider = "loginPoliceAccount", priority = 7)
	public void addInValidepartment(String Name, String MobileNumber,String ValidMilitaryNumber, String ValidDepartment,String InValidMilitaryNumber, String InValidDepartment,String InvalidName) throws InterruptedException {
		DubaiPoliceProfileScreen addInValidepartment = new DubaiPoliceProfileScreen();
		addInValidepartment.addInValiddepartment(InValidDepartment);
	}


	@Test(priority = 8)
	public void clickStationstation()

	{
		DubaiPoliceProfileScreen station = new DubaiPoliceProfileScreen();
		station.clickstation();
	}

	@Test(priority = 9)
	public void preformdragsheetoutt()

	{
		ScrollActionScreen scroll = new ScrollActionScreen();
		scroll.dragsheetout();
	}

	@Test(priority = 10)
	public void selectstationItem()

	{
		DubaiPoliceProfileScreen stationitem = new DubaiPoliceProfileScreen();
		stationitem.clickStationItem();
	}
	
	@Test(priority = 11)
	public void clcikSigniture()

	{
		DubaiPoliceProfileScreen Signiture = new DubaiPoliceProfileScreen();
		Signiture.clickSigniture();
	}
	
	
	@Test(priority = 12)
	public void signinAction()

	{
		DubaiPoliceProfileScreen Signiture = new DubaiPoliceProfileScreen();
		Signiture.signinAction();
	}
	@Test(priority = 13)
	public void clearsigninAction()

	{
		DubaiPoliceProfileScreen Signiture = new DubaiPoliceProfileScreen();
		Signiture.clearsigninAction();
	}
	
	@Test(priority = 14)
	public void savesigninAction()

	{
		DubaiPoliceProfileScreen Signiture = new DubaiPoliceProfileScreen();
		Signiture.savesigninAction();
	}
	
	@Test(priority = 15)
	public void validatesignINErrorMessage()

	{
		DubaiPoliceProfileScreen Signiture = new DubaiPoliceProfileScreen();
		Signiture.validatesignINErrorMessage();
	}
	
	
	@Test(priority = 16)
	public void closesignuture()

	{
		DubaiPoliceProfileScreen Signiture = new DubaiPoliceProfileScreen();
		Signiture.closesignuture();
	}
	

	@Test(priority = 17)
	public void clcikSigniture2()

	{
		DubaiPoliceProfileScreen Signiture = new DubaiPoliceProfileScreen();
		Signiture.clickSigniture();
	}
	
	
	@Test(priority = 18)
	public void signin2Action()

	{
		DubaiPoliceProfileScreen Signiture = new DubaiPoliceProfileScreen();
		Signiture.signin2Action();
	}
	
	
	@Test(priority = 19)
	public void savesigninAction2()

	{
		DubaiPoliceProfileScreen Signiture = new DubaiPoliceProfileScreen();
		Signiture.savesigninAction();
	}
	
	@Test(priority = 20)
	public void clciksave2()

	{
		DubaiPoliceProfileScreen save = new DubaiPoliceProfileScreen();
		save.clciksave();
				try {
		Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
//
//	
//	@Test(priority = 21)
//	public void closesuccessscreen()
//
//	{
//		DubaiPoliceProfileScreen success = new DubaiPoliceProfileScreen();
//		success.colsesuccessscreen();
//	}
}
//
