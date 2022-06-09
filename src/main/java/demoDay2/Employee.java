package demoDay2;

public class Employee {

	int salary;

	int bonus;

	public Employee() {
		salary = 10000;

		bonus = 5000;
	}

	public Employee(int salary, int bonus) {

		this.salary = salary;

		this.bonus = bonus;

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
