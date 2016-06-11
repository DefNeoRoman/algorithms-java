/**
 * https://www.algospot.com/judge/problem/read/BOARDCOVER
 */
package algospot.BOARDCOVER;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

    }

    public static int fill(int height, int width, boolean[] spots) {
        // find next empty spot
        int index = findNextFalse(spots);
        if (index == -1) {
            return 1;
        }

        if (
                (spots[index + 1] || spots[index + width + 1]) &&
                (spots[index + width] || spots[index + width + 1]) &&
                (spots[index + width] || spots[index + width - 1])
        ) {
            return 0;
        }

        int count = 0;

        // 1st route
        if (!spots[index + 1] && !spots[index + width + 1]) {
            boolean[] newSpots = Arrays.copyOf(spots, spots.length);
            newSpots[index] = true;
            newSpots[index + 1] = true;
            newSpots[index + width + 1] = true;
            count += fill(height, width, spots);
        }

        // 2nd route
        if (!spots[index + width] && !spots[index + width + 1]) {
            boolean[] newSpots = Arrays.copyOf(spots, spots.length);
            newSpots[index] = true;
            newSpots[index + width] = true;
            newSpots[index + width + 1] = true;
            count += fill(height, width, spots);
        }

        // 3rd route
        if (!spots[index + width] && !spots[index + width - 1]) {
            boolean[] newSpots = Arrays.copyOf(spots, spots.length);
            newSpots[index] = true;
            newSpots[index + width] = true;
            newSpots[index + width - 1] = true;
            count += fill(height, width, spots);
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

    public static boolean areAllVisited(boolean[] spots) {
        for (boolean spot : spots) {
            if (!spot) {
                return false;
            }
        }
        return true;
    }


    static class BoardConver {

        private int count;

        private int height;
        private int width;
        private boolean[][] visitied;

        public BoardConver(int height, int width, boolean[][] visitied) {
            this.height = height;
            this.width = width;
            this.visitied = visitied;
        }

        public void fill() {
            // find next empty spot

            // make possilbe cases

            // recurse each case
        }

        public int getCount() {
            return count;
        }
    }

}

