package gameParts;

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

    protected String printEncryptedWord() {
        String encryptedName = "";
        for (int i = 0; i < encryptedNameArray.length; i++) {
            encryptedName += encryptedNameArray[i] + " ";
        }
        return encryptedName;
    }

    protected void printDecriptedWord() {
        System.out.println(filmNameArray);
    }

    protected boolean guessChar(char guessedChar) {
        int e = 0;
        for (int i = 0; i < filmNameArray.length; i++) {
            if (guessedChar == filmNameArray[i]) {
                encryptedNameArray[i] = filmNameArray[i];
                e++;
            }
        }
        return 0 == e;
    }

    public boolean areTheSameArray() {

        return Arrays.equals(filmNameArray, encryptedNameArray);
    }


}

