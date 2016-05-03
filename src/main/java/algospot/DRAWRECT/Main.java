package algospot.DRAWRECT;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfTests = scanner.nextInt();
        while (numOfTests --> 0) {
            int[][] position = new int[3][3];
            for (int i = 0; i < 3; i++) {
                position[i][0] = scanner.nextInt();
	            position[i][1] = scanner.nextInt();
            }
            drawrect(position);
        }
    }

    public static void drawrect(int[][] position) {
        Set<Integer> xSet = new HashSet<>();
	    Set<Integer> ySet = new HashSet<>();

        for (int i = 0; i < 3; i++) {
	        int posX = position[i][0];
            if (xSet.contains(posX)) {
                xSet.remove(posX);
            } else {
	            xSet.add(posX);
            }

	        int posY = position[i][1];
	        if (ySet.contains(posY)) {
		        ySet.remove(posY);
	        } else {
		        ySet.add(posY);
	        }
        }
	    System.out.println(xSet.toArray()[0] + " " + ySet.toArray()[0]);
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
            int[][] position = new int[3][3];
            for (int i = 0; i < 3; i++) {
                position[i][0] = scanner.nextInt();
                position[i][1] = scanner.nextInt();
            }
            drawrect(position);
        }
    }

}
