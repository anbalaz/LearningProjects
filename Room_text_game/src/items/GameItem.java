package items;

public class GameItem {
    protected String itemName;
    protected boolean pickable;


    public GameItem(String itemName, boolean pickable) {
        this.itemName = itemName;
        this.pickable = pickable;
    }

    @Override
    public String toString() {
        return String.format("%1s, pickable: %2s", itemName, pickable);
    }
}
