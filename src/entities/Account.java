package entities;

public class Account {
	
	private int accountNumber;
	private String holderName;
	private double balance;
	
	public Account(int accountNumber, String holderName) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
	}

	public Account(int accountNumber, String holderName, double inicialDeposit) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		deposit(inicialDeposit);
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public double getInitialDeposit() {
		return balance;
	}

	public void deposit(double deposit) {
		balance += deposit;
	}
	
	public void withdraw(double withdraw) {
		balance = (balance - withdraw) - 5.00;
	}
	
	public String toString() {
		return "Account "
				+ accountNumber
				+ ", Holder: "
				+ holderName
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
}






