package assignment04;

import java.util.ArrayList;
import java.util.Arrays;
import static assignment04.ArrayListsPractice.*;

public class ArrayListsTester {
	public static void main(String[] args){
		ArrayList<Integer> a1 = null;
		ArrayList<Integer> a2 = new ArrayList<>();
		ArrayList<Integer> a3 = new ArrayList<>();
		a3.add(1);
		a3.add(2);
		a3.add(2);
		a3.add(3);
		a3.add(4);
		a3.add(5);
		ArrayList<Integer> a4 = new ArrayList<>();
		a4.add(1);
		a4.add(2);
		a4.add(3);
		a4.add(4);
		a4.add(5);
		ArrayList<Integer> a5 = new ArrayList<>();
		a5.add(1);
		a5.add(3);
		a5.add(4);
		a5.add(2);
		a5.add(5);
		ArrayList<Integer> a6 = new ArrayList<>();
		a6.add(8);
		a6.add(9);
		a6.add(12);
		ArrayList<Integer> a7 = new ArrayList<>();
		a7.add(5);
		a7.add(null);
		a7.add(10);
		a7.add(null);
		a7.add(15);
		ArrayList<Integer> a8 = new ArrayList<>();
		a8.add(null);
		a8.add(null);
		a8.add(null);

		System.out.println("Test isNonDecreasing:");
		test(true, isNonDecreasing(a1));
		test(true, isNonDecreasing(a2));
		test(true, isNonDecreasing(a3));
		test(false, isNonDecreasing(a5));
		test(true, isNonDecreasing(a7));
		test(true, isNonDecreasing(a8));

		System.out.println("\nTest isIncreasing:");
		test(true, isIncreasing(a1));
		test(true, isIncreasing(a2));
		test(false, isIncreasing(a3));
		test(true, isIncreasing(a4));
		test(true, isIncreasing(a7));
		test(true, isIncreasing(a8));

		System.out.println("\nTest reverse:");
		test("null", reverse(a1));
		test("[]", reverse(a2));
		test("[5, 4, 3, 2, 2, 1]", reverse(a3));
		test("[5, 4, 3, 2, 1]", reverse(a4));
		test("[15, null, 10, null, 5]", reverse(a7));
		test("[null, null, null]", reverse(a8));

		System.out.println("\nTest concatenate:");
		try {
    		concatenate(null, null);
    		System.out.println("test failed - exception not thrown");
		} catch(IllegalArgumentException e) {
    		System.out.println("Exception = " + e);
		}
		test("[1, 2, 3, 4, 5]", concatenate(a2, a4));
		test("[1, 3, 4, 2, 5]", concatenate(a5, a2));
		test("[1, 3, 4, 2, 5, 1, 2, 2, 3, 4, 5]", concatenate(a5, a3));
		test("[8, 9, 12, 1, 2, 3, 4, 5]", concatenate(a6, a4));
		test("[8, 9, 12, 5, null, 10, null, 15]", concatenate(a6, a7));
		test("[null, null, null, 8, 9, 12]", concatenate(a8, a6));

		System.out.println("\nTest endToEnd:");
		try {
    		endToEnd(null, null);
    		System.out.println("test failed - exception not thrown");
		} catch(IllegalArgumentException e) {
    		System.out.println("Exception = " + e);
		}
		test("[5, 4, 3, 2, 1]", endToEnd(a2, a4));
		test("[1, 3, 4, 2, 5]", endToEnd(a5, a2));
		test("[1, 3, 4, 2, 5, 5, 4, 3, 2, 2, 1]", endToEnd(a5, a3));
		test("[1, 2, 3, 4, 5, 12, 9, 8]", endToEnd(a4, a6));
		test("[8, 9, 12, 15, null, 10, null, 5]", endToEnd(a6, a7));
		test("[null, null, null, 12, 9, 8]", endToEnd(a8, a6));

		System.out.println("\nTest reverseInPlace:");
		reverseInPlace(a1);
		test("null", a1);
		reverseInPlace(a2);
		test("[]", a2);
		reverseInPlace(a3);
		test("[5, 4, 4, 3, 2, 1]", a3);
		reverseInPlace(a4);
		test("[5, 4, 3, 2, 1]", a4);
		reverseInPlace(a7);
		test("[15, null, 10, null, 5]", a7);
		reverseInPlace(a8);
		test("[null, null, null]", a8);

	}

	public static void test(String expected, ArrayList<Integer> actual) {
		if (actual != null) {
		    System.out.println("Expected: " + expected +
			               ", received: " 
			               + Arrays.toString(actual.toArray()));
		}else{
			System.out.println("Expected: " + expected + ", received: null");
		}
	}

	public static void test(ArrayList<Integer> expected,
							ArrayList<Integer> actual) {
		if (actual != null) {
		    System.out.println("Expected: " + Arrays.toString(expected.toArray())
			               + ", received: " + Arrays.toString(actual.toArray()));
		}else{
			System.out.println("Expected: " + Arrays.toString(expected.toArray())
			               + ", received: null");
		}
	}

	public static void test(boolean expected, boolean actual) {
	    System.out.println("Expected: " + expected + ", received: " 
	    	+ actual);
	}
}
