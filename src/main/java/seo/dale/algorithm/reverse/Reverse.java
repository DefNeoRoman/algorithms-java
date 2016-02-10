package seo.dale.algorithm.reverse;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Reverse {

    public static String reverse(final String s) {
        final StringBuilder builder = new StringBuilder(s.length());
        for (int i = s.length() - 1; i >= 0; i--) {
            builder.append(s.charAt(i));
        }
        return builder.toString();
    }

    public static String inPlaceReverse(final String s) {
        final StringBuilder builder = new StringBuilder(s);
        for (int i = 0; i < s.length() / 2; i++) {
            final char tmp = builder.charAt(i);
            final int otherEnd = builder.length() - i - 1;
            builder.setCharAt(i, builder.charAt(otherEnd));
            builder.setCharAt(otherEnd, tmp);
        }
        return builder.toString();
    }

    @Test
    public void test() {
        assertEquals("dehsinif", reverse("finished"));
        assertEquals("dehsinif", inPlaceReverse("finished"));
    }

}
