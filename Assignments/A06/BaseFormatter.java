package assignment06;

public class BaseFormatter implements NumberFormatter {
	private int base;

	public BaseFormatter(int base) {
		this.base = base;
	}

	public String format(int n) {
		if (base >=2 && base <= 32) {
			return Integer.toString(n, base);
		}else {
			return "Can't format in base other than bases 2-36";
		}
	}
}