package algospot.HELLOWORLD;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfTests = scanner.nextInt();
        while (numOfTests --> 0) {
            String name = scanner.next();
            System.out.printf("Hello, %s!\n", name);
        }
    }

}
