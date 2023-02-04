package com.ERA.screens;

import com.ERA.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class NoteScreen extends Base {
	
	@AndroidFindBy (id="com.eci.era:id/addNoteTitle")
	private MobileElement NoteAdd;
	
	public void clickadd() {
		// TODO Auto-generated method stub
		NoteAdd.click();
	}
	
	

	@AndroidFindBy (id="com.eci.era:id/addNoteContainer")
	private MobileElement NoteAddTowing;
	
	public void NoteAddTowing() {
		// TODO Auto-generated method stub
		NoteAddTowing.click();
	}
	
	@AndroidFindBy (id="com.eci.era:id/notesEditText")
	private MobileElement notevalue;
	
	
	public void Sendnotevalue() {
		// TODO Auto-generated method stub
		notevalue.sendKeys("Character Count is a free online tool that calculates the number of characters and words written in your writingCharacter Count is a free online tool that calculates the number of characters and words written in your writingCharacter Count is a free online tool that calculates dsdsadsdjjhsddsdsdsds");
	}

	@AndroidFindBy (id="com.eci.era:id/btnDone")
	private MobileElement confirmnote;
	

	public void ConfirmNote() {
		// TODO Auto-generated method stub
		confirmnote.click();
	}

	@AndroidFindBy (id="com.com.eci.era:id/addNoteTitle")
	private MobileElement BatteryAddNote;
	public void Battery_clickadd() {
		// TODO Auto-generated method stub
		BatteryAddNote.click();
	}
	
}

