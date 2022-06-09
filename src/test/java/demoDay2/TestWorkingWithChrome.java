package demoDay2;

import org.testng.annotations.Test;

public class TestWorkingWithChrome {
	
	
	@Test
	public void verifyHomepage() {
		
		WorkingWithChrome wc = new WorkingWithChrome();
		
		wc.openBrowser();
		
		wc.formFill();
		
		wc.closeBrowser();
		
	}

}
