package bankteller;

import java.util.Scanner;

public class BankTellerApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Bank myBank = new Bank();
		BankAccount account1 = new BankAccount("1111", "Checking", 500.00);
		BankAccount account2 = new BankAccount("2222", "Savings ", 2500.00);
		myBank.addBankAccount(account1);
		myBank.addBankAccount(account2);
		int userChoice;

		while (true) {
			System.out.println("Here are your accounts:");
			myBank.printAccountsWithoutNumbers();
			printOptionMenu();
			userChoice = input.nextInt();
			if (userChoice == -1) {
				System.exit(0);
			} else {
				String accountChoice;

				System.out.println("Here are your accounts");
				System.out.println(myBank.toString());
				System.out.println("Select the account by (acct num) to perform this transaction.");
				input.nextLine();
				accountChoice = input.nextLine();
				System.out.println("You selected account " + accountChoice);
				if (userChoice == 1) {
					System.out.println("Enter the amount to deposit:");
					double deposit = input.nextDouble();
					myBank.getBankAccount(accountChoice).deposit(deposit);
					System.out.println(
							"Your updated balance is now $" + myBank.getBankAccount(accountChoice).getAccountBalance());
				} else if (userChoice == 2) {
					System.out.println("Enter the amount to withdraw:");
					double withdraw = input.nextDouble();
					myBank.getBankAccount(accountChoice).withdraw(withdraw);
					System.out.println(
							"Your updated balance is now $" + myBank.getBankAccount(accountChoice).getAccountBalance());
				} else if (userChoice == 3) {
					System.out.println(
							"The account balance is $" + myBank.getBankAccount(accountChoice).getAccountBalance());
				} else if (userChoice == 4) {
					System.out.println("Are you sure you want to close this account? (\'y\' or \'n\')");
					if (input.nextLine().equalsIgnoreCase("y")) {
						myBank.closeBankAccount(accountChoice);
					}

				}
			}
			input.close();
		}
	}

	public static void printOptionMenu() {
		System.out.println();
		System.out.println("What would you like to do?");
		System.out.println("Press 1 to deposit");
		System.out.println("Press 2 to withdrawal");
		System.out.println("Press 3 to check balance");
		System.out.println("Press 4 to close an account");
		System.out.println("Press -1 to exit");
	}
}
