package day5;

public class Car extends Machine {
	
	public String colour;
	
	public int numberOfSeats;
	
	
	public Car() {
		
		super(10);
		
		
		System.out.println("This is a Car class constructor");
	}
	
	
	public void calculateMaxSpeed() {
		
		engineSize = 10000;
		
		System.out.println("Max speed of a car");
		
	}
	
	public void calculateMinSpeed() {
		
		System.out.println("Min speed of a car");
	}
	
	
	@Override
	public void run() {

		System.out.println("This is a run method from Car class");

	}

}
