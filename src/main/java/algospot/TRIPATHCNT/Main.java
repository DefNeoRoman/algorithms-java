/**
 * https://www.algospot.com/judge/problem/read/TRIPATHCNT
 */
package algospot.TRIPATHCNT;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfTests = scanner.nextInt();
		while (numOfTests-- > 0) {
			int height = scanner.nextInt();
			scanner.nextLine();
			int[][] tri = new int[height][];
			for (int i = 0; i < height; i++) {
				String line = scanner.nextLine();
				String[] tokens = line.split(" ");
				int[] ints = new int[tokens.length];
				for (int j = 0; j < tokens.length; j++) {
					ints[j] = Integer.parseInt(tokens[j]);
				}
				tri[i] = ints;
			}

			for (int i = 0; i < tri.length / 2; i++) {
				int[] tmp = tri[i];
				tri[i] = tri[tri.length - 1 - i];
				tri[tri.length - 1 - i] = tmp;
			}

			System.out.println(tripathcnt(tri));
		}
		scanner.close();
	}

	public static int tripathcnt(int[][] tri) {
		int[] firstCols = tri[0];
		Eval[] evals = new Eval[firstCols.length];
		for (int c = 0; c < firstCols.length; c++) {
			evals[c] = new Eval(firstCols[c], 1);
		}
		// System.out.println(Arrays.toString(evals));

		for (int r = 1; r < tri.length; r++) {
			for (int e = 0; e < tri[r].length; e++) {
				int weight = tri[r][e];
				int count;
				if (evals[e].compareTo(evals[e + 1]) < 0) {
					weight += evals[e + 1].weight;
					count = evals[e + 1].count;
				} else if (evals[e].compareTo(evals[e + 1]) > 0) {
					weight += evals[e].weight;
					count = evals[e].count;
				} else {
					weight += evals[e].weight;
					count = evals[e].count + evals[e + 1].count;
				}
				evals[e] = new Eval(weight, count);
			}
			// System.out.println(Arrays.toString(evals));
		}

		return evals[0].count;
	}

	static class Eval implements Comparable<Eval> {
		public int weight;
		public int count;

		public Eval(int weight, int count) {
			this.weight = weight;
			this.count = count;
		}

		@Override
		public String toString() {
			return weight + "(" + count + ")";
		}

		@Override
		public int compareTo(Eval other) {
			return this.weight - other.weight;
		}
	}

}