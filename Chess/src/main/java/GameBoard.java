import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class GameBoard {

    public int[][] gameBoard;

    public GameBoard(int x, int y) {
        this.gameBoard = new int[x][y];
    }

    public void writeItDown() {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                System.out.print(gameBoard[i][j] + "\t");
            }
            System.out.println();
        }

    }


    public int solveProblem(int positionX, int positionY) {

        int i = 0;
        Point point = new Point( positionX,  positionY);
        do {
            point = getPossiblePositions(point.x,point.y).get(0);
            i++;
            System.out.println(point);
        } while (i < 300);

        this.solveProblem(positionX, positionY);

        return 0;
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

    public void moveOnChessBoard(){

    }
}
