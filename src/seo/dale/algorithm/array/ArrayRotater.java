package seo.dale.algorithm.array;

public class ArrayRotater {

	/**
	 * 배열의 일부를 오른쪽으로 1만큼 회전시키는 함수를 작성하라.
	 * 배열 arr와 위치 s, t가 있을 때, arr[s], arr[s+1], ... , arr[t-1]을 오른쪽으로 한 칸씩 이동하고, arr[t]는 arr[s]로 복사한다.
	 */
	public static void right_rotate(int[] arr, int s, int t) {
		int last = arr[t];
		for (int i = t; i > s; i--) {
			arr[i] = arr[i - 1];
		}
		arr[s] = last;
	}
	
}
