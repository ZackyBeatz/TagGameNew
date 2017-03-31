package tagver3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zack
 */
public class TextBasedGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        GameController g = new GameController();
        Boundery b = new Boundery();
        String name = b.askNamed();
        Player n1 = new Player(name, 100, 1, 0);
        b.intro(n1);
        g.runGame(n1);
        
     
            

        
           
         
      
           
        }
}
        


