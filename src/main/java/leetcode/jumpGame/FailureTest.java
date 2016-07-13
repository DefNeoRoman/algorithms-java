package leetcode.jumpGame;

import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class FailureTest {

	private Failure solution = new Failure();

	@Test
	public void test() {
		int[] nums = new int[]{2,3,1,1,4};
		assertTrue(solution.canJump(nums));
	}


	@Test
	public void test2() {
		int[] nums = new int[]{3,2,1,0,4};
		assertFalse(solution.canJump(nums));
	}

	@Test
	public void test3() {
		assertTrue(solution.canJump(new int[0]));
		assertTrue(solution.canJump(new int[]{0}));
	}

	// StackOverFlowError!
	@Test
	public void test4() {
		int[] nums = new int[10000];
		Arrays.fill(nums, 1);
		assertTrue(solution.canJump(nums));
	}

}