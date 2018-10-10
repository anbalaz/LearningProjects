package managingTheGame;

import characters.Player;
import items.GameItem;
import items.GameRoom;

import java.util.Scanner;

public class ManagingCommands {

    private static boolean stillRun = false;
    private static Scanner scan = new Scanner(System.in);
    private static String command;


    public static GameRoom commandHandling(GameRoom currentRoom, Player player) {

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
            } else if (command.equals("take")) {
                System.out.println("What do you want to take?");
                command = scan.nextLine();
                if (currentRoom.isThereAnItem(command)) {
                    GameItem itemToAdd = currentRoom.getItemByName(command);
                    player.addItemToItinerary(itemToAdd);
                    currentRoom.removeItem(itemToAdd);
                    break;
                }

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
