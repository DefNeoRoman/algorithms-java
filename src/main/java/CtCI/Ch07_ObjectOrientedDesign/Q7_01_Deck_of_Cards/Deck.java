package CtCI.Ch07_ObjectOrientedDesign.Q7_01_Deck_of_Cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> cardList;

    public Deck() {
        cardList = new ArrayList<>(52);
        for (Card.Symbol symbol : Card.Symbol.values()) {
            for (Card.Letter letter : Card.Letter.values()) {
                Card card = new Card(letter, symbol);
                cardList.add(card);
            }
        }
        shuffle();
    }

    public void shuffle() {
        Collections.shuffle(cardList);
    }

    public Card turnCard() {
        return cardList.remove(0);
    }

    @Override
    public String toString() {
        return "Deck{" +
                "cardList=" + cardList +
                '}';
    }
}
