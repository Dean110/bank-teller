package bankteller;

import java.util.HashMap;
import java.util.Map;

public class Bank {

	Map<String, BankAccount> bankAccounts = new HashMap<String, BankAccount>();

	public String addBankAccount(BankAccount bankAccount) {
		return this.bankAccounts.put(bankAccount.getAccountNumber(), bankAccount).toString();
	}

}
