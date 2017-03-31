package tagver3;


import java.util.List;
import java.util.Scanner;
import tagver3.ItemsFactories.Armor;
import tagver3.ItemsFactories.HealingPotions;
import tagver3.ItemsFactories.PrettyDolls;
import tagver3.ItemsFactories.Weapons;

/**
 *
 * @author Zack
 */
public class GameController {

    private boolean invalidInput = true;

    Room[][] roomMatrix = new RoomFactory().createRooms();
    String helpInput;
    Boundery b = new Boundery();
  


    boolean gamerun;

    public void runGame(Player n1) {
        n1.setLocation(roomMatrix[0][0]);
        b.chooseRoomStart();

        Scanner rumA = new Scanner(System.in);
        String enterchoice = rumA.next();

        if (enterchoice.equals("1")) {
            System.out.println(n1.getLocation());
            gamerun = true;
        }

        while (gamerun) {

            boolean game;
            Scanner userInput = new Scanner(System.in);

            // initalise room
            game = true;
            while (game) {

                if (n1.getRoomNr() == 9) {
                    System.out.println(n1.getName() + ", You won");
                    System.out.println("You collected " + n1.getPlayerGold() + " gold coins" + "\n"
                            + "--------------------------------------------------------------------");
                    n1.HighScores();
                    restartGame(n1);
                }

                invalidInput = true;
                while (invalidInput) {
                    if (n1.getHealth() < 1) {

                        System.out.println("You Died. Game Over");
                        n1.HighScores();
                        restartGame(n1);

                    }

                    b.chooseDirection();

                    String brugerInput = userInput.nextLine();
                    if (brugerInput.equalsIgnoreCase("help")) {
                        Help(n1);
                    }

                    // ROOM NORTH
                    if (brugerInput.charAt(0) == 'n') {
                        if (n1.getLocation().getNorth() != null) {
                            direction(n1, n1.getLocation().getNorth());
                            System.out.println(n1.getLocation());
                        } // IF NO ROOM TO THAT DIRECTION
                        else {
                            System.out.println("No room north for room " + n1.getRoomNr() + "\n"
                                    + "--------------------------------------------------------------------");
                        }
                    }

                    // ROOM SOUTH
                    if (brugerInput.charAt(0) == 's') {
                        if (n1.getLocation().getSouth() != null) {
                            direction(n1, n1.getLocation().getSouth());
                        } // IF NO ROOM TO THAT DIRECTION
                        else {
                            System.out.println("No room south for room " + n1.getRoomNr() + "\n"
                                    + "--------------------------------------------------------------------");
                        }
                    }

                    // ROOM EAST
                    if (brugerInput.charAt(0) == 'e') {
                        if (n1.getLocation().getEast() != null) {
                            direction(n1, n1.getLocation().getEast());
                        } // IF NO ROOM TO THAT DIRECTION
                        else {
                            System.out.println("No room east for room " + n1.getRoomNr() + "\n"
                                    + "--------------------------------------------------------------------");
                        }
                    }

                    // ROOM WEST
                    if (brugerInput.charAt(0) == 'w') {
                        if (n1.getLocation().getWest() != null) {
                            direction(n1, n1.getLocation().getWest());
                        } // // IF NO ROOM TO THAT DIRECTION
                        else {
                            System.out.println("No room west for room " + n1.getRoomNr() + "\n"
                                    + "--------------------------------------------------------------------");
                        }
                    }

                }
            }

        }

        // after the into player was asked if he was a coward or not this is if he was a coward and ends the game. 
        if (enterchoice.equals("0")) {
            gameOver(n1);
            gamerun = false;

        }
        if (!(enterchoice.equals("0") || enterchoice.equals("1"))) {
            System.out.println("Say what!");
            runGame(n1);
        }

    }

    private void direction(Player n1, Room nextRoom) {
        invalidInput = false;

        // sætter vores ny position for spilleren
        n1.setLocation(nextRoom);
        n1.setRoomNr(n1.getLocation().getCurrentRoom());
        
        
        // SETTING THE ARRAY OF ITEMS FROM ROOM TO PLAYER PICKUP
      // n1.setInventory(n1.getLocation().getRoomItem());
        // ACCESSING THE FIRST ITEM ON THE ARRAY OF ITEMS PICKED UP FROM A ROOM
        
        int gold = nextRoom.getGold();
        int health = n1.getHealth();
        
        HealingPotions item1 =nextRoom.getRoomItem1();
        Weapons item2 = nextRoom.getRoomItem2();
        Armor item3 = nextRoom.getRoomItem3();
        PrettyDolls item4 = nextRoom.getRoomItem4();
        
        n1.setPlayerGold(n1.getPlayerGold() + gold);
        nextRoom.setGold(0);
        n1.setHealth(health - 10);
      
       
       System.out.println("You found " + gold + " gold coins and \n");
        
   
        
        if(item1!=null){
        System.out.println(""+item1+"  \n");
        
        }
        if(item2!=null){
        System.out.println(""+item2+"  \n");
        }
        if(item3!=null) {
        System.out.println(""+item3+"  \n");
        }
        if (item4!=null) {
        System.out.println(""+item4+"  \n");
        }   
        
        
        //System.out.println("" + n1.getLocation() + "\n");
        
    }
 
