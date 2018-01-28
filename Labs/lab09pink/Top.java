package lab09pink;

public class Top {
	private int[] arr;
	
	public Top(int[] arr) {
		this.arr = arr;
	}
	
	public double average() {
		double avg = 0.0;
		double sum = 0.0;
		if (arr != null && arr.length > 0) {
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
			}
			avg = sum / arr.length;
		}
		return avg;
	}
	
	public int max() {
		int retVal = Integer.MIN_VALUE;
		if (arr != null && arr.length > 0) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > retVal) {
					retVal = arr[i];
				}
			}
		}
		return retVal;
	}
}
