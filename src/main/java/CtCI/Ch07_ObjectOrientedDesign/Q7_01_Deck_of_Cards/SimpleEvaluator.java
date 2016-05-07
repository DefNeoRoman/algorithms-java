package CtCI.Ch07_ObjectOrientedDesign.Q7_01_Deck_of_Cards;

import java.util.List;

public class SimpleEvaluator implements Evaluator {

    @Override
    public boolean exceeds(List<Card> cardList) {
        return evaluate(cardList) > 21;
    }

    @Override
    public int evaluate(List<Card> cardList) {
        int value = 0;
        for (Card card : cardList) {
            value += card.getValue();
        }
        return value;
    }

}
