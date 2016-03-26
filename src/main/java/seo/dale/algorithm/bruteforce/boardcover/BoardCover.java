package seo.dale.algorithm.bruteforce.boardcover;

public class BoardCover {

    private static final Point[][] CHECK_POINTS = {
            {new Point(-1, 0), new Point(-1, -1)},
            {new Point(-1, 0), new Point(-1, 1)},
            {new Point(0, -1), new Point(-1, -1)},
            {new Point(0, -1), new Point(1, -1)},
            {new Point(1, 0), new Point(1, -1)},
            {new Point(1, 0), new Point(1, 1)},
            {new Point(0, 1), new Point(-1, 1)},
            {new Point(0, 1), new Point(1, 1)}
    };

    public Board board;

    public BoardCover(int height, int width, boolean[][] matrix) {
        board = new Board(height, width, matrix);
    }

    public int count() {
        Point firstFalsePoint = board.getFirstEmptyPoint();
        if (firstFalsePoint == null) {
            System.out.println("===== Found =====");
            System.out.println(board);
        }

        checkAndFill(firstFalsePoint);

        return 0;
    }

    public void checkAndFill(Point point) {
        Point current = point.clone();
        if (board.isEmptyAt(new Point(point.x -1, point.y))) {
            if (board.isEmptyAt(current)) {
                board.fill(current);
                checkAndFill(current);
            }
        }


    }



}
