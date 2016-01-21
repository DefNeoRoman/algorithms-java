package seo.dale.algorithm.search;

import java.util.List;

public class BinaryListSearcher {

    public static boolean binarySearch(List<Integer> numbers, int value) {
        if (numbers == null || numbers.isEmpty()) {
            return false;
        }

        int middle = numbers.size() / 2;
        int comparison = numbers.get(middle);

        if (value == comparison) {
            return true;
        } else if (value < comparison) {
            return binarySearch(numbers.subList(0, middle), value);
        } else {
            return binarySearch(numbers.subList(middle + 1, numbers.size()), value);
        }
    }

}
