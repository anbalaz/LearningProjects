package gameParts;

import java.util.Scanner;

public class GameManager {

    private final String outputString = "You are guessing: %s\nYou have guessed (%s) wrong letter: %s\nGuess a letter: ";
    private Scanner scanner = new Scanner(System.in);
    private char guessedChar = ' ';
    private String filmName = FileReader.readFile("movies.txt", RandomNumber.generateRandomNumber());


    public void gamePlay() {
        int countOfWrongAnswers = 0;
        WordHandling wordHandling = new WordHandling();
        wordHandling.registerWord(filmName);
        String answers= "";
        String endGame= "Congratulations, you won, the name of the film was really: " + filmName;


        while (!wordHandling.areTheSameArray()) {
            System.out.print(String.format(outputString, wordHandling.printEncryptedWord(), countOfWrongAnswers, answers));
            guessedChar = scanner.next().charAt(0);
            if (wordHandling.guessChar(guessedChar)) {
                countOfWrongAnswers++;
                answers += " "+ guessedChar;
            }
            if(countOfWrongAnswers>=10){
                endGame= "You have lost, too many guesses, the name of film was "+ filmName;
                break;
            }

        }
        System.out.println(endGame);

    }
}
