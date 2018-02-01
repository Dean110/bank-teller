package bankteller;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Bank {

	private Map<String, BankAccount> bankAccounts = new HashMap<String, BankAccount>();

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

	public void printAccountsWithoutNumbers() {
		for (Entry<String, BankAccount> account : bankAccounts.entrySet()) {
			System.out.println(account.getValue().getType() + "\t\t" + account.getValue().getAccountBalance());
		}

	}

	@Override
	public String toString() {
		String toStringReturn = "";
		for (Entry<String, BankAccount> account : bankAccounts.entrySet()) {
			toStringReturn += "("+account.getValue().getAccountNumber()+")" + "\t" + account.getValue().getType() + "\t"
					+ account.getValue().getAccountBalance() + "\n";
		}
		return toStringReturn;
	}
}
