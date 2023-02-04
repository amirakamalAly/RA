package RTA;

import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.DownloadAndShareScreen;


public class DownloadAndShareTest extends Base {

	
	
	@Test(priority = 1)
	public void ClickDownloadTest() {
		DownloadAndShareScreen download = new DownloadAndShareScreen();
		download.clcikownload();
	}
	
	@Test(priority = 2)
	public void ClickShareTest() {
		DownloadAndShareScreen share = new DownloadAndShareScreen();
		share.clcikShare();
	}
	
	
	@Test(priority = 3)
	public void CopyLinkTest() {
		
		DownloadAndShareScreen copy = new DownloadAndShareScreen();
		copy.clcikCopy();
	}
	
	}
//
