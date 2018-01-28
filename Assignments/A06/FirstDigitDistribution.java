package assignment06;

public class FirstDigitDistribution {
	private int[] counters;

	public FirstDigitDistribution() {
		counters = new int[10];
	}

	public void process(Sequence seq, int valuesToProcess) {
		for (int i = 1; i <= valuesToProcess; i++) {
			int value = seq.next();
			int firstDigit = value;
			while (value != 0) {
				value = value / 10;
				if (value != 0) {
					firstDigit = value;
				}
			}
			counters[firstDigit]++;
		}
	}

	public void display() {
		for (int i = 0; i < counters.length; i++) {
			System.out.println(i + ": " + counters[i]);
		}
	}
}