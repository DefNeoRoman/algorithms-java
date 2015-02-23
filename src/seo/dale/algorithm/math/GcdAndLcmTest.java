package seo.dale.algorithm.math;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GcdAndLcmTest {

	private GcdAndLcm gcd = new GcdAndLcm();
	
	@Test
	public void testGetGcd() {
		assertEquals(2, gcd.getGcd(6, 8));
		assertEquals(4, gcd.getGcd(16, 20));
		assertEquals(146, gcd.getGcd(2336, 1314));
	}
	
	@Test
	public void testGetGcdEnhanced() {
		assertEquals(2, gcd.getGcdEnhanced(6, 8));
		assertEquals(4, gcd.getGcdEnhanced(16, 20));
		assertEquals(146, gcd.getGcdEnhanced(2336, 1314));
		assertEquals(146, gcd.getGcdEnhanced(1314, 2336));
	}
	
	@Test
	public void testGetLcm() {
		assertEquals(24, gcd.getLcm(6, 8));
		assertEquals(80, gcd.getLcm(16, 20));
		assertEquals(21024, gcd.getLcm(2336, 1314));
	}

}
