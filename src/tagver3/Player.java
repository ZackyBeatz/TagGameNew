package tagver3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Zack
 */
public class Player{

    String name;
    int health;
    private Room location;
    private int roomNr;
    private int playerGold;
    private Accessories[] pickUp;
    private List <Accessories> inventory;
    
    public Player(String name, int health, int roomNr, int playerGold) {
        this.name = name;
        this.health = health;
        this.roomNr = roomNr;
        this.playerGold = playerGold;
        this.inventory = new ArrayList<>();
    }

    public List<Accessories> getInventory() {
        return inventory;
    }

    
    public int getPlayerGold() {
        return playerGold;
    }

    public void setPlayerGold(int playerGold) {
        this.playerGold = playerGold;
    }

    public int getRoomNr() {
        return roomNr;
    }

    public void setRoomNr(int roomNr) {
        this.roomNr = roomNr;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  "" + name + "";
    }

    public void setName(String name) {
        this.name = name;
        name= name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setLocation(Room location) {
        this.location = location;
    }

    public Room getLocation() {
        return location;
    }

 

}
