package items;

public class GameItem {
    private String itemName;
    private boolean pickUp;
    private boolean breakSmth;
    private boolean breakable;


    public GameItem(String itemName, boolean pickUp, boolean breakSmth, boolean breakable){
        this.itemName =itemName;
        this.pickUp=pickUp;
        this.breakSmth=breakSmth;
        this.breakable= breakable;
    }

    @Override
    public String toString() {
        return "GameItem{" +
                "itemName='" + itemName + '\'' +
                ", pickUp=" + pickUp +
                ", breakSmth=" + breakSmth +
                ", breakable=" + breakable +
                '}';
    }
}
