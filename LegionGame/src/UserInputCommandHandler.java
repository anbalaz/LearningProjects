import java.util.Scanner;

//TODO: Class by mala citat a prezentovat vstupy od uzivatela
public class UserInputCommandHandler {

    private String commandString;
    private boolean commandHandled = true;
    private Scanner scanner = new Scanner(System.in);

    public void readCommandString() {
        this.setCommandString(this.scanner.nextLine());
    }

    public boolean equals(String answer) {
        return this.getCommandString().equals(answer); }

    private String getCommandString() {
        return commandString;
    }
    private void setCommandString(String commandString) {
        this.commandString = commandString;
    }
    public boolean isCommandHandled() {
        return commandHandled;
    }
    public void setCommandHandled(boolean commandHandled) {
        this.commandHandled = commandHandled;
    }
    public Scanner getIn() {
        return scanner;
    }
    public void setIn(Scanner in) {
        this.scanner = in;
    }



}