package PolicedriverApi;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.ERA.base.Base;

public class API_GetBaseURLTest extends Base {

	public String GetBaseUrl() throws IOException {

		File propFile = new File("src\\main\\config.properties");
		inputStream = new FileInputStream(propFile);
		prop = new Properties();
		prop.load(inputStream);
		String URLL = prop.getProperty("PathURL");
		return URLL;
	}
	
	public String GetrdriverBaseUrl() throws IOException {

		File propFile = new File("src\\main\\config.properties");
		inputStream = new FileInputStream(propFile);
		prop = new Properties();
		prop.load(inputStream);
		String driverBaseURL = prop.getProperty("driverBaseURL");
		return driverBaseURL;
	}

	public String centraldispatcherBaseUrl() throws IOException {

		File propFile = new File("src\\main\\config.properties");
		inputStream = new FileInputStream(propFile);
		prop = new Properties();
		prop.load(inputStream);
		String driverBaseURL = prop.getProperty("centraldispatcherBaseUrl");
		return driverBaseURL;
	}

	public String adminBaseUrl() throws IOException {

		File propFile = new File("src\\main\\config.properties");
		inputStream = new FileInputStream(propFile);
		prop = new Properties();
		prop.load(inputStream);
		String adminBaseURL = prop.getProperty("adminBaseURL");
		return adminBaseURL;
	}
	public String fleetBaseUrl() throws IOException {

		File propFile = new File("src\\main\\config.properties");
		inputStream = new FileInputStream(propFile);
		prop = new Properties();
		prop.load(inputStream);
		String fleetBaseURL = prop.getProperty("fleetBaseURL");
		return fleetBaseURL;
	}
	public String getadminUser() throws IOException {

		File propFile = new File("src\\main\\config.properties");
		inputStream = new FileInputStream(propFile);
		prop = new Properties();
		prop.load(inputStream);
		String adminuser = prop.getProperty("adminuser");
		return adminuser;
	}
	
	public String getadminPasword() throws IOException {

		File propFile = new File("src\\main\\config.properties");
		inputStream = new FileInputStream(propFile);
		prop = new Properties();
		prop.load(inputStream);
		String adminPasword = prop.getProperty("adminpassword");
		return adminPasword;
	}
	
	public String getFleetUser() throws IOException {

		File propFile = new File("src\\main\\config.properties");
		inputStream = new FileInputStream(propFile);
		prop = new Properties();
		prop.load(inputStream);
		String fleetuser = prop.getProperty("fleetuser");
		return fleetuser;
	}
	
	public String getfleetPasword() throws IOException {

		File propFile = new File("src\\main\\config.properties");
		inputStream = new FileInputStream(propFile);
		prop = new Properties();
		prop.load(inputStream);
		String fleetPasword = prop.getProperty("fleetpassword");
		return fleetPasword;
	}
	
	public String getdriveraccount() throws IOException {

		File propFile = new File("src\\main\\config.properties");
		inputStream = new FileInputStream(propFile);
		prop = new Properties();
		prop.load(inputStream);
		String driveraccount = prop.getProperty("driveraccount");
		return driveraccount;
	}
	public String getassignedriver() throws IOException {

		File propFile = new File("src\\main\\config.properties");
		inputStream = new FileInputStream(propFile);
		prop = new Properties();
		prop.load(inputStream);
		String driveraccount = prop.getProperty("assignedriver");
		return driveraccount;
	}
	
	
	
	
	public String getrecoveryQrCode() throws IOException {

		File propFile = new File("src\\main\\config.properties");
		inputStream = new FileInputStream(propFile);
		prop = new Properties();
		prop.load(inputStream);
		String recoveryQrCode = prop.getProperty("recoveryQrCode");
		return recoveryQrCode;
	}

	public String getodoMeterReading()throws IOException {
		// TODO Auto-generated method stub
		
		File propFile = new File("src\\main\\config.properties");
		inputStream = new FileInputStream(propFile);
		prop = new Properties();
		prop.load(inputStream);
		String odoMeterReading = prop.getProperty("odoMeterReading");
	
		return odoMeterReading;
		
	}

	public String fleetBaseDubaiUrl() throws IOException{
		// TODO Auto-generated method stub

		File propFile = new File("src\\main\\config.properties");
		inputStream = new FileInputStream(propFile);
		prop = new Properties();
		prop.load(inputStream);
		String fleetDubaiBaseURL = prop.getProperty("fleetDubaiBaseURL");
	
		return fleetDubaiBaseURL;	}
}