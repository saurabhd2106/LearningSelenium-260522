package demoDay5;

import org.testng.annotations.Test;

import day5.Cube;
import day5.Cylinder;
import day5.Shape;

public class TestShape {

	@Test
	public void verifyShape() {

		Shape cylinder = new Cylinder();

		Shape cube = new Cube();

		System.out.println(cylinder.calculateVolume(10, 12));

		System.out.println("----------------------");

		System.out.println(cube.calculateVolume(12, 10));
	}

}
