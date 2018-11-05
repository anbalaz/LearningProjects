package items;

public class Potion extends GameItem {

    private int addingHealth;

    public Potion(String itemName, boolean pickable, int addingHealth) {
        super(itemName, pickable);
        this.addingHealth = addingHealth;
    }

    @Override
    public String toString() {
        return String.format("%1s, addingHealth: %2s", super.toString(), addingHealth);
    }

}
