package tagver3;

import java.io.BufferedWriter;
import java.io.File;
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
    
    
    public static void printMethod(){
        try {
            String text = "Your sample content to save in a text file.";
            BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Users\\Zack\\Documents\\TextBasedGame\\sample.txt"));
            out.write(text);
            out.close();
        }
        catch (IOException e)
        {
            System.out.println("Exception ");       
        }

        return ;
    }
}
        


