package intro.to.java.pe.ch09;

public class PE0907 {
	public static void main(String[] args) {
		Account account = new Account(1122, 20000);
		
		account.setAnnualInterestRate(4.5);
		account.withdraw(2500);
		account.deposit(3000);
		
		System.out.println("\t\tAccount Status");
		System.out.println("----------------------------------------");
		System.out.println("Account ID: "
				+ account.getId());
		System.out.println("Date Created: "
				+ account.getDateCreated());
		System.out.printf("Balance: $%.2f\n",
				account.getBalance());
		System.out.printf("Monthly Interest: $%.2f\n",
				account.getMonthlyInterest());
	}
}
