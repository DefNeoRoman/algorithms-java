package codility.break_the_chain;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * https://codility.com/tasks/break_the_chain/
 * https://codility.com/tickets/tryEWG5VU-FXZ/
 */
public class Solution {
	public int solution(int[] A) {
		PriorityQueue<Link> maxHeap = new PriorityQueue<>(3, Comparator.reverseOrder());
		for (int i = 1; i < 4; i++) {
			maxHeap.offer(new Link(i, A[i]));
		}
		for (int i = 4; i < A.length - 1; i++) {
			if (A[i] < maxHeap.peek().value) {
				maxHeap.poll();
				maxHeap.offer(new Link(i, A[i]));
			}
		}
		Link high = maxHeap.poll(), mid = maxHeap.poll(), low = maxHeap.poll();
		if (mid.idx - low.idx == 1) {
			return high.value + low.value;
		} else {
			return mid.value + low.value;
		}
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
//		PriorityQueue<Link> maxHeap = new PriorityQueue<>(3, Comparator.reverseOrder());
//		maxHeap.offer(new Link(0, 5));
//		maxHeap.offer(new Link(1, 2));
//		maxHeap.offer(new Link(2, 4));
//		maxHeap.offer(new Link(3, 6));
//		maxHeap.offer(new Link(4, 3));
//		maxHeap.offer(new Link(5, 7));
//
//		while (!maxHeap.isEmpty()) {
//			System.out.println(maxHeap.poll());
//		}
		Solution s = new Solution();
		int[] A = {5, 2, 4, 6, 3, 7};
		System.out.println(s.solution(A));
	}

}
