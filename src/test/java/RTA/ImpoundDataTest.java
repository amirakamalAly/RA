package RTA;

import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.ImageScreen;
import com.ERA.screens.ImpoundDataScreen;


public class ImpoundDataTest extends Base {

	@Test(priority = 1)
	public void switchcustudyToggleOn()

	{
		ImageScreen image = new ImageScreen();
		image.switchOn();
	}

	@Test(priority = 2)
	public void takeImage()

	{
		ImageScreen image = new ImageScreen();
		image.addPhoto();
	}
	@Test(priority = 3)
	public void cameraTakeImage() {
		ImageScreen cameraTakeImage = new ImageScreen();
		cameraTakeImage.cameraTakeImage();
	}

	@Test(priority = 4)
	public void ConfirmImage() {
		ImageScreen confirmImage = new ImageScreen();
		confirmImage.confirmImage();
	}

	
	
	@Test(dataProvider = "CompleteVehicleData",priority = 5)
	public void AddcustodyNoteTest(String vinnumber,String ownerfullname,String ownermobilenumber,String ownerlicencenumber,String plateNumber,String morgateto,String reason,String casenumber,String notes,String custodynotes) {
		ImpoundDataScreen note = new ImpoundDataScreen();
		note.AddcustodyNote(notes);
	}
	
	
	
	
	@Test(priority = 6)
	public void ConfirmcustodyTest() {
		ImpoundDataScreen impound = new ImpoundDataScreen();
		impound.Confirmcustody();
	}
	
	
	
	@Test(priority = 7)
	public void FinishTest() {
		ImpoundDataScreen impound = new ImpoundDataScreen();
		impound.finish();
	}
	
	}
