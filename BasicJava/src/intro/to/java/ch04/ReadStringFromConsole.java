package intro.to.java.ch04;

import java.util.Scanner;

public class ReadStringFromConsole {
	public static void main(String[] args) {
		// The next() method reads a string that
		// ends with a whitespace character.
		Scanner input1 = new Scanner(System.in);
		System.out.print("Enter three words separated by spaces: ");
		String s1 = input1.next();
		String s2 = input1.next();
		String s3 = input1.next();
		System.out.println("s1 is " + s1);
		System.out.println("s2 is " + s2);
		System.out.println("s3 is " + s3);
		
		// The nextLine() method reads a string that
		// ends with the 'Enter' key pressed.
		Scanner input2 = new Scanner(System.in);
		System.out.print("\nEnter a line: ");
		String s4 = input2.nextLine();
		System.out.println("The line entered is [" + s4 + "]");
		
		// Reading a character from the console
		Scanner input3 = new Scanner(System.in);
		System.out.print("\nEnter a character: ");
		String s5 = input3.nextLine();
		char ch = s5.charAt(0);
		System.out.println("The character entered is " + ch);
		
		// Comparing strings
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.startsWith("python"));
		System.out.println(s2.endsWith("python"));
		System.out.println(s4.contains("python"));
		
		// Obtaining substrings
		System.out.println(s4.substring(11));
		System.out.println(s5.substring(11, 17));
		
		// Finding a Character or a Substring in a String
		// indexOf()
		System.out.println(s4.indexOf('W'));
		System.out.println(s4.indexOf('o'));
		System.out.println(s4.indexOf('o', 5));
		System.out.println(s4.indexOf("come"));
		System.out.println(s4.indexOf("Java", 5));
		System.out.println(s4.indexOf("java", 5));
		
		// lastIndexOf()
		System.out.println(s4.lastIndexOf('W'));
		System.out.println(s4.lastIndexOf('o'));
		System.out.println(s4.lastIndexOf('o', 5));
		System.out.println(s4.lastIndexOf("come"));
		System.out.println(s4.lastIndexOf("Java", 5));
		System.out.println(s4.lastIndexOf("Java"));
	}
}
