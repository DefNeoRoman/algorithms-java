package interviewcake;

/**
Given an array_of_ints, find the highest_product you can get from three of the integers.
The input array_of_ints will always have at least three integers.
https://www.interviewcake.com/question/highest-product-of-3
 */
public class HighestProductOfThree {

	/**
	 * Greedy : O(n) time & O(1) space
	 */
	public int find1(int[] ints) {
		if (ints.length < 3) {
			throw new IllegalArgumentException("Less than 3 items.");
		}
		
	    // Except this one--we pre-populate it for the first /3/ items.
	    // This means in our first pass it'll check against itself, which is fine.
		int highestProductOf3 = ints[0] * ints[1] * ints[2];
		int highestProductOf2 = ints[0] * ints[1];
		int lowestProductOf2 = ints[0] * ints[1];
		int highest = Math.max(ints[0], ints[1]);
		int lowest = Math.min(ints[0], ints[1]);
		
		for (int i = 2; i < ints.length; i++) {
			int current = ints[i];
			highestProductOf3 = Math.max(highestProductOf3, Math.max(current * highestProductOf2, current * lowestProductOf2));
			highestProductOf2 = Math.max(highestProductOf2, Math.max(current * highest, current * lowest));
			lowestProductOf2 = Math.min(lowestProductOf2, Math.min(current * highest, current * lowest));
			highest = Math.max(current, highest);
			lowest = Math.min(current, lowest);
		}
		
		return highestProductOf3;
	}
	
	/**
	 * Brute Force : O(n3)
	 */
	public int find3(int[] ints) {
		if (ints.length < 3) {
			throw new IllegalArgumentException("Less than 3 items.");
		}
		
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < ints.length; i++) {
			for (int j = i + 1; j < ints.length; j++) {
				for (int k = j + 1; k < ints.length; k++) {
					max = Math.max(ints[i] * ints[j] * ints[k], max);
				}
			}
		}
		
		return max;
	}
	
}
