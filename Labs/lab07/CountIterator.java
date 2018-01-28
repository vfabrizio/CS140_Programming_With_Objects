package lab07;

public class CountIterator implements IntIterator {
	private int start;
	private int step;
	private int stop = -1;

	public CountIterator(int start, int step) {
		this.start = start;
		this.step = step;
	}

	public CountIterator(int start, int step, int stop) {
		super();
		this.start = start;
		this.step = step;
		this.stop = stop;
	}

	@Override
	public boolean hasNext() {
		boolean retVal = true;
		if (stop != -1) {
			if (start >= stop) {
				retVal = false;
			}
		}
		return retVal;
	}

	@Override
	public Integer next() {
		Integer retVal = new Integer(start);
		start += step;
		return retVal;
	}

}
