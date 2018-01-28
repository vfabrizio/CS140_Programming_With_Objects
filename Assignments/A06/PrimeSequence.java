package assignment06;

public class PrimeSequence implements Sequence {
	private int nextPrime = 2;

	public int next() {
		int currentPrime = nextPrime;
		nextPrime++;
		int i = 2;
		while (i <= Math.sqrt(nextPrime)) {
			if (nextPrime % i == 0) {
				nextPrime++;
				i = 2;
			}else {
				i++;
			}
		}
		return currentPrime;

	}
}