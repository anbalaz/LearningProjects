package items;

public class GameItem {
    protected String itemName;
    protected boolean isPickable;


    public GameItem(String itemName, boolean pickable) {
        this.itemName = itemName;
        this.isPickable = pickable;
    }

    @Override
    public String toString() {
        return String.format("%1s, isPickable: %2s", itemName, isPickable);
    }
}
