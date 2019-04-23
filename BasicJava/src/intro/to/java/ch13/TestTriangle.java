package intro.to.java.ch13;

import java.util.Scanner;

public class TestTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Triangle t = new Triangle();
		
		System.out.print("Length of first side: ");
		t.setSide1(input.nextDouble());
		
		System.out.print("Length of second side: ");
		t.setSide2(input.nextDouble());
		
		System.out.print("Length of third side: ");
		t.setSide3(input.nextDouble());
		
		System.out.print("The color of triangle: ");
		t.setColor(input.next());
		
		System.out.print("Is it filled? " );
		t.setFilled(input.nextBoolean());
		
		System.out.println("\n\tResult\n" + t.toString());
	}
}
