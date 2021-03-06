package items;

public class GameRoom {

    private String name;
    private GameRoom northExit;
    private GameRoom southExit;
    private GameRoom eastExit;
    private GameRoom westExit;
    private ItemStorage gameItems;

    public ItemStorage getGameItems() {
        return gameItems;
    }

    public GameRoom(String name, ItemStorage gameItems) {
        this.name = name;
        this.gameItems = gameItems;
    }

    public GameRoom(String name) {
        this(name, new ItemStorage());
    }

    public void setRooms(GameRoom north, GameRoom south, GameRoom east, GameRoom west) {
        northExit = north;
        southExit = south;
        eastExit = east;
        westExit = west;
    }

    public GameRoom northRoom() {
        return this.northExit;
    }

    public boolean hasNorthExit() {
        return northExit != null;
    }

    public GameRoom southRoom() {
        return this.southExit;
    }

    public boolean hasSouthExit() {
        return this.southExit != null;
    }

    public GameRoom eastRoom() {
        return this.eastExit;
    }

    public boolean hasEastExit() {
        return this.eastExit != null;
    }

    public GameRoom westRoom() {
        return this.westExit;
    }

    public boolean hasWestExit() {
        return this.westExit != null;
    }

    public boolean hasExit(String direction) {
        switch (direction) {
            case "north":
                direction.equals("north");
                return hasNorthExit();
            case "south":
                direction.equals("south");
                return hasSouthExit();
            case "east":
                direction.equals("east");
                return hasEastExit();
            case "west":
                direction.equals("west");
                return hasWestExit();
            default:
                return false;
        }
    }

    public String roomDescriptionToString() {
        String retString = String.format("You're in the %1s, %s", this.name, this.exitsToString());
        if (!this.gameItems.isEmpty()) {
            retString = String.format("%s, %s", retString, this.gameItems);
        }

        return retString;
    }

    public String exitsToString() {
        String stringCanGo = "You can go";
        String retString = "";
        if (this.northExit != null) {
            retString = retString + " north";
            //" north"
        }
        if (this.southExit != null) {
            retString = retString + " south";
            //" north south"
        }
        if (this.eastExit != null) {
            retString = retString + " east";
        }
        if (this.westExit != null) {
            retString = retString + " west";
        }

        if (retString.equals("")) {
            retString = "You can go nowhere";
        } else {
            retString = stringCanGo + retString;
        }

        return retString;
    }


}