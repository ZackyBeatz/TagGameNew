/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tagver3;

/**
 *
 * @author Zack
 */
public class Inventory {
    private static final int MAX_INVENTORY = 100;
   
    private Accessories[] items = new Accessories[MAX_INVENTORY];
    
    
    public Inventory(){
    
    };
    
    public void addItem(Accessories a1){
        int slot = findFreeSlot();
        if (slot >=0) {
            items[slot] = a1;
        }
        
    }
    
    
     public Accessories removeItem(Accessories item) {
           for (int i=0;i<items.length;i++) {
                if (items[i].equals(item)) {
                      Accessories temp = items[i];
                      items[i] = null;
                      return temp;
                }
            }

            return null;
     }
    
    
     public Accessories getItemAt(int index) {
            return items[index];
     }

    
     public int getInventorySize() {
             return MAX_INVENTORY;
     }
    
    
     private int findFreeSlot() {
          for (int i=0;i<items.length;i++) {
               if (items[i] == null) {
                    return i;
               }
          }

          return -1;
     }
    
    
    
    
    
    
    
}
