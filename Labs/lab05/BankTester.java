package lab05;

import java.util.ArrayList;
import java.util.Arrays;

public class BankTester {
	public static void main(String[] args) {
		ArrayList<BankAccount> accounts = new ArrayList<>();
		accounts.add(new BankAccount(100.00));
		accounts.add(new SavingsAccount(200.00, 0.1));
		accounts.add(new CheckingAccount(1000.00, 5));
		accounts.add(new BankAccount(250.50));
		accounts.add(new SavingsAccount(550.50, 0.02));
		accounts.add(new CheckingAccount(2500.50, 10));

		System.out.println(accounts);

		for (BankAccount element : accounts) {
			element.deposit(1000.00);
		}
		System.out.println("\n" + accounts);

		for (int i = 0; i < 6; i++) {
			for (BankAccount element : accounts) {
				double withdrawnMoney = element.withdraw(200.00);
			}
			System.out.println("\n" + accounts);
		}

		ArrayList<Object> objects = new ArrayList<>();
		objects.add(new SavingsAccount(1987.00, 0.1));
		objects.add(45678);
		objects.add(new Double(45.999));
		objects.add("Hello");
		objects.add(new ArrayList<Integer>(Arrays.asList(1, 2, 3)));
		objects.add(null);
		objects.add(true);
		objects.add(new Integer(123456789));

		System.out.println("\n" + objects);
	}
}
