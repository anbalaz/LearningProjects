package characters;

import items.GameItem;

import java.util.ArrayList;

public class Player extends GameCharacter {
    private ArrayList<GameItem> itinerary;

    public Player(ArrayList<GameItem> itinerary) {
        this.itinerary = itinerary;
    }

    public void addItemToItinerary(GameItem item) {
        itinerary.add(item);

    }


}
