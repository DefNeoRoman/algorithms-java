package plalab.algorithm.lab7;

/**
 * 4억개의 정수중에 1개가 빠졌다. 누락된 수를 찾는 함수를 구현하라. 
 * 단, 메모리는 100MB밖에 없다. (정수 n은 0 <= n < 400000000)
 * 
 * [원리] 
 * 메모리가 모자르기 때문에, 메모리를 적게 쓰는 게 관건
 * 원래 int에 저장할 수 있는 정수는 1개이지만,
 * int는 32bit이기 때문에, 
 */
public class MemorySavingFinder {
	private static int memLength = 25 * (int) Math.pow(10, 6); // 25M개의 인덱스
	private static int numSize = 4 * (int) Math.pow(10, 8); // 4억개의 정수
	
	private static int[] mem = new int[memLength]; // 4 Byte x 25M = 100MB

	/**
	 * 한 배열 공간에는 32bit가 들어있다.
	 * 최초에는 모두 0이지만, 32개의 숫자를 계속해서 1로 마킹해 나간다.
	 * 32n 부터 32n + 31 까지 빠진 수가 없다면 결국 모두 1이된다.
	 */
	public static void read(int n) {
		// 계속에서 한 자리 높은 수로 or 연산을 하기 때문에 1로 마킹되 나감
		mem[n / 32] |= getNthOne(n % 32);
	}
	
	/**
	 * n번째를 1로 세팅
	 */
	private static int getNthOne(int n) {
		return (1 << n);
	}

	/**
	 * 배열 안에서 몇번째에 0이 있는지 찾아나감
	 */
	public static int getFail() {
		for (int i = 0; i < numSize; ++i) {
			if (isNthZero(mem[i / 32], i % 32)) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * n번째가 0인지 검사
	 * : 0은 1이랑 and 해도 0
	 */
	private static boolean isNthZero(int a, int n) {
		return (a & (1 << n)) == 0;
	}
}
