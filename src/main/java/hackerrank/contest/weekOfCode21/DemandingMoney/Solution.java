/**
 * https://www.hackerrank.com/contests/w21/challenges/borrowing-money
 * Set 자료구조를 이용하여 경로가 중복되지 않게 저장해놓을까?
 */
package hackerrank.contest.weekOfCode21.DemandingMoney;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int houseLength = scan.nextInt();
		int roadLength = scan.nextInt();
		int[] houses = new int[houseLength];
		for (int i = 0; i < houseLength; i++) {
			houses[i] = scan.nextInt();
		}
		int[][] roads = new int[roadLength][];
		for (int i = 0; i < roadLength; i++) {
			int[] road = new int[2];
			road[0] = scan.nextInt() - 1;
			road[1] = scan.nextInt() - 1;
			roads[i] = road;
		}

		System.out.println("houses : " + Arrays.toString(houses));
		for (int[] road : roads) {
			System.out.println("road : " + Arrays.toString(road));
		}

		System.out.println("===============================================");

		Solution solution = new Solution(houses, roads);
		solution.solve();
	}

	private int[] houses;
	private int[][] roads;

	private int max;
	private int cnt;

	public Solution(int[] houses, int[][] roads) {
		this.houses = houses;
		this.roads = roads;

		max = 0;
		cnt = 0;
	}

	public void solve() {
		for (int houseId = 0; houseId < houses.length; houseId++) {
			int money = visitAndGetMoney(houseId, new boolean[houses.length]);
			System.out.println("From " + houseId + " : " + money);
		}
	}

	public int visitAndGetMoney(int houseId, boolean[] visits) {
		System.out.println("houseId = [" + houseId + "], visits = " + Arrays.toString(visits));
		markVisited(houseId, visits);
		int nextHouseId = next(visits);
		if (nextHouseId == -1) {
			return houses[houseId];
		} else {
			return houses[houseId] + visitAndGetMoney(nextHouseId, visits);
		}
	}

	public void markVisited(int houseId, boolean[] visits) {
		visits[houseId] = true;
		for (int i = 0; i < roads.length; i++) {
			int[] road = roads[i];
			if (road[0] == houseId) {
				visits[road[1]] = true;
			}
			if (road[1] == houseId) {
				visits[road[0]] = true;
			}
		}
	}

	public int next(boolean[] visits) {
		for (int i = 0; i < visits.length; i++) {
			if (!visits[i]) {
				return i;
			}
		}
		return -1;
	}

}
