package assignment08;

import static org.junit.Assert.*;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class FactorizeTest {

	@Test
	public void test1() {
		ArrayList<Integer> test = new ArrayList<>();
		assertEquals(test, Factorize.factors(0));
	}
	
	@Test
	public void test2() {
		ArrayList<Integer> test = new ArrayList<>();
		assertEquals(test, Factorize.factors(1));
	}
	
	@Test
	public void test3() {
		Integer[] temp = {2, 2, 2, 2, 2, 2};
		ArrayList<Integer> test = new ArrayList<>(Arrays.asList(temp));
		assertEquals(test, Factorize.factors(64));
	}

	
	@Test
	public void test4() {
		ArrayList<Integer> test = new ArrayList<>();
		test.add(67);
		assertEquals(test, Factorize.factors(67));
	}
	
	@Test
	public void test5() {
		assertEquals("100110", Factorize.binary(38));
	}
	
	@Test
	public void test6() {
		assertEquals("100111", Factorize.binary(39));
	}
	
	@Test
	public void test7() {
		assertEquals("llun", Factorize.reverse(null));
	}
	
	@Test
	public void test8() {
		assertEquals("", Factorize.reverse(""));
	}
	
	@Test
	public void test9() {
		assertEquals("airotciV si eman ym ih", Factorize.reverse("hi my name is Victoria"));
	}
	
	@Test
	public void test10() {
		assertEquals(-1, Factorize.indexOf("Hello", "bee"));
	}
	
	@Test
	public void test11() {
		assertEquals(10, Factorize.indexOf("victoriahhhellobye", "hello"));
	}
	
	@Test
	public void test12() {
		Point2D.Double[] pts = 
			{new Point2D.Double(1,3), new Point2D.Double(2,2),
			new Point2D.Double(2,1), new Point2D.Double(1,0),
			new Point2D.Double(0,1), new Point2D.Double(0,2)};
		assertEquals(4.0, Factorize.area(pts), 1e-6);
	}


}
