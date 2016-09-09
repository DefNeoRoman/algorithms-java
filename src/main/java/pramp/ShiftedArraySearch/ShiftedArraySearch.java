/**
 * https://www.pramp.com/question/N5LYMbYzyOtbpovQoYPX
 */
package pramp.ShiftedArraySearch;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 1. Find a given number num in a sorted array arr:
 arr = [2, 4, 5, 9, 12, 17]

 2. If the sorted array arr is shifted left by an unknown offset and you don't have a pre-shifted copy of it,
 how would you modify your method to find a number in the shifted array?
 shiftArr = [9, 12, 17, 2, 4, 5]

 Explain and code an efficient solution and analyze its runtime complexity
 if num doesn't exist in the array, return -1
 */
public class ShiftedArraySearch {

    public int find(int num, int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        arr = sorted(arr);
        System.out.println(">>> sortedArr : " + Arrays.toString(arr));
        return findBetween(num, arr, 0, arr.length - 1);
    }

    private int[] sorted(int[] arr) {
        int offset = 0;
        int right = arr[0];
        while (offset < arr.length) {
            int left = arr[arr.length - 1 - offset];
            if (left >= right)
                break;
            right = left;
            offset++;
        }

        System.out.println(">>> offset : " + offset);

        if (offset == 0) {
            return arr;
        }

        int[] sortedArr = new int[arr.length];
        int idx = 0;

        for (int i = arr.length - offset; i < arr.length; i++) {
            sortedArr[idx++] = arr[i];
        }
        for (int i = 0; i < arr.length - offset; i++) {
            sortedArr[idx++] = arr[i];
        }

        return sortedArr;
    }

    private int findBetween(int num, int[] arr, int start, int end) {
        if (start > end)
            return -1;

        int mid = (start + end) / 2;

        if (num == arr[mid])
            return mid;

        if (num < arr[mid])
            return findBetween(num, arr, start, mid - 1);
        else
            return findBetween(num, arr, mid + 1, end);
    }

}
