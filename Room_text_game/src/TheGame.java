import items.GameItem;
import items.GameRoom;

import java.util.Scanner;

public class TheGame {

    public void runTheGame(){
        this.runTheGameMasso();
        System.out.println("The game is running");
        GameItem object= new GameItem("hovno",true,true, true);
        System.out.println(object.toString());

        GameRoom currentRoom = this.createMap();
        System.out.println(currentRoom.roomDescriptionToString());

        currentRoom = currentRoom.northRoom();
        System.out.println(currentRoom.roomDescriptionToString());

    }

    private void runTheGameMasso()
    {
        Scanner cmdReader = new Scanner(System.in);
        boolean doExit = false;

        do {
            String command = cmdReader.nextLine();

            String[] commands = command.split(" ");

            if(commands[0].equals("go"))
            {
                String whereCommand = "";
                if(commands.length == 1)
                {
                    System.out.println("go where?");
                    whereCommand = cmdReader.nextLine();
                }
                else
                {
                    whereCommand = commands[1];
                }


                if(whereCommand.equals("north"))
                {
                    System.out.println("you go north");
                }else
                {
                    System.out.println("dont know that direction");
                }
            }


            if(command.equals("go"))
            {
                System.out.println("where do you want to go");
                command = cmdReader.nextLine();

                switch (command)
                {
                    case "north":
                        System.out.println("you want to go north");
                        break;
                    default:
                        System.out.println("I don't recognize that direction");


                }
                if(command.equals("north"))
                {}
            }
            else if(command.equals("exit"))
            {
                doExit = true;
            }
            else
            {
                System.out.println("I don't recognize that command");
            }

        }while(!doExit);

    }

    private GameRoom createMap()
    {
        GameRoom room2 = new GameRoom("Living room");
        GameRoom room3 = new GameRoom("Garage");

        GameRoom room1 = new GameRoom("Hall");
        System.out.println(room1.name);
        this.Sth(room1);
        System.out.println(room1.name);

        int number = 5;
        System.out.println(number);
        this.Sth2(number);
        System.out.println(number);


        room1.setRooms(room2, null, room3, null);
        room2.setRooms(null, room1, null, room3);

        room1.eastExit.name = "zmenene";
        System.out.println(room2.westExit.name);

        return room1;
    }

    private void Sth(GameRoom room)
    {
        room.name = "fuck of";
    }

    private void Sth2(int number)
    {   int sport;
        sport = number * 2;
    }


}

