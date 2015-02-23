package seo.dale.algorithm.math;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BaseTest {

	private Base base = new Base();
	
	@Test
	public void testFromDecimal() {
		assertEquals(101011, base.fromDecimal(43, 2));
	}
	
	@Test
	public void testFromDecimal2() {
		assertEquals("101011", base.fromDecimal2(43, 2));
		assertEquals("2B", base.fromDecimal2(43, 16));
	}
	
	@Test
	public void testToDecimal() {
		assertEquals(1011, base.toDecimal(1011, 10));
		assertEquals(11, base.toDecimal(1011, 2));
	}
	
	@Test
	public void testToDecimal2() {
		assertEquals(1011, base.toDecimal2(1011, 10));
		assertEquals(11, base.toDecimal2(1011, 2));
	}

}
