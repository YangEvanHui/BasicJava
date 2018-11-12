package intro.to.java.ch04;

public class TheStringType {
	public static void main(String[] args) {
		String message = "Welcome to Java";
		String messageWithSpace = "    Welcome to Java    ";
		
		System.out.println("Length of message is " +
				message.length());
		System.out.println(message.charAt(0));
		System.out.println(message.concat(" Programming"));
		System.out.println(message.toUpperCase());
		System.out.println(message.toLowerCase());
		
		// trim() method
		System.out.println("\nBefore Trim: " + messageWithSpace
				+ "\nAfter Trim: " + messageWithSpace.trim());
	}
}
