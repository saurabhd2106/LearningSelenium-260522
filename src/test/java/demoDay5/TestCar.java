package demoDay5;

import org.testng.annotations.Test;

import day5.Car;
import day5.Machine;

public class TestCar {
	
	@Test
	public void verifyCarObjectAccess() {
		
		Machine mac = new Machine(12);
		
		mac.run();
		
		
		System.out.println("---------------------------");
		
		Car nexon = new Car();
		
		nexon.engineSize = 1000;
		
		nexon.colour = "White";
		
		nexon.run();
		
		
		System.out.println("---------------------------");
		
		Machine alto = new Car();
		
		alto.engineSize = 7000;
		
		alto.run();
		
		
		
		
		
	}

}
