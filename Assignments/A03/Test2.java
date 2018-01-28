package assignment03;

import java.util.Arrays;

public class Test2 {
	public static void main(String[] args){
		double[] array1 = null;
		double[] array2 = {};
		double[] array3 = {4.0689, 4.03, 4.075, 4.07, 4.069, 4.071};
		double[] array4 = {10.0, 9.0, 4.0, 17.0};
		Assig3 a1 = new Assig3();

		System.out.println("Array 1 = " + Arrays.toString(array1));
		System.out.println("Array 2 = " + Arrays.toString(array2));
		System.out.println("Array 3 = " + Arrays.toString(array3));
		System.out.println("Array 4 = " + Arrays.toString(array4));

		System.out.println("\nIndex of value close to 4.07 for Array 1: "
							+ a1.indexOf(4.07, array1));
		System.out.println("Index of value close to 4.07 for Array 2: "
							+ a1.indexOf(4.07, array2));
		System.out.println("Index of value close to 4.07 for Array 3: "
							+ a1.indexOf(4.07, array3));
		System.out.println("Index of value close to 4.07 for Array 4: "
							+ a1.indexOf(4.07, array4));

		System.out.println("\nIndex of value close to 4.07 for Array 1: "
							+ a1.indexOf2(4.07, array1));
		System.out.println("Index of value close to 4.07 for Array 2: "
							+ a1.indexOf2(4.07, array2));
		System.out.println("Index of value close to 4.07 for Array 3: "
							+ a1.indexOf2(4.07, array3));
		System.out.println("Index of value close to 4.07 for Array 4: "
							+ a1.indexOf2(4.07, array4));

		int[] array5 = {2, 2, 3, 5, 6, 7, 7};
		System.out.println("\nArray 5 = " + Arrays.toString(array5));
		System.out.println("\nIndex of value 7 in Array 5: " +
							a1.indexOf3(7, array5));
		System.out.println("Index of value 4 in Array 5: " +
							a1.indexOf3(4, array5));
		System.out.println("Index of value 8 in Array 5: " +
							a1.indexOf3(8, array5));
		System.out.println("Index of value 1 in Array 5: " +
							a1.indexOf3(1, array5));

		System.out.println("\nValue 5 is in Array 5 = " +
						Arrays.toString(a1.insertIfNeeded(5, array5)));
		System.out.println("Value 4 is in Array 5 = " +
						Arrays.toString(a1.insertIfNeeded(4, array5)));
	}
}