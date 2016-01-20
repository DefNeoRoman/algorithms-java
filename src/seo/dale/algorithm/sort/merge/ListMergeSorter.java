package seo.dale.algorithm.sort.merge;

import java.util.ArrayList;
import java.util.List;

public class ListMergeSorter {

    public static List<Integer> mergeSort(List<Integer> values) {
        if (values.size() <= 1) {
            return values;
        }

        List<Integer> left = values.subList(0, values.size() / 2);
        List<Integer> right = values.subList(values.size() / 2, values.size());

        System.out.println(left + " + " + right);

        return merge(mergeSort(left), mergeSort(right));
    }

    public static List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> merged = new ArrayList<>(left.size() + right.size());

        int leftPtr = 0, rightPtr = 0;

        while (leftPtr < left.size() && rightPtr < right.size()) {
            if (left.get(leftPtr) < right.get(rightPtr)) {
                merged.add(left.get(leftPtr++));
            } else {
                merged.add(right.get(rightPtr++));
            }
        }

        while (leftPtr < left.size()) {
            merged.add(left.get(leftPtr++));
        }

        while (rightPtr < right.size()) {
            merged.add(right.get(rightPtr++));
        }

        return merged;
    }

}
