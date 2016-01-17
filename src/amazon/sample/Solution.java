package amazon.sample;

import java.util.Scanner;

/**
 * Write a program that adds two numbers prints the sum to STDOUT. Read the input from STDIN. The first line of your input will contain an integer (N) that tells you how many more lines there are in the input. Each of the subsequent N lines contain 2 integers). You need to print the sum of each pair on a separate line of STDOUT.
 *[Sample Input]
 * 3
 * 1 5
 * 3 10
 * 999 -34343
 * [Sample Output]
 * 6
 * 13
 * -33344
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int leftOne = scanner.nextInt();
            int rightOne = scanner.nextInt();
            System.out.println(leftOne + rightOne);
        }
        scanner.close();
    }

}
