package items;

import java.util.ArrayList;

public class ItemStorage<Masso> {
    //    private ArrayList<Masso> storage;
    private ArrayList<GameItem> storage;

    public ItemStorage(ArrayList<GameItem> storage) {
        this.storage = storage;
    }
    public ItemStorage() {
        this( new ArrayList<>() );
    }

    @Override
    public String toString() {
        return "There are these items :" + storage ;
    }

    public boolean isThereAnItem(String itemName) {
        boolean isThereAnItem = false;
        for (GameItem item : storage) {
            if (item.itemName.equals(itemName)) {
                System.out.println("I have in my inventory: " + item.itemName + " here you go");
                return isThereAnItem = true;
            }
        }
        System.out.println("Shit, we don't have it");
        return isThereAnItem;
    }

    public void removeItem(GameItem itemToRemove) {
        storage.remove(itemToRemove);
        System.out.println(itemToRemove + " is removed");

    }

    public GameItem getItemByName(String itemName) {
        for (GameItem item : storage) {
            if (item.itemName.equals(itemName)) {
                return item;
            }
        }

        return null;
    }

    public void addItemToStorage(GameItem item) {
        storage.add(item);
    }

    public boolean isEmpty() {
        return storage.isEmpty();
    }


}
