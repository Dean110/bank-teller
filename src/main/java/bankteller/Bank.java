package bankteller;

import java.util.HashMap;
import java.util.Map;

public class Bank {

	Map<String, BankAccount> bankAccounts = new HashMap<String, BankAccount>();

	public void addBankAccount(BankAccount bankAccount) {
		this.bankAccounts.put(bankAccount.getAccountNumber(), bankAccount);
	}

	public int amountOfAccounts() {
		
		return this.bankAccounts.size();
	}

	public void closeBankAccount(String accountNum) {
		
		bankAccounts.remove(accountNum);
		
	}

	public BankAccount getBankAccount(String accountNum) {
		
		return this.bankAccounts.get(accountNum);
	}

	
}
