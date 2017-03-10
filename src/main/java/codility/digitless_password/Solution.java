package codility.digitless_password;

/**
 * https://codility.com/tasks/digitless_password/
 * https://codility.com/tickets/try8ZAE9K-GX8/
 */
public class Solution {

	public static void main(String[] args) {
		System.out.println(new Solution().solution("a0Ba")); // 2
		System.out.println(new Solution().solution("a0bb")); // -1
	}

	public int solution(String S) {
		int maxLength = -1;
		int length = 0;
		boolean hasUppercase = false;
		int i = 0;
		while (i <= S.length()) {
			if (i == S.length() || Character.isDigit(S.charAt(i))) {
				if (length > 0 && hasUppercase) {
					maxLength = Math.max(length, maxLength);
				}
				length = 0;
				hasUppercase = false;
			} else {
				if (Character.isUpperCase(S.charAt(i))) {
					hasUppercase = true;
				}
				length++;
			}
			i++;
		}
		return maxLength;
	}

}
