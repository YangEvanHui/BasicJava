package intro.to.java.ch10;

public class ReplaceSplitString {
	public static void main(String[] args) {
		String[] poundSign = "Java#HTML#Perl".split("#");
		System.out.println(poundSign.length);
		for (int i = 0; i < poundSign.length; i++) {
			System.out.print(poundSign[i] + " ");
		}
		System.out.println();
		
		String[] punctuationMark =
				"Java,C?C#,C++".split("[.,:;?]");
		for (int i = 0; i < punctuationMark.length; i++) {
			System.out.println(punctuationMark[i]);
		}
		
		// toCharArray()
		char[] chars = "Java".toCharArray();
		for (int i = 0; i < chars.length; i++) {
			System.out.print(chars[i] + " ");
		}
		System.out.println();
		
		// getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
		char[] dst = {'J', 'A', 'V', 'A', '1', '3', '0', '1'};
		"CS3720".getChars(2, 6, dst, 4);
		for (int i = 0; i < dst.length; i++) {
			System.out.print(dst[i] + " ");
		}
		System.out.println();
		
		// String(char[]), String.valueOf(char[])
		String strConstructor =
				new String(new char[] {'J', 'a', 'v', 'a'});
		String strValueOf =
				String.valueOf(new char[] {'J', 'a', 'v', 'a'});
		System.out.println(strConstructor.toString() + ","
				+ strValueOf.toString());
		
		// Formatting Strings
		String formatString = String.format(
				"%7.2f%6d%-4s", 45.556, 14, "AB");
		System.out.println(formatString);
		
		System.out.println("Welcome".replace('e', 'A'));
		System.out.println("Welcome".replaceFirst("e", "AB"));
		System.out.println("Welcome".replace("e", "AB"));
		System.out.println("Welcome".replace("el", "AB"));
	}
}
