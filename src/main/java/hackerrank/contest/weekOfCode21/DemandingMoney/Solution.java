/**
 * https://www.hackerrank.com/contests/w21/challenges/borrowing-money
 * Test #2,8 빼고 모두 패쓰
 */
package hackerrank.contest.weekOfCode21.DemandingMoney;

import java.util.*;

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

//		System.out.println("houses : " + Arrays.toString(houses));
//		for (int[] road : roads) {
//			System.out.println("road : " + Arrays.toString(road));
//		}
//
//		System.out.println("===============================================");

		Solution solution = new Solution(houses, roads);
		solution.solve();
	}

	private int[] houses;
	private int[][] roads;

	public Solution(int[] houses, int[][] roads) {
		this.houses = houses;
		this.roads = roads;
	}

	public void solve() {
		Map<Set<Integer>, Integer> map = new HashMap<>();
		for (int houseId = 0; houseId < houses.length; houseId++) {
			Set<Integer> route = new HashSet<>();
			visitAndGetMoney(houseId, new boolean[houses.length], route);

			if (!map.containsKey(route)) {
				int money = 0;
				for (Integer id : route) {
					money += houses[id];
				}
				map.put(route, money);
			}
			//System.out.println("From " + houseId + " : " + route);
		}

		//System.out.println("Map : " + map);

		int max = 0;
		for (Integer val : map.values()) {
			max = Math.max(val, max);
		}

		int cnt = 0;
		for (Integer val : map.values()) {
			if (val == max) {
				cnt++;
			}
		}

		System.out.println(max + " " + cnt);
	}

	public int visitAndGetMoney(int houseId, boolean[] visits, Set<Integer> route) {
		// System.out.println("houseId = [" + houseId + "], visits = " + Arrays.toString(visits));
		markVisited(houseId, visits);
		int nextHouseId = next(visits);
		if (nextHouseId == -1) {
			route.add(houseId);
			return houseId;
		} else {
			route.add(houseId);
			return houses[houseId] + visitAndGetMoney(nextHouseId, visits, route);
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
