package bankteller;

import org.junit.Assert;
import org.junit.Test;

public class BankAccountTest {
	@Test
	public void bankAccountShouldHaveAccountNumber() {
		BankAccount account = new BankAccount("10000001", "Savings", 1.0);
		String result = account.getAccountNumber();
		Assert.assertEquals("10000001", result);
	}

	@Test
	public void bankAccountShouldHaveAccountNumberAndType() {
		BankAccount account = new BankAccount("10000002", "Savings", 1.0);
		String result = account.getType();
		Assert.assertEquals("Savings", result);

	}

	@Test
	public void bankAccountShouldHaveAccountNumberTypeAndBalance() {
		BankAccount account = new BankAccount("10000002", "Savings", 1.0);
		double result = account.getAccountBalance();
		Assert.assertEquals(1.0, result, 0.001);
	}

	@Test
	public void bankAccountShouldAddDepositsToBalance() {
		BankAccount underTest = new BankAccount("10000002", "Savings", 100.0);
		underTest.deposit(100.00);
		double result = underTest.getAccountBalance();
		Assert.assertEquals(200.0, result, 0.001);
	}

	@Test
	public void bankAccountShouldSubtractWithdrawsFromBalance() {
		BankAccount underTest = new BankAccount("10000002", "Savings", 100.0);
		underTest.withdraw(100.00);
		double result = underTest.getAccountBalance();
		Assert.assertEquals(0.0, result, 0.001);
	}
	
}
