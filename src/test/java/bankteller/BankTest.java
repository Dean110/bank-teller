package bankteller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class BankTest {
	@Test
	public void shouldInstantiateBankAccountObject() {
		Bank underTest = new Bank();
		int result = underTest.amountOfAccounts();
		assertEquals(0, result);
	}

	@Test
	public void shouldAddBankAccount() {
		Bank underTest = new Bank();
		underTest.addBankAccount(new BankAccount("1", "Checking", 100.0));
		assertEquals(1, underTest.amountOfAccounts());
	}

	@Test
	public void shouldCloseAccount2() {
		Bank underTest = new Bank();
		underTest.addBankAccount(new BankAccount("1", "Checking", 100.0));
		underTest.addBankAccount(new BankAccount("2", "Checking", 200.0));
		underTest.addBankAccount(new BankAccount("3", "Checking", 300.0));
		underTest.closeBankAccount("2");
		assertNull(underTest.getBankAccount("2"));
	}
	@Test
	public void shouldGetBankAccountByIndex() {
		Bank underTest = new Bank();
		underTest.addBankAccount(new BankAccount("1", "Checking", 100.0));
		underTest.addBankAccount(new BankAccount("2", "Checking", 200.0));
		underTest.addBankAccount(new BankAccount("3", "Checking", 300.0));
		BankAccount result= underTest.getBankAccount("2");
		assertEquals(200.0, result.getAccountBalance(), 0.001);
		
	}
	
}
