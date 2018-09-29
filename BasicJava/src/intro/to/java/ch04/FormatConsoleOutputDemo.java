package intro.to.java.ch04;

public class FormatConsoleOutputDemo {
	public static void main(String[] args) {
		FormatConsoleOutput fco = new FormatConsoleOutput();
		fco.setAmount(12618.98);
		fco.setInterestRate(0.0013);
		fco.getInterest();
		fco.displayResultWithPrintf();
	}
}