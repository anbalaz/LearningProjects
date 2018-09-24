import java.util.Scanner;

//TODO: Class by mala citat a prezentovat vstupy od uzivatela
public class UserInputCommandHandler {

    private static String commandString;
    private static boolean commandHandled = true;
    private static Scanner scanner = new Scanner(System.in);

    public static void
    readCommandString() {
        setCommandString(scanner.nextLine());
    }

    public static boolean equals(String answer) {
        return getCommandString().equals(answer); }

    private static String getCommandString() {
        return commandString;
    }
    private static void setCommandString(String command) {
        commandString = command;
    }
    public static boolean isCommandHandled() {
        return commandHandled;
    }
    public static void setCommandHandled(boolean command) {
        commandHandled = command;
    }
    public static Scanner getIn() {
        return scanner;
    }
    public static void setIn(Scanner in) {
        scanner = in;
    }



}