package lab09pink;

import static org.junit.Assert.*;

import org.junit.Test;

public class TopLowerTest {
	int[] test1 = null;
	int[] test2 = {};
	int[] test3 = {5, 2, -2, 7, -5, 2};

	@Test
	public void testAverage1() {
		assertEquals(0.0, new Top(test1).average(), 1e-6);
	}
	
	@Test
	public void testAverage2() {
		assertEquals(0.0, new Top(test2).average(), 1e-6);
	}
	
	@Test
	public void testAverage3() {
		assertEquals(1.5, new Top(test3).average(), 1e-6);
	}
	
	@Test
	public void testAverage4() {
		assertEquals(0.0, new Lower(test1, test2).average(), 1e-6);
	}
	
	@Test
	public void testAverage5() {
		assertEquals(0.0, new Lower(test2, test1).average(), 1e-6);
	}
	
	@Test
	public void testAverage6() {
		assertEquals(1.5, new Lower(test1, test3).average(), 1e-6);
	}
	
	@Test
	public void testAverage7() {
		assertEquals(0.0, new Lower(test3, test1).average(), 1e-6);
	}
	
	@Test
	public void testAverage8() {
		assertEquals(1.5, new Lower(test2, test3).average(), 1e-6);
	}
	
	@Test
	public void testAverage9() {
		assertEquals(0.0, new Lower(test3, test2).average(), 1e-6);
	}
	
	@Test
	public void testMax1() {
		assertEquals(-2147483648, new Top(test1).max());
	}
	
	@Test
	public void testMax2() {
		assertEquals(-2147483648, new Top(test2).max());
	}
	
	@Test
	public void testMax3() {
		assertEquals(7, new Top(test3).max());
	}
	
	@Test
	public void testMax4() {
		assertEquals(-2147483648, new Lower(test1, test2).max());
	}
	
	@Test
	public void testMax5() {
		assertEquals(-2147483648, new Lower(test2, test1).max());
	}
	
	@Test
	public void testMax6() {
		assertEquals(7, new Lower(test1, test3).max());
	}
	
	@Test
	public void testMax7() {
		assertEquals(7, new Lower(test3, test1).max());
	}
	
	@Test
	public void testMax8() {
		assertEquals(7, new Lower(test2, test3).max());
	}
	
	@Test
	public void testMax9() {
		assertEquals(7, new Lower(test3, test2).max());
	}

}
