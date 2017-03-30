package tagver3;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Zack
 */
public class GameController {

    private boolean invalidInput = true;
   
    
    Room[][] roomMatrix = new RoomFactory().createRooms();
    String helpInput;
    Boundery b = new Boundery();
//    String name = b.named;
    
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
                    restartGame(n1);
                }

                invalidInput = true;
                while (invalidInput) {
                    if (n1.getHealth() < 1) {

                        System.out.println("You Died. Game Over");
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
       // n1.setPickUp(n1.getLocation().getRoomItem());
        
        // ACCESSING THE FIRST ITEM ON THE ARRAY OF ITEMS PICKED UP FROM A ROOM
       // n1.getPickUp()[0].getHeal();
       //n1.getPickUp()[0].getName();

        int gold = nextRoom.getGold();
        int health = n1.getHealth();
        n1.setPlayerGold(n1.getPlayerGold() + gold);
        nextRoom.setGold(0);
        
        n1.setHealth(health - 10);
       
        
        System.out.println("You found " + gold + " gold coins" + "\n");
        //System.out.println("Your health is " + n1.getHealth() + "\n");

    }

   public void Help(Player n1) {

        b.helpMenu();
        
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
        
        if (b.helpInput.equalsIgnoreCase("quit")) {
            gameOver(n1);
            System.exit(0);
        }
        if (b.helpInput.equalsIgnoreCase("sack")) {
            
            //display items in rucksack here
            b.rucksackOptions(n1);
            
            if (b.itemchoice.equalsIgnoreCase("items")){
                
                
                b.rucksackOptions(n1);
                
              System.out.println("Choose an item by typing it's name");//}
      
       
        
        
            }
                
            
            if (b.itemchoice.equalsIgnoreCase("help")) {
                Help(n1);
                //if (b.itemchoice is valid) {
                // return item;
            }
            invalidInput = false;
        }
    }

    public void restartGame(Player n1) {

        Scanner exitopt = new Scanner(System.in);
        System.out.println("Do you wanna play again? Press 1 for yes og 2 for no");
        String startover = exitopt.nextLine();

        if (startover.equalsIgnoreCase("2")) {
            System.out.println("Thank you for playing!");
            System.exit(0);
        }

        if (startover.equalsIgnoreCase("1")) {
            n1.setHealth(100);
            n1.setLocation(roomMatrix[0][0]);
            Class<? extends Room[][]> aClass;
            aClass = roomMatrix.getClass();
            n1.setRoomNr(1);
            System.out.println(n1.getRoomNr() + "  " + n1.getLocation() + "\n"
                    + "--------------------------------------------------------------------");
            gamerun = true;

        } else {
            System.out.println("Wrong Answer, the answer is '1' for yes or '2' for no!\n");
            restartGame(n1);
        }

    }

    public void gameOver(Player n1) {

        System.out.println("Bye  " + n1.getName() + "  Game Over");

    }
    
    
    
    public void showPlayerItems(Player n1){
            System.out.println("You currently have "+n1.getPickUp().length+" items");
           for(int i = 0; i < n1.getPickUp().length; i++) {
            System.out.println(n1.getPickUp()[i].getName());
        }
    }

}
