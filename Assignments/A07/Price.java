package assignment07;

public class Price {
	private long dollars;
	private int cents;
	
	public Price(long dollars, int cents) {
		if (dollars >= 0 || cents >=0 || cents < 100) {
			this.dollars = dollars;
			this.cents = cents;
		}else {
			throw new IllegalArgumentException("Can't have negative money. Or more than 99 cents");
		}
	}
	
	public void changeUp(double percent) {
		if (percent > 0) {
			percent = percent / 100;
			double temp = ((double) cents) / 100;
			double money = dollars + temp;
			double conv = money + money*percent;
			conv = Math.round(conv * 100);
			conv = conv / 100;
			String str = Double.toString(conv);
			String[] strArr = str.split("\\.");
			dollars = Long.parseLong(strArr[0]);
			if (Integer.parseInt(strArr[1]) < 10) {
				cents = Integer.parseInt(strArr[1])*10;
			}else {
				cents = Integer.parseInt(strArr[1]);
			}
		}else {
			throw new IllegalArgumentException("Can't have negative percent.");
		}
	}
	
	public void changeDown(double percent) {
		if (percent > 0) {
			percent = percent / 100;
			double temp = ((double) cents) / 100;
			double money = dollars + temp;
			double conv = money - money*percent;
			conv = Math.round(conv * 100);
			conv = conv / 100;
			String str = Double.toString(conv);
			String[] strArr = str.split("\\.");
			dollars = Long.parseLong(strArr[0]);
			if (Integer.parseInt(strArr[1]) < 10) {
				cents = Integer.parseInt(strArr[1])*10;
			}else {
				cents = Integer.parseInt(strArr[1]);
			}
		}else {
			throw new IllegalArgumentException("Can't have negative percent.");
		}
	}
	
	@Override
	public String toString() {
		if (cents == 0) {
			return "$" + dollars + "." + "00";
		}
		return "$" + dollars + "." + cents;
	}
	
	
}
