package CtCI.Ch07_ObjectOrientedDesign.Q7_01_Deck_of_Cards;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BlackJack {

    private Dealer dealer;
    private int numOfPlayers;
    private List<Player> playerList;

    public BlackJack(int numOfPlayers, int dealerMoney) {
        this.numOfPlayers = numOfPlayers;
        dealer = new Dealer(0L, "Dealer", dealerMoney);
        playerList = new ArrayList<>(numOfPlayers);
    }

    public void join(Player player) {
        if (playerList.size() == numOfPlayers) {
            System.out.println("Can't take more players now.");
            return;
        }
        System.out.println("A new player has joined. : " + player);
        playerList.add(player);
    }

    public void play() {
        GameRunner gameRunner = new GameRunner(dealer, playerList);
        gameRunner.run();
    }

}
