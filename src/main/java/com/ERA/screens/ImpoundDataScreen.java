package com.ERA.screens;
import org.openqa.selenium.interactions.Actions;

import com.ERA.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ImpoundDataScreen extends Base {

	@AndroidFindBy(id = "com.eci.era:id/mortgageToEdit")
	private MobileElement Morgateto;
	public void AddMorgateTo(String morgateto) {
		// TODO Auto-generated method stub
		Morgateto.sendKeys(morgateto);
	}
	
	@AndroidFindBy(id = "com.eci.era:id/notesEditText")
	private MobileElement RTANote;
	public void AddcustodyNote(String Note) {
		// TODO Auto-generated method stub
		RTANote.sendKeys(Note);
	}
	@AndroidFindBy(id = "com.eci.era:id/reasonsToEdit")
	private MobileElement Reasons;
	public void addReasons(String reason) {
		// TODO Auto-generated method stub
		Reasons.sendKeys(reason);
	}
	@AndroidFindBy(id = "com.eci.era:id/caseNumberEdit")
	private MobileElement Casenumber;
	public void AddCaseNumber(String casenumber) {
		// TODO Auto-generated method stub
		Casenumber.sendKeys(casenumber);
	}
	
	@AndroidFindBy(id = "com.eci.era:id/itemsInCustodySwitch")
	private MobileElement Toggle;
	public void switchCustodyToggleON() {
		// TODO Auto-generated method stub
		Toggle.click();
	}
	
	@AndroidFindBy(id = "com.eci.era:id/mortgageToTitle")
	public MobileElement To2;
	@AndroidFindBy(id = "com.eci.era:id/notesTitle")
	public MobileElement From2;

	
	public void scrollown() {
		// TODO Auto-generated method stub
		Actions act = new Actions(driver);
		act.dragAndDrop(From2, To2).build().perform();
	}

	
	@AndroidFindBy(id = "com.eci.era:id/notesEdit")
	private MobileElement Note;
	public void addNote(String notes) {
		// TODO Auto-generated method stub
		Note.sendKeys(notes);
	}
	@AndroidFindBy(id = "com.eci.era:id/custodyNotesEdit")
	private MobileElement CustodyNotes;
	public void addCustodyNoteest(String custodynotes) {
		// TODO Auto-generated method stub
		CustodyNotes.sendKeys(custodynotes);
	}
	@AndroidFindBy(id = "com.eci.era:id/btnConfirmRequest")
	private MobileElement ConfirmImpound;
	public void ConfirmImpounddata() {
		// TODO Auto-generated method stub
		ConfirmImpound.click();
	}
	@AndroidFindBy(id = "com.eci.era:id/btnDone")
	private MobileElement custody;
		public void Confirmcustody() {
		// TODO Auto-generated method stub
			custody.click();
	}
		@AndroidFindBy(id = "com.eci.era:id/btnConfirmRequest")
		private MobileElement finish;
			public void finish() {
			// TODO Auto-generated method stub
				finish.click();
		}
}
