package demoDay6;

import org.testng.annotations.Test;

public class TestEmployee {
	
	
	@Test
	public void verifyEmployee() {
		
		
		Employee saurabh = new Employee("Saurabh");
		
		System.out.println(saurabh.getEmployeeId());
		
		
		Employee gaurav = new Employee("Gaurav");
		
		System.out.println(gaurav.getEmployeeId());
		
		

		Employee rahul = new Employee("rahul");
		
		System.out.println(rahul.getEmployeeId());
	}

}
