package CtCI.Ch08_RecursionAndDynamicProgramming.Q8_04_Power_Set;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MySolution2 {

	@Test
	public void test() {
		List<Integer> set = Arrays.asList(0, 1, 2, 3 );
		List<List<Integer>> subSets = getSubsets(set);
		System.out.println("SubSets : " + subSets);
	}

	public static List<List<Integer>> getSubsets(List<Integer> set) {
		int numOfSubsets = (int) Math.pow(2, set.size());
		List<List<Integer>> subsets = new ArrayList<>(numOfSubsets);

		for (int i = 0; i < numOfSubsets; i++) {
			List<Integer> subset = convertToSubset(i, set);
			subsets.add(subset);
		}

		return subsets;
	}

	private static List<Integer> convertToSubset(int i, List<Integer> set) {
		List<Integer> subset = new ArrayList<>();

		int pos = 0;
		while (i > 0) {
			if (i % 2 == 1) {
				subset.add(set.get(pos));
			}
			i /= 2;
			pos++;
		}

		return subset;
	}

}
