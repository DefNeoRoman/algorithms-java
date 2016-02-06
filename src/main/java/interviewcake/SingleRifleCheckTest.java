package interviewcake;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SingleRifleCheckTest {

	SingleRifleCheck svc = new SingleRifleCheck();
	
	int[] half1 = {1, 2, 3, 4, 5};
	int[] half2 = {6, 7, 8, 9, 0};
	
	@Test
	public void test1() {
		int[] shuffledDeck1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		assertTrue(svc.isSingleRiffleRecursive(half1, half2, shuffledDeck1));
		assertTrue(svc.isSingleRiffleRecursive2(half1, half2, shuffledDeck1, 0, 0, 0));
		assertTrue(svc.isSingleRiffleRecursive3(half1, half2, shuffledDeck1));
	}
	
	@Test
	public void test2() {
		int[] shuffledDeck2 = {6, 7, 8, 9, 0, 1, 2, 3, 4, 5};
		assertTrue(svc.isSingleRiffleRecursive(half1, half2, shuffledDeck2));
		assertTrue(svc.isSingleRiffleRecursive2(half1, half2, shuffledDeck2, 0, 0, 0));
		assertTrue(svc.isSingleRiffleRecursive3(half1, half2, shuffledDeck2));
	}
	
	@Test
	public void test3() {
		int[] shuffledDeck3 = {1, 6, 2, 7, 3, 8, 4, 9, 5, 0};
		assertTrue(svc.isSingleRiffleRecursive(half1, half2, shuffledDeck3));
		assertTrue(svc.isSingleRiffleRecursive2(half1, half2, shuffledDeck3, 0, 0, 0));
		assertTrue(svc.isSingleRiffleRecursive3(half1, half2, shuffledDeck3));
	}
	
	@Test
	public void test4() {
		int[] shuffledDeck4 = {6, 7, 1, 2, 3, 8, 9, 4, 5, 0};
		assertTrue(svc.isSingleRiffleRecursive(half1, half2, shuffledDeck4));
		assertTrue(svc.isSingleRiffleRecursive2(half1, half2, shuffledDeck4, 0, 0, 0));
		assertTrue(svc.isSingleRiffleRecursive3(half1, half2, shuffledDeck4));
	}
	
	@Test
	public void test5() {
		int[] shuffledDeck5 = {1, 2, 8, 4, 5, 6, 7, 3, 9, 0};
		assertFalse(svc.isSingleRiffleRecursive(half1, half2, shuffledDeck5));
		assertFalse(svc.isSingleRiffleRecursive2(half1, half2, shuffledDeck5, 0, 0, 0));
		assertFalse(svc.isSingleRiffleRecursive3(half1, half2, shuffledDeck5));
	}

}
