package leetcode.moveZeroes;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author 서대영(DAEYOUNG SEO)/Onestore/SKP
 */
public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void testMoveZeroes() {
		int[] arr = new int[]{0, 1, 0, 3, 12};
		solution.moveZeroes(arr);
		assertArrayEquals(new int[]{1, 3, 12, 0, 0}, arr);
	}

	@Test
	public void testMoveZeroes2() {
		int[] arr = new int[]{0, 0, 1};
		solution.moveZeroes(arr);
		assertArrayEquals(new int[]{1, 0, 0}, arr);
	}

}