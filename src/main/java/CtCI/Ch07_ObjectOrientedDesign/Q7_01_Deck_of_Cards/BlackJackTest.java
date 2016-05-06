package CtCI.Ch07_ObjectOrientedDesign.Q7_01_Deck_of_Cards;

import java.util.Scanner;

public class BlackJackTest {

    public static void main(String[] args) {
        BlackJack blackJack = new BlackJack(1000, 1);
        blackJack.join(new Player(1L, "Dale", 100));
        blackJack.play();

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("You have ");
//        System.out.println("Please bet : ");
    }

}
