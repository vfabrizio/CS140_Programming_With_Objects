package lab05;

/* Entering Greeter::sayHi
 * Hello, Bob.
 * Exiting Greeter::sayHi
*/

/* Entering InquisitiveGreeter::sayHi
 * Entering Greeter::sayHi
 * Hello, Bob.
 * Exiting Greeter::sayHi
 * How are you, Bob?
 * Exiting InquisitiveGreeter::sayHi
*/

public class SavingsAccount extends BankAccount {
	private double rate;

	public SavingsAccount(double balance, double rate) {
		super(balance);
		this.rate = rate;
	}

	@Override
	public void deposit(double amount) {
		super.deposit(amount + amount*rate);
	}

	public double getRate() {
		return rate;
	}

	@Override
	public String toString() {
		return super.toString() + " @ " + rate*100 + "%";
	}
}
