package hackerrank.algorithms.dynamic_programing;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/red-john-is-back
 *
 * 왜 f(n) = f(n-1) + f(n-4) 인지 이해하지 못해서 포기
 */
public class RedJohnIsBlack {

    public static void main(String[] args)
    {
        int T;
        Scanner jin = new Scanner(System.in);
        T = jin.nextInt();
        int[] array = new int[41];
        array[0] = array[1] = array[2] = array[3] = 1;
        for(int i = 4; i <= 40; i++)
        {
            array[i] = array[i-1] + array[i-4];
        }
        for(int t = 0; t < T; t++)
        {
            int N = jin.nextInt();
            int ret = 0;
            for (int i = 2; i <= array[N]; i++) {
                if (Isprime(i)) {
                    ret++;
                }
            }
            System.out.println(ret);
        }
        array = null;
    }
    public static boolean Isprime(int n) //pass by value
    {
        if(n <= 1) return false;
        for(int i = 2; i*i <= n; i++)
        {
            if((n%i) == 0)
                return false;
        }
        return true;
    }

}