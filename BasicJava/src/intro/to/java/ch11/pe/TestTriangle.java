package intro.to.java.ch11.pe;

import java.util.Scanner;

public class TestTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three sides: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		System.out.print("Enter color and filled: ");
		String color = input.next();
		boolean filled = input.nextBoolean();
		
		Triangle triangle = new Triangle(side1, side2, side3);
		triangle.setColor(color);
		triangle.setFilled(filled);
		
		System.out.println("Area: " + triangle.getArea() + "\n" +
				"Perimeter: " + triangle.getPerimeter() + "\n" +
				"Color: " + triangle.getColor() + "\n" +
				"Filled: " + triangle.isFilled());
	}
}
