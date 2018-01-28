package assignment06;

public class formatterTester {
	public static void main(String[] args) {
		testDefault();
		testDecimal();
		testAccounting();
		testBase();
	}

	public static void testDefault() {
		DefaultFormatter d1 = new DefaultFormatter();
		System.out.println(d1.format(150));
		System.out.println(d1.format(5));
		System.out.println();
	}

	public static void testDecimal() {
		DecimalSeparatorFormatter ds1 = new DecimalSeparatorFormatter();
		System.out.println(ds1.format(12345));
		System.out.println(ds1.format(1234567890));
		System.out.println(ds1.format(722215308));
		System.out.println();
	}

	public static void testAccounting() {
		AccountingFormatter acc = new AccountingFormatter();
		System.out.println(acc.format(10));
		System.out.println(acc.format(-1));
		System.out.println(acc.format(-50));
		System.out.println(acc.format(50000));
		System.out.println();
	}

	public static void testBase() {
		BaseFormatter b1 = new BaseFormatter(2);
		System.out.println(b1.format(12));
		BaseFormatter b2 = new BaseFormatter(16);
		System.out.println(b2.format(123));
		BaseFormatter b3 = new BaseFormatter(33);
		System.out.println(b3.format(1234));
		BaseFormatter b4 = new BaseFormatter(1);
		System.out.println(b4.format(1234));
		BaseFormatter b5 = new BaseFormatter(22);
		System.out.println(b5.format(123444));
	}
}