package algospot.DRAWRECT;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfTests = scanner.nextInt();
        while (numOfTests --> 0) {
            int[] xArr = new int[3];
            int[] yArr = new int[3];
            for (int i = 0; i < 3; i++) {
                xArr[i] = scanner.nextInt();
                yArr[i] = scanner.nextInt();
            }
            drawrect(xArr, yArr);
        }
    }

    public static void drawrect(int[] xArr, int[] yArr) {
        System.out.println("- drawrect");
    }

    @Test
    public void test() {
        String input = "2\n" +
                "5 5\n" +
                "5 7\n" +
                "7 5\n" +
                "30 20\n" +
                "10 10\n" +
                "10 20";
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));
        int numOfTests = scanner.nextInt();
        while (numOfTests --> 0) {
            int[] xArr = new int[3];
            int[] yArr = new int[3];
            for (int i = 0; i < 3; i++) {
                xArr[i] = scanner.nextInt();
                yArr[i] = scanner.nextInt();
            }
            drawrect(xArr, yArr);
        }
    }

}
