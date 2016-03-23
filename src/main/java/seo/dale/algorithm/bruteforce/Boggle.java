package seo.dale.algorithm.bruteforce;

public class Boggle {

    private static final int[][] NEIGHBORS = {
        {-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}
    };

    private char[][] matrix;

    public Boggle(char[][] matrix) {
        this.matrix = matrix;
    }

    // Worst O(8^n)
    public boolean hasWord(int y, int x, String word) {
        System.out.printf("hasWord(%d, %d, %s);\n", y, x, word);

        // Base Case 1 : 위치가 범위 밖이면 무조건 실패
        if (y < 0 || x < 0 || y >= matrix.length || x >= matrix.length) {
            System.out.println("\treturn false (y < 0 || x < 0)");
            return false;
        }

        // Base Case 2 : 첫 글자가 일치하지 않으면 실패
        if (word.charAt(0) != matrix[y][x]) {
            System.out.println("\treturn false (word.charAt(0) != matrix[y][x])");
            return false;
        }

        // Base Case 3 : 단어 길이가 1이면 성공
        if (word.length() == 1) {
            System.out.println("\treturn true (word.length() == 1)");
            return true;
        }

        for (int[] point : NEIGHBORS) {
            int nextY = y + point[0];
            int nextX = x + point[1];
            String wordLeft = word.substring(1);
            if (hasWord(nextY, nextX, wordLeft)) {
                return true;
            }
        }
        return false;
    }

}
