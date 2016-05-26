package CtCI.Ch08_RecursionAndDynamicProgramming.Q8_04_Power_Set;

import org.junit.Test;

import java.util.*;

public class MySolution {

	@Test
	public void test() {
		List<Integer> set = Arrays.asList(0, 1, 2, 3 );
		List<List<Integer>> subSets = getSubsets(set);
		System.out.println("SubSets : " + subSets);
	}

	public static List<List<Integer>> getSubsets(List<Integer> set) {
		return getSubsets(set, set.size() - 1);
	}

	public static List<List<Integer>> getSubsets(List<Integer> set, int index) {
		if (index < 0) {
			List<List<Integer>> subsets = new ArrayList<>();
			subsets.add(new ArrayList<>());
			return subsets;
		}

		List<List<Integer>> lowerSubsets = getSubsets(set, index - 1);
		List<List<Integer>> currentSubsets = new ArrayList<>(lowerSubsets.size());

		// Add new sets
		for (List<Integer> lower : lowerSubsets) {
			List<Integer> newSet = new ArrayList<>(lower);
			newSet.add(set.get(index));
			currentSubsets.add(newSet);
		}

		// Copy lower subsets
		currentSubsets.addAll(lowerSubsets);

		System.out.println(index + " : " + currentSubsets);

		return currentSubsets;
	}

}
