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
                switch (command) {
                    case "north":
                        if (currentRoom.northExit != null) {
                            System.out.println("You're going north");
                            currentRoom = currentRoom.northRoom();
                            break;
                        } else {
                            System.out.println("There is no door that way");
                            break;
                        }

                    case "south":
                        if (currentRoom.southExit != null) {
                            System.out.println("You're going south");
                            currentRoom = currentRoom.southRoom();
                            break;
                        } else {
                            System.out.println("There is no door that way");
                            break;
                        }
                    case "east":
                        if (currentRoom.eastExit != null) {
                            System.out.println("You're going east");
                            currentRoom = currentRoom.eastRoom();
                            break;
                        } else {
                            System.out.println("There is no door that way");
                            break;
                        }
                    case "west":
                        if (currentRoom.westExit != null) {
                            System.out.println("You're going west");
                            currentRoom = currentRoom.westRoom();
                            break;
                        } else {
                            System.out.println("There is no door that way");
                            break;
                        }
                    default:
                        System.out.println("There is no door that way");
                        break;
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
