package CtCI.Ch07_ObjectOrientedDesign.Q7_01_Deck_of_Cards;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private Long id;
    private String name;
    private int bet;

    protected int money;
    protected List<Card> cardList;

    private boolean stayed;
    private boolean lost;

    public Player(Long id, String name, int money) {
        cardList = new ArrayList<>(10);
        this.id = id;
        this.name = name;
        this.money = money;
    }

    public boolean isLost() {
        return lost;
    }

    public boolean isStayed() {
        if (stayed) {
            System.out.println(name + " is staying...");
        }
        return stayed;
    }

    public void lose(Player other) {
        lost = true;
        decreaseMoney(bet);
        System.out.println(name + " lost " + bet + ".");
        other.increaseMoney(bet);
        System.out.println(other.getName() + " won " + bet + ".");
    }

    public void win(Player other) {
        lost = false;
        increaseMoney(bet);
        System.out.println(name + " won " + bet + ".");
        other.decreaseMoney(bet);
        System.out.println(other.getName() + " lost " + bet + ".");
    }

    public void increaseMoney(int bet) {
        money += bet;
    }

    public void decreaseMoney(int bet) {
        money -= bet;
    }

    public void hit() {
        System.out.println(name + " hits now.");
    }

    public void stay() {
        stayed = true;
        System.out.println(name + " stays now.");
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
