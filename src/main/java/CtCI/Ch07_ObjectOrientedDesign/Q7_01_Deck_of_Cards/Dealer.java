package CtCI.Ch07_ObjectOrientedDesign.Q7_01_Deck_of_Cards;

import java.util.List;

public class Dealer extends Player {

    private Deck deck;

    public Dealer(Long id, String name, int money) {
        super(id, name, money);
        deck = new Deck();
    }

    public void shuffleDeck() {
        System.out.println("The dealer shuffles the deck.");
        deck.shuffle();
    }

    public void handOutCards(List<Player> playerList) {
        System.out.println("The dealer hands out the cards.");
        playerList.forEach(player -> {
            Card card1 = deck.turnCard();
            Card card2 = deck.turnCard();
            player.receiveCard(card1);
            player.receiveCard(card2);
        });
    }

    public void auto() {
        System.out.println("- Dealer auto");
    }

}
