package lab07;

public class RepeatIterator implements IntIterator {
	private int a;
	
	public RepeatIterator(int a) {
		//super();
		this.a = a;
	}

	@Override
	public boolean hasNext() {
		return true;
	}

	@Override
	public Integer next() {
		return a;
	}

}
