package amazon.sample;

import java.util.Scanner;

/**
 * Created by Dale on 2016-01-15.
 */
public class PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        double pluses = 0, minuses = 0, zeros = 0;
        for (int i : arr) {
            if (i > 0) pluses++;
            else if (i < 0) minuses++;
            else zeros++;
        }

        String format = "%1.6f\n";
        System.out.printf(format, pluses / n);
        System.out.printf(format, minuses / n);
        System.out.printf(format, zeros / n);
    }

}
