package codility.count_identical_pairs;

import java.util.HashMap;
import java.util.Map;

/**
 * https://codility.com/tasks/count_identical_pairs/
 * O(n)
 */
public class Solution2 {

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		System.out.println(s.solution(new int[]{3, 5, 6, 3, 3, 5}));
		System.out.println(s.solution(new int[]{0, 0})); // 1
	}

	public int solution(int[] A) {
		Map<Integer, Integer> counter = new HashMap<>();
		for (int a : A) {
			if (counter.containsKey(a)) {
				counter.put(a, counter.get(a) + 1);
			} else {
				counter.put(a, 1);
			}
		}

		int cnt = 0;
		for (Integer val : counter.values()) {
			if (val >= 2) {
				cnt += val * (val - 1) / 2;
				if (cnt > 1_000_000_000 || cnt < 0) {
					return 1_000_000_000;
				}
			}
		}

		return cnt;
	}

}
