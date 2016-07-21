package leetcode.findKPairsWithSmallestSums;

import java.util.*;

public class Solution {

	public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
		if (k < 1 || nums1 == null || nums2 == null || nums1.length == 0 || nums2.length ==0)
			return Collections.emptyList();

		List<int[]> list = new ArrayList<>(k);
		PriorityQueue<Pair> pairQueue = new PriorityQueue<>(k * k, (pair1, pair2) -> Long.compare(pair1.sum, pair2.sum));

		int len1 = Math.min(k, nums1.length);
		int len2 = Math.min(k, nums2.length);
		for (int i = 0; i < len1; i++) {
			for (int j = 0; j < len2; j++) {
				pairQueue.offer(new Pair(nums1[i], nums2[j]));
			}
		}

		while (k-- > 0) {
			Pair pair = pairQueue.poll();
			if (pair == null) break;
			list.add(new int[]{pair.val1, pair.val2});
		}

		return list;
	}

	class Pair {
		int val1;
		int val2;
		long sum;

		public Pair(int val1, int val2) {
			this.val1 = val1;
			this.val2 = val2;
			this.sum = (long) val1 + (long) val2;
		}
	}

}