    public void Help(Player n1) {

        b.helpMenu(n1);
        
// We might consider a switch case thingy here it might be prettier

        if (b.helpInput.equalsIgnoreCase("exit")) {
            invalidInput = true;
            System.out.println("You are still in room " + n1.getRoomNr());
        }
        if (b.helpInput.equalsIgnoreCase("gold")) {
            System.out.println("You have collected:  " + n1.getPlayerGold() + " gold pieces");
            Help(n1);
        }

        if (b.helpInput.equalsIgnoreCase("health")) {
            System.out.println("Your health is at:  " + n1.getHealth() + " %");
            Help(n1);
        }
        
        if (b.helpInput.equalsIgnoreCase("search")){
            Search(n1, n1.getLocation());
        }

        if (b.helpInput.equalsIgnoreCase("quit")) {
            gameOver(n1);
            System.exit(0);
        }
        if (b.helpInput.equalsIgnoreCase("sack")) {
            printBackPack(n1);
            b.rucksackOptions(n1);
            
            
            
            // nested if statements not pretty
            if (b.itemchoice.equalsIgnoreCase("items")) {
               
                System.out.println("");
                
                //display items in rucksack here
                b.rucksackOptions(n1);
                
            }
            if (b.itemchoice.equalsIgnoreCase("help")) {
                Help(n1);
                
            }
            invalidInput = false;
        }
    }

    public void restartGame(Player n1) {

        Scanner exitopt = new Scanner(System.in);
        System.out.println("Do you wanna play again? Type 'Yes' for yes og 'No' for no");
        String startover = exitopt.nextLine();

        if (startover.equalsIgnoreCase("no")) {
            System.out.println("Thank you for playing  "+n1.getName()+" !");
            System.exit(0);
        }

        if (startover.equalsIgnoreCase("yes")) {
            n1.setHealth(100);
            n1.setLocation(roomMatrix[0][0]);
            n1.setRoomNr(1);
            System.out.println(n1.getRoomNr() + "  " + n1.getLocation());
            gamerun = true;

        } else {
            restartGame(n1);
        }

    }

    public void gameOver(Player n1) {

        System.out.println("Bye  " + n1.getName() + "  Game Over");
        

    }
    
     private void Search(Player n1, Room nextRoom){  
        Scanner putinsack = new Scanner (System.in);
        invalidInput = false;

        // sætter vores ny position for spilleren
        n1.setLocation(nextRoom);
        n1.setRoomNr(n1.getLocation().getCurrentRoom());
        
        // SETTING THE ARRAY OF ITEMS FROM ROOM TO PLAYER PICKUP
      // n1.setInventory(n1.getLocation().getRoomItem());
        // ACCESSING THE FIRST ITEM ON THE ARRAY OF ITEMS PICKED UP FROM A ROOM
        
        HealingPotions item1 =nextRoom.getRoomItem1();
        Weapons item2 = nextRoom.getRoomItem2();
        Armor item3 = nextRoom.getRoomItem3();
        PrettyDolls item4 = nextRoom.getRoomItem4();
        
        
       System.out.println("You found: \n");
        
  
        if(item1!=null){
        System.out.println(""+item1+"  \n");
        
        }
        if(item2!=null){
        System.out.println(""+item2+"  \n");
        }
        if(item3!=null) {
        System.out.println(""+item3+"  \n");
        }
        if (item4!=null) {
        System.out.println(""+item4+"  \n");
        }   
        
         System.out.println("Do you want to put any of these items in your backpack?");
         String putinyes = putinsack.nextLine();
         
         
         if (putinyes.equalsIgnoreCase("yes")){
               if(item1!=null){
               n1.getBackPack().add(item1);
               }
               if(item2!=null){
               n1.getBackPack().add(item2);
               }
               if(item3!=null) {
               n1.getBackPack().add(item3);
               }
               if (item4!=null) {
               n1.getBackPack().add(item4);
               }
             
             System.out.println("You have added some items to your backpack");
         }
         
         
       
         
     }
        
       public static void printBackPack(Player n1){
             for (int i = 0; i < n1.getBackPack().size(); i++) {
                 System.out.println(n1.getBackPack().get(i).toString());
             }
         }

}
