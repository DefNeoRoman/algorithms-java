package seo.dale.algorithm.array;

public class ResizableArray {

	private int[] items = new int[8];
	private int size = 0;

	public void append(int item) {
		ensureExtraCapacity();
		items[size] = item;
		size++;
	}

	private void ensureExtraCapacity() {
		if (size == items.length) {
			int[] copies = new int[size * 2];
			System.arraycopy(items, 0, copies, 0, size);
			items = copies;
		}
	}

	public int get(int index) {
		verifyIndex(index);
		return items[index];
	}

	public void set(int index, int item) {
		verifyIndex(index);
		items[index] = item;
	}

	private void verifyIndex(int index) {
		if (index < 0 || size < index) {
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	public int size() {
		return size;
	}

}
