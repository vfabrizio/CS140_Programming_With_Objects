package lab07;

public class CyclicIterator implements IntIterator {
	private int[] a;
	private int pos = 0;

	public CyclicIterator(int[] a) {
		this.a = a;
	}

	@Override
	public boolean hasNext() {
		return true;
	}

	@Override
	public Integer next() {
		Integer retVal = new Integer(a[pos]);
		pos++;
		if (pos == a.length) {
			pos = 0;
		}
		return retVal;
	}
	
}
