package DubaiPoliceAccount;

import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.CompleteVehicleDataScreen;

public class UpdateImpoundTest extends Base {

	@Test(priority = 1)
	public void ClickeditImpoundTest() {
		CompleteVehicleDataScreen Impoundicon = new CompleteVehicleDataScreen();
		Impoundicon.editImpoundIcon();
	}
	
	
}
	
	