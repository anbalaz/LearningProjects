import java.awt.*;

public class MainApp {
    public static void main(String[] args) {

        GameBoard board = new GameBoard(5, 5);
//        System.out.println(board);
        // vypytaj koordinaty od uzivatela cez konzolu
        Point point = new Point(2, 2);


        // vypis  ze pocitam
        board.solveProblem(point);


        // pocet moznost... je 18


        board.gameBoard[2][3] = 5;


        board.writeItDown();
    }
}
