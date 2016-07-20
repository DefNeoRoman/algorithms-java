package leetcode.guessNumberHigherOrLower;

/**
 * @author 서대영(DAEYOUNG SEO)/Onestore/SKP
 */
public class GuessGame {

	private int mine;

	public GuessGame(int n) {
//		mine = 6;
		mine = (int) (Math.random() * n) + 1;
		System.out.println("mine : " + mine);
	}

	public int guess(int n) {
		if (n == mine)
			return 0;

		if (n < mine)
			return 1;

		return -1;
	}

}
