package bankteller;

public class BankAccount {
	private String accountNum;
	private String accountType;
	private double accountBalance;

	public BankAccount(String accountNum, String accountType, double accountBalance) {
		this.accountNum = accountNum;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}

	public String getAccountNumber() {

		return this.accountNum;
	}

	public String getType() {

		return this.accountType;
	}

	public double getAccountBalance() {

		return this.accountBalance;
	}

	public void deposit(double depositAmount) {

		this.accountBalance += depositAmount;
	}

	public void withdraw(double withdrawAmount) {

		this.accountBalance -= withdrawAmount;
	}

	@Override
	public String toString() {
		return this.accountNum + "\t" + this.accountType + "\t" + this.accountBalance;
	}
}
