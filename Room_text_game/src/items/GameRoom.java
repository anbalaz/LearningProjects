package items;

public class GameRoom {

    public String name;
    public GameRoom northExit;
    public GameRoom southExit;
    public GameRoom eastExit;
    public GameRoom westExit;

//    boolean openable;

    public GameRoom(String name)
    {
        this.name = name;
    }

    public boolean CanGo(String direction)
    {
        switch (direction)
        {
            case "north":
                return (this.northExit != null);
        }

        return false;
    }

    public void setRooms(GameRoom north, GameRoom south, GameRoom east, GameRoom west)
    {
        northExit = north;
        southExit = south;
        eastExit = east;
        westExit = west;
    }

    public GameRoom northRoom()
    {
        return this.northExit;
    }


    public String roomDescriptionToString()
    {
        return this.name + "\n" + this.exitsToString();
    }

    public String exitsToString()
    {
        String stringCanGo= "You can go";
        String retString = "";
        if(this.northExit != null)
        {
            retString = retString + " north";
            //" north"
        }
        if(this.southExit != null)
        {
            retString = retString + " south";
            //" north south"
        }

        if(retString.equals(""))
        {
            retString = "You can go nowhere";
        }
        else
        {
            retString = stringCanGo + retString;
        }

        return retString;
    }

    public String wrongDirection(){
        String wrongDirection = "You are going nowhere with this.";
        return wrongDirection;
    }
}
