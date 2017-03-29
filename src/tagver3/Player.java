package tagver3;

import java.util.ArrayList;

/**
 *
 * @author Zack
 */
public class Player {

    public Player(String name, int health, Room location,  int roomNr, int playerGold) {
        this.name = name;
        this.health = health;
        this.location = location;
        this.roomNr = roomNr;
        this.playerGold = playerGold;
        
    }

    String name;
    int health;
    private Room location;
    private int roomNr;
    private int playerGold;
    private Accessories[] pickUp;

    public Accessories[] getPickUp() {
        return pickUp;
    }

    public void setPickUp(Accessories[] pickUp) {
        this.pickUp = pickUp;
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

    void getName(String named) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
