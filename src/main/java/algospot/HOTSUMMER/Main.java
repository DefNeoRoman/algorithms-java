/**
 * https://www.algospot.com/judge/problem/read/HOTSUMMER
 */
package algospot.HOTSUMMER;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int count = scanner.nextInt();
            for (int i = 0; i < count; i++) {
                int limit = scanner.nextInt();
                int[] usages = new int[9];
                for (int j = 0; j < 9; j++) {
                    usages[j] = scanner.nextInt();
                }
                hotSummer(limit, usages);
            }
        }
    }

    private static void hotSummer(int limit, int[] usages) {
        int sum = 0;
        for (int usage : usages) {
            sum += usage;
        }
        if (sum <= limit) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
