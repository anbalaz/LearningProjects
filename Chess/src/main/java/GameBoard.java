import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class GameBoard {

    public int[][] gameBoard;
    public boolean[][] isUsed;

    public GameBoard(int x, int y) {
        this.gameBoard = new int[x][y];
        this.isUsed = new boolean[x][y];
        for (int i = 0; i < isUsed.length; i++) {
            for (int j = 0; j < isUsed[i].length; j++) {
                isUsed[i][j] = true;
            }
        }
    }

    public void writeItDown() {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                System.out.print(gameBoard[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < isUsed.length; i++) {
            for (int j = 0; j < isUsed[i].length; j++) {
                System.out.print(isUsed[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void solveProblem(int positionX, int positionY) {

        Point sourcePoint = new Point(positionX, positionY);
        System.out.println(sourcePoint);

        ArrayList<Point> possiblePositions = getPossiblePositions(sourcePoint.x, sourcePoint.y);

        if (!possiblePositions.isEmpty()) {
            Point movePoint = possiblePositions.get(0);
            this.solveProblem(movePoint.x, movePoint.y);
        }
    }

    private ArrayList<Point> getPossiblePositions(int x, int y) {
        ArrayList<Point> points = new ArrayList<Point>();
        points.add(new Point(x + 2, y + 1));
        points.add(new Point(x + 2, y - 1));
        points.add(new Point(x - 2, y + 1));
        points.add(new Point(x - 2, y - 1));
        points.add(new Point(x + 1, y + 2));
        points.add(new Point(x + 1, y - 2));
        points.add(new Point(x - 1, y + 2));
        points.add(new Point(x - 1, y - 2));

        for (int i = 0; i < points.size(); i++) {
            Point currPoint = points.get(i);
            if (currPoint.x < 0 || currPoint.x > 8 || currPoint.y < 0 || currPoint.y > 8) {
                points.remove(currPoint);
                i--;
            }
        }

//        for (Point point:points){
//            System.out.println(point);
//        }

        return points;
    }

    public void moveOnChessBoard() {

    }
}
