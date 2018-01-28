package lab07;

public class Driver {
	public static void printFor(IntIterator itr, int limit) {
		int count = 0;
		for (int i : itr.toIterable()) {
			System.out.print(i +  ", ");
			count++;
			if (count == limit) break;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		RepeatIterator repeat = new RepeatIterator(36);
		printFor(repeat, 4);
		
		int[] arr = {1, 2, 3};
		CyclicIterator cyclic = new CyclicIterator(arr);
		printFor(cyclic, 4);
		
		CountIterator count = new CountIterator(2, 2);
		printFor(count, 4);
		
		CountIterator count2 = new CountIterator(2, 2, 8);
		printFor(count2, 4);
		
		CountIterator count3 = new CountIterator(1, 3, 9);
		
		for (int i : count3.toIterable()) {
			System.out.print(i + "   ");
		}
		System.out.println();
		
		Double[] dArr1 = {new Double(1.2), new Double(2.2), new Double(3.2)};
		Integer[] iArr1 = {new Integer(1), new Integer(2), new Integer(3)};
		ZipIterator<Double, Integer> zip1 = new ZipIterator<>(dArr1, iArr1);
		
		for (Pair<Double, Integer> i : zip1.toIterable()) {
			System.out.print(i + ", ");
		}
		System.out.println();
		
		Double[] dArr2 = {new Double(1.2), new Double(2.2), new Double(3.2), new Double(4.2), new Double(5.2)};
		Integer[] iArr2 = {new Integer(4), new Integer(5), new Integer(6)};
		ZipIterator<Double, Integer> zip2 = new ZipIterator<>(dArr2, iArr2);
		ZipIterator<Integer, Double> zip3 = new ZipIterator<>(iArr2, dArr2);
		
		for (Pair<Double, Integer> i : zip2.toIterable()) {
			System.out.print(i + ", ");
		}
		System.out.println();
		
		for (Pair<Integer, Double> i : zip3.toIterable()) {
			System.out.print(i + ", ");
		}
		
	}

}
