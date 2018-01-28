package assignment04;

import java.util.ArrayList;

public class ArrayListsPractice {
	 /**
	 * Determines if an ArrayLists's elements are in non-decreasing order.
	 * The ArrayList {1, 2, 2, 3, 4} is in non-decreasing order while
	 * the ArrayList {1, 3, 4, 2, 5} is not in non-decreasing order as 2 < 4.
	 * A null or empty ArrayList is by default in non-decreasing order.
	 * @param arrList the ArrayList to inspect
	 * @return true  if the ArrayList's elements are in non-decreasing order,
	 *               or the ArrayList is null or empty
	 *         false otherwise
	 */
	public static boolean isNonDecreasing(ArrayList<Integer> arrList) {
		boolean returnValue = true;
		if (arrList != null && arrList.size() > 0) {
			for (int i = 0; i < arrList.size()-1 && returnValue; i++) {
				if (arrList.get(i+1) != null && arrList.get(i) != null) {
					if (arrList.get(i+1) < arrList.get(i)) {
				    	returnValue = false;
					}
				}
			}
		}
		return returnValue;
	}

	/**
	 * Determines if an ArrayList's elements are in strictly increasing order.
	 * The ArrayList {1, 2, 3, 4, 5} is in increasing order while
	 * the ArrayList {1, 2, 2, 4, 5} is not in increasing order as 2 == 2.
	 * A null or empty ArrayList is by default in increasing order.
	 * @param arrList the ArrayList to inspect
	 * @return true  if the ArrayList's elements are in increasing order,
	 *               or the ArrayList is null or empty
	 *         false otherwise
	 */
	public static boolean isIncreasing(ArrayList<Integer> arrList) {
		boolean returnValue = true;
		if (arrList != null && arrList.size() > 0) {
			for (int i = 0; i < arrList.size()-1 && returnValue; i++) {
				if (arrList.get(i+1) != null && arrList.get(i) != null) {
					if (arrList.get(i+1) <= arrList.get(i)) {
			    		returnValue = false;
					}
				}
			}
		}
		return returnValue;
	}

	/**
	 * Computes the reverse an ArrayList.
	 * The reverse of a null ArrayList is null.
	 * The reverse of an empty ArrayList is the empty ArrayList.
	 * Do NOT use reverseInPlace in the implementation of reverse
	 * @param arrList the ArrayList whose elements are to be reversed
	 * @return an ArrayList holding the contents of ArrayList in reverse order
	 */
	public static ArrayList<Integer> reverse(ArrayList<Integer> arrList) {
		ArrayList<Integer> returnArray = null;
		if (arrList != null){
			returnArray = new ArrayList<>();
			if (arrList.size() > 0){
				for (int i = 0; i < arrList.size(); i++){
					returnArray.add(arrList.get(arrList.size()-1-i));
				}
			}
		}
		return returnArray;
	}

	/**
	 * Computes an ArrayList that is all the elements of arrList1 in the order they appear,
	 * followed by the elements of arrList2 in the order they appear.
	 * An empty ArrayList should contribute no elements to the
	 * concatenated ArrayList.
	 * e.g. concatenate({6, 3, 8}, {10, 1, 7}) should return {6, 3, 8, 10, 1, 7}
	 * @param arrList1 the first ArrayList
	 * @param arrList2 the second ArrayList
	 * @return an ArrayList that is all the elements of arrList1 in order,
	 *         followed by the elements of arrList2 in order.
	 * @throws IllegalArgumentException if arrList1 or arrList2 is null
	 */
	public static ArrayList<Integer> concatenate(ArrayList<Integer> arrList1, 
									ArrayList<Integer> arrList2) {
		ArrayList<Integer> returnArray = new ArrayList<>();
		if (arrList1 != null || arrList2 != null){
			if (arrList1.size() > 0) {
				for (int i = 0; i < arrList1.size(); i++) {
					returnArray.add(arrList1.get(i));
				}
			}
			if (arrList2.size() > 0) {
				for (int j = 0; j < arrList2.size(); j++) {
					returnArray.add(arrList2.get(j));
				}
			}
		}else {
			throw new IllegalArgumentException("Can't concatenate null"
				+ " ArrayLists");
		}
		return returnArray;
	}

	/**
	 * Computes an array that is all the elements of arr1 in the order they appear,
	 * followed by the elements of arr2 in the reverse order they appear
	 * An empty array should contribute no elements to the resulting
	 * array.
	 * e.g. endToEnd({6, 3, 8}, {10, 1, 7}) should return {6, 3, 8, 7, 1, 10}
	 * HINT: this method can use other methods in this class to assist it.
	 *       ideally, this method is one short line of code.
	 * @param arr1 the first array
	 * @param arr2 the second array
	 * @return an array that is all the elements of arr1 in order,
	 * followed by the elements of arr2 in reverse order
	 * @throws IllegalArgumentException if arr1 or arr2 is null
	 */
	public static ArrayList<Integer> endToEnd(ArrayList<Integer> arrList1, 
									ArrayList<Integer> arrList2) {
		return concatenate(arrList1, reverse(arrList2));
	}

	/**
	 * Reverses the given array in-place.
	 * Zero credit if another array is made.
	 * The reverse of a null array is null.
	 * The reverse of an empty array is the empty array.
	 * Do NOT use reverse in the implementation of reverseInPlace
	 * HINT: since we cannot make another array, we will have to swap certain
	 *       elements one-by-one.
	 * @param array the array to reverse
	 */
	public static void reverseInPlace(ArrayList<Integer> arrList) {
		if (arrList != null && arrList.size() > 0) {
			for (int i = 0; i < arrList.size()/2; i++) {
				Integer element = arrList.get(i);
				arrList.set(i, arrList.get(arrList.size()-1-i));
				arrList.set(arrList.size()-1-i, element);
			}
		}
	}
}
