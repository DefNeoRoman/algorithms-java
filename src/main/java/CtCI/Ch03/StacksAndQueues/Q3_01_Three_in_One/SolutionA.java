package CtCI.Ch03.StacksAndQueues.Q3_01_Three_in_One;

import java.util.Arrays;

/**
 * 하나의 배열을 사용해 세 개의 스택을 구현하는 방법을 설명하라.
 * 방법 1) 각 스택의 top index를 관리하는 방법
 * @author 서대영/Store기술개발팀/SKP
 */
public class SolutionA {

	private int numOfStacks = 3;
	private int sizeOfStack;
	private int[] array;
	private int[] topIndexes;

	public SolutionA(int size) {
		sizeOfStack = size;
		array = new int[size * numOfStacks];
		topIndexes = new int[numOfStacks];
		for (int i = 0; i < numOfStacks; i++) {
			topIndexes[i] = i * sizeOfStack - 1;
		}
		log();
	}

	public void push(int stackNo, int value) {
		if (isFull(stackNo)) {
			throw new RuntimeException("The stack is full.");
		}
		System.out.printf("pushing %s onto the stack %s\n", value, stackNo);
		topIndexes[stackNo]++;
		int topIndex = topIndexes[stackNo];
		array[topIndex] = value;
		log();
	}

	public int pop(int stackNo) {
		if (isEmpty(stackNo)) {
			throw new RuntimeException("The stack is empty.");
		}
		int topIndex = topIndexes[stackNo];
		System.out.printf("popping %s from the stack %s\n", array[topIndex], stackNo);
		array[topIndex] = 0;
		topIndexes[stackNo]--;
		log();
		return array[topIndex];
	}

	public int peek(int stackNo) {
		if (isEmpty(stackNo)) {
			throw new RuntimeException("Nothing to peek in the stack.");
		}
		int topIndex = topIndexes[stackNo];
		System.out.printf("peeking %s from the stack %s\n", array[topIndex], stackNo);
		log();
		return array[topIndex];
	}

	public void log() {
		System.out.println("- array : " + Arrays.toString(array));
		System.out.println("- topIndexes : " + Arrays.toString(topIndexes));
	}

	private boolean isFull(int stackNo) {
		return topIndexes[stackNo] + 1 >= sizeOfStack * (stackNo + 1);
	}

	private boolean isEmpty(int stackNo) {
		return topIndexes[stackNo] < sizeOfStack * stackNo;
	}

}
