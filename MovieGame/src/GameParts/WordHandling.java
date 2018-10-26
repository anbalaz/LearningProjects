package GameParts;

import java.util.Arrays;

public class WordHandling {

    private char[] filmNameArray;
    private char[] encryptedNameArray;


    protected void registerWord(String filmName) {
        this.filmNameArray = filmName.toCharArray();
        this.encryptedNameArray = new char[filmNameArray.length];

        for (int i = 0; i < filmNameArray.length; i++) {
            if (Character.isAlphabetic(filmNameArray[i])) {
                encryptedNameArray[i] = '_';
            } else {
                encryptedNameArray[i] = filmNameArray[i];
            }
        }
    }

    protected void printEncryptedWord() {
        for (int i = 0; i < encryptedNameArray.length; i++) {
            System.out.print(encryptedNameArray[i] + " ");
        }
    }

    protected void printDecriptedWord() {
        System.out.println(filmNameArray);
    }

    protected void guessChar(char guessedChar) {
        for (int i = 0; i < filmNameArray.length; i++) {
            if (guessedChar == filmNameArray[i]) {
                encryptedNameArray[i] = filmNameArray[i];
            }
        }

    }

    public boolean areTheSameArray() {

        return Arrays.equals(filmNameArray, encryptedNameArray);
    }


}

