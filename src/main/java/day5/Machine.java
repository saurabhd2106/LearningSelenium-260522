package day5;

public class Machine {

	public int engineSize;

	public int rpm;

	public Machine(int engineSize) {
		System.out.println("This is a machine class constructor");
	}
	
	public void run() {

		System.out.println("This is a run method from Machine class");

	}

	public void calculateAverage() {

		System.out.println("This is a average calculation method from Machine class");

	}
}
