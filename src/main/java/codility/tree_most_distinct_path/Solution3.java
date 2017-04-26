package codility.tree_most_distinct_path;

import java.util.HashSet;
import java.util.Set;

/**
 * https://codility.com/tasks/tree_most_distinct_path/
 * https://codility.com/tickets/tryMUX6U8-GDN/
 * http://stackoverflow.com/questions/39940607/max-number-of-distinct-nodes-in-a-binary-tree-path
 */
public class Solution3 {

	private int max = 0;

	public int solution(Tree T) {
		Set<Integer> set = new HashSet();
		return helper(T, set);
	}

	public int helper(Tree T, Set<Integer> set){
		if (T == null) {
			max = Math.max(max, set.size());
			set.clear();
			return max;
		}

		set.add(T.x);
		helper(T.l, set);

		set.add(T.x);
		helper(T.r, set);

		return max;
	}

}

