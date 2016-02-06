package seo.dale.algorithm.tree;

public class MaxHeap {
	
	private int[] array;
	private int size;

	public MaxHeap() {
		array = new int[15];
		size = 0;
	}
	
	public int getSize() {
		return size;
	}
	public void insert(int item) {
		array[size++] = item;
		
		int current = size - 1;
		while (current > 0) {
			int parent = (current - 1) / 2;
			if (array[current] > array[parent]) {
				swap(current, parent);
				current = parent;
			} else {
				break;
			}
		}
	}
	
	public int delete() {
		int deleted = array[0];
		
		swap(0, --size);
		array[size] = 0;
		
		int current = 0;
		while (current * 2 < size) {
			int left = (2 * current) + 1;
			int right = left + 1;
			
			int candidate;
			if (left == size - 1) {
				candidate = left;
			} else {
				candidate = array[left] < array[right] ? right : left;
			}
			
			if (array[current] < array[candidate]) {
				swap(current, candidate);
				current = candidate;
			} else {
				break;
			}
		}
		
		return deleted;
	}
	
	private void swap(int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	@Override
	public String toString() {
		if (array == null) {
			return "null";
		}
		
		if (size == 0) {
			return "[]";
		}
		
		StringBuilder builder = new StringBuilder("[");
		for (int i = 0; ; i++) {
			builder.append(array[i]);
			if (i == size - 1)
				return builder.append("]").toString(); 
			builder.append(", ");
		}
	}
	
}
