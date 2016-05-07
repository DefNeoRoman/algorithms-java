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
        dealer.shuffleDeck();

        System.out.println("=========================================================================================");

        // while (continues()) {
        proceedRound();
        //}
    }

    private void proceedRound() {
        Scanner scanner = new Scanner(System.in);

        playerList.forEach(player -> {
            System.out.print(player.getName() + ", Please bet. : ");
            int bet = scanner.nextInt();
            player.setBet(bet);
        });

        System.out.println("-----------------------------------------------------------------------------------------");

        dealer.handOutCards(playerList);

        System.out.println("-----------------------------------------------------------------------------------------");

        if (isEveryoneStayed()) {
            System.out.println("Dealer should hit or stay to finish the round... (to be developed).");
        }


        playerList.forEach(player -> {
            if (player.isStayed()) {
                return;
            }
            System.out.print(player.getName() + ", Hit(h) or stay(s)? : ");
            String action = scanner.next();
            if ("h".equals(action)) {
                player.hit();
                dealer.giveACard(player);
            } else {
                player.stay();
            }
        });

        for (Player player : playerList) {
            if (player.isDead()) {
                player.lose();
                playerList.remove(player);
            }
        }

    }

    private boolean isEveryoneStayed() {
        for (Player player : playerList) {
            if (!player.isStayed()) {
                return false;
            }
        }
        return true;
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
