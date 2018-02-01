package bankteller;

import java.util.Map.Entry;

public class BankTellerApp {
	public static void main(String[] args) {
		Bank myBank = new Bank();
		BankAccount account1 = new BankAccount("1111","Checking",500.00);
		BankAccount account2 = new BankAccount("2222","Savings ",2500.00);
		myBank.addBankAccount(account1);
		myBank.addBankAccount(account2);
		
		System.out.println("Here are your accounts:");
		myBank.printAccountsWithoutNumbers();
		System.out.println("Amy withdraws $38.00 from savings.");
		myBank.getBankAccount("2222").withdraw(38.00);
		myBank.printAccountsWithoutNumbers();
	}

}
