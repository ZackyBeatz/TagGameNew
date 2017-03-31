package tagver3;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    private ArrayList <Items> backPack = new ArrayList<>();

   
    public Player(String name, int health, int roomNr, int playerGold) {
        this.name = name;
        this.health = health;
        this.roomNr = roomNr;
        this.playerGold = playerGold;
        
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

          public void HighScores() {
              
              
                  try {
                      PrintWriter print = new PrintWriter("HighScores.txt");
                      print.println("High scores:"+name+"  "+getPlayerGold());
                FileWriter writer;
                writer = new FileWriter("C:/Users/Ejer/Desktop/Datamatiker/TagGame2/TagGameNew/src/tagver3/HighScores.txt", true);
                System.out.println("High scores:"+name+"  "+getPlayerGold());
            } catch (IOException ex) {
                Logger.getLogger(TextBasedGame.class.getName()).log(Level.SEVERE, null, ex);
                ex.printStackTrace();
               
            }
 
          }
          
          
    public ArrayList<Items> getBackPack() {
        return backPack;
    }
}
