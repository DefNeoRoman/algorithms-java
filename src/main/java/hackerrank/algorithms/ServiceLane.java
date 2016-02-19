package hackerrank.algorithms;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

/**
 * https://www.hackerrank.com/challenges/service-lane
 */
public class ServiceLane {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int length = input.nextInt();
		int num = input.nextInt();
		int[] widths = new int[length];
		for (int i = 0; i < length; i++) {
			widths[i] = input.nextInt();
		}
		for (int i = 0; i < num; i++) {
			int entry = input.nextInt();
			int exit = input.nextInt();
			int vehicle = getLargestVehicle(widths, entry, exit);
			System.out.println(vehicle);
		}
	}

	public static int getLargestVehicle(int[] widths, int entry, int exit) {
		int min = 3;
		for(int i = entry; i <= exit; i++) {
			min = Math.min(min, widths[i]);
		}
		return min;
	}

	@Test
	public void test() {
		int[] widths = {2, 3, 1, 2, 3, 2, 3, 3};
		assertEquals(1, getLargestVehicle(widths, 0, 3));
		assertEquals(2, getLargestVehicle(widths, 4, 6));
		assertEquals(3, getLargestVehicle(widths, 6, 7));
		assertEquals(2, getLargestVehicle(widths, 3, 5));
		assertEquals(1, getLargestVehicle(widths, 0, 7));
	}


}
