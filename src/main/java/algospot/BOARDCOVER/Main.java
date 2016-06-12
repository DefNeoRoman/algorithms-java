/**
 * https://www.algospot.com/judge/problem/read/BOARDCOVER
 * TODO: 배열을 매번 복사하지 말고, 클리어 시켜보기
 * TODO: spots 배열을 내부 필드로 가지고 있는 클래스를 이용해 구조 개선해보기
 * TODO: boolean 배열 대신에 비트 연산으로 풀어보기
 */
package algospot.BOARDCOVER;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfTests = scanner.nextInt();
        while (numOfTests-- > 0) {
            int height = scanner.nextInt();
            int width = scanner.nextInt();
            boolean[] spots = new boolean[height * width];
            for (int i = 0; i < height; i++) {
                String row = scanner.next();
                for (int j = 0; j < width; j++) {
                    if (row.charAt(j) == '#') {
                        spots[i * width + j] = true;
                    }
                }
            }
            System.out.println(countCovers(width, spots));
        }
        scanner.close();
    }

    public static int countCovers(int width, boolean[] spots) {
        // print(width, spots);

        // find next empty spot
        int index = findNextFalse(spots);
        if (index == -1) {
            return 1;
        }

        int count = 0;

        if (index % width != width - 1) {
            // right, down
            if (areAllEmpty(spots, index + 1, index + width)) {
                boolean[] newSpots = makeNewSpots(spots, index, index + 1, index + width);
                count += countCovers(width, newSpots);
            }

            // right, right-down
            if (areAllEmpty(spots, index + 1, index + width + 1)) {
                boolean[] newSpots = makeNewSpots(spots, index, index + 1, index + width + 1);
                count += countCovers(width, newSpots);
            }

            // down, down-right
            if (areAllEmpty(spots, index + width, index + width + 1)) {
                boolean[] newSpots = makeNewSpots(spots, index, index + width, index + width + 1);
                count += countCovers(width, newSpots);
            }
        }

        if (index % width != 0) {
            // down, down-left
            if (areAllEmpty(spots, index + width, index + width - 1)) {
                boolean[] newSpots = makeNewSpots(spots, index, index + width, index + width - 1);
                count += countCovers(width, newSpots);
            }
        }

        return count;
    }

    public static int findNextFalse(boolean[] spots) {
        for (int i = 0; i < spots.length; i++) {
            if (!spots[i]) {
                return i;
            }
        }
        return -1;
    }

    public static boolean areAllEmpty(boolean[] spots, int... indexes) {
        for (int index : indexes) {
            if (index < 0 || index >= spots.length) {
                return false;
            }
            if (spots[index]) {
                return false;
            }
        }
        return true;
    }

    public static boolean[] makeNewSpots(boolean[] spots, int... indexes) {
        boolean[] newSpots = Arrays.copyOf(spots, spots.length);
        for (int index : indexes) {
            newSpots[index] = true;
        }
        return  newSpots;
    }

    public static boolean areAllVisited(boolean[] spots) {
        for (boolean spot : spots) {
            if (!spot) {
                return false;
            }
        }
        return true;
    }

    public static void print(int width, boolean[] spots) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < spots.length; i++) {
            if (spots[i]) {
                builder.append("#");
            } else {
                builder.append(".");
            }
            if (i % width == width - 1) {
                builder.append("\n");
            }
        }
        System.out.println(builder.toString());
    }

}