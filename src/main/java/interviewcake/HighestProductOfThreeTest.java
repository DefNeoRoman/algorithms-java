package interviewcake;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HighestProductOfThreeTest {
	
	HighestProductOfThree svc = new HighestProductOfThree();

	@Test
	public void test1() {
		int[] ints = {-10, -10 , 1, 3, 2};
		assertEquals(300, svc.find1(ints));
		assertEquals(300, svc.find3(ints));
	}
	
	@Test
	public void test2() {
		int[] ints = {1, 10, -5, 1, -100};
		assertEquals(5000, svc.find1(ints));
		assertEquals(5000, svc.find3(ints));
	}
	
}
