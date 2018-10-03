package managingTheGame;

import items.GameRoom;

import java.util.Scanner;

public class ManagingCommands {

    private static boolean stillRun = false;
    private static Scanner scan = new Scanner(System.in);
    private static String command;


    public static GameRoom commandHandling(GameRoom currentRoom) {

        do {
            System.out.println(currentRoom.roomDescriptionToString());
            System.out.println("What do you want to do?");
            command = scan.nextLine();

            if (command.equals("go")) {
                System.out.println("Where you wanna go man?");
                command = scan.nextLine();

                if (!currentRoom.hasExit(command)) {
                    System.out.println("There is no door that way");
                } else {
                    switch (command) {
                        case "north":
                            System.out.println("You're going north");
                            currentRoom = currentRoom.northRoom();
                            break;

                        case "south":
                            System.out.println("You're going south");
                            currentRoom = currentRoom.southRoom();
                            break;

                        case "east":
                            System.out.println("You're going east");
                            currentRoom = currentRoom.eastRoom();
                            break;

                        case "west":
                            System.out.println("You're going west");
                            currentRoom = currentRoom.westRoom();
                            break;
                    }
                }
            } else if (command.equals("description")) {
                System.out.println(currentRoom.roomDescriptionToString());
            } else if (command.equals("exit")) {
                break;
            } else {
                System.out.println("I don't understand what you wanna do !");
            }

        }
        while (!stillRun);
        return currentRoom;
    }

    public String commandReader(Scanner in) {
        return in.nextLine();
    }


}
