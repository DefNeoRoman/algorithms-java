package amazon.sample;

import java.util.Scanner;

/**
 * Created by Dale on 2016-01-14.
 */
public class Sample2 {

    static void StairCase(int n) {
        for (int i = 1; i <= n; i++) {
            char[] line = new char[i];
            for (int j = 0; j < i; j++) {
                line[j] = '#';
            }
            System.out.printf("%" + n + "s\n", new String(line));
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int _n;
        _n = Integer.parseInt(in.nextLine().trim());
        StairCase(_n);
    }

}
