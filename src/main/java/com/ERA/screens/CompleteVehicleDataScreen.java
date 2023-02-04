package com.ERA.screens;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.ERA.base.Base;
import com.github.javafaker.Faker;

import io.appium.java_client.MobileElement;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class CompleteVehicleDataScreen extends Base {
	@AndroidFindBy(id = "com.eci.era:id/viewVehiclesBtn")
	private MobileElement viewdata;

	public void ViewRequestdata() {
		// TODO Auto-generated method stub
		viewdata.click();
	}

	@AndroidFindBy(id = "com.eci.era:id/addVehicleInfoBtn")
	private MobileElement completeButton;

	public void clcikcompletebutton() {
		// TODO Auto-generated method stub
		completeButton.click();
	}

	@AndroidFindBy(id = "com.eci.era:id/makeDropMenu")
	private MobileElement selectMake;

	public void SelectMake() {
		// TODO Auto-generated method stub
		selectMake.click();
	}

	@AndroidFindBy(id = "com.eci.era:id/handle")
	public MobileElement From;
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout")
	public MobileElement To;

	public void dragsheet() {
		Actions act = new Actions(driver);
		act.dragAndDrop(From, To).build().perform();

	}

	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup")
	private MobileElement selectMakeitem;

	public void selectMakeitem() {
		// TODO Auto-generated method stub
		selectMakeitem.click();

	}

	@AndroidFindBy(id = "com.eci.era:id/modelDropMenu")
	private MobileElement selectModel;

	public void selectModel() {
		// TODO Auto-generated method stub
		selectModel.click();
	}

	@AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.view.ViewGroup")
	private MobileElement selectModelitem;

	public void selectModelitem() {
		// TODO Auto-generated method stub
		selectModelitem.click();
	}

	@AndroidFindBy(id = "com.eci.era:id/modelDropMenu")
	public MobileElement From2;
	@AndroidFindBy(id = "com.eci.era:id/vehicleImagesTitle")
	public MobileElement To2;

	public void scrolldown() {
		// TODO Auto-generated method stub
		Actions act = new Actions(driver);
		act.dragAndDrop(From2, To2).build().perform();
	}

	@AndroidFindBy(id = "com.eci.era:id/modelDropMenu")
	public MobileElement Too;
	@AndroidFindBy(id = "com.eci.era:id/colorDropMenu")
	public MobileElement Froom;

	public void scrollUp() {
		// TODO Auto-generated method stub
		Actions act = new Actions(driver);
		act.dragAndDrop(Too, Froom).build().perform();
	}

	@AndroidFindBy(id = "com.eci.era:id/yearDropMenu")
	public MobileElement Year;

	public void SelectYear() {
		// TODO Auto-generated method stub

		Year.click();
	}

	@AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView")
	public MobileElement YearItem;

	public void SelectYearItem() {
		// TODO Auto-generated method stub
		YearItem.click();
	}

	@AndroidFindBy(id = "com.eci.era:id/colorDropMenu")
	public MobileElement color;

	public void SelectColor() {
		// TODO Auto-generated method stub
		color.click();
	}

	@AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[8]/android.widget.ImageView")
	public MobileElement colorItem;

	public void SelectColorItem() {
		// TODO Auto-generated method stub
		colorItem.click();

	}

	@AndroidFindBy(id = "com.eci.era:id/weightDropMenu")
	public MobileElement weightlist;

	public void Selectweightlist() {
		// TODO Auto-generated method stub
		weightlist.click();
	}

	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView")
	public MobileElement weightItem;

	public void SelectweightlistItem() {
		// TODO Auto-generated method stub
		weightItem.click();
	}

	@AndroidFindBy(id = "com.eci.era:id/hasKeySwitch")
	public MobileElement key;

	public void SelectHasKeySwitch() {
		// TODO Auto-generated method stub
		key.click();

	}

	@AndroidFindBy(id = "com.eci.era:id/ChassissEdit")
	public MobileElement VinNumber;

	public void AddChassisNumber(String chassisNumber) {
		// TODO Auto-generated method stub
		System.out.println("iiiiiiiiiiiiiiiiii" + chassisNumber);
		VinNumber.sendKeys(chassisNumber);
	}

	@AndroidFindBy(id = "com.eci.era:id/btnConfirmRequest")
	public MobileElement Confirmbutton;

	public void ConfirmVehicle() {
		// TODO Auto-generated method stub
		Confirmbutton.click();
	}

	@AndroidFindBy(id = "com.eci.era:id/modelErrorMessage")
	private MobileElement ValidationMessage;

	public void assertModelValidation() {

		String ValidationMessageText = ValidationMessage.getText();
		System.out.println("here is error " + ValidationMessageText);
		String validValidationErrorText = "حدد الموديل";
		Assert.assertEquals(ValidationMessageText, validValidationErrorText);
	}

	@AndroidFindBy(id = "com.eci.era:id/chassissErrorMessage")
	private MobileElement ChassisValidationMessage;

	public void assertChassisValidation() {
		String ValidationMessageText = ChassisValidationMessage.getText();
		System.out.println("here is error " + ValidationMessageText);
		String validValidationErrorText = "*يجب أن يتكون الرمز المروري من 11 وحتى 17 رقم";
		Assert.assertEquals(ValidationMessageText, validValidationErrorText);
	}

	@AndroidFindBy(id = "com.eci.era:id/makeErrorMessage")
	private MobileElement MakeValidationMessage;

	public void assertMakeValidation() {
		String ValidationMessageText = MakeValidationMessage.getText();
		System.out.println("here is error " + ValidationMessageText);
		String validValidationErrorText = "حدد المصنع";
		Assert.assertEquals(ValidationMessageText, validValidationErrorText);
	}

	@AndroidFindBy(id = "com.eci.era:id/imageErrorMessage")
	private MobileElement ImageValidationMessage;

	public void assertImageValidation() {
		// TODO Auto-generated method stub
		String ValidationMessageText = ImageValidationMessage.getText();
		System.out.println("here is error " + ValidationMessageText);
		String validValidationErrorText = "يرجى التقاط صورة واحدة على الأقل";
		Assert.assertEquals(ValidationMessageText, validValidationErrorText);
	}

	@AndroidFindBy(id = "com.eci.era:id/pickUpAddress")
	private MobileElement fristitem;

	public void itemclick() {
		fristitem.click();

	}

	@AndroidFindBy(id = "com.eci.era:id/viewVehiclesBtn")
	private MobileElement clcikcomplete;

	public void clcikitemclick() {
		// TODO Auto-generated method stub
		clcikcomplete.click();
	}

	@AndroidFindBy(id = "com.eci.era:id/addVehicleInfoBtn")
	private MobileElement clcikVehcomplete;

	public void completeVehicleclcik() {
		// TODO Auto-generated method stub
		clcikVehcomplete.click();
	}

	@AndroidFindBy(id = "com.eci.era:id/nameErrorMessage")
	private MobileElement OwnerName;

	public void assertOwnerNameValidation() {
		// TODO Auto-generated method stub
		String ValidationMessageText = OwnerName.getText();
		System.out.println("here is error " + ValidationMessageText);
		String validValidationErrorText = "يجب أن يتكون الاسم من 4 وحتى 35 حرفًا";
		Assert.assertEquals(ValidationMessageText, validValidationErrorText);
	}

	@AndroidFindBy(id = "com.eci.era:id/mobileErrorMessage")
	private MobileElement MobileMessage;

	public void assertMobileNumberValidation() {
		// TODO Auto-generated method stub
		String ValidationMessageText = MobileMessage.getText();
		System.out.println("here is error " + ValidationMessageText);
		String validValidationErrorText = "يجب أن يتكون رقم الهاتف المتحرك من 10 أرقام";
		Assert.assertEquals(ValidationMessageText, validValidationErrorText);
	}

	@AndroidFindBy(id = "com.eci.era:id/licenseErrorMessage")
	private MobileElement licenseValidationMessage;

	public void assertIssueLincenseValidation() {
		// TODO Auto-generated method stub
		String ValidationMessageText = licenseValidationMessage.getText();
		System.out.println("here is error " + ValidationMessageText);
		String validValidationErrorText = "يجب أن يتكون رقم الرخصة من 6 وحتى 15 رقمًا";
		Assert.assertEquals(ValidationMessageText, validValidationErrorText);
	}

	@AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
	private MobileElement UpdateModelitem;

	public void UpdateModelitem() {
		// TODO Auto-generated method stub
		UpdateModelitem.click();
	}

	@AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.TextView")
	private MobileElement UpdateMakeitem;

	public void UpdateMakeitem() {
		// TODO Auto-generated method stub
		UpdateMakeitem.click();

	}

	@AndroidFindBy(id = "com.eci.era:id/edtVehicleInfoBtn")
	private MobileElement editVehicleIcon;

	public void completeVehicleInfoata() {
		// TODO Auto-generated method stub
		editVehicleIcon.click();
	}

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]")
	private MobileElement updateYear;

	public void UpdateYearItem() {
		// TODO Auto-generated method stub
		updateYear.click();
	}

	public void UpdateChassisNumber(String chassisNumber) {
		// TODO Auto-generated method stub
		System.out.println("Update Chassis number value " + chassisNumber);
		VinNumber.clear();
		VinNumber.sendKeys(chassisNumber);
	}

	@AndroidFindBy(xpath = "//android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView")
	private MobileElement weightItem2;

	public void UpdateweightlistItem() {
		// TODO Auto-generated method stub
		weightItem2.click();
	}

	@AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[9]/android.widget.ImageView")
	public MobileElement colorItem2;

	public void UpdateColorItem() {
		// TODO Auto-generated method stub
		colorItem2.click();
	}

	@AndroidFindBy(id = "com.eci.era:id/VehicleInfoData")
	public MobileElement vehicledataSection;

	public void AssertVehicleData() {
		// TODO Auto-generated method stub
		String vehicleInfo = vehicledataSection.getText();
		Assert.assertEquals(true, vehicleInfo.contains("رقم الشاسي"));
	}

	@AndroidFindBy(id = "com.eci.era:id/edtVehicleOwnerBtn")
	public MobileElement editownericon;

	public void editownerIcon() {
		// TODO Auto-generated method stub
		editownericon.click();
	}

	@AndroidFindBy(id = "com.eci.era:id/edtPlateInfoBtn")
	public MobileElement editPlateicon;

	public void editPlateIcon() {
		// TODO Auto-generated method stub
		editPlateicon.click();
	}

	@AndroidFindBy(id = "com.eci.era:id/edtImpoundInfoBtn")
	public MobileElement editImpoundicon;

	public void editImpoundIcon() {
		// TODO Auto-generated method stub
		editImpoundicon.click();
	}

	@AndroidFindBy(id = "com.eci.era:id/vehicleReferanceEdit")
	public MobileElement refNumber;

	public void addrefrencenumber(String vinnumber2, String refrencenumber) {
		// TODO Auto-generated method stub

		Faker faker = new Faker();
		String randomRefrence = faker.number().digits(40);
		refNumber.sendKeys(randomRefrence);
	}

	@AndroidFindBy(xpath = "//android.widget.LinearLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.GridView/android.view.ViewGroup[2]/android.view.ViewGroup")
	public MobileElement collectdate;

	public void selectcollectdate() {
		// TODO Auto-generated method stub
		collectdate.click();
	}

	@AndroidFindBy(id = "com.eci.era:id/btnConfirmRequest")
	public MobileElement confirm;

	public void ConfirmFujirahVehicle() {
		// TODO Auto-generated method stub
		confirm.click();
	}

	@AndroidFindBy(xpath = "//android.widget.LinearLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.GridView/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ImageView")
	public MobileElement scheduled;

	public void selectcollectdateSchedule() {
		// TODO Auto-generated method stub
		scheduled.click();
	}

	@AndroidFindBy(id = "com.eci.era:id/edtVehicleInfoBtn")
	public MobileElement editIcon;

	public void SelectVehicleEditIcon() {
		// TODO Auto-generated method stub
		editIcon.click();

	}

	@AndroidFindBy(id = "com.eci.era:id/continueBtn")
	public MobileElement cnt;

	public void ContinueVehicle() {
		// TODO Auto-generated method stub
		cnt.click();
	}

	@AndroidFindBy(id = "com.eci.era:id/finishRequestBtn")
	public MobileElement finish;

	public void finish() {
		// TODO Auto-generated method stub
		finish.click();

	}

}
