package codility.digitless_password;

/**
 * Using regular expressions
 */
class Solution2 {

	public static void main(String[] args) {
		System.out.println(new Solution2().solution("a0Ba")); // 2
		System.out.println(new Solution2().solution("a0bb")); // -1
	}

	public int solution(String S) {
		int maxLength = -1;
		String[] passwords = S.split("\\d");
		for (String password : passwords) {
			if (password.matches(".*[A-Z].*")) {
				maxLength = Math.max(password.length(), maxLength);
			}
		}
		return maxLength;
	}

}
