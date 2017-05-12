package codility.min_abs_slice_sum;

/**
 * https://codility.com/tasks/min_abs_slice_sum/
 * https://codility.com/tickets/tryAMXYZR-745/
 * https://codesays.com/2014/solution-to-min-abs-sum-of-two-by-codility/
 * http://stackoverflow.com/questions/25965939/finding-minimal-absolute-sum-of-a-subarray
 * http://codility-lessons.blogspot.kr/2015/04/lesson-15-minabssum-min-abs-sum.html
 */
public class Solution2 {

	public static void main(String[] args) {
		Solution2 s = new Solution2();

		System.out.println(s.solution(new int[]{2, -4, 6, -3, 9}));
//		System.out.println(s.solution(new int[]{1}));
	}

	public int solution(int[] A) {
		int minSoFar = Math.abs(A[0]);
		int minTillHere = A[0];
		int absMinTillHere = A[0];
		for(int i = 1; i < A.length; i++){
			absMinTillHere = Math.min(Math.abs(A[i]), Math.abs(minTillHere + A[i]));
			minTillHere = Math.min(A[i], minTillHere + A[i]);
			minSoFar = Math.min(Math.abs(minSoFar), absMinTillHere);
		}
		return minSoFar;
	}
}
