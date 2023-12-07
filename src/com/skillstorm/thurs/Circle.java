package com.skillstorm.thurs;

public class Circle {

	private double radius;

	public Circle (double radius) {
		setRadius(radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if (radius <= 0) {
			throw new InvalidSizeException("You entered a invalid radius size: Must be a positive number.");
		}

		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle with radius: " + radius;
	}

}
