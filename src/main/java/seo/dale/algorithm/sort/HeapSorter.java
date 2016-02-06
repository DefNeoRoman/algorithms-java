package seo.dale.algorithm.sort;

import seo.dale.algorithm.tree.MaxHeap;

/**
 * O(n*log n)
 * 힙 정렬은 정렬할 원소들을 모두 힙에 차례차례 삽입한 후, 힙에 넣었떤 원소들을 삭제하는 과정을 거친다.
 * 최대 힙의 삭제는 큰 원소부터 작은 원소의 순으로 이루어지므로, 삭제되면서 반환된 값을 나열하면 내림차순으로 정렬된 결과를 얻을 수 있다.
 * 삽입과 삭제에 걸리는 시간은 각  원소당 O(log n)이고, 이 연산을 모든 원소에 대해 실행해야 하므로, 힙 정렬의 시간복잡도는 O(n*log n)이다.
 * 힙 정렬은 매우 안정적인 연산 속도를 보이지만, 평균적인 경우, 퀵 정렬보다는 조금 느린 것으로 알려져 있다.
 */
public class HeapSorter {

	public static void sort(int[] arr) {
		MaxHeap heap = new MaxHeap(); // 내가 구현한 힙
		for (int i : arr) {
			heap.insert(i);
		}
		
		for (int i = arr.length; i > 0; i--) {
			arr[i - 1] = heap.delete(); // 오름차순 정렬을 위해 뒤에서 붙어 넣음
		}
	}
	
}
