package lab05;

public class CheckingAccount extends BankAccount {
	private int withdrawLimit;
	private int withdrawCount = 0;

	public CheckingAccount(double balance, int limit) {
		super(balance);
		this.withdrawLimit = limit;
	}

	public int getWithdrawLimit() {
		return withdrawLimit;
	}

	public int getWithdrawCount() {
		return withdrawCount;
	}

	@Override
	public String toString() {
		return super.toString() + " (" + withdrawCount + "/" + 					withdrawLimit + ")";
	}

	@Override
	public double withdraw(double amount) {
		double returnAmount = 0;
		if (withdrawCount < withdrawLimit) {
			returnAmount = super.withdraw(amount);
			withdrawCount += 1;
		}
		return returnAmount;
	}
}
