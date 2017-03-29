package tagver3;

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
    String name = b.named;
    Player n1 = new Player(name, 100, roomMatrix[0][0], 1, 0);
    boolean gamerun;
    
  

    public void runGame() {
       
        
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
                    System.out.println("You won");
                    System.out.println("You collected " + n1.getPlayerGold() + " gold coins" + "\n"
                            + "--------------------------------------------------------------------");
                    restartGame();
                }

                invalidInput = true;
                while (invalidInput) {
                    if (n1.getHealth() < 1) {

                        System.out.println("You Died. Game Over");
                        restartGame();

                    }
                 
                    b.chooseDirection();

                    String brugerInput = userInput.nextLine();
                    if (brugerInput.equalsIgnoreCase("help")) {
                        help();
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
            gameOver();
            gamerun = false;

        }
        if (!(enterchoice.equals("0") || enterchoice.equals("1"))) {
            System.out.println("Say what!");
            runGame();
        }

    }
    

    private void direction(Player n1, Room nextRoom) {
        invalidInput = false;

        // sætter vores ny position for spilleren
        n1.setLocation(nextRoom);

        n1.setRoomNr(n1.getLocation().getCurrentRoom());

        int gold = nextRoom.getGold();
        int health = n1.getHealth();
        n1.setPlayerGold(n1.getPlayerGold() + gold);
        nextRoom.setGold(0);
        
        n1.setHealth(health - 10);

        System.out.println("" + n1.getLocation() + "\n");
        System.out.println("You found " + gold + " gold coins" + "\n");
        //System.out.println("Your health is " + n1.getHealth() + "\n");

    }

    public void help() {
        b.helpMenu();
        Scanner scanHelp = new Scanner(System.in);
        helpInput = scanHelp.nextLine();
        if (helpInput.equalsIgnoreCase("exit")) {
            invalidInput = true;
            System.out.println("You are still in room " + n1.getRoomNr());
        }
        if (helpInput.equalsIgnoreCase("gold")) {
            System.out.println("You have collected:  " + n1.getPlayerGold() + " gold pieces");
        }

        if (helpInput.equalsIgnoreCase("health")) {
            System.out.println("Your health is at:  " + n1.getHealth() + " %");
        }
        if (helpInput.equalsIgnoreCase("quit")) {
            gameOver();
            System.exit(0);
        }

        invalidInput = false;
    }

    public void restartGame() {

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
            restartGame();
        }

    }

    public void gameOver() {

        System.out.println("Bye  " + name + "  Game Over");

    }

}
