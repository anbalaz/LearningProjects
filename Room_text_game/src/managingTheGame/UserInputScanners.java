package managingTheGame;

import java.util.Scanner;

public class UserInputScanners {
    public String currentCommand;


    public String getCurrentCommand() {
        return currentCommand;
    }

    public void setCurrentCommand(String currentCommand) {
        this.currentCommand = currentCommand;
    }

    public void readCommand(Scanner scanner){
        scanner.nextLine();
    }
}
