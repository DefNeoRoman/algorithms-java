package seo.dale.algorithm.bruteforce.boardcover;

public class Board {

    int height;
    int width;
    boolean[][] matrix;

    public Board(int height, int width, boolean[][] matrix) {
        this.height = height;
        this.width = width;
        this.matrix = matrix;
    }

    public Point getFirstEmptyPoint() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (!matrix[i][j]) {
                    return new Point(i, j);
                }
            }
        }
        return null;
    }

    public boolean isEmptyAt(Point point) {
        return !matrix[point.x][point.y];
    }

    public boolean isFilledAt(Point point) {
        return matrix[point.x][point.y];
    }

    public boolean isValid(Point point) {
        return point.x > 0 && point.y > 0 && point.x < width && point.y < width;
    }

    public void fill(Point point) {
        matrix[point.y][point.x] = true;
    }

    public void empty(Point point) {
        matrix[point.y][point.x] = false;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i <= width * 2; i++) {
            builder.append('-');
        }

        builder.append('\n');

        for (boolean[] row : matrix) {
            for (boolean col : row) {
                String c = col == true ? "|+" : "| ";
                builder.append(c);
            }
            builder.append("|\n");
        }

        for (int i = 0; i <= width * 2; i++) {
            builder.append('-');
        }

        return builder.toString();
    }

}
