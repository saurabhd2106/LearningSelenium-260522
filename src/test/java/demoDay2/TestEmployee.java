package demoDay2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestEmployee {
	
	
	@Test
	public void testEmployeeAccess() {

		Employee saurabh = new Employee();

		saurabh.salary = -100000;

		saurabh.bonus = 50000;

		saurabh.calculateSalary();

	}

	@Test
	public void testEmployee() {

		Employee saurabh = new Employee();

		saurabh.salary = 100000;

		saurabh.bonus = 50000;

		saurabh.calculateSalary();

	}

	@Test
	public void testEmployee2() {

		Employee saurabh = new Employee();

		saurabh.salary = 100000;

		saurabh.bonus = 60000;

		int totalSalary = saurabh.calculateSalary2();
		
		Assert.assertEquals(totalSalary, 160000);

	}
	
	@Test
	public void testEmployee3() {

		Employee saurabh = new Employee();

		saurabh.salary = 100000;

		saurabh.bonus = 60000;

		int totalSalary = saurabh.calculateSalary(50000, 30000);
		
		Assert.assertEquals(totalSalary, 160000);

	}
	
	@Test
	public void testDefaultValues() {

		Employee saurabh = new Employee();
		
		Employee gaurav = new Employee(30000, 2000);

		
		int totalSalary = saurabh.calculateSalary2();
		
		int totalSalaryGaurav = gaurav.calculateSalary2();
		
		Assert.assertEquals(totalSalary, 15000);
		
		Assert.assertEquals(totalSalaryGaurav, 32000);

	}

}
