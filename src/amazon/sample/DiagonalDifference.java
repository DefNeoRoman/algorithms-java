package amazon.sample;

import java.util.Scanner;

/**
 * Created by Dale on 2016-01-15.
 */
public class DiagonalDifference {

    public static void main(String[] args) {
//        int n = 3;
//        int[][] a = {{11, 2, 4}, {4, 5, 6}, {10, 8, -12}};

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }

        int diagonal1 = 0;
        int diagonal2 = 0;
        for (int j = 0; j < n; j++) {
            diagonal1 += a[j][j];
            diagonal2 += a[j][n - j - 1];
        }

        System.out.println(Math.abs(diagonal1 - diagonal2));
    }

}
