package seo.dale.algorithm.dynamic.companyInvestment;

import java.util.Scanner;

/**
 * http://m.blog.naver.com/sksdong1/220434000839
 */
public class CompanyInvestment2 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int money = sc.nextInt();
		int company = sc.nextInt();

		int[][] unitProfits = new int[money + 1][company + 1]; // 한 기업에만 돈을 투자했을 때 개별 이익 (입력)

		int[][] maxProfits = new int[money + 1][company + 1]; // 1부터 해당 기업에 분산 투자했을 때 최대 이익 (출력1)
		int[][] investments = new int[money + 1][company + 1]; // 1부터 해당 기업에 분산 투자했을 때 특정 기업에 할당된 투자금 (출력2)

		for (int m = 1; m <= money; m++) {
			for (int c = 0; c <= company; c++){
				unitProfits[m][c] = sc.nextInt();
			}
		}

		for (int c = 1; c <= company; c++) { // 투자 대상 기업 수를 하나 씩 늘려감
			for (int m = 1; m <= money; m++){
				if (c == 1) { // 투자 대상 기업이 하나인 경우
					maxProfits[m][c] = unitProfits[m][c];
					investments[m][c] = m; // 해당 기업에 전액 투자
				} else {
					for (int inv = 0; inv <= m; inv++) { // inv : 투자금
						int profit = maxProfits[m - inv][c - 1] + unitProfits[inv][c]; // 기존 기업들에 투자한 금액의 최대 이익 + 추가된 기업에 투자한 금액의 개별 이익
						if (maxProfits[m][c] < profit) {
							maxProfits[m][c] = profit;
							investments[m][c] = inv;  // 추가된 기업에 투자된 금액 기록
						}
					}
				}
			}
		}

		System.out.println(maxProfits[money][company]); // 투자금 전액을 모든 기업에 분산 투자했을 때 최대 이익 출력 (출력1)

		int[] each = new int[company + 1];

		int mon = money;
		int com = company;
		while (com > 0) {
			each[com] = investments[mon][com];
			mon -= each[com];
			com--;
		}

		for (int c = 1; c <= company; c++) {
			System.out.print(each[c] + " "); // 최대 이익일 때 각 기업의 투자 금액 출력 (출력2)
		}
	}

}