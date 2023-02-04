package RTA;

import org.testng.annotations.Test;

import com.ERA.base.Base;

public class TrackTest extends Base {



	@Test(priority =1 )
	public void clickTrack()

	{
		RTATrackScreen track = new RTATrackScreen();
		track.clicktrack();
	}

}

