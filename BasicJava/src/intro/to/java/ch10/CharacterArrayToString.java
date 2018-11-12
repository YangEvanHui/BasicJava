package intro.to.java.ch10;

public class CharacterArrayToString {
	public static void main(String[] args) {
		char[] charArray = {
				'G', 'o', 'o', 'd', ' ', 'D', 'a', 'y'};
		String message = new String(charArray);
		System.out.println("The length of " + message.toString()
				+ " is " + message.length());
	}
}
