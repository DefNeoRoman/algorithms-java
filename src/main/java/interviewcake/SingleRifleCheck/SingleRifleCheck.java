package interviewcake.SingleRifleCheck;

import java.util.Arrays;

/**
 * https://www.interviewcake.com/question/single-rifle-check?utm_source=weekly_email

I figured out how to get rich: online poker.
I suspect the online poker game I'm playing shuffles cards by doing a single " riffle ↴ ."

To prove this, let's write a function to tell us if a full deck of cards shuffled_deck is a single riffle of two other halves half1 and half2.

We'll represent a stack of cards as an array of integers in the range 1..521..52 (since there are 5252 distinct cards in a deck).

Why do I care? A single riffle is not a completely random shuffle. If I'm right, I can make more informed bets and get rich and finally prove to my ex that I am not a "loser with an unhealthy cake obsession" (even though it's too late now because she let me go and she's never getting me back).

 */
public class SingleRifleCheck {
	
	/**
	 * O(n) time & O(1) space by iteration

We walk through shuffled_deck, seeing if each card so far could have come from a riffle of the other two halves. To check this, we:

Keep pointers to the current index in half1, half2, and shuffled_deck.
Walk through shuffled_deck from beginning to end.
If the current card in shuffled_deck is the same as the top card from half1, increment half1_index and keep going. This can be thought of as "throwing out" the top cards of half1 and shuffled_deck, reducing the problem to the remaining cards in the stacks.
Same as above with half2.
If the current card isn't the same as the card at the top of half1 or half2, we know we don't have a single riffle.
If we make it all the way to the end of shuffled_deck and each card checks out, we know we do have a single riffle.

	 */
	public boolean isSingleRiffleRecursive3(int[] half1, int[] half2, int[] shuffledDeck) {
		int half1Index = 0, half2Index = 0;
		for (int card : shuffledDeck) {
			// System.out.printf("half1[%d] = %d / half2[%d] = %d / deck[%d] = %d\n", half1Index, half1[half1Index], half2Index, half2[half2Index], shuffledDeckIndex, shuffledDeck[shuffledDeckIndex]);
			if (half1Index < half1.length && half1[half1Index] == card) {
				half1Index++;
			} else if (half2Index < half2.length && half2[half2Index] == card) {
				half2Index++;
			} else {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * O(n) time & space using keeping track of indices in the array
	 */
	public boolean isSingleRiffleRecursive2(int[] half1, int[] half2, int[] shuffledDeck, int half1Index, int half2Index, int shuffledDeckIndex) {
		// System.out.printf("isSingleRiffleRecursive2(%s, %s, %s, %d, %d, %d)\n", Arrays.toString(half1), Arrays.toString(half2), Arrays.toString(shuffledDeck), half1Index, half2Index, shuffledDeckIndex);
		
		if (shuffledDeck.length == shuffledDeckIndex) {
			return true;
		}
		
		if (half1Index < half1.length && half1[half1Index] == shuffledDeck[shuffledDeckIndex]) {
			half1Index++;
		} else if (half2Index < half2.length && half2[half2Index] == shuffledDeck[shuffledDeckIndex]) {
			half2Index++;
		} else {
			return false;
		}
		
		shuffledDeckIndex++;
		return isSingleRiffleRecursive2(half1, half2, shuffledDeck, half1Index, half2Index, shuffledDeckIndex);
	}
	
	/**
	 * O(n^2) time & space due to array slicing
	 */
	public boolean isSingleRiffleRecursive(int[] half1, int[] half2, int[] shuffledDeck) {
		// System.out.printf("isSingleRiffleRecursive(%s, %s, %s)\n", Arrays.toString(half1), Arrays.toString(half2), Arrays.toString(shuffledDeck));
		
		if (shuffledDeck.length == 0) {
			return true;
		}
		
		if (half1.length > 0 && half1[0] == shuffledDeck[0]) {
			int[] half1Left = Arrays.copyOfRange(half1, 1, half1.length);
			int[] shuffledDeckLeft = Arrays.copyOfRange(shuffledDeck, 1, shuffledDeck.length);
			return isSingleRiffleRecursive(half1Left, half2, shuffledDeckLeft);
		} else if (half2.length > 0 && half2[0] == shuffledDeck[0]) {
			int[] half2Left = Arrays.copyOfRange(half2, 1, half2.length);
			int[] shuffledDeckLeft = Arrays.copyOfRange(shuffledDeck, 1, shuffledDeck.length);
			return isSingleRiffleRecursive(half1, half2Left, shuffledDeckLeft);
		} else {
			return false;
		}
	}

}
