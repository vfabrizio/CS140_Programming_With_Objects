package lab08;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Tests {

	@Test
	public void testFactorialNum() {
		assertEquals(120, Recursion.factorial(5));
	}
	@Test
	public void testFactorialBase0() {
		assertEquals(1, Recursion.factorial(0));
	}
	@Test
	public void testFactorialBase1() {
		assertEquals(1, Recursion.factorial(1));
	}
	
	@Test
	public void testSquareRootPerf() {
		assertEquals(2.0, Recursion.squareRoot(4.0), 1e-6);
	}
	@Test
	public void testSquareRoot0() {
		assertEquals(0.0, Recursion.squareRoot(0.0), 1e-6);
	}
	
	@Test
	public void testSumArrayList() {
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3));
		assertEquals(6, Recursion.sum(nums));
	}
	
	@Test
	public void testSumArray() {
		int[] nums = {4, 5, 6};
		assertEquals(15, Recursion.sum(nums));
	}
	
	@Test
	public void testBinomialCoeff() {
		assertEquals(4, Recursion.binomialCoefficient(4, 1));
	}
	@Test
	public void testBinomialCoeff2() {
		assertEquals(4, Recursion.binomialCoefficient(4, 3));
	}

}
