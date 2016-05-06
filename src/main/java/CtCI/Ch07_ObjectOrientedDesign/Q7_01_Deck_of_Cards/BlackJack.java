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
        join(dealer);
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
        dealer.shuffleDeck();

        // while (continues()) {
        proceedRound();
        //}
    }

    private void proceedRound() {
        Scanner scanner = new Scanner(System.in);

        playerList.forEach(player -> {
            if (!(player instanceof Dealer)) {
                System.out.println("Hey, " + player.getName());
                System.out.println("Please bet : ");
                int bet = scanner.nextInt();
                player.setBet(bet);
            }
        });

        dealer.handOutCards(playerList);



    }

    private boolean continues() {
        if (dealer.getMoney() < 0) {
            System.out.println("The dealer went broke!.");
            return false;
        }

        if (playerList.isEmpty()) {
            System.out.println("All the players went broke!.");
            return false;
        }

        return true;
    }

}
