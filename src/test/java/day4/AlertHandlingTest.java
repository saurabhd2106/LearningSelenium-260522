package day4;

import org.testng.annotations.Test;

public class AlertHandlingTest {
	
	@Test
	public void verifyAlerts() {
		FrameAndAlertHandling fa = new FrameAndAlertHandling();
		
		fa.openBrowser();
		
		fa.clickTryitButton();
		
		fa.closeBrowser();
	}

}
