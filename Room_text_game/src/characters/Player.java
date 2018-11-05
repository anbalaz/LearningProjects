package characters;

import items.ItemStorage;

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
