package com.ERA.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.ERA.listeners.ListenerClass;
import com.ERA.utils.ExcelUtility;
import com.ERA.utils.ExcelUtilityFujirahAccount;
import com.ERA.utils.ExcelUtilityPoliceAccount;
import com.ERA.utils.ExcelUtilityRTAAccount;
import com.ERA.utils.ExtentManager;
import com.ERA.utils.JobOrderIdUtility;
import com.ERA.utils.LocationExcelUtility;
import com.ERA.utils.RequestUtility;
import com.ERA.utils.UpdateLocationUtility2;
import com.ERA.utils.UpdateLocationUtilityInroute;
import com.ERA.utils.UpdateLocationUtilityPickup;
import com.ERA.utils.UpdateLocationUtilityassigned;
import com.ERA.utils.VehicleDataUtility;
import com.ERA.utils.access_tokenUtility;
import com.ERA.utils.profileUitilty;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.HTMLReporter;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Base {

	protected static AndroidDriver<MobileElement> driver;
	protected FileInputStream inputStream;
	protected Properties prop;
	public static ExtentReports extent;
	public static ExtentTest logger;
	public static HTMLReporter htmlReporter;

	public Base() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@BeforeSuite
	public void beforeSuite() {
		ExtentManager.setExtent();
	};

	@AfterSuite
	public void afterSuite() {
		ExtentManager.endReport();
	//	driver.close();
	}

	@AfterMethod
	public void afterMethod(Method method, ITestResult result) throws InterruptedException {
		Thread.sleep(1000);
		ListenerClass listenerClass = new ListenerClass();

		File image = driver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(image, new File("Snapshots/" + method.getName() + ".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		String Fullpath = System.getProperty("user.dir") + File.separator + "Snapshots/" + method.getName() + ".jpg";

		if (result.getStatus() == ITestResult.SUCCESS) {
			listenerClass.onTestSuccessMobile(result, Fullpath);
		} else if (result.getStatus() == ITestResult.FAILURE) {
			listenerClass.onTestFailureMobile(result, Fullpath);
		} else {
			listenerClass.onTestSkippedMobile(result, Fullpath);
		}
	}

	@DataProvider(name = "loginUsers")
	public Object[][] getdata() throws IOException {

		List<Map<String, String>> testDataInMap = ExcelUtility.getMapTestDataInMap();
		Object[][] data = new Object[1][2];
		String Name = testDataInMap.get(0).get("Name");
		String MobileNumber = testDataInMap.get(0).get("MobileNumber");
		data[0][0] = Name;
		data[0][1] = MobileNumber;
		return data;
	}

	@DataProvider(name = "loginPoliceAccount")
	public Object[][] getPolicedata() throws IOException {
		List<Map<String, String>> testDataInMap = ExcelUtilityPoliceAccount.getMapTestDataInMap();
		Object[][] data = new Object[1][7];
		String Name = testDataInMap.get(0).get("Name");
		String MobileNumber = testDataInMap.get(0).get("MobileNumber");
		String ValidMilitaryNumber = testDataInMap.get(0).get("ValidMilitaryNumber");
		String ValidDepartment = testDataInMap.get(0).get("ValidDepartment");
		String InValidMilitaryNumber = testDataInMap.get(0).get("InValidMilitaryNumber");
		String InValidDepartment = testDataInMap.get(0).get("InValidDepartment");
		String InvalidName = testDataInMap.get(0).get("InvalidName");

		data[0][0] = Name;
		data[0][1] = MobileNumber;
		data[0][2] = ValidMilitaryNumber;
		data[0][3] = ValidDepartment;
		data[0][4] = InValidMilitaryNumber;
		data[0][5] = InValidDepartment;
		data[0][6] = InvalidName;

		return data;
	}

	@DataProvider(name = "RTA_Account")
	public Object[][] getRTA() throws IOException {
		List<Map<String, String>> testDataInMap = ExcelUtilityRTAAccount.getMapTestDataInMap();
		Object[][] data = new Object[1][5];
		String Name = testDataInMap.get(3).get("Name");
		String MobileNumber = testDataInMap.get(3).get("MobileNumber");
		String ID = testDataInMap.get(3).get("ID");
		String InvalidID = testDataInMap.get(3).get("InvalidID");
		String InvalidName = testDataInMap.get(3).get("InvalidName");
		

		data[0][0] = Name;
		data[0][1] = MobileNumber;
		data[0][2] = ID;
		data[0][3] = InvalidID;
		data[0][4] = InvalidName;
		
		return data;
	}

	@DataProvider(name = "loginFujirahAccount")
	public Object[][] getPolicedataFujirah() throws IOException {
		List<Map<String, String>> testDataInMap = ExcelUtilityPoliceAccount.getMapTestDataInMap();
		Object[][] data = new Object[1][7];
		String Name = testDataInMap.get(1).get("Name");
		String MobileNumber = testDataInMap.get(1).get("MobileNumber");
		String ValidMilitaryNumber = testDataInMap.get(1).get("ValidMilitaryNumber");
		String ValidDepartment = testDataInMap.get(1).get("ValidDepartment");
		String InValidMilitaryNumber = testDataInMap.get(1).get("InValidMilitaryNumber");
		String InValidDepartment = testDataInMap.get(1).get("InValidDepartment");
		String InvalidName = testDataInMap.get(1).get("InvalidName");

		data[0][0] = Name;
		data[0][1] = MobileNumber;
		data[0][2] = ValidMilitaryNumber;
		data[0][3] = ValidDepartment;
		data[0][4] = InValidMilitaryNumber;
		data[0][5] = InValidDepartment;
		data[0][6] = InvalidName;

		return data;
	}

	@DataProvider(name = "FujirahVehicleData")
	public Object[][] getFujirahvehicleata() throws IOException {
		List<Map<String, String>> testDataInMap = ExcelUtilityFujirahAccount.getMapTestDataInMap();
		Object[][] data = new Object[1][2];
		String vinnumber = testDataInMap.get(0).get("vinnumber");
		String refrencenumber = testDataInMap.get(0).get("refrencenumber");

		data[0][0] = vinnumber;
		data[0][1] = refrencenumber;

		return data;
	}

	@DataProvider(name = "InvalidMobileNumber")
	public Object[][] getInvalidMobileNumberdata() throws IOException {
		List<Map<String, String>> testDataInMap = ExcelUtility.getMapTestDataInMap();
		Object[][] data = new Object[1][2];
		String Name = testDataInMap.get(1).get("Name");
		String MobileNumber = testDataInMap.get(1).get("MobileNumber");
		data[0][0] = Name;
		data[0][1] = MobileNumber;
		return data;
	}

	@DataProvider(name = "EditloginUsers")
	public Object[][] getdataa() throws IOException {
		List<Map<String, String>> testDataInMap = ExcelUtility.getMapTestDataInMap();
		Object[][] data = new Object[1][2];
		String Name = testDataInMap.get(2).get("Name");
		String MobileNumber = testDataInMap.get(2).get("MobileNumber");
		data[0][0] = Name;
		data[0][1] = MobileNumber;
		return data;
	}

	@DataProvider(name = "Locations")
	public Object[][] getdataFromLocationExcelSheet() throws IOException {
		List<Map<String, String>> testDataInMap = LocationExcelUtility.getMapTestDataInMap();
		Object[][] Location = new Object[1][2];
		String Description = testDataInMap.get(0).get("Description");
		String Value = testDataInMap.get(0).get("Value");
		Location[0][0] = Description;
		Location[0][1] = Value;
		return Location;
	}

	@DataProvider(name = "validLocations")
	public Object[][] getdatalocationfromLocationExcelSheet() throws IOException {
		List<Map<String, String>> testDataInMap = LocationExcelUtility.getMapTestDataInMap();
		Object[][] Location = new Object[1][2];
		String Description = testDataInMap.get(2).get("Description");
		String Value = testDataInMap.get(2).get("Value");
		Location[0][0] = Description;
		Location[0][1] = Value;
		return Location;
	}

	@DataProvider(name = "RTA_validLocations")
	public Object[][] RTA_Valid_location() throws IOException {
		List<Map<String, String>> testDataInMap = LocationExcelUtility.getMapTestDataInMap();
		Object[][] Location = new Object[1][2];
		String Description = testDataInMap.get(4).get("Description");
		String Value = testDataInMap.get(4).get("Value");
		Location[0][0] = Description;
		Location[0][1] = Value;
		return Location;
	}

	@DataProvider(name = "validFujirahLocations")
	public Object[][] FujirahlocationfromLocationExcelSheet() throws IOException {
		List<Map<String, String>> testDataInMap = LocationExcelUtility.getMapTestDataInMap();
		Object[][] Location = new Object[1][2];
		String Description = testDataInMap.get(3).get("Description");
		String Value = testDataInMap.get(3).get("Value");
		Location[0][0] = Description;
		Location[0][1] = Value;
		return Location;
	}

	@DataProvider(name = "InvalidLocations")
	public Object[][] getInvaildLocationExcelSheet() throws IOException {
		List<Map<String, String>> testDataInMap = LocationExcelUtility.getMapTestDataInMap();
		Object[][] Location = new Object[1][2];
		String Description = testDataInMap.get(1).get("Description");
		String Value = testDataInMap.get(1).get("Value");
		Location[0][0] = Description;
		Location[0][1] = Value;
		return Location;
	}

	@DataProvider(name = "RequestId")
	public Object[][] getRequestIddata() throws IOException {
		List<Map<String, String>> testDataInMap = RequestUtility.getMapTestDataInMap();
		Object[][] data = new Object[1][3];
		String Name = testDataInMap.get(0).get("Name");
		String MobileNumber = testDataInMap.get(0).get("MobileNumber");
		String RequestId = testDataInMap.get(0).get("RequestId");

		data[0][0] = Name;
		data[0][1] = MobileNumber;
		data[0][2] = RequestId;
		return data;
	}

	@DataProvider(name = "driverdata")
	public Object[][] getJoborderId() throws IOException {
		List<Map<String, String>> testDataInMap = JobOrderIdUtility.getMapTestDataInMap();
		Object[][] data = new Object[1][4];
		String Name = testDataInMap.get(0).get("Name");
		String MobileNumber = testDataInMap.get(0).get("MobileNumber");
		String RequestId = testDataInMap.get(0).get("RequestId");
		String JoborderId = testDataInMap.get(0).get("JoborderId");

		data[0][0] = Name;
		data[0][1] = MobileNumber;
		data[0][2] = RequestId;
		data[0][3] = JoborderId;
		return data;
	}

	@DataProvider(name = "access_token")
	public Object[][] getaccess_token() throws IOException {
		List<Map<String, String>> testDataInMap = access_tokenUtility.getMapTestDataInMap();
		Object[][] data = new Object[1][5];
		String Name = testDataInMap.get(0).get("Name");
		String MobileNumber = testDataInMap.get(0).get("MobileNumber");
		String RequestId = testDataInMap.get(0).get("RequestId");
		String JoborderId = testDataInMap.get(0).get("JoborderId");
		String access_token = testDataInMap.get(0).get("access_token");
		data[0][0] = Name;
		data[0][1] = MobileNumber;
		data[0][2] = RequestId;
		data[0][3] = JoborderId;
		data[0][4] = access_token;
		return data;

	}

	@DataProvider(name = "CompleteVehicleData")
	public Object[][] completeVehicleData() throws IOException {
		List<Map<String, String>> testDataInMap = VehicleDataUtility.getMapTestDataInMap();
		Object[][] data = new Object[1][10];
		String vinnumber = testDataInMap.get(0).get("vinnumber");
		String ownerfullname = testDataInMap.get(0).get("ownerfullname");
		String ownermobilenumber = testDataInMap.get(0).get("ownermobilenumber");
		String ownerlicencenumber = testDataInMap.get(0).get("ownerlicencenumber");
		String plateNumber = testDataInMap.get(0).get("plateNumber");
		String morgateto = testDataInMap.get(0).get("morgateto");
		String reason = testDataInMap.get(0).get("reason");
		String casenumber = testDataInMap.get(0).get("casenumber");
		String notes = testDataInMap.get(0).get("notes");
		String custodynotes = testDataInMap.get(0).get("custodynotes");
		data[0][0] = vinnumber;
		data[0][1] = ownerfullname;
		data[0][2] = ownermobilenumber;
		data[0][3] = ownerlicencenumber;
		data[0][4] = plateNumber;
		data[0][5] = morgateto;
		data[0][6] = reason;
		data[0][7] = casenumber;
		data[0][8] = notes;
		data[0][9] = custodynotes;
		return data;

	}

	@DataProvider(name = "InvalidvehicleData")
	public Object[][] Invalid_VehicleData() throws IOException {
		List<Map<String, String>> testDataInMap = VehicleDataUtility.getMapTestDataInMap();
		Object[][] data = new Object[1][10];
		String vinnumber = testDataInMap.get(1).get("vinnumber");
		String ownerfullname = testDataInMap.get(1).get("ownerfullname");
		String ownermobilenumber = testDataInMap.get(1).get("ownermobilenumber");
		String ownerlicencenumber = testDataInMap.get(1).get("ownerlicencenumber");
		String plateNumber = testDataInMap.get(1).get("plateNumber");
		String morgateto = testDataInMap.get(1).get("morgateto");
		String reason = testDataInMap.get(1).get("reason");
		String casenumber = testDataInMap.get(1).get("casenumber");
		String notes = testDataInMap.get(1).get("notes");
		String custodynotes = testDataInMap.get(1).get("custodynotes");
		data[0][0] = vinnumber;
		data[0][1] = ownerfullname;
		data[0][2] = ownermobilenumber;
		data[0][3] = ownerlicencenumber;
		data[0][4] = plateNumber;
		data[0][5] = morgateto;
		data[0][6] = reason;
		data[0][7] = casenumber;
		data[0][8] = notes;
		data[0][9] = custodynotes;
		return data;

	}

	@DataProvider(name = "UpdateVehicleData")
	public Object[][] UpdateVehicleData() throws IOException {
		List<Map<String, String>> testDataInMap = VehicleDataUtility.getMapTestDataInMap();
		Object[][] data = new Object[1][10];
		String vinnumber = testDataInMap.get(2).get("vinnumber");
		String ownerfullname = testDataInMap.get(2).get("ownerfullname");
		String ownermobilenumber = testDataInMap.get(2).get("ownermobilenumber");
		String ownerlicencenumber = testDataInMap.get(2).get("ownerlicencenumber");
		String plateNumber = testDataInMap.get(2).get("plateNumber");
		String morgateto = testDataInMap.get(2).get("morgateto");
		String reason = testDataInMap.get(2).get("reason");
		String casenumber = testDataInMap.get(2).get("casenumber");
		String notes = testDataInMap.get(2).get("notes");
		String custodynotes = testDataInMap.get(2).get("custodynotes");
		data[0][0] = vinnumber;
		data[0][1] = ownerfullname;
		data[0][2] = ownermobilenumber;
		data[0][3] = ownerlicencenumber;
		data[0][4] = plateNumber;
		data[0][5] = morgateto;
		data[0][6] = reason;
		data[0][7] = casenumber;
		data[0][8] = notes;
		data[0][9] = custodynotes;
		return data;
	}

	@DataProvider(name = "Profiledata")
	public Object[][] getprofiledata() throws IOException {
		List<Map<String, String>> testDataInMap = profileUitilty.getMapTestDataInMap();
		Object[][] data = new Object[1][3];
		String Name = testDataInMap.get(0).get("Name");
		String MobileNumber = testDataInMap.get(0).get("MobileNumber");
		String Email = testDataInMap.get(0).get("Email");

		data[0][0] = Name;
		data[0][1] = MobileNumber;
		data[0][2] = Email;
		return data;
	}

	@DataProvider(name = "InvalidNameAndEmail")
	public Object[][] getInvaildEmailForprofiledata() throws IOException {
		List<Map<String, String>> testDataInMap = profileUitilty.getMapTestDataInMap();
		Object[][] data = new Object[1][3];
		String Name = testDataInMap.get(1).get("Name");
		String MobileNumber = testDataInMap.get(1).get("MobileNumber");
		String Email = testDataInMap.get(1).get("Email");

		data[0][0] = Name;
		data[0][1] = MobileNumber;
		data[0][2] = Email;
		return data;
	}

	@DataProvider(name = "InvalidEmailFromat")
	public Object[][] getInvaildEmailFormat() throws IOException {
		List<Map<String, String>> testDataInMap = profileUitilty.getMapTestDataInMap();
		Object[][] data = new Object[1][3];
		String Name = testDataInMap.get(1).get("Name");
		String MobileNumber = testDataInMap.get(2).get("MobileNumber");
		String Email = testDataInMap.get(2).get("Email");

		data[0][0] = Name;
		data[0][1] = MobileNumber;
		data[0][2] = Email;
		return data;
	}

	@DataProvider(name = "LocationdataProivder")
	public Object[][] getlocation() throws IOException {

		List<Map<String, String>> Location = UpdateLocationUtility2.getMapTestDataInMap();
		Object[][] Loaac = null;
		Loaac = new Object[4][3];

		// is less than the number of location rows by 1
		// Object[3][2]; [3]is the number of location rows
		// https://admin.emiratesroadsideassistance.com/CustomersAccounts/GetRequestLogs/94744
		for (int i = 0; i < 4; i++) {
			String latitude = Location.get(i).get("lat");
			String longitude = Location.get(i).get("long");
			String requesterTypeId = Location.get(i).get("requesterTypeId");
			Loaac[i][0] = latitude;
			Loaac[i][1] = longitude;
			Loaac[i][2] = requesterTypeId;
			System.out.println("+++++++++++++++++++" + latitude);
			System.out.println("+++++++++++++++++++" + longitude);
			System.out.println("+++++++++++++++++++" + requesterTypeId);

		}
		return Loaac;
	}

	@DataProvider(name = "data-provider")
	public Object[][] dpMethod() {
		return new Object[][] { { 25.020500327068408, 55.550445162396294, 6 },
				{ 25.020305748874303, 55.550054263155474, 6 }, { 25.019948053164647, 55.54939656226849, 6 },
				{ 25.019642743924848, 55.54886478445399, 6 } };
	}

//	@DataProvider(name = "LocationdataProivder")
//	public Object[][] getlocation() throws IOException {
//
//		List<Map<String, String>> Location = UpdateLocationUtility2.getMapTestDataInMap();
//		Object[][] Loaac = null;
//		Loaac = new Object[41][5];
//
//		// is less than the number of location rows by 1
//		// Object[3][2]; [3]is the number of location rows
//		// https://admin.emiratesroadsideassistance.com/CustomersAccounts/GetRequestLogs/94744
//		for (int i = 0; i < 5; i++) {
//			String latitude = Location.get(i).get("lat");
//			String longitude = Location.get(i).get("long");
//			String requesterTypeId = Location.get(i).get("requesterTypeId");
//			String latitude1 = Location.get(i).get("lat2");
//			String longitude1 = Location.get(i).get("long2");
//			String requesterTypeId1 = Location.get(i).get("requesterTypeId2");
//			Loaac[i][0] = latitude;
//			Loaac[i][1] = longitude;
//			Loaac[i][2] = requesterTypeId;
//			Loaac[i][3] = latitude1;
//			Loaac[i][4] = longitude1;
//			Loaac[i][5] = requesterTypeId1;
//			System.out.println("+++++++++++++++++++" + latitude);
//			System.out.println("+++++++++++++++++++" + longitude);
//			System.out.println("+++++++++++++++++++" + requesterTypeId);
//
//		}
//		return Loaac;
//	}

	@DataProvider(name = "arrivedToPickup")
	public Object[][] getarrivedToPickuplocation() throws IOException {

		List<Map<String, String>> Location = UpdateLocationUtility2.getarrivedToPickup();
		Object[][] Loaac = null;
		Loaac = new Object[1][3];

		// is less than the number of location rows by 1
		// Object[3][2]; [3]is the number of location rows
		// https://admin.emiratesroadsideassistance.com/CustomersAccounts/GetRequestLogs/94744

		String latitude = Location.get(0).get("lat");
		String longitude = Location.get(0).get("long");
		String requesterTypeId = Location.get(0).get("requesterTypeId");
		Loaac[0][0] = latitude;
		Loaac[0][1] = longitude;
		Loaac[0][2] = requesterTypeId;
		System.out.println("+++++++++++++++++++" + latitude);
		System.out.println("+++++++++++++++++++" + longitude);
		System.out.println("+++++++++++++++++++" + requesterTypeId);

		return Loaac;
	}

	@DataProvider(name = "arrivedTodestination")
	public Object[][] getarrivedToestinationlocation() throws IOException {

		List<Map<String, String>> Location = UpdateLocationUtility2.getarrivedTodestination();
		Object[][] Loaac = null;
		Loaac = new Object[1][3];

		// is less than the number of location rows by 1
		// Object[3][2]; [3]is the number of location rows
		// https://admin.emiratesroadsideassistance.com/CustomersAccounts/GetRequestLogs/94744

		String latitude = Location.get(0).get("lat");
		String longitude = Location.get(0).get("long");
		String requesterTypeId = Location.get(0).get("requesterTypeId");
		Loaac[0][0] = latitude;
		Loaac[0][1] = longitude;
		Loaac[0][2] = requesterTypeId;
		System.out.println("+++++++++++++++++++" + latitude);
		System.out.println("+++++++++++++++++++" + longitude);
		System.out.println("+++++++++++++++++++" + requesterTypeId);

		return Loaac;
	}

	@DataProvider(name = "LocationdataProivderassigned")
	public Object[][] getlocationassigned() throws IOException {

		List<Map<String, String>> Location = UpdateLocationUtilityassigned.getMapTestDataInMapassigned();
		Object[][] Loc = new Object[23][2];
		// is less than the number of location rows by 1
		// Object[3][2]; [3]is the number of location rows
		// https://admin.emiratesroadsideassistance.com/CustomersAccounts/GetRequestLogs/94744
		for (int i = 0; i < 23; i++) {
			String latitude = Location.get(i).get("lat");
			String longitude = Location.get(i).get("long");
			Loc[i][0] = latitude;
			Loc[i][1] = longitude;
			System.out.println("assigned+++++++++++++++++++" + latitude);
			System.out.println("assigned+++++++++++++++++++" + longitude);

		}
		return Loc;
	}

	@DataProvider(name = "LocationdataProivderInRoute")
	public Object[][] getlocationINRoute() throws IOException {

		List<Map<String, String>> Location = UpdateLocationUtilityInroute.getMapTestDataInRoute();
		Object[][] Loc = new Object[38][2];
		// is less than the number of location rows by 1
		// Object[3][2]; [3]is the number of location rows
		// https://admin.emiratesroadsideassistance.com/CustomersAccounts/GetRequestLogs/94744
		for (int i = 0; i < 38; i++) {
			String latitude = Location.get(i).get("lat");
			String longitude = Location.get(i).get("long");
			Loc[i][0] = latitude;
			Loc[i][1] = longitude;
			System.out.println("InRoute+++++++++++++++++++" + latitude);
			System.out.println("InRoute+++++++++++++++++++" + longitude);

		}
		return Loc;
	}

	@DataProvider(name = "LocationdataProivderPickup")
	public Object[][] getlocationPickup() throws IOException {

		List<Map<String, String>> Location = UpdateLocationUtilityPickup.getMapTestDataPickup();
		Object[][] Loc = new Object[146][2];
		// is less than the number of location rows by 1
		// Object[3][2]; [3]is the number of location rows
		// https://admin.emiratesroadsideassistance.com/CustomersAccounts/GetRequestLogs/94744
		for (int i = 0; i < 146; i++) {
			String latitude = Location.get(i).get("lat");
			String longitude = Location.get(i).get("long");
			Loc[i][0] = latitude;
			Loc[i][1] = longitude;
			System.out.println("pickup+++++++++++++++++++" + latitude);
			System.out.println("pickup+++++++++++++++++++" + longitude);

		}
		return Loc;
	}

	@Parameters({ "deviceName", "platformName", "platformVersion", "udiddevice", "skipServerInstallationpro",
			"noSignpro", "noReset" })
//@Parameters({"deviceName","platformName","platformVersion","skipServerInstallationpro","noSignpro","noReset"})

	@BeforeTest

	public void beforeClass(String deviceName, String platformName, String platformVersion, String udiddevice,
			boolean noSignpro, boolean skipServerInstallationpro, String noReset) throws Exception {

//		 public void beforeTest(String deviceName, String platformName, String
//		platformVersion, boolean noSignpro, boolean skipServerInstallationpro) throws
//		Exception {
		File propFile = new File("src\\main\\config.properties");
		inputStream = new FileInputStream(propFile);
		prop = new Properties();
		prop.load(inputStream);
		// File app = new File(prop.getProperty("androidAppPath"));

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", deviceName);
		caps.setCapability("platformName", platformName);
		caps.setCapability("platformVersion", platformVersion);
		caps.setCapability("AUTOMATION_NAME", prop.getProperty("androidAutomationName"));
		caps.setCapability("skipServerInstallation", skipServerInstallationpro);
		caps.setCapability("noSign", noSignpro);
		caps.setCapability("suppressKillServer", false);
		caps.setCapability("appPackage", "com.eci.era");
		caps.setCapability("appActivity", "com.eci.era.splash.presentation.view.SplashActivity");
		// caps.setCapability("appActivity",
		// "com.eci.era.home.presentation.view.activities.MainActivity");
		caps.setCapability("remoteAppsCacheLimit", "0");
		caps.setCapability("noReset", noReset);

		caps.setCapability("enforceAppInstall", false);

		caps.setCapability("newCommandTimeout", "2000");
//		// used for mobile device
		caps.setCapability("udid", udiddevice);

		// caps.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

		driver = new AndroidDriver<MobileElement>(new URL(prop.getProperty("appiumServerLink")), caps);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@AfterTest
	public void afterTest() {
		//driver.quit();
	}
}
