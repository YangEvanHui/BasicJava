package intro.to.java.ch04;

public class FormatConsoleOutput {
	private double amount;
	private double interestRate;
	private double interest;
	
	public FormatConsoleOutput() {
		this.amount = 0;
		this.interestRate = 0;
		this.interest = 0;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public double getInterest() {
		interest = amount * interestRate;
		return interest;
	}
	
	public String toString() {
		return "amount: " + amount +
				"\ninterestRate: " + interestRate +
				"\ninterest: " + interest;
	}
	
	public void displayResult() {
		System.out.println("Interest is $" + interest);
	}
	
	public void displayResultWithCast() {
		System.out.println("Interest is $" +
				(int)(interest * 100) / 100.0);
	}
	
	public void displayResultWithPrintf() {
		System.out.printf("Interest is $%4.2f", interest);
	}
}
