package assignment06;

public class AccountingFormatter implements NumberFormatter {
	public String format(int n) {
		String retVal = "" + n;
		if (n < 0) {
			n = Math.abs(n);
			retVal = "(" + n + ")";
		}
		return retVal;
	}
}