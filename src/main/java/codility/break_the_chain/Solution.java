package codility.break_the_chain;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * https://codility.com/tasks/break_the_chain/
 * https://codility.com/tickets/tryEWG5VU-FXZ/
 * O(n) time & space
 */
public class Solution {
	public int solution(int[] A) {
		PriorityQueue<Link> maxHeap = new PriorityQueue<>(4, Comparator.reverseOrder());
		for (int i = 1; i < A.length - 1; i++) {
			if (i < 5) {
				maxHeap.offer(new Link(i, A[i]));
				continue;
			}
			if (A[i] < maxHeap.peek().value) {
				maxHeap.poll();
				maxHeap.offer(new Link(i, A[i]));
			}
		}

		Link[] links = maxHeap.toArray(new Link[maxHeap.size()]);
		int minSum = Integer.MAX_VALUE;
		for (int i = 0; i < links.length - 1; i++) {
			for (int j = i + 1; j < links.length; j++) {
				if (Math.abs(links[i].idx - links[j].idx) == 1) {
					continue;
				}
				minSum = Math.min(minSum, links[i].value + links[j].value);
			}
		}
		return minSum;
	}

	static class Link implements Comparable<Link> {
		public Link(int idx, int value) {
			this.idx = idx;
			this.value = value;
		}

		int idx;
		int value;

		@Override
		public int compareTo(Link other) {
			return this.value - other.value;
		}

		@Override
		public String toString() {
			return "Link{" +
					"idx=" + idx +
					", value=" + value +
					'}';
		}
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(new int[]{5, 2, 4, 6, 3, 7})); // 5
		System.out.println(s.solution(new int[]{9, 9, 8, 3, 2, 4, 8})); // 7
		System.out.println(s.solution(new int[]{13, 10, 8, 1, 4, 11, 8})); // 11
		System.out.println(s.solution(new int[]{1, 1, 1, 1, 1})); // 2
	}

}
