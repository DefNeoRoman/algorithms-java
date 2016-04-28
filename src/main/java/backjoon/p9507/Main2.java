package backjoon.p9507;

import java.util.Scanner;

/**
 * 다른 사람 답변 복사
 * @author 서대영/Store기술개발팀/SKP
 */
public class Main2 {

	public static void main(String[] args) {
		long[] fibo = new long[68];

		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();

		while(cases-- > 0) {
			System.out.println(koong(sc.nextInt(), fibo));
		}

	}

	public static long koong(int n, long[] fibo) {
		if(fibo[n] != 0)
			return fibo[n];

		if(n < 2) {
			fibo[n] = 1;
			return fibo[n];
		} else if(n == 2) {
			fibo[n] = 2;
			return fibo[n];
		} else if (n == 3) {
			fibo[n] = 4;
			return fibo[n];
		} else
			fibo[n] = koong(n-1, fibo) + koong(n-2, fibo) + koong(n-3, fibo) + koong(n-4, fibo);
		return fibo[n];
	}

}