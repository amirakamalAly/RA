package common;

import org.testng.annotations.Test;

import com.ERA.base.Base;
import com.ERA.screens.NoteScreen;

public class NoteTest extends Base {
	@Test(priority = 1)
	public void clickAddNote()
	{
		NoteScreen noteadd = new NoteScreen();
		noteadd.clickadd();
	}
	@Test(priority = 2)
	public void Sendnotevalue()
	{
		NoteScreen note = new NoteScreen();
		note.Sendnotevalue();
	}
	@Test(priority = 3) 
	public void ConfirmNote() 
	{
		NoteScreen ConfirmNote = new NoteScreen();
		ConfirmNote.ConfirmNote();
			}
}
