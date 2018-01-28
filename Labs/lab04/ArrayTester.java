package lab04;

import java.util.Arrays;
import static lab04.ArrayPractice.*;

public class ArrayTester {
	public static void main(String[] args){
		int[] a1 = null;
		int[] a2 = {};
		int[] a3 = {1, 2, 3, 4, 4, 5};
		int[] a4 = {1, 2, 3, 4, 5};
		int[] a5 = {1, 3, 4, 2, 5};
		int[] a6 = {8, 9, 12};

		System.out.println("Test isNonDecreasing:");
		test(true, isNonDecreasing(a1));
		test(true, isNonDecreasing(a2));
		test(true, isNonDecreasing(a3));
		test(false, isNonDecreasing(a5));

		System.out.println("\nTest isIncreasing:");
		test(true, isIncreasing(a1));
		test(true, isIncreasing(a2));
		test(false, isIncreasing(a3));
		test(true, isIncreasing(a4));

		System.out.println("\nTest reverse:");
		test("null", reverse(a1));
		test("[]", reverse(a2));
		test("[5, 4, 4, 3, 2, 1]", reverse(a3));
		test("[5, 4, 3, 2, 1]", reverse(a4));

		System.out.println("\nTest concatenate:");
		try {
    		concatenate(null, null);
    		System.out.println("test failed - exception not thrown");
		} catch(IllegalArgumentException e) {
    		System.out.println("Exception = " + e);
		}
		test("[1, 2, 3, 4, 5]", concatenate(a2, a4));
		test("[1, 3, 4, 2, 5]", concatenate(a5, a2));
		test("[1, 3, 4, 2, 5, 1, 2, 3, 4, 4, 5]", concatenate(a5, a3));
		test("[8, 9, 12, 1, 2, 3, 4, 5]", concatenate(a6, a4));

		System.out.println("\nTest endToEnd:");
		try {
    		endToEnd(null, null);
    		System.out.println("test failed - exception not thrown");
		} catch(IllegalArgumentException e) {
    		System.out.println("Exception = " + e);
		}
		test("[5, 4, 3, 2, 1]", endToEnd(a2, a4));
		test("[1, 3, 4, 2, 5]", endToEnd(a5, a2));
		test("[1, 3, 4, 2, 5, 5, 4, 4, 3, 2, 1]", endToEnd(a5, a3));
		test("[1, 2, 3, 4, 5, 12, 9, 8]", endToEnd(a4, a6));

		System.out.println("\nTest reverseInPlace:");
		reverseInPlace(a1);
		test("null", a1);
		reverseInPlace(a2);
		test("[]", a2);
		reverseInPlace(a3);
		test("[5, 4, 4, 3, 2, 1]", a3);
		reverseInPlace(a4);
		test("[5, 4, 3, 2, 1]", a4);
	}

	public static void test(String expected, int[] actual) {
	    System.out.println("Expected: " + expected +
		               ", received: " + Arrays.toString(actual));
	}

	public static void test(int[] expected, int[] actual) {
	    System.out.println("Expected: " + Arrays.toString(expected) +
		               ", received: " + Arrays.toString(actual));
	}

	public static void test(boolean expected, boolean actual) {
	    System.out.println("Expected: " + expected + ", received: " + 					actual);
	}
}
