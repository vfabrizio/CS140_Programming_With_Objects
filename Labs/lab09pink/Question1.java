package lab09pink;

import java.util.ArrayList;

public class Question1 {
	private int n;
	
	public Question1(int n1) {
		this.n = Math.abs(n1);
	}
	
	public int method1() {
		if (n == 0 || n == 1) {
			return n;
		}
		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				return i;
			}
		}
		return n;
	}
	
	public ArrayList<Integer> factorize() {
		ArrayList<Integer> retArr = new ArrayList<>();
		int temp = n;
		while (n > 1) {
			int x = method1();
			retArr.add(x);
			n = n / x;
		}
		n = temp;	
		return retArr;
	}
	
	@Override
	public String toString() {
		String retVal = "0 = 0";
		if (n != 0) {
			retVal = "1 = 1";
			if (n != 1) {
				retVal = n + " = " + factorize();
				retVal = retVal.replace(",", " x");
				retVal = retVal.replace("[", "");
				retVal = retVal.replace("]", "");
			}
		}
		return retVal;
	}

}
