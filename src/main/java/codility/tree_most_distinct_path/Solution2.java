package codility.tree_most_distinct_path;

import java.util.HashSet;
import java.util.Set;

/**
 * https://codility.com/tasks/tree_most_distinct_path/
 */
public class Solution2 {

	public int solution(Tree T) {
		return maxSet(T).size();
	}

	public Set<Integer> maxSet(Tree T) {
		if (T == null) {
			return new HashSet<>();
		}

		Set<Integer> leftSet = maxSet(T.l);
		Set<Integer> rightSet = maxSet(T.r);

		leftSet.add(T.x);
		rightSet.add(T.x);

		return leftSet.size() > rightSet.size() ? leftSet : rightSet;
	}

}

