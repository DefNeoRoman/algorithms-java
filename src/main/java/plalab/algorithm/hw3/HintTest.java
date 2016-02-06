package plalab.algorithm.hw3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
정수와 음수를 담은 배열이 주어졌을 때, 그 모든 원소의 합이 최대가 되는 부분 배열의 원소의 합을 구하는 코드를 작성하라.
 */
public class HintTest {

	@Test
	public void testMaxArray() {
		assertEquals(1, Hint.maxArray(new int[]{1}));
		assertEquals(3, Hint.maxArray(new int[]{1, 2}));
		assertEquals(3, Hint.maxArray(new int[]{-1, 1, 2}));
		assertEquals(20, Hint.maxArray(new int[]{-2, -1, 1, 2, 3, 4, 10, -20}));
	}
	
	@Test
	public void testMaxArray2() {
		assertEquals(1, Hint.maxArray2(new int[]{1}));
		assertEquals(3, Hint.maxArray2(new int[]{1, 2}));
		assertEquals(3, Hint.maxArray2(new int[]{-1, 1, 2}));
		assertEquals(20, Hint.maxArray2(new int[]{-2, -1, 1, 2, 3, 4, 10, -20}));
	}

	@Test
	public void testMaxArray3() {
		assertEquals(1, Hint.maxArray3(new int[]{1}));
		assertEquals(3, Hint.maxArray3(new int[]{1, 2}));
		assertEquals(3, Hint.maxArray3(new int[]{-1, 1, 2}));
		assertEquals(20, Hint.maxArray3(new int[]{-2, -1, 1, 2, 3, 4, 10, -20}));
	}

}
