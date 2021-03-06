package codility.tree_most_distinct_path;

import java.util.HashSet;
import java.util.Set;

/**
 * https://codility.com/tasks/tree_most_distinct_path/
 */
public class Solution {

	public int solution(Tree T) {
		Set<Integer> set = new HashSet<>();
		set.add(T.x);
		return maxDistinct(T, 1, set);
	}

	public int maxDistinct(Tree T, int current, Set<Integer> set) {
		if (T == null) {
			return current;
		}
		if (!set.contains(T.x)) {
			set.add(T.x);
			current++;
		}
		return Math.max(maxDistinct(T.l, current, new HashSet<>(set)), maxDistinct(T.r, current, new HashSet<>(set)));
	}

}

class Tree {
	public int x;
	public Tree l;
	public Tree r;
}
