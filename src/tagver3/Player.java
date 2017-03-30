package tagver3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Zack
 */
public class Player extends Inventory{

    @Override
    public int getInventorySize() {
        return super.getInventorySize(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Accessories getItemAt(int index) {
        return super.getItemAt(index); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Accessories removeItem(Accessories item) {
        return super.removeItem(item); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addItem(Accessories a1) {
        super.addItem(a1); //To change body of generated methods, choose Tools | Templates.
    }

    String name;
    int health;
    private Room location;
    private int roomNr;
    private int playerGold;
    private Accessories[] pickUp;
    private List <Accessories> newList;
    
    public Player(String name, int health, int roomNr, int playerGold) {
        this.name = name;
        this.health = health;
        this.roomNr = roomNr;
        this.playerGold = playerGold;
        
    }
  
    public List<Accessories> getNewList() {
        return newList;
    }

    public void setNewList(List<Accessories> newList) {
        this.newList = newList;
    }

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
