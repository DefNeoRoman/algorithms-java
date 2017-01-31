package CtCI.Ch06_MathAndLogicPuzzles.Q6_07_The_Apocalypse;

import java.util.Random;

/**
 * https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2006.%20Math%20and%20Logic%20Puzzles/Q6_07_The_Apocalypse/Question.java
 */
public class Question {

	public static int[] runOneFamily() {
		Random random = new Random();
		int boys = 0;
		int girls = 0;
		while (girls == 0) {
			if (random.nextBoolean()) {
				girls += 1;
			} else {
				boys += 1;
			}
		}
		int[] genders = {girls, boys};
		return genders;
	}

	public static double runNFamilies(int n) {
		int boys = 0;
		int girls = 0;
		for (int i = 0; i < n; i++) {
			int[] genders = runOneFamily();
			girls += genders[0];
			boys += genders[1];
		}
		return girls / (double) (boys + girls);
	}

	public static void main(String[] args) {
		double ratio = runNFamilies(10000000);
		System.out.println(ratio);
	}

}
