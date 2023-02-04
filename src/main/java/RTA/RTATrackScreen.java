package RTA;

import com.ERA.base.Base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class RTATrackScreen extends Base{
	
	
	@AndroidFindBy(id ="com.eci.era:id/trackRequestTxt")
	public MobileElement track;

	public void clicktrack() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		track.click();
	}
}
