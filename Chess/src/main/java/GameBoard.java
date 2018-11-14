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
                isUsed[i][j] = false;
            }
        }
    }

    public void writeItDown() {
//        for (int i = 0; i < gameBoard.length; i++) {
//            for (int j = 0; j < gameBoard[i].length; j++) {
//                System.out.print(gameBoard[i][j] + "\t");
//            }
//            System.out.println();
//        }
        for (int i = 0; i < isUsed.length; i++) {
            for (int j = 0; j < isUsed[i].length; j++) {
                System.out.print(isUsed[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void solveProblem(Point sourcePoint) {

        isUsed[sourcePoint.x][sourcePoint.y] = true;

        if(isSolved()){
            System.out.println("forward: " + sourcePoint);
            writeItDown();
            System.out.println();

            System.out.println("dobra praca");
        }

        ArrayList<Point> possiblePositions = getPossiblePositions(sourcePoint);

        if (possiblePositions.isEmpty()) {
            isUsed[sourcePoint.x][sourcePoint.y] = false;
            return;
        } else {
            for (int i = 0; i < possiblePositions.size(); i++) {
                Point movePoint = possiblePositions.get(i);
                this.solveProblem(movePoint);
            }
            isUsed[sourcePoint.x][sourcePoint.y] = false;
            return;
        }
    }

    private ArrayList<Point> getPossiblePositions(Point point) {
        int x = point.x;
        int y = point.y;

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

            if (currPoint.x < 0 || currPoint.x > 4 || currPoint.y < 0 || currPoint.y > 4 || isUsed[currPoint.x][currPoint.y]) {
                points.remove(currPoint);
                i--;
            }
//            for (Point pint : points) {
//                System.out.println(pint);
//            }
//            System.out.println();
        }
        return points;
    }
    public boolean isSolved(){
        for (int i = 0; i < isUsed.length; i++) {
            for (int j = 0; j < isUsed[i].length; j++) {
                if (!isUsed[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}

