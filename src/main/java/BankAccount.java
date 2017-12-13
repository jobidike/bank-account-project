

public class BankAccount {

	private String type;
	private double balance;
	private String accountNum; //unique key

	public BankAccount(String accountNum, String type, double balance) {
		this.accountNum = accountNum;
		this.type = type;
		this.balance = balance;
	}

	public String getType() {
		return type;
	}

	public double getBalance() {
		return balance;
	}

	public String getAccoutNum() {
		return accountNum;
	}

	public void deposit(double amount) {
		balance += amount;

	}

	public void withdrawal(double amount) {
		balance -= amount;
		
	}

}
