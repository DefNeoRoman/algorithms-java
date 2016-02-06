package seo.dale.algorithm.queue;

public class ArrayQueue {
	
	private static final int CAPACITY = 8;
	private int[] array;
	private int head;
	private int tail;
	private int size;
	
	public ArrayQueue() {
		array = new int[CAPACITY];
	}
	
	public void enqueue(int num) {
		if (size == CAPACITY) {
			throw new RuntimeException("The queue is full.");
		}
		array[tail] = num;
		tail = (tail + 1) % CAPACITY;
		size++;
	}
	
	public int dequeue() {
		if (size == 0) {
			throw new RuntimeException("The queue is empty.");
		}
		int num = array[head];
		head = (head + 1) % CAPACITY;
		size--;
		return num;
	}

}
