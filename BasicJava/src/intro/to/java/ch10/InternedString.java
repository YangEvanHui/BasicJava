package intro.to.java.ch10;

public class InternedString {
	public static void main(String[] args) {
		String s1 = "Welcome to Java";
		String s2 = new String("Welcoem to Java");
		String s3 = "Welcome to Java";
		
		System.out.println("s1 == s2 is " + (s1 == s2));
		System.out.println("s1 == s3 is " + (s1 == s3));
	}
}
