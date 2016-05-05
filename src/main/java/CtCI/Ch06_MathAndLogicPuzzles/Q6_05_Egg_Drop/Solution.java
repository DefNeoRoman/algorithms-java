package CtCI.Ch06_MathAndLogicPuzzles.Q6_05_Egg_Drop;

import org.junit.Test;

public class Solution {

	private static int breakingFloor = 89;
	private static int count = 0;

	public static boolean isEggBroken(int floor) {
		System.out.println(" - Drop it on " + floor);
		count++;
		boolean eggBroken = floor >= breakingFloor;
		if (eggBroken) {
			System.out.println("  -- break!!! --");
		}
		return eggBroken;
	}

	public static int findBreakingPoint(int breakingPoint) {
		int interval = 14;

		System.out.println("# First Egg");

		int firstEggBreakingFloor = interval;
		while (!isEggBroken(firstEggBreakingFloor)) {
			firstEggBreakingFloor += --interval;
		}

		System.out.println("# Second Egg");

		int secondEggBreakingFloor = firstEggBreakingFloor - interval + 1;
		while (!isEggBroken(secondEggBreakingFloor)) {
			secondEggBreakingFloor++;
		}

		System.out.println("Found the braking floor. : " + secondEggBreakingFloor);
		System.out.println("count : " + count);
		return count;
	}

	@Test
	public void test() {
		int breakingFloor = 89;
		findBreakingPoint(89);
	}

}
