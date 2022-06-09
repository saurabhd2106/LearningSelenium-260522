package day5;

public class Employee {

	private int salary;

	private int bonus;
	
	//To give write access
	public void setSalary(int salary) {
		
		if(salary > 0) {
		
		this.salary = salary;
		
		} else {
			System.err.println("Invalid salary");
		}
	}
	
	//To give read access
	public int getSalary() {
		
		return salary;
		
	}

	
	
	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public Employee() {
		salary = 10000;

		bonus = 5000;
	}

	public Employee(int salary, int bonus) {

		setSalary(salary);
		
		setBonus(bonus);

	}

	public void calculateSalary() {

		int totalSalary = salary + bonus;

		System.out.println("Total Salary - " + totalSalary);
	}

	public int calculateSalary2() {

		int totalSalary = salary + bonus;

		System.out.println("Total Salary - " + totalSalary);

		return totalSalary;
	}

	public int calculateSalary(int salary, int bonus) {

		int totalSalary = this.salary + this.bonus;

		System.out.println("Total Salary - " + totalSalary);

		return totalSalary;
	}
}
