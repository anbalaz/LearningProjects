package items;

public class ItemsWithText extends GameItem {

    private String text;

    public ItemsWithText(String itemName, boolean pickable, String text) {
        super(itemName, pickable);
        this.text = text;
    }

    @Override
    public String toString() {
        return String.format("%1s, text: %2s", super.toString(), text);
    }

}
