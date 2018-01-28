package lab06;

public class Zipper {
	public static int[] zip(int[] arr1, int[] arr2) {
		if (arr1 == null || arr2 == null || arr1.length != arr2.length) {
			throw new IllegalArgumentException("bad input");
		}
		int[] returnArray = new int[0];
		int arr1Counter = 0;
		int arr2Counter = 0;
		if (arr1.length > 0) {
			returnArray = new int[arr1.length + arr2.length];
			for (int i = 0; i < returnArray.length; i+=2) {
				returnArray[i] = arr1[arr1Counter];
				returnArray[i+1] = arr2[arr2Counter];
				arr1Counter++;
				arr2Counter++;
			}
		}
		return returnArray;
	}
}
