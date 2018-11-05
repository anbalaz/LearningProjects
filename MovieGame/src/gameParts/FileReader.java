package gameParts;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FileReader {

    private static int count = 0;

    protected static String readFile(String nameOfFile, int command) {
        String filmName = "";

        try {
            File file = new File(nameOfFile);
            Scanner scanner = new Scanner(file);
            String line;


            while (scanner.hasNextLine()) {
                count++;
                line = scanner.nextLine();
                if (count == command) {
                    filmName = line;

                }
            }

        } catch (FileNotFoundException exception) {
            System.out.println("The file was not found");
        }
        return filmName;
    }
}
