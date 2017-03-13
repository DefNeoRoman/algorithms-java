package codility.monotone;

/**
 * https://codility.com/tasks/monotone/
 * https://codility.com/tickets/tryXF4N4U-P7B/
 */
public class Solution {

	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution(new int[]{2, 2, 2, 2, 1, 2, -1, 2, 1, 3})); // 4
		System.out.println(sol.solution(new int[]{30, 20, 10})); // 0
		System.out.println(sol.solution(new int[]{2, 1, 2})); // 1
	}

	public int solution(int[] A) {
		int max_begin = 0, max_size = 1;
		int begin = -1, size = 1;
		int i = 0;
		while (i < A.length) {
			if (i != A.length - 1 && A[i] < A[i + 1]) {
				if (begin == -1) {
					begin = i;
				}
				size++;
			} else {
				if (size > max_size) {
					max_begin = begin;
					max_size = size;
				}
				begin = -1;
				size = 1;
			}
			i++;
		}
		return max_begin;
	}

}
