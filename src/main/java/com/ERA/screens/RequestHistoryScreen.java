package com.ERA.screens;

import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import com.ERA.base.Base;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class RequestHistoryScreen extends Base{
//	@AndroidFindBy (uiAutomator = "new UiSelector().text(\"طلباتي\")")
@AndroidFindBy(id = "com.eci.era:id/itemNavRequests")
	private MobileElement MenuRequestHistory;

	
	public void MenuRequestHistory() {
		// TODO Auto-generated method stub
		MenuRequestHistory.click();
	}

	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageView")
	private MobileElement FristItemList;
	public void ClickFristItemRequestHistory() {
		// TODO Auto-generated method stub
		FristItemList.click();
	}
	
		@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageView")
		public MobileElement listItem1;
		@AndroidFindBy(xpath = "//android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.ImageView")
		public MobileElement listItem2;

		public void scrollitems() {
			Actions act = new Actions(driver);
			act.dragAndDrop(listItem2, listItem1).build().perform();

		}
		
		@AndroidFindBy(id = "com.eci.era:id/tripImage")
		public MobileElement item1;
		@AndroidFindBy(id = "com.eci.era:id/tvDriverName")
		public MobileElement item2;
	//	private FindsByAndroidUIAutomator<MobileElement> wd;

		public void scrollitemetails() {
			Actions act = new Actions(driver);
			act.dragAndDrop(item2, item1).build().perform();
		}
			
//			wd = null;
//			MobileElement radioGroup = (MobileElement) wd
//
//					.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
//
//					+ ".resourceId(\"com.eci.era:id/constraintLayout\")).scrollIntoView("
//
//					+ "new UiSelector().resourceId(\"com.eci.era:id/tvRequestFeesTxT\"));");
//					radioGroup.click();

						
			@AndroidFindBy(id = "com.eci.era:id/ratingBarImage")
			public MobileElement ratebar;
		

			public void ratedriver() {
				ratebar.click();
	}

			@AndroidFindBy(id = "com.eci.era:id/ib_call")
			public MobileElement calldriver;
			public void calldriver() {
				// TODO Auto-generated method stub
				calldriver.click();
				driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
//				driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
//
//				try {
//					Thread.sleep(2000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));


			}
			
			@AndroidFindBy (uiAutomator = "new UiSelector().text(\"ملغى\")")
			//@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView")
			public MobileElement Statustext;
		

			public void checkCompletedStatus() {

				SoftAssert softAssert = new SoftAssert();
				String Status=Statustext.getText();

				System.out.println("here is completed status " + Status);

				String completedStatus = "تم إنزال المركبة";

				softAssert.assertEquals(Status, completedStatus);

				softAssert.assertNotNull(Status);
				softAssert.assertAll();
				
				
	}
			
			@AndroidFindBy (id = "com.eci.era:id/statusTV")
			public MobileElement completedStatustext;
		

			public void checkStatuscompleted() {

				SoftAssert softAssert = new SoftAssert();
				String Status=completedStatustext.getText();

				System.out.println("here is completed status " + Status);

				String completedStatus = "تم إنزال المركبة";

				softAssert.assertEquals(Status, completedStatus);

				softAssert.assertNotNull(Status);
				softAssert.assertAll();
				
				
	}
			
			@AndroidFindBy(id = "com.eci.era:id/statusTV")
			public MobileElement status;
		

			public void checkStatus() {

				SoftAssert softAssert = new SoftAssert();
				String Status=status.getText();

				System.out.println("here is completed status " + Status);

				String currentStatus = "ملغى";

				softAssert.assertEquals(Status, currentStatus);

				softAssert.assertNotNull(Status);
				softAssert.assertAll();
				
				
	}

			public void checkCancelledStatus() {
				// TODO Auto-generated method stub
				SoftAssert softAssert = new SoftAssert();
				String Status=Statustext.getText();

				System.out.println("here is cancelled status " + Status);

				String completedStatus = "ملغى";

				softAssert.assertEquals(Status, completedStatus);

				softAssert.assertNotNull(Status);
				softAssert.assertAll();
			}

			
			@AndroidFindBy(id = "com.eci.era:id/pickUpAddress")
			public MobileElement item;
			public void fristitemclick() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				item.click();
			}
			
			public void checkCompletedStatus1() {

				SoftAssert softAssert = new SoftAssert();
				String Status=status.getText();

				System.out.println("here is completed status " + Status);

				String currentStatus = "تم إنزال المركبة";

				softAssert.assertEquals(Status, currentStatus);

				softAssert.assertNotNull(Status);
				softAssert.assertAll();
				
				
	}



}
