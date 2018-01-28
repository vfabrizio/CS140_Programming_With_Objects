package assignment09;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class InOrderTester {

	@Test
	public void testNull() {
		assertEquals(true, Sorting.inOrder(null));
	}
	
	@Test
	public void testEmpty() {
		ArrayList<Integer> list1 = new ArrayList<>();
		assertEquals(true, Sorting.inOrder(list1));
	}
	
	@Test
	public void testSorted() {
		ArrayList<Integer> list1 = new ArrayList<>(
				Arrays.asList(2, 4, 4, 6, 8, 9, 9));
		assertEquals(true, Sorting.inOrder(list1));
	}
	
	@Test
	public void testNotSorted() {
		ArrayList<Integer> list1 = new ArrayList<>(
				Arrays.asList(2, 9, 4, 16, 8, 9, 19));
		assertEquals(false, Sorting.inOrder(list1));
	}

}
