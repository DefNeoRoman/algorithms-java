package amazon.KoreaSdeChallenge;

public class Solution {

    static int[][] getLockerDistanceGrid(int cityLength, int cityWidth, int[] lockerXCoordinates, int[] lockerYCoordinates) {
        int[][] grid = new int[cityLength][cityWidth];

        for (int row = 0; row < cityLength; row++) {
            for (int col = 0; col < cityWidth; col++) {
                grid[row][col] = 10;
                setClosetDistance(grid, row, col, lockerXCoordinates, lockerYCoordinates);
            }
        }

        return grid;
    }

    static void setClosetDistance(int[][] grid, int row, int col, int[] lockerXCoordinates, int[] lockerYCoordinates) {
        int numberOfLocker = lockerXCoordinates.length;
        for (int i = 0; i < numberOfLocker; i++) {
            int distance = getDistance(row, col, lockerXCoordinates[i], lockerYCoordinates[i]);
            grid[row][col] = Math.min(grid[row][col], distance);
        }
    }

    static int getDistance(int row, int col, int x, int y) {
        return Math.abs(x - row -1) + Math.abs(y - col -1);
    }

}
