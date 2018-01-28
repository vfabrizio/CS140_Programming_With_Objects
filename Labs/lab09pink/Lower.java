package lab09pink;

public class Lower extends Top {
	private int[] arr1;
	
	public Lower(int[] arr, int[] arr1) {
		super(arr);
		this.arr1 = arr1;
	}
	
	@Override
	public double average() {
		return new Top(arr1).average();
	}
	
	@Override
	public int max() {
		return Math.max(super.max(), new Top(arr1).max());
	}

}
