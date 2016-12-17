package testdome;

public class Palindrome {
	public static boolean isPalindrome(String word) {
		if (word == null) {
			return true;
		}
		word = word.toLowerCase();
		int left = 0, right = word.length() - 1;
		while (left < right) {
			if (word.charAt(left++) != word.charAt(right--)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(Palindrome.isPalindrome("Deleveled"));
		System.out.println(Palindrome.isPalindrome("aba"));
		System.out.println(Palindrome.isPalindrome("abba"));
		System.out.println(Palindrome.isPalindrome("bbbb"));
	}
}
