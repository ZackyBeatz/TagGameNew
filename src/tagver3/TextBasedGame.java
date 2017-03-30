package tagver3;

/**
 *
 * @author Zack
 */
public class TextBasedGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
//        GameController g = new GameController();
//        Boundery b = new Boundery();
//
//        b.askNamed();
//        b.intro();
//        g.runGame();

         Inventory in1 = new Inventory();
         Accessories a1 = new Accessories("Sword", "Fire");
         Accessories a2 = new Accessories("Gun", "Fire");
         
         in1.addItem(a1);
         in1.addItem(a2);
         
         in1.removeItem(a1);
         
         
         
         System.out.println(in1.getItemAt(0).getName());
    

    }

}
