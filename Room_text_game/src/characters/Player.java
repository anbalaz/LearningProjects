package characters;

import items.GameItem;
import items.ItemStorage;

import java.util.ArrayList;

public class Player extends GameCharacter {
    private ItemStorage itinerary;


    public ItemStorage getItinerary() {
        return itinerary;
    }

    public Player(ItemStorage itinerary) {
        this.itinerary = itinerary;
    }

    public Player() {
        this(new ItemStorage());
    }


}
