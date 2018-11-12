package intro.to.java.ch10;

public class MatchByPatterns {
	public static void main(String[] args) {
		System.out.println("Java is fun".matches("Java.*"));
		System.out.println("Java is cool".matches("Java.*"));
		System.out.println("Java is powerful".matches("Java.*"));
		System.out.println(
				"440-02-4534".matches("\\d{3}-\\d{2}-\\d{4}"));
		System.out.println("a+b$#c".replaceAll("[$+#]", "NNN"));
	}
}
