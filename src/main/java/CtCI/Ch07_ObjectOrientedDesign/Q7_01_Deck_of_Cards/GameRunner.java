package CtCI.Ch07_ObjectOrientedDesign.Q7_01_Deck_of_Cards;

import java.util.List;
import java.util.Scanner;

public class GameRunner {

    public static int numOfRound;

    public Evaluator evaluator = new SimpleEvaluator();

    private Scanner scanner;

    private Dealer dealer;
    private List<Player> playerList;

    public GameRunner(Dealer dealer, List<Player> playerList) {
        this.dealer = dealer;
        this.playerList = playerList;
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        // Until the dealer goes broke or all the players go broke.
        while (isNoOneBroke()) {
            numOfRound++;
            round();
        }
    }

    private void round() {
        System.out.println("<<< Round # " + numOfRound + " has just started. >>>");
        // Let the dealer shuffle cards.
        dealer.shuffleDeck();

        System.out.println("====================================================");

        // Let each player bet.
        playerList.forEach(player -> {
            System.out.print(player.getName() + ", Please bet. : ");
            int bet = scanner.nextInt();
            player.setBet(bet);
        });

        System.out.println("====================================================");

        // Let the dealer pass around two cards to each player including himself.
        dealer.passAroundCards(playerList);

        System.out.println("====================================================");

        // Until they are all stayed or defeated, let the players hit or stay
        while (isAnyPlayerReady()) {
            dealWithPlayers();
        }

        System.out.println("====================================================");

        // Unless all the players are dead, let the dealer hit or stay until he wins or loses.
        if (isAnyPlayerAlive()) {
            dealWithDealer();
        }

        System.out.println("<<< Round # " + numOfRound + " has just finished. >>>");
    }

    private boolean isAnyPlayerAlive() {
        for (Player player : playerList) {
            if (!player.isLost()) {
                return false;
            }
        }
        return true;
    }

    private boolean isAnyPlayerReady() {
        for (Player player : playerList) {
            if (!player.isStayed()) {
                return true;
            }
        }
        return false;
    }

    private boolean isNoOneBroke() {
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

    public void dealWithPlayers() {
        playerList.forEach(player -> {
            if (player.isStayed() || player.isLost()) {
                return;
            }

            System.out.print(player.getName() + ", Hit(h) or stay(s)? : ");
            String action = scanner.next();
            if ("h".equals(action)) {
                player.hit();
                dealer.giveACard(player);
                if (evaluator.exceeds(player.getCardList())) {
                    player.lose(dealer);
                }
            } else {
                player.stay();
            }
        });
    }

    public void dealWithDealer() {
        dealer.auto();
        if (evaluator.exceeds(dealer.getCardList())) {
            playerList.forEach(player -> {
                if (!player.isLost()) {
                    player.win(dealer);
                }
            });
        } else {
            System.out.println("[TODO] Need to be compare dealer's value to each player's value.");
        }
    }

}
