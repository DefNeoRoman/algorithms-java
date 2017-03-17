package codility.bitcount_in_product;

/**
 * https://codility.com/tasks/bitcount_in_product/
 * https://codility.com/tickets/try9N9RSE-XGJ/
 */
public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();

		System.out.println("#" + s.solution(3, 7)); // 3
		System.out.println("#" + s.solution2(3, 7)); // 3

		System.out.println("#" + s.solution(131071, 131073)); // 34
		System.out.println("#" + s.solution2(131071, 131073)); // 34
	}

	public int solution2(int A, int B) {
		long product = (long) A * (long) B;
		int count = 0;
		while (product > 0) {
			if (product % 2 == 1) {
				count++;
			}
			product /= 2;
		}
		return count;
	}

	public int solution(int A, int B) {
		long product = (long) A * (long) B;
		String binaryStr = Long.toBinaryString(product);
		int count = 0;
		for (char ch : binaryStr.toCharArray()) {
			if (ch == '1') {
				count++;
			}
		}
		return count;
	}

}
