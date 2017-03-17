package codility.integer_decimal_occurrence;

/**
 * https://codility.com/tasks/integer_decimal_occurrence/
 * https://codility.com/tickets/tryZSDTYG-DXZ/
 */
public class Solution {

	public int solution(int A, int B) {
		String strA = Integer.toString(A);
		String strB = Integer.toString(B);
		return strB.indexOf(strA);
	}

}
