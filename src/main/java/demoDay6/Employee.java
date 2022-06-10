package demoDay6;

public class Employee {
	
	private String name;
	
	private static int employeeId = 100000;
	
	static {
		
		employeeId = employeeId + 1;
		
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public int getBonus() {
		return bonus;
	}


	public void setBonus(int bonus) {
		this.bonus = bonus;
	}


	public int getEmployeeId() {
		return employeeId;
	}


	private int salary;
	
	private int bonus;
	
	
	
	
	public Employee(String name) {
		
		this.name = name;
		
		
	}

}
