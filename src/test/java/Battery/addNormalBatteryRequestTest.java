package Battery;

import org.testng.annotations.Test;

import com.ERA.base.Base;
import com.ERA.screens.NoteScreen;
import com.ERA.screens.addBatteryRequestTestScreen;

public class addNormalBatteryRequestTest  extends Base {


	@Test(priority = 1)
	public void DragServiceSheet()

	{
		addBatteryRequestTestScreen Battery = new addBatteryRequestTestScreen();
		Battery.dragsheetHome();
		

	}
//	@Test(priority = 1)
//	public void MoveMap()
//
//	{
//		addBatteryRequestTestScreen map = new addBatteryRequestTestScreen();
//		map.mapmove();
//		
//
//	}
   


	@Test(priority = 3)
	public void SelectBattery()

	{
		addBatteryRequestTestScreen Battery = new addBatteryRequestTestScreen();
		Battery.selectBattery();
		

	}
   
	
	@Test(priority = 4)
	public void clickAddNote()
	{
		NoteScreen noteadd = new NoteScreen();
		noteadd.clickadd();
	}
	@Test(priority = 5)
	public void Sendnotevalue()
	{
		NoteScreen note = new NoteScreen();
		note.Sendnotevalue();
	}
	@Test(priority = 6) 
	public void ConfirmNote() 
	{
		NoteScreen ConfirmNote = new NoteScreen();
		ConfirmNote.ConfirmNote();
			}
	
	@Test(priority = 7)
	public void ConfirmSummery()

	{
		addBatteryRequestTestScreen confrmSummery = new addBatteryRequestTestScreen();
		confrmSummery.cnfirmSummery();
		

	}

	
	

	@Test(priority = 33)
	public void ConfirmBaymnet()

	{
		addBatteryRequestTestScreen confirmSummery = new addBatteryRequestTestScreen();
		confirmSummery.ConfmBaymnet();
		

	}
	
//	@Test(priority = 34)
//	public void CancelLink()
//
//	{
//		addBatteryRequestTestScreen cancelLnk = new addBatteryRequestTestScreen();
//		cancelLnk.Cancellink();
//		
//
//	}
//	
//	@Test(priority = 35)
//	public void CancelBn()
//
//	{
//		addBatteryRequestTestScreen cancelBn = new addBatteryRequestTestScreen();
//		cancelBn.CancelBn();
//		
//
//	}
}
