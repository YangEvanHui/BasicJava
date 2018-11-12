package intro.to.java.ch04;

public class StringNumberConversion {
	public static void main(String[] args) {
		int number1 = Integer.valueOf("789").intValue();
		int number2 = Integer.valueOf("987").intValue();
		
		System.out.println(number1 + " + " + number2 + " = "
				+ (number1 + number2));
		System.out.println(
				Integer.parseInt("123") + 123);
		System.out.println(
				Double.parseDouble("123.321") + 123.321);
		System.out.println(
				Integer.valueOf("123").hashCode());
	}
}
