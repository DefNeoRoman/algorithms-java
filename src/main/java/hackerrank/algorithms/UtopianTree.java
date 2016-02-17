package hackerrank.algorithms;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

/**
 * https://www.hackerrank.com/challenges/utopian-tree
 */
public class UtopianTree {

	public static int getHeight(int cycle) {
		int height = 1;
		for (int i = 0; i < cycle; i++) {
			if (i % 2 == 0) {
				height *= 2;
			} else {
				height += 1;
			}
		}
		return height;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int cnt = Integer.valueOf(input.nextLine());
		for (int i = 0; i < cnt; i++) {
			int cycle = Integer.valueOf(input.nextLine());
			int height = getHeight(cycle);
			System.out.println(height);
		}
	}

	@Test
	public void test() {
		assertEquals(1, getHeight(0));
		assertEquals(2, getHeight(1));
		assertEquals(7, getHeight(4));
	}




}
