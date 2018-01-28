package assignment06;

public class SequenceDemo {
	public static void main(String[] args) {
		testLastDigit();
		testPrime();
		testFirstDigit();
	}

	public static void testLastDigit() {
		LastDigitDistribution dist1 = new LastDigitDistribution();
		dist1.process(new SquareSequence(), 1000);
		dist1.display();
		System.out.println();

		LastDigitDistribution dist2 = new LastDigitDistribution();
    	dist2.process(new RandomSequence(), 100);
    	dist2.display();
    	System.out.println();
    }

    public static void testPrime() {
    	PrimeSequence p1 = new PrimeSequence();
    	for (int i = 0; i <= 10; i++) {
    		System.out.println(p1.next());
    	}
    	System.out.println();
    }

    public static void testFirstDigit() {
    	FirstDigitDistribution f1 = new FirstDigitDistribution();
		f1.process(new SquareSequence(), 1000);
		f1.display();
		System.out.println();

		FirstDigitDistribution f2 = new FirstDigitDistribution();
		f2.process(new RandomSequence(), 1000);
		f2.display();
		System.out.println();
    }
}