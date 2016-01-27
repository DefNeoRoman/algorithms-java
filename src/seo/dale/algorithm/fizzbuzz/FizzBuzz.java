package seo.dale.algorithm.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static List<String> fizzBuzz2(final int n) {
        final List<String> list = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            final String word = toWord(i, 3, "Fizz") + toWord(i, 5, "Buzz");
            if ("".equals(word)) {
                list.add(String.valueOf(i));
            } else {
                list.add(word);
            }
        }
        return list;
    }

    private static String toWord(final int number, final int divisor, final String word) {
        return number % divisor == 0 ? word : "";
    }


    public static List<String> fizzBuzz(final int n) {
        final List<String> list = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                list.add("FizzBuzz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }

}
