package seo.dale.algorithm.recursion;

/**
 * 수분할 개수 세는 재귀 프로그램
 * n을 m 이하의 자연수의 합으로만 나타내는 방법을 n/m 수분할이라고 함
 */
public class Partition {

	public static int[][] memory = new int[200][200];
	
	public static int count(int n, int m) {
		// System.out.printf("count(%d, %d)\n", n, m);		
		
		//  이 게 없으면 무한루프에 빠짐
		if (n == 0) {
			return 1;
		}
		
		// 더 큰수의 합으로 수분할은 불가능
		if (n < m) {
			m = n;
		}
		
		// 메모리제이션으로 성능 향상
		if (memory[n][m] > 0) {
			return memory[n][m];
		}
		
		int cnt = 0;
		for (int i = 1; i <= m; i++) {
			cnt += count(n - i, i);
		}
		return memory[n][m] = cnt;
	}
	
	/**
	 * 순서까지 구분하는 수분할
	 */
	public static int count(int n) {
		System.out.printf("count(%d);\n", n);
		
		if (n == 1) {
			System.out.printf("cnt ---> 1\n");
			return 1;
		}
		
		int cnt = 1;
		for (int i = 1; i < n; i++) {
			cnt += count(n- i);
		}
		
		System.out.printf("cnt ---> %d\n", cnt);
		return cnt;
	}
	
}
