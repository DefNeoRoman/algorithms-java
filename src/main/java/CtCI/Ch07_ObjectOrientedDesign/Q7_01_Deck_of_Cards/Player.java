package CtCI.Ch07_ObjectOrientedDesign.Q7_01_Deck_of_Cards;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private Long id;
    private String name;
    private int bet;

    protected int money;
    protected List<Card> cardList;

    public Player(Long id, String name, int money) {
        cardList = new ArrayList<>(10);
        this.id = id;
        this.name = name;
        this.money = money;
    }

    public void hit() {
        System.out.printf("- Player #%s(%s) hit.\n", id, name);
    }

    public void stay() {
        System.out.printf("- Player #%s(%s) stay.\n", id, name);
    }

    public int getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public void receiveCard(Card card) {
        cardList.add(card);
        System.out.println(name + " receives a card : " + card);
    }

    public List<Card> getCardList() {
        return cardList;
    }

    public void setBet(int bet) {
        this.bet = bet;
        System.out.println(name + " bets $" + bet);
    }

    @Override
    public String toString() {
        return String.format("Player #%s(%s) with $%s\n", id, name, money);
    }
}
