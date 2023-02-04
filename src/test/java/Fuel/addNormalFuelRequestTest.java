package Fuel;

import org.testng.annotations.Test;

import com.ERA.base.Base;
import com.ERA.screens.CancelFuelRequestScreen;
import com.ERA.screens.NoteScreen;
import com.ERA.screens.addNormalFuelRequestTestScreen;

public class addNormalFuelRequestTest  extends Base {

	@Test(priority = 1)
	public void MoveMap()

	{
		addNormalFuelRequestTestScreen Fuel = new addNormalFuelRequestTestScreen();
		Fuel.Movemap();

	}
	
	
	
	@Test(priority = 2)
	public void Dragsheet()

	{
		addNormalFuelRequestTestScreen Fuel = new addNormalFuelRequestTestScreen();
		Fuel.dragsheet();

	}
	
	@Test(priority = 3)
	public void selectFuelService()

	{
		addNormalFuelRequestTestScreen Fuel = new addNormalFuelRequestTestScreen();
		Fuel.SelectFuel();

	}
	
	@Test(priority = 4)
	public void SelectFuelType()

	{
		addNormalFuelRequestTestScreen Fueltype = new addNormalFuelRequestTestScreen();
		Fueltype.SelectFuelType();

	}
	

	
	@Test(priority =5)
	public void clickAddNote()
	{
		NoteScreen noteadd = new NoteScreen();
		noteadd.clickadd();
	}
	@Test(priority = 6)
	public void Sendnotevalue()
	{
		NoteScreen note = new NoteScreen();
		note.Sendnotevalue();
	}
	@Test(priority = 7) 
	public void ConfirmNote() 
	{
		NoteScreen ConfirmNote = new NoteScreen();
		ConfirmNote.ConfirmNote();
			}
	

	@Test(priority = 8)
	public void ConfirmfuelType()

	{
		addNormalFuelRequestTestScreen confirmFueltype = new addNormalFuelRequestTestScreen();
		confirmFueltype.ConfirmfuelType();

	}
//
//	@Test(priority = 9)
//	public void ConfirmpaymentButton()
//
//	{
//		addNormalFuelRequestTestScreen ConfirmpaymentButton = new addNormalFuelRequestTestScreen();
//		ConfirmpaymentButton.ConfirmpaymentButton();
//
//	} 
	
	@Test(priority = 10)
	public void SelectCash()

	{
		addNormalFuelRequestTestScreen SelectCash = new addNormalFuelRequestTestScreen();
		SelectCash.SelectCash();

	}
	
	@Test(priority = 11)
	public void ConfirmCashPayment()

	{
		addNormalFuelRequestTestScreen ConfirmCashPayment = new addNormalFuelRequestTestScreen();
		ConfirmCashPayment.ConfirmCashPayment();

	}
	
//	@Test(priority = 29)
//	public void CancelFuelRequest()
//
//	{
//		CancelFuelRequestScreen cancellink = new CancelFuelRequestScreen();
//		cancellink.confirmCancelFuelRequest();
//
//	}
//	
//	@Test(priority = 30)
//	public void CancelBnFuelRequest()
//
//	{
//		CancelFuelRequestScreen cancelBn = new CancelFuelRequestScreen();
//		cancelBn.ClickCancelFuelRequest();
//
//	}
}
