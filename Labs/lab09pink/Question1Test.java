package lab09pink;

import static org.junit.Assert.*;

import org.junit.Test;

public class Question1Test {

	@Test
	public void test0() {
		assertEquals("0 = 0", new Question1(0).toString());
	}
	
	@Test
	public void test1() {
		assertEquals("1 = 1", new Question1(1).toString());
	}
	
	@Test
	public void test2() {
		assertEquals("37 = 37", new Question1(37).toString());
	}
	
	@Test
	public void test3() {
		assertEquals("168 = 2 x 2 x 2 x 3 x 7", new Question1(168).toString());
	}

}
