package codility.whole_square_count;

/**
 * https://codility.com/tasks/whole_square_count/
 * https://codility.com/tickets/try8V9WCX-TVN/
 */
public class Solution {

	public static void main(String[] args) {
		System.out.println(Math.ceil(Math.sqrt(3)));
	}

	public int solution(int A, int B) {
		if ((A < 0 && B < 0) || (A > B)) {
			return 0;
		}
		A = A < 0 ? 0 : A;
		B = B < 0 ? 0 : B;
		int low = (int) Math.ceil(Math.sqrt(A));
		int high = (int) Math.floor(Math.sqrt(B));
		return high - low + 1;
	}

}
