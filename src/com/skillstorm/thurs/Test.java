package com.skillstorm.thurs;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the radius of the circle: ");
			double radius = scanner.nextDouble();

			Circle circle = new Circle(radius);
			System.out.println(circle.toString());
		} catch (InvalidSizeException e) {
			System.out.println("Error: " + e.getMessage());
		}

		try {
			Circle circle = new Circle(1);
			System.out.println(circle.toString());
		} catch (InvalidSizeException e) {
			System.out.println("Error:" + e.getMessage());
		}

	}

}
