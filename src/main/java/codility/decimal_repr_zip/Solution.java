package codility.decimal_repr_zip;

/**
 * https://codility.com/tasks/decimal_repr_zip/
 * https://codility.com/tickets/tryCWNMB4-W3E/
 */
public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(12, 56)); // 1526
		System.out.println(s.solution(1234, 0)); // 10234
		System.out.println(s.solution(12345, 678)); // 16273845
		System.out.println(s.solution(123, 67890)); // 16273890
	}

	public int solution(int A, int B) {
		String strA = Integer.toString(A), strB = Integer.toString(B);
		StringBuilder builder = new StringBuilder();
		int i = 0, j = 0;

		while (i < strA.length() && j < strB.length()) {
			builder.append(strA.charAt(i++));
			builder.append(strB.charAt(j++));
		}

		builder.append(strA.substring(i));
		builder.append(strB.substring(j));

		long zip = Long.parseLong(builder.toString());
		return zip > 100_000_000 ? -1 : (int) zip;
	}

}
