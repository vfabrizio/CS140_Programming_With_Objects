package assignment03;

public class Assig3 {
	public static boolean hasNegative(double[] arr) {
		boolean returnValue = false;
		if (arr != null && arr.length > 0) {
			for (int i = 0; i < arr.length && !returnValue; i++) {
				if (arr[i] < 0) {
					returnValue = true;
				}
			}
		}
		return returnValue;
	}

	public static int indexOf(double value, double[] arr) {
		int returnValue = -3;
		if (arr != null) {
			returnValue = -2;
			if (arr.length > 0) {
				for (int i = 0; i < arr.length && returnValue < 0; i++) {
					if (Math.abs(value - arr[i]) < 1e-9) {
						returnValue = i;
					} else {
						returnValue = -1;
					}
				}
			}
		}
		return returnValue;
	}

	public static int indexOf2(double value, double[] arr) {
		if (arr == null) {
			return -3;
		}
		if (arr.length <= 0) {
			return -2;
		}
		for (int i = 0; i < arr.length; i++) {
			if (Math.abs(value - arr[i]) < 1e-9) {
				return i;
			}
		}
		return -1;
	}

	public static int indexOf3(int value, int[] arr) {
		int returnValue = -arr.length-1;
		for (int i = 0; i < arr.length &&
				returnValue == -arr.length-1; i++) {
			if (value == arr[i]) {
				returnValue = i;
			}
			else if (arr[i] > value) {
				returnValue = -i-1;
			}
		}
		if (value < arr[0]) {
			returnValue = -1;
		}
		return returnValue;
	}

	public static int[] insertIfNeeded(int value, int[] arr) {
		int k = indexOf3(value, arr);
		if (k >= 0) {
			return arr;
		} else {
			int[] arr1 = new int[arr.length+1];
			System.arraycopy(arr, 0, arr1, 0, -k-1);
			arr1[-k-1] = value;
			System.arraycopy(arr, -k-1, arr1, -k, arr.length+k+1);
			return arr1;
		}
	}
}