package assignment06;

public class DecimalSeparatorFormatter implements NumberFormatter {
	public String format(int n) {
		String retVal = "" + n;
		int length = String.valueOf(n).length();
		if (length > 3) {
			retVal = "";
			int[] digits = new int[length];
			for (int i = 0; i < length; i++) {
				digits[i] = n % 10;
				n = n / 10;
			}

			for (int i = 0; i < digits.length; i++) {
				if (i % 3 == 0 && i != 0) {
					retVal = digits[i] + "," + retVal;
				}else {
					retVal = digits[i] + retVal;
				}
			}
		}

		return retVal;
	}
}