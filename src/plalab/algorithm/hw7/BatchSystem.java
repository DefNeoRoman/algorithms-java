package plalab.algorithm.hw7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/*
과거의 모든 조직들은 하나의 큰 컴퓨터에 모든 기계적인 연산을 의지했습니다. 각 경우에 대해 컴퓨터는 int[ ] duration과 String[ ] user로 나타내는 작업 목록을 가지고 있었습니다. n개의 작업이 있고 각 작업은 2개의 배열로 설명됩니다. i번째 작업과 관련해서 duration[i]는 작업을 완료하는데 필요한 합계시간, user[i]는 작업을 요청한 사용자를 식별하는 문자열입니다. 한사람의 사용자는 여러개의 작업을 요청할 수 있습니다. 컴퓨터는 한번에 1개의 작업만을 처리할 수 있습니다. 사용자의 대기시간은 해당 사용자가 의뢰한 모든 작업이 완료될 때까지 기다리는 시간이라 정의합니다. 프로그램은 모든 사용자의 평균 대기 시간을 최소화하도록 해야합니다.
0부터 시작하는 n개의 작업 번호를 처리순서로 다시 배열하고 int 자료형의 배열로 리턴해주세요. 여러가지 결과가 나온다면 사전 순서로 정리해서 가장 앞의 결과를 리턴해주세요.
public int[ ] schedule(int[ ]  duration, String[ ] user);
제한조건: 두 입력 배열은 최대 50개의 원소를 가지고 두 배열은 크기가 같다.
예시)
duration={400,100,100,100}
user={”김희민”,”서대영”,”서대영”,”정화수”}
return={3,1,2,0}
이때 평균 대기 시간은 (100+300+700)/3=366.6초 입니다.

참고 : http://kwangswei.tistory.com/m/post/425
1) 각 User 별로 Job의 duration 의 누적합을 구한다.
2) duration의 누적합 순으로 정렬한다.
3) duration의 누적합이 작은 User 별로 job index 를 결과에 저장한다.
 */
public class BatchSystem {
	
	public static int[] scheduleDaleSeo(int[] duration, String[] user) {
		if (duration.length != user.length) {
			throw new RuntimeException("두 배열의 크기는 같아야 한다.");
		}
		int length = user.length;
		
		/* 1) 각 user의 duration의 합계와 index 목록을 객체화하 Map에 저장한다.*/		
		Map<String, Duration> userMap = new HashMap<String, Duration>();
		for (int i = 0; i < length; i++) {
			if (userMap.containsKey(user[i])) {
				Duration oldDuration = userMap.get(user[i]);
				oldDuration.setSum(oldDuration.getSum() + duration[i]);
				oldDuration.getIndexList().add(i);
			} else {
				Duration newDuration = new Duration(duration[i], i);
				userMap.put(user[i], newDuration);
			}
		}
		// System.out.println("# userMap : " + userMap);
		
		/* 2) duration 합계를 기준으로 user를 정렬한다.*/
		Duration[] durationArr = userMap.values().toArray(new Duration[0]);
		Arrays.sort(durationArr);
		// System.out.println("# durationArr : " + durationArr);
		
		/* 3) 정렬된 duration 객체에서 index 값만 뽑아서 배열에 넣는다. */
		int[] watingTime = new int[length];
		int index = 0;
		for (Duration u : durationArr) {
			for (int i : u.getIndexList()) {
				watingTime[index++] = i;
			}
		}		
		return watingTime;
	}

	public static class Duration implements Comparable<Duration> {
		private int sum;
		private List<Integer> indexList = new LinkedList<Integer>();
		
		public Duration(int durationSum, int index) {
			this.sum = durationSum;
			indexList.add(index);
		}
		
		public int getSum() {
			return sum;
		}
		public void setSum(int sum) {
			this.sum = sum;
		}
		public List<Integer> getIndexList() {
			return indexList;
		}
		public void setIndexList(List<Integer> indexList) {
			this.indexList = indexList;
		}

		@Override
		public int compareTo(Duration user) {
			if (sum != user.getSum()) {
				return sum - user.getSum();
			} else {
				return indexList.get(0) - user.getIndexList().get(0);
			}
		}

		@Override
		public String toString() {
			String format = "{%s%s}";
			return String.format(format, sum, indexList);
		}
	}

}
