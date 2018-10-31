package GameParts;

import java.util.Scanner;

public class GameManager {

    private final String outputString = "You are guessing: %s\nYou have guessed(%s) wrong letter:\nGuess a letter: %s";
    private Scanner scanner = new Scanner(System.in);
    char guessedChar = ' ';
    private String filmName = FileReader.readFile("movies.txt", RandomNumber.generateRandomNumber());


    public void gamePlay() {
        int countOfWrongAnswers = 0;
        WordHandling wordHandling = new WordHandling();
        wordHandling.registerWord(filmName);
        String answers= "";


        while (!wordHandling.areTheSameArray()) {
            System.out.println(String.format(outputString, wordHandling.printEncryptedWord(), countOfWrongAnswers, answers));
            guessedChar = scanner.next().charAt(0);
            if (wordHandling.guessChar(guessedChar)) {
                countOfWrongAnswers++;
            }
            answers += " "+ String.valueOf(guessedChar);

        }
        System.out.println("Congratulations, you won, the name of the film was really:" + filmName);

    }
}
