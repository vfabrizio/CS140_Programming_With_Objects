package lab06;

public class TwoInts extends OneInt {
	private int two;

	public TwoInts(int one, int two) {
		super(one);
		this.two = two;
	}

	@Override
	public int sum() {
		return super.sum() + two;
	}

	@Override
	public String toString() {
		return "(" + super.toString() + ", " + two + ")";
	}
}
