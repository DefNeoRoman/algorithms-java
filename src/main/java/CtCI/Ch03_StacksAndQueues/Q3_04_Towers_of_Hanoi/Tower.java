package CtCI.Ch03_StacksAndQueues.Q3_04_Towers_of_Hanoi;

import java.util.Stack;

/**
 * https://github.com/careercup/ctci/blob/master/java/Chapter%203/Question3_4/Tower.java
 */
public class Tower {

	private int index;
	private Stack<Integer> disks;

	public Tower(int index) {
		this.index = index;
		disks = new Stack<>();
	}

	public void add(int d) {
		if (disks.isEmpty() || disks.peek() > d) {
			disks.push(d);
		} else {
			System.out.println("Error placing disk " + d);
		}
	}

	/**
	 * @param n the number of disks to move
	 * @param destination the tower to be used as the destination
	 * @param buffer the tower to be used as the buffer
	 */
	public void moveDisks(int n, Tower destination, Tower buffer) {
		if (n == 0) return;
		moveDisks(n-1, buffer, destination);
		moveTopTo(destination);
		buffer.moveDisks(n-1, destination, this);
	}

	public void moveTopTo(Tower t) {
		int top = disks.pop();
		// System.out.printf("T[%s] --(%s)--> T[%s]%n", this.index, top, t.index);
		t.add(top);
	}

	public void print() {
		System.out.println("Contents of Tower " + index + ": " + disks.toString());
	}
}
