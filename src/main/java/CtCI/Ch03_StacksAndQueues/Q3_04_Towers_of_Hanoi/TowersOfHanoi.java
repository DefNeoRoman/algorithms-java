package CtCI.Ch03_StacksAndQueues.Q3_04_Towers_of_Hanoi;

/**
 * https://github.com/careercup/ctci/blob/master/java/Chapter%203/Question3_4/Question.java
 */
public class TowersOfHanoi {

	public static void main(String[] args) {
		// Set up code.
		int n = 5;
		Tower[] towers = new Tower[3];
		for (int i = 0; i < 3; i++) {
			towers[i] = new Tower(i);
		}
		for (int i = n - 1; i >= 0; i--) {
			towers[0].add(i);
		}

		// Copy and paste output into a .XML file and open it with internet explorer.
		towers[0].print();
		towers[0].moveDisks(n, towers[2], towers[1]);
		towers[2].print();
	}

}
