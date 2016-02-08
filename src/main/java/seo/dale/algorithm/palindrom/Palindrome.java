package seo.dale.algorithm.palindrom;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class Palindrome {

    /**
     * 공백을 무시한 팬린드롬 체크
     */
    public static boolean isPalindrome(final String s) {
        final String toCheck = s.toLowerCase();
        int left = 0;
        int right = toCheck.length() - 1;

        while (left < right) {
            while (left < toCheck.length() && !Character.isLetter(toCheck.charAt(left))) {
                left++;
            }
            while (right > 0 && !Character.isLetter(toCheck.charAt(right))) {
                right--;
            }
            if (left > toCheck.length() || right < 0) {
                return false;
            }
            if (toCheck.charAt(left) != toCheck.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean strictPalindrome(final String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }

    @Test
    public void test() {
        assertTrue(isPalindrome("eve"));
        assertTrue(isPalindrome("level"));
        assertTrue(isPalindrome("top spot"));

        assertTrue(strictPalindrome("eve"));
        assertTrue(strictPalindrome("level"));
        assertFalse(strictPalindrome("top spot"));
    }

}
