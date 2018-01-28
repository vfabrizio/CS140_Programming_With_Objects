package lab05;

public class BankAccount {
	private double balance;
	private int idNum;
	static int numAccounts = 0; //static -> will be shared for all instances

	public BankAccount(double balance) {
		this.balance = balance;
		if (balance < 0) {
			throw new IllegalArgumentException("Balance cannot be" + 							"negative");
		}
		idNum = numAccounts;
		numAccounts += 1;
	}

	public double getBalance() {
		return balance;
	}

	public int getIdNum() {
		return idNum;
	}

	@Override
	public String toString() {
		return "Account number " + idNum + " has $" + balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public double withdraw(double amount) {
		double returnAmount = amount;
		if (amount > balance) {
			returnAmount = amount - balance;
			balance -= returnAmount;
		}else{
			balance -= amount;
		}
		return returnAmount;
	}
}
