package towing;

import com.ERA.base.Base;
import com.ERA.screens.addNormalTowingRequest;

import org.testng.annotations.Test;


public class NewFlow_addNormalTowingRequestTest extends Base {

	@Test(priority = 1)
	public void selectTowingService()

	{
		addNormalTowingRequest Towing = new addNormalTowingRequest();
		Towing.SelectTowing();

	}
	
	@Test(priority = 2)
	public void selectNormalTowing()

	{
		addNormalTowingRequest NormalTowing = new addNormalTowingRequest();
		NormalTowing.SelectNormalTowing();

	}

//	@Test(priority = 3)
//	public void AddingDestination()
//
//	{
//		addNormalTowingRequest Ds = new addNormalTowingRequest();
//		Ds.Destinationbox();
//
//	}
	
//	@Test(priority = 4)
//	public void ClickSearchDest()
//
//	{
//		addNormalTowingRequest Dv = new addNormalTowingRequest();
//		Dv.DestinationSearch();
//
//	}
//	
//	
//
//
//	
//	@Test(dataProvider ="Locations",priority = 5)
//	public void SendDestLocation(String Description,String LocationValue)
//
//	{System.out.println("get location fromExcelsheet  "+ LocationValue );
//	addNormalTowingRequest Dv = new addNormalTowingRequest();
//		Dv.SendDestLocation(Description,LocationValue);
//
//		
//	}
//
//	@Test(priority = 6)
//	public void ClickSearchItem()
//
//	{
//		addNormalTowingRequest Dvw = new addNormalTowingRequest();
//		Dvw.ClickSearchItem();
//
//		
//	}
//	@Test(priority = 7)
//	public void ConfirmDestination()
//
//	{
//		addNormalTowingRequest Dvw = new addNormalTowingRequest();
//		Dvw.ConfirmDestination();
//
//		
//	}
//	
//
//	
//	@Test(priority = 8)
//	public void clickAddNote()
//	{
//		NoteScreen noteadd = new NoteScreen();
//		noteadd.clickadd();
//	}
//	
//
//	@Test(priority = 8)
//	public void clickAddNoteTowing()
//	{
//		NoteScreen noteadd = new NoteScreen();
//		noteadd.NoteAddTowing();
//	}
//	
//	@Test(priority = 9)
//	public void Sendnotevalue()
//	{
//		NoteScreen note = new NoteScreen();
//		note.Sendnotevalue();
//	}
//	@Test(priority = 10) 
//	public void ConfirmNote() 
//	{
//		NoteScreen ConfirmNote = new NoteScreen();
//		ConfirmNote.ConfirmNote();
//			}
//	
//
//	@Test(priority = 11)
//	public void ConfirmTowingRequest()
//
//	{addNormalTowingRequest Confirm = new addNormalTowingRequest();
//	Confirm.confirmTowingRequest();
//
//		
//	}
//	
//	@Test(priority = 12)
//	public void ConfirmPaymentTowingRequest()
//
//	{addNormalTowingRequest Confirm = new addNormalTowingRequest();
//	Confirm.confirmPaymrntTowingRequest();
//
//		
//	}
	
//	@Test(priority = 19)
//	public void CancelTowingRequest()
//
//	{addNormalTowingRequest Confirm = new addNormalTowingRequest();
//	Confirm.confirmCancelTowingRequest();
//
//		
//	}
//	
//	@Test(priority = 20)
//	public void ClickCancelTowingRequest()
//
//	{addNormalTowingRequest ConfirmBn = new addNormalTowingRequest();
//	ConfirmBn.ClickCancelTowingRequest();

		
	//}
	
	
//	@Test(priority =13)
//	public void SelectVisa()
//
//	{
//		addNormalFuelRequestTestScreen Selectvisa = new addNormalFuelRequestTestScreen();
//		Selectvisa.SelectVisa();
//
//	}
//	
//	@Test(priority =14)
//	public void ConfirmVisaPayment()
//
//	{
//		addNormalFuelRequestTestScreen ConfirmVisaPayment = new addNormalFuelRequestTestScreen();
//		ConfirmVisaPayment.ConfirmVisaPayment();
//
//	}

}

