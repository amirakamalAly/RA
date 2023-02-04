package RTA;

import org.testng.annotations.Test;

import com.ERA.base.Base;
import com.ERA.screens.DubaiPoliceLocationScreen;
import com.ERA.screens.EditLocationScreen;
import com.ERA.screens.ImageScreen;
import com.ERA.screens.PoliceSubServiceScreen;

public class SummeryTest extends Base {
//
//	@Test(priority = 1)
//	public void EditLocationIcon()
//
//	{
//
//		EditLocationScreen EditLocationIcon = new EditLocationScreen();
//		EditLocationIcon.EditLocationIcon();
//
//	}
//
//	@Test(priority = 2)
//	public void MoveMap() throws InterruptedException
//
//	{
//		DubaiPoliceLocationScreen Map = new DubaiPoliceLocationScreen();
//		Map.MoveMap();
//		Thread.sleep(5000);
//
//	}
//
//	@Test(priority = 3)
//	public void confirmlocation()
//
//	{
//		DubaiPoliceLocationScreen confm = new DubaiPoliceLocationScreen();
//		confm.Selectconfirmbtn();
//
//	}
//
	@Test(priority = 4)
	public void EditSubServiceNumberAndSelectionIcon()

	{

		DubaiPoliceLocationScreen Subservice = new DubaiPoliceLocationScreen();
		Subservice.editsubserviceIcon();

	}

	@Test(priority = 4)
	public void EditSubServiceNumberPlusIcon1()
	{
		PoliceSubServiceScreen Subservice1plusIcon = new PoliceSubServiceScreen();
		try {
			Subservice1plusIcon.editsubserviceIcon1();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 4)
	public void EditSubServiceNumberPlusIcon2()

	{
		PoliceSubServiceScreen Subservice1plusIcon2 = new PoliceSubServiceScreen();
		Subservice1plusIcon2.editsubserviceIcon2();
	}

	@Test(priority = 5)
	public void EditSubServiceNumberPlusIcon3()
	{
		PoliceSubServiceScreen Subservice1plusIcon3 = new PoliceSubServiceScreen();
		Subservice1plusIcon3.editsubserviceIcon3();
	}

	@Test(priority = 6)
	public void EditSubServiceNumberPlusIcon4()

	{

		PoliceSubServiceScreen Subservice1plusIcon4 = new PoliceSubServiceScreen();
		Subservice1plusIcon4.editsubserviceIcon4();

	}

	@Test(priority = 7)
	public void EditSubServiceNumberminusIcon1()

	{

		PoliceSubServiceScreen Subservice1minusIcon1 = new PoliceSubServiceScreen();
		Subservice1minusIcon1.editsubserviceminusIcon1();

	}

	@Test(priority = 8)
	public void EditSubServiceNumberminusIcon2()

	{

		PoliceSubServiceScreen Subservice1minusIcon2 = new PoliceSubServiceScreen();
		Subservice1minusIcon2.editsubserviceminusIcon2();

	}

	@Test(priority = 9)
	public void EditSubServiceNumberminusIcon3()

	{

		PoliceSubServiceScreen Subservice1minusIcon3 = new PoliceSubServiceScreen();
		Subservice1minusIcon3.editsubserviceminusIcon3();

	}
	@Test(priority = 10)
	public void EditSubServiceNumberminusIcon4()
	{
		PoliceSubServiceScreen Subservice1minusIcon4 = new PoliceSubServiceScreen();
		Subservice1minusIcon4.editsubserviceminusIcon4();
	}
	@Test(priority = 11)
	public void ConfirmEditSubService()
	{
		PoliceSubServiceScreen confirmEditSubService = new PoliceSubServiceScreen();
		confirmEditSubService.confirmEditSubService();
	}

	@Test(priority = 12)
	public void EditropOffIcon()

	{

		DubaiPoliceLocationScreen dropofficon = new DubaiPoliceLocationScreen();
		dropofficon.editdropoffIcon();

	}
//
//	@Test(priority = 13)
//	public void SelectropOff()
//	{
//		DubaiPoliceLocationScreen SelectropOff = new DubaiPoliceLocationScreen();
//		SelectropOff.selctropOFF2();
//
//	}

	@Test(priority = 14)
	public void confirmdropOff()

	{

		DubaiPoliceLocationScreen confirmdropOff = new DubaiPoliceLocationScreen();
		confirmdropOff.Confirmropoff();

	}

	@Test(priority = 15)
	public void EditImageIcon()

	{

		DubaiPoliceLocationScreen ImageIcon = new DubaiPoliceLocationScreen();
		ImageIcon.editImageIcon();

	}

	@Test(priority = 16)
	public void takeImageEdit()

	{

		ImageScreen image = new ImageScreen();
		image.addPhoto();
	}
	@Test(priority = 17)
	public void cameraTakeImageEdit()
	{
		ImageScreen cameraTakeImage = new ImageScreen();
		cameraTakeImage.cameraTakeImageEdit();
	}

	@Test(priority = 18)
	public void ConfirmImageEdit()

	{
		ImageScreen confirmImage = new ImageScreen();
		confirmImage.confirmImageEdit();

	}

	@Test(priority = 19)
	public void ConfirmImagebuttonEdit()

	{
		ImageScreen confirmImagebutton = new ImageScreen();
		confirmImagebutton.ConfirmImagebuttonEdit();

	}
//
//	@Test(priority = 20)
//	public void EditLocationIcon2()
//
//	{
//		EditLocationScreen EditLocationIcon = new EditLocationScreen();
//		EditLocationIcon.EditLocationIcon();
//	}
//
//	@Test(priority = 21)
//	public void backIcon1() {
//		EditLocationScreen BackIcon = new EditLocationScreen();
//		BackIcon.BackIcon1();
//
//	}

	@Test(priority = 22)
	public void EditSubServiceNumberAndSelectionIcon2() {
		DubaiPoliceLocationScreen Subservice = new DubaiPoliceLocationScreen();
		Subservice.editsubserviceIcon();
	}

	@Test(priority = 23)
	public void backIcon2() {
		EditLocationScreen BackIcon = new EditLocationScreen();
		BackIcon.BackIcon1();
	}

	@Test(priority = 24)
	public void EditropOffIcon2() {
		DubaiPoliceLocationScreen dropofficon = new DubaiPoliceLocationScreen();
		dropofficon.editdropoffIcon();
	}

	@Test(priority = 25)
	public void backIcon3() {
		EditLocationScreen BackIcon = new EditLocationScreen();
		BackIcon.BackIcon1();
	}

	@Test(priority = 26)
	public void EditImageIcon2() {
		DubaiPoliceLocationScreen ImageIcon = new DubaiPoliceLocationScreen();
		ImageIcon.editImageIcon();
	}

	@Test(priority = 27)
	public void backIcon4() {
		EditLocationScreen BackIcon = new EditLocationScreen();
		BackIcon.BackIcon1();
	}
	
	
	@Test(priority = 28)
	public void confirmSummery() {
		EditLocationScreen confirmSummery = new EditLocationScreen();
		confirmSummery.confirmSummery();
	}
	
//	@Test(priority = 30)
//	public void viewRequestetails() {
//		EditLocationScreen viewRequestetails = new EditLocationScreen();
//		viewRequestetails.viewRequestetails();
//	}
}
