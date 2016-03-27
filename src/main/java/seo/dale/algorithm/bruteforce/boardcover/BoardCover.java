package seo.dale.algorithm.bruteforce.boardcover;

public class BoardCover {

/*    private static final Point[][] CHECK_DELTAS = {
            {new Point(1, 0), new Point(0, 1)},
            {new Point(1, 0), new Point(1, 1)},
            {new Point(0, 1), new Point(-1, 1)},
            {new Point(0, 1), new Point(1, 1)}
    };

    public Board board;

    public int count(int height, int width, boolean[][] matrix) {
        board = new Board(height, width, matrix);

        checkAndFill(board);

        count(board);

        return 0;
    }

    public int checkAndFill(Board board) {
        Point next = board.getNextEmptyPoint();
        if (next == null) {
            System.out.println("===== Found =====");
            System.out.println(board);
            return 1;
        }

        for (Point[] delta : CHECK_DELTAS) {
            Point firstPoint = new Point(next.x + delta[0].x, next.y + delta[0].y);
            Point secondPoint = new Point(next.x + delta[1].x, next.y + delta[1].y);
            if (board.isEmptyAt(firstPoint) && board.isEmptyAt(secondPoint)) {
                board.fill(firstPoint);
                board.fill(secondPoint);
                return checkAndFill(board);
            } else {
                return 0;
            }
        }
    }*/


}
