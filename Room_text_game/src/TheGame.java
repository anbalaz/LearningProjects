import characters.Player;
import items.*;
import managingTheGame.ManagingCommands;

public class TheGame {

    public void runTheGame() {
        Player player= new Player();

        System.out.println("The game is running");

        GameRoom currentRoom = this.createMap();
        currentRoom = ManagingCommands.commandHandling(currentRoom, player);
    }

//    private void runTheGameMasso()
//    {
//        Scanner cmdReader = new Scanner(System.in);
//        boolean doExit = false;
//
//        do {
//            String command = cmdReader.nextLine();
//
//            String[] commands = command.split(" ");
//
//            if(commands[0].equals("go"))
//            {
//                String whereCommand = "";
//                if(commands.length == 1)
//                {
//                    System.out.println("go where?");
//                    whereCommand = cmdReader.nextLine();
//                }
//                else
//                {
//                    whereCommand = commands[1];
//                }
//
//
//                if(whereCommand.equals("north"))
//                {
//                    System.out.println("you go north");
//                }else
//                {
//                    System.out.println("dont know that direction");
//                }
//            }
//
//
//            if(command.equals("go"))
//            {
//                System.out.println("where do you want to go");
//                command = cmdReader.nextLine();
//
//                switch (command)
//                {
//                    case "north":
//                        System.out.println("you want to go north");
//                        break;
//                    default:
//                        System.out.println("I don't recognize that direction");
//
//
//                }
//                if(command.equals("north"))
//                {}
//            }
//            else if(command.equals("exit"))
//            {
//                doExit = true;
//            }
//            else
//            {
//                System.out.println("I don't recognize that command");
//            }
//
//        }while(!doExit);
//
//    }

    private GameRoom createMap() {
        GameRoom room1 = new GameRoom("Hall", createItems());
        GameRoom room2 = new GameRoom("Living room");
        GameRoom room3 = new GameRoom("Garage");

//        System.out.println(room1.name);

        room1.setRooms(room2, null, null, null);
        room2.setRooms(null, room1, room3, null);
        room3.setRooms(null, null, null, room2);

        return room1;
    }

    private ItemStorage createItems(){
        ItemStorage gameItems= new ItemStorage();
        gameItems.addItemToStorage(new ItemsWithText("note", true, "very long text"));
        gameItems.addItemToStorage(new Potion("healthPotion", true, 25));
        return gameItems;
    }

}



