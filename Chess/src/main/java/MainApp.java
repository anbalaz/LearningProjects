public class MainApp {
    public static void main(String[] args) {

        GameBoard board = new GameBoard(8, 8);
//        System.out.println(board);
        int x = 0;
        int y = 0;
        // vypytaj koordinaty od uzivatela cez konzolu

        x = 1;
        y = 2;

        // vypis  ze pocitam
        board.solveProblem(x, y);


        // pocet moznost... je 18


        board.gameBoard[2][3] = 5;


//        board.writeItDown();
    }
}
