package algospot.RATIO;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * http://h0tsource.tistory.com/entry/algospotRatio
 * 인터넷에서 뱃길걸로 통과 ㅠㅠ
 */
public class MainCopied {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		while (cnt-- > 0) {
			String[] str = br.readLine().split(" ");
			double total = Double.parseDouble(str[0]);
			double win = Double.parseDouble(str[1]);

			if (total >= 1 && total <= 1000000000 && win <= total && win >= 0) {

				double ratio = Math.floor(((double) win * 100l) / total) + 1;
				double result = (ratio * total - 100l * win) / (100l - ratio);

				if (Double.isInfinite(result))
					System.out.printf("-1\n");
				else if (result > 0)
					System.out.printf("%.0f\n", Math.ceil(result));
				else
					System.out.printf("-1\n");
			}

		}

	}

}
