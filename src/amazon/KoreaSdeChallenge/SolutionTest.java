package amazon.KoreaSdeChallenge;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    @Test
    public void test1() {
        int cityLength = 5;
        int cityWidth = 3;
        int[] lockerXCoordinates = {1};
        int[] lockerYCoordinates = {1};

        int[][] expected = {
                {0, 1 , 2},
                {1, 2 , 3},
                {2, 3 , 4},
                {3, 4 , 5},
                {4, 5 , 6},
        };
        System.out.println("# Expected");
        for (int[] row : expected) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println("# Actual");
        int[][] actual = Solution.getLockerDistanceGrid(cityLength, cityWidth, lockerXCoordinates, lockerYCoordinates);
        for (int[] row : actual) {
            System.out.println(Arrays.toString(row));
        }
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        int cityLength = 7;
        int cityWidth = 5;
        int[] lockerXCoordinates = {3, 7};
        int[] lockerYCoordinates = {2, 4};

        int[][] expected = {
                {3, 2 , 3, 4, 5},
                {2, 1 , 2, 3, 4},
                {1, 0 , 1, 2, 3},
                {2, 1 , 2, 3, 4},
                {3, 2 , 3, 2, 3},
                {4, 3 , 2, 1, 2},
                {3, 2 , 1, 0, 1},
        };
        System.out.println("# Expected");
        for (int[] row : expected) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println("# Actual");
        int[][] actual = Solution.getLockerDistanceGrid(cityLength, cityWidth, lockerXCoordinates, lockerYCoordinates);
        for (int[] row : actual) {
            System.out.println(Arrays.toString(row));
        }
        assertArrayEquals(expected, actual);
    }

}
