package CtCI.Ch07_ObjectOrientedDesign.Q7_01_Deck_of_Cards;

import java.util.List;

public interface Evaluator {

    boolean exceeds(List<Card> cardList);

    int evaluate(List<Card> cardList);

}
