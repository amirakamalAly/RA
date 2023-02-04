package com.ERA.screens;
import java.time.Duration;

import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import com.ERA.base.Base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class DubaiPoliceProfileScreen extends Base {
	
	@AndroidFindBy(id = "com.eci.era:id/completeProfileContainer")
	private MobileElement mustaddata;
	public void validateProfileDataIsIncompleteMessage() {

		SoftAssert softAssert = new SoftAssert();
		String mustaddataa = mustaddata.getText();
		System.out.println("text///////////" + mustaddataa);
		softAssert.assertNotNull(mustaddataa);
		softAssert.assertAll();
	}
	
	@AndroidFindBy(id = "com.eci.era:id/btnSave")
	private MobileElement save;

	public void clciksave() {
		// TODO Auto-generated method stub
		save.click();
	}

	 @AndroidFindBy (id = "com.eci.era:id/nameError")
	public MobileElement nameerrormessage;

	public void validateNameMandatoryMessage() {

		SoftAssert softAssert = new SoftAssert();
		String nameerrormessagee = nameerrormessage.getText();
		System.out.println("text///////////" + nameerrormessagee);
		softAssert.assertNotNull(nameerrormessagee);
		softAssert.assertAll();
	}

	 @AndroidFindBy (id = "com.eci.era:id/militaryNumberError")
	public MobileElement MilitaryNumbererrormessage;

	public void validateMilitaryNumberMandatoryMessage() {

		SoftAssert softAssert = new SoftAssert();
		String MilitaryNumbererrormessagee = MilitaryNumbererrormessage.getText();
		System.out.println("text///////////" + MilitaryNumbererrormessagee);
		softAssert.assertNotNull(MilitaryNumbererrormessagee);
		softAssert.assertAll();
	}
	@AndroidFindBy(id = "com.eci.era:id/rankMessageError")
	public MobileElement rankErrorMessage;

	public void validateRankMandatoryMessage() {

		SoftAssert softAssert = new SoftAssert();
		String rankErrorMessagee = rankErrorMessage.getText();
		System.out.println("text///////////" + rankErrorMessagee);
		softAssert.assertNotNull(rankErrorMessagee);
		softAssert.assertAll();
	}
	
	@AndroidFindBy(id = "com.eci.era:id/departmentError")
	public MobileElement departmentErrorMessage;

	public void validatedepartmentMandatoryMessage() {

		SoftAssert softAssert = new SoftAssert();
		String departmentErrorMessagee = departmentErrorMessage.getText();
		System.out.println("text///////////" + departmentErrorMessagee);
		softAssert.assertNotNull(departmentErrorMessagee);
		softAssert.assertAll();
	}
	@AndroidFindBy(id = "com.eci.era:id/policeStationMessageError")
	public MobileElement StationErrorMessage;

	public void validateStationMandatoryMessage() {

		SoftAssert softAssert = new SoftAssert();
		String StationErrorMessagee = StationErrorMessage.getText();
		System.out.println("text///////////" + StationErrorMessagee);
		softAssert.assertNotNull(StationErrorMessagee);
		softAssert.assertAll();
	}

	// @AndroidFindBy (uiAutomator = "new UiSelector().text(\"ÙŠØ±Ø¬Ù‰ Ø§Ù„ØªÙ‚Ø§Ø· ØµÙˆØ±Ø© ÙˆØ§Ø­Ø¯Ø©
	// Ø¹Ù„Ù‰ Ø§Ù„Ø£Ù‚Ù„\")")
	@AndroidFindBy(id = "com.eci.era:id/signatureError")
	public MobileElement Signitureerrormessage;

	public void validatSignitureMandatoryMessage() {

		SoftAssert softAssert = new SoftAssert();
		String Signitureerrormessagee = Signitureerrormessage.getText();
		System.out.println("text///////////" + Signitureerrormessagee);
		softAssert.assertNotNull(Signitureerrormessagee);
		softAssert.assertAll();
	}
	@AndroidFindBy(id = "com.eci.era:id/nameEdit")
	public MobileElement addName;

	public void addValidName(String name) {
		// TODO Auto-generated method stub
		addName.sendKeys(name);
		
	}

	@AndroidFindBy(id = "com.eci.era:id/militaryNumberEdit")
	public MobileElement MilitaryNumber;

	public void addValidMilitaryNumber(String validMilitaryNumber) {
		// TODO Auto-generated method stub
		
		MilitaryNumber.sendKeys(validMilitaryNumber);
	}

	@AndroidFindBy(id = "com.eci.era:id/rankDropMenu")
	public MobileElement Rank;
	public void clickRank() {
		// TODO Auto-generated method stub
		Rank.click();
	}
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[2]/android.widget.TextView")
	public MobileElement Rankitem2;
	public void clickRankItem() {
		// TODO Auto-generated method stub
		Rankitem2.click();
	}
	
	@AndroidFindBy(id = "com.eci.era:id/departmentEdit")
	public MobileElement Department;
	public void addValiddepartment(String validDepartment) {
		// TODO Auto-generated method stub
		Department.sendKeys(validDepartment);
	}



	@AndroidFindBy(id = "com.eci.era:id/policeStationDropMenu")
	public MobileElement station;
	public void clickstation() {
		// TODO Auto-generated method stub
		station.click();
	}
	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView")
	public MobileElement StationItem2;
	public void clickStationItem() {
		// TODO Auto-generated method stub
		StationItem2.click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	@AndroidFindBy(id = "com.eci.era:id/signatureContainer")
	public MobileElement Signiture;
	public void clickSigniture() {
		// TODO Auto-generated method stub
		Signiture.click();
		
	}
	@AndroidFindBy(id = "com.eci.era:id/sigView")
	public MobileElement sigView;
	public void signinAction() {

		Actions act = new Actions(driver);

		act.dragAndDropBy(sigView, 508, 1228).build().perform();
	}
	@AndroidFindBy(id = "com.eci.era:id/clearSigBtn")
	public MobileElement clearsigView;
	
	public void clearsigninAction() {
		// TODO Auto-generated method stub
		clearsigView.click();
	}
	
	
	
	@AndroidFindBy(id = "com.eci.era:id/saveBtn")
	public MobileElement savesigView;
	
	public void savesigninAction() {
		// TODO Auto-generated method stub
		savesigView.click();
	}
	@AndroidFindBy(id = "com.eci.era:id/sigErrorMessage")
	public MobileElement signINErrorMessage;

	public void validatesignINErrorMessage() {

		SoftAssert softAssert = new SoftAssert();
		String signINErrorMessagee = signINErrorMessage.getText();
		System.out.println("text///////////" + signINErrorMessagee);
		softAssert.assertNotNull(signINErrorMessagee);
		softAssert.assertAll();
	}
	

	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[2]/android.widget.ImageView")
	public MobileElement closesignuture;
	
	public void closesignuture() {
		// TODO Auto-generated method stub
		closesignuture.click();
	}
	@AndroidFindBy(id = "com.eci.era:id/sigView")
	public MobileElement sigView2;
	@AndroidFindBy(id = "com.eci.era:id/saveBtn")
	public MobileElement savee;



	public void signin2Action() {
		// TODO Auto-generated method stub

		Actions act = new Actions(driver);

		act.dragAndDropBy(sigView2, 328, 1133).build().perform();
	act.dragAndDropBy(sigView2, 815, 1207).build().perform();
	act.clickAndHold().dragAndDropBy(sigView2, 558, 1233).release();
		act.clickAndHold(sigView2).release(close);
		
		
		TouchAction touchAction = new TouchAction(driver);
		touchAction.longPress(ElementOption.element(sigView2)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500))).moveTo(ElementOption.element(savee)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(3000))).release().perform();
	}
	
	@AndroidFindBy(id = "com.eci.era:id/closeImg")
	public MobileElement close;
	public void colsesuccessscreen() {
		// TODO Auto-generated method stub
		close.click();
	}
	public void addInValidName(String invalidName) {
		// TODO Auto-generated method stub
		addName.sendKeys(invalidName);
		
	}
	public void addInValidMilitaryNumber(String inValidMilitaryNumber) {
		// TODO Auto-generated method stub
		MilitaryNumber.sendKeys(inValidMilitaryNumber);

		
	}
	public void addInValiddepartment(String inValidDepartment) {
		// TODO Auto-generated method stub
		Department.sendKeys(inValidDepartment);
		
	}
}
