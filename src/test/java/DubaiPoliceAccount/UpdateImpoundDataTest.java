package DubaiPoliceAccount;

import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.ImpoundDataScreen;

public class UpdateImpoundDataTest extends Base {

	@Test(dataProvider = "UpdateVehicleData", priority = 1)
	public void AddMorgateToTest(String vinnumber, String ownerfullname, String ownermobilenumber,
			String ownerlicencenumber, String plateNumber, String morgateto, String reason, String casenumber,
			String notes, String custodynotes) {
		ImpoundDataScreen morgateTo = new ImpoundDataScreen();
		morgateTo.AddMorgateTo(morgateto);
	}

	@Test(dataProvider = "UpdateVehicleData", priority = 2)
	public void AddReasonsTest(String vinnumber, String ownerfullname, String ownermobilenumber,
			String ownerlicencenumber, String plateNumber, String morgateto, String reason, String casenumber,
			String notes, String custodynotes) {
		ImpoundDataScreen Reason = new ImpoundDataScreen();
		Reason.addReasons(reason);
	}

	@Test(dataProvider = "UpdateVehicleData", priority = 3)
	public void AddCaseNumberTest(String vinnumber, String ownerfullname, String ownermobilenumber,
			String ownerlicencenumber, String plateNumber, String morgateto, String reason, String casenumber,
			String notes, String custodynotes) {
		ImpoundDataScreen Casenumber = new ImpoundDataScreen();
		Casenumber.AddCaseNumber(casenumber);
	}

	@Test(dataProvider = "UpdateVehicleData", priority = 4)
	public void AddNoteTest(String vinnumber, String ownerfullname, String ownermobilenumber, String ownerlicencenumber,
			String plateNumber, String morgateto, String reason, String casenumber, String notes, String custodynotes) {
		ImpoundDataScreen note = new ImpoundDataScreen();
		note.addNote(notes);
	}

	@Test(priority = 5)
	public void scrolldownTest() {
		ImpoundDataScreen Scrolldown = new ImpoundDataScreen();
		Scrolldown.scrollown();
	}
	@Test(priority = 6)
	public void SwitchCustodyToggleOFFTest() {
		ImpoundDataScreen toggle = new ImpoundDataScreen();
		toggle.switchCustodyToggleON();

	}
	@Test(priority = 7)
	public void SwitchCustodyToggleONTest() {
		ImpoundDataScreen toggle = new ImpoundDataScreen();
		toggle.switchCustodyToggleON();

	}

	@Test(dataProvider = "UpdateVehicleData", priority = 8)
	public void AddCustodyNoteest(String vinnumber, String ownerfullname, String ownermobilenumber,
			String ownerlicencenumber, String plateNumber, String morgateto, String reason, String casenumber,
			String notes, String custodynotes) {
		ImpoundDataScreen custodyNote = new ImpoundDataScreen();
		custodyNote.addCustodyNoteest(custodynotes);
	}

	@Test(priority = 9)
	public void ConfirmImpounddataTest() {
		ImpoundDataScreen impound = new ImpoundDataScreen();
		impound.ConfirmImpounddata();
	}

}
//
