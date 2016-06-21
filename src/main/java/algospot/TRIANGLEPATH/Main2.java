/**
 * https://www.algospot.com/judge/problem/read/TRIANGLEPATH
 * Interation을 이용하여 재구현 (수행 시간 : 720ms)
 */
package algospot.TRIANGLEPATH;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

	private static int height;
	private static int[][] triangle;
	private static int[][] memo;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		while (count-- > 0) {
			height = scanner.nextInt();
			scanner.nextLine();
			String[] lines = new String[height];
			for (int level = 0; level < height; level++) {
				lines[level] = scanner.nextLine();
			}

			init(lines);

			System.out.println(trianglepath());
		}
		scanner.close();
	}

	public static void init(String[] lines) {
		triangle = new int[lines.length][];
		for (int row = 0 ; row < lines.length; row++) {
			String[] tokens = lines[row].split("[\\s]+");
			int[] nums = new int[tokens.length];
			for (int col = 0; col < tokens.length; col++) {
				nums[col] = Integer.parseInt(tokens[col]);
			}
			triangle[row] = nums;
		}

		memo = new int[lines.length][];
		for (int row = 0; row < memo.length; row++) {
			memo[row] = new int[row + 1];
			Arrays.fill(memo[row], -1);
		}
	}

	public static int trianglepath() {
		// 만 아래 라인은 그냥 복사
		memo[height - 1] = Arrays.copyOf(triangle[height - 1], triangle[height - 1].length);

		// 맨 밑에서 두번째 라인 부터 위 방행으로 계산
		for (int row = triangle.length - 2; row >= 0;row --) {
			for (int col = 0; col < triangle[row].length; col ++) {
				memo[row][col] = triangle[row][col] + Math.max(memo[row + 1][col], memo[row + 1][col + 1]);
			}
		}
		return memo[0][0];
	}

}
