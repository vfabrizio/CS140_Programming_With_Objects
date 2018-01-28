package assignment09;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class QSortTester {

	@Test
	public void testNull() {
		assertNull(Sorting.qsort(null));
	}
	
	@Test
	public void testEmpty() {
		ArrayList<Integer> list1 = new ArrayList<>();
		assertEquals(list1, Sorting.qsort(list1));
	}
	
	@Test
	public void testSorted() {
		ArrayList<Integer> list1 = new ArrayList<>(
				Arrays.asList(2, 4, 4, 6, 8, 9, 9));
		assertEquals(list1, Sorting.qsort(list1));
	}
	
	@Test
	public void testNotSorted() {
		ArrayList<Integer> list1 = new ArrayList<>(
				Arrays.asList(2, 9, 4, 16, 8, 2, 19));
		ArrayList<Integer> list2 = new ArrayList<>(
				Arrays.asList(2, 2, 4, 8, 9, 16, 19));
		assertEquals(list2, Sorting.qsort(list1));
	}

}
