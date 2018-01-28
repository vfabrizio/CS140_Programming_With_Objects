package assignment09;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class SelectionTester {

	@Test
	public void testNull() {
		assertNull(Sorting.selection(null));
	}

	
	@Test
	public void testEmpty() {
		ArrayList<Integer> list = new ArrayList<>();
		assertEquals(list, Sorting.selection(list));
	}
	
	@Test
	public void test1() {
		ArrayList<Integer> list1 = new ArrayList<>(
				Arrays.asList(2, 17, 4, 10, 9, 5));
		ArrayList<Integer> list2 = new ArrayList<>(
				Arrays.asList(2, 4, 5, 9, 10, 17));
		assertEquals(list2, Sorting.selection(list1));
	}
	
	
}
