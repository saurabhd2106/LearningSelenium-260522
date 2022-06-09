package demoDay5;

import org.testng.annotations.Test;

import day5.interfaceExample.MSExcel;
import day5.interfaceExample.MSOffice;

public class TestMsOffice {
	
	@Test
	public void verifyMsOffice() {
		
		
		MSOffice office = new MSExcel();
		
		MSExcel excel = new MSExcel();
		
		office.save();
		
		excel.saveAs();
		
	}

}
