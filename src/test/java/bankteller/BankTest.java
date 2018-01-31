package bankteller;

import org.junit.Test;

public class BankTest {
@Test
public void shouldAddBankAccount() {
	Bank underTest = new Bank();
	underTest.addBankAccount(new BankAccount("1","Checking", 100.0));
	
}
}
