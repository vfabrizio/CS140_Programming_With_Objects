package assignment08;

import static org.junit.Assert.*;
import org.junit.Test;

public class RectangleTest {

	@Test
	public void test1() {
		Rectangle rect1 = new Rectangle(0, 5);
		assertEquals(0, rect1.getArea());
	}
	
	@Test
	public void test2() {
		Rectangle rect2 = new Rectangle(5, 0);
		assertEquals(0, rect2.getArea());
	}
	
	@Test
	public void test3() {
		Rectangle rect3 = new Rectangle(6, 7);
		assertEquals(42, rect3.getArea());
	}

}
