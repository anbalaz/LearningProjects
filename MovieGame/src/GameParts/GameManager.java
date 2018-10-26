package GameParts;

import java.util.Scanner;

public class GameManager {

    private Scanner scanner = new Scanner(System.in);
    private String filmName = FileReader.readFile("movies.txt", RandomNumber.generateRandomNumber());



    public void gamePlay() {

        WordHandling wh = new WordHandling();
        wh.registerWord(filmName);
        System.out.println("Guess the name of the famous film. Please insert one letter each time and then press Enter.");

        while (!wh.areTheSameArray()) {
            wh.printEncryptedWord();
            char guessedChar = scanner.next().charAt(0);
            wh.guessChar(guessedChar);
        }
        System.out.println("Congratulations, you won, the name of the film was really:"+ filmName);

    }
}
