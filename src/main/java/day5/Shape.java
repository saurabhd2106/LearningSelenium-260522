package day5;

public abstract class Shape {

	public double calculateVolume(int side, int height) {

		return calculateArea(side) * height;

	}

	public abstract double calculateArea(int side);

}
