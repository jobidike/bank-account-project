import java.util.Scanner;

public class BankingApp {

	static int choice;
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		Bank myBank = new Bank();

		BankAccount account1 = new BankAccount("1111", "Checking", 500.00);
		BankAccount account2 = new BankAccount("2222", "Savings", 100.00);

		myBank.add(account1);
		myBank.add(account2);

		System.out.println("Here are your accounts at our bank:");
		for (BankAccount current : myBank.accountValues()) {
			System.out.println(current.getType() + " " + current.getBalance());
		}

		menuOptions();

		while (choice != -1) {
			if (choice == 1) {
				System.out.println("You want to deposit.");
				System.out.println("Here are your accounts");
				for (BankAccount current : myBank.accountValues()) {
					System.out.println(
							"(" + current.getAccoutNum() + ") " + current.getType() + " " + current.getBalance());
				}
				input.nextLine();
				System.out.println("Select the account by (acct num) to perform this transaction.");
				String accountNum = input.nextLine();
				System.out.println("You have selected " + accountNum);
				System.out.println("Enter the amount to deposit:");
				double amount = input.nextDouble();
				myBank.getAccount(accountNum).deposit(amount);
				System.out.println("Your updated balance is now " + myBank.getAccount(accountNum).getBalance());

				menuOptions();

			} else if (choice == 2) {
				System.out.println("You want to withdrawl.");
				System.out.println("Here are your accounts");
				for (BankAccount current : myBank.accountValues()) {
					System.out.println(
							"(" + current.getAccoutNum() + ") " + current.getType() + " " + current.getBalance());
				}
				input.nextLine();
				System.out.println("Select the account by (acct num) to perform this transaction.");
				String accountNum = input.nextLine();
				System.out.println("You have selected " + accountNum);
				System.out.println("Enter the amount to withdrawl:");
				double amount = input.nextDouble();
				myBank.getAccount(accountNum).withdrawal(amount);
				System.out.println("Your updated balance is now " + myBank.getAccount(accountNum).getBalance());

				menuOptions();

			} else if (choice == 3) {
				System.out.println("You want to check your balance.");
				System.out.println("Here are your accounts");
				for (BankAccount current : myBank.accountValues()) {
					System.out.println(
							"(" + current.getAccoutNum() + ") " + current.getType() + " " + current.getBalance());
				}
				input.nextLine();
				System.out.println("Select the account by (acct num) to perform this transaction.");
				String accountNum = input.nextLine();
				System.out.println("You have selected " + accountNum);
				System.out.println("Your updated balance is now " + myBank.getAccount(accountNum).getBalance());

				menuOptions();

			} else if (choice == 4) {

				System.out.println("You would like to close an account.");
				System.out.println("Here are your accounts");
				for (BankAccount current : myBank.accountValues()) {
					System.out.println(
							"(" + current.getAccoutNum() + ") " + current.getType() + " " + current.getBalance());
				}
				input.nextLine();

				System.out.println("Enter the account number of the account you would like to close:");
				String accountNum = input.nextLine();

				myBank.closeAccount(accountNum);
				System.out.println("You are closing account # " + accountNum);
				System.out.println("Here are your remaining accounts");
				for (BankAccount current : myBank.accountValues()) {
					System.out.println(
							"(" + current.getAccoutNum() + ") " + current.getType() + " " + current.getBalance());
				}
				menuOptions();
			}
		}
		System.out.println("Thanks for banking with us...have a nice day!");
	}

	public static void menuOptions() {
		System.out.println("\nWhat would you like to do?");
		System.out.println("Press 1 to deposit");
		System.out.println("Press 2 to withdrawal");
		System.out.println("Press 3 to check balance");
		System.out.println("Press 4 to close an account");
		System.out.println("Press -1 to exit");
		choice = input.nextInt();

	}
}
