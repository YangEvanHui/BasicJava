package intro.to.java.ch11;

import java.util.ArrayList;
import java.util.Scanner;

public class TestMyStack {	
	public static void main(String[] args) {
//		ArrayList<Integer> intList = new ArrayList<>();
//		intList.add(1);
//		intList.add(2);
//		intList.add(3);
//		
//		ArrayList<String> stringList = new ArrayList<>();
//		stringList.add("Phyllis");
//		stringList.add("Eve");
//		stringList.add("Evan");
//		
//		ArrayList<Double> doubleList = new ArrayList<>();
//		doubleList.add(9.9);
//		doubleList.add(8.8);
//		doubleList.add(7.7);
//		
//		ArrayList<Character> charList = new ArrayList<>();
//		charList.add('w');
//		charList.add('o');
//		charList.add('w');
		
		MyStack stack = new MyStack();
		Scanner input = new Scanner(System.in);
		String[] strArray = new String[20];
		
		for (int i = 0; i < strArray.length; i++) {
			strArray[i] = input.next();
			stack.push(strArray[i]);
		}
		
		System.out.println(stack.toString());
		
//		MyStack stack = new MyStack();
//		stack.push(intList);
//		stack.push(stringList);
//		stack.push(doubleList);
//		stack.pop();
//		stack.push(charList);
//		System.out.println(stack.peek());
//		System.out.println(stack.toString());
	}
}
