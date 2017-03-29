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
public class AccessFactory {
    
    
    // HERINDE KAN VI REDIGERE OG LAVE FLERE VÅBEN SAMT HEAL POTIONS...
    public Accessories[] createItems() {
        
       Accessories[] itemArr = new Accessories[3];
        
        itemArr[0] = new Accessories("Sword", "A magic sword that is most effective for x type of enemy");
        itemArr[0].setDamage(8);
        itemArr[1] = new Accessories("Gun", "A Gun that has a high damage on x type of enemy");
        itemArr[1].setDamage(10);
        
       
        
        
        return itemArr;
    }
    
    // Mixing Items for each room
    
    public Accessories[] mixedItems1() {
        
        Accessories[] itemArr = new Accessories[3];
        itemArr[0] = new Accessories("Sword", "A magic sword that is most effective for x type of enemy");
        itemArr[0].setDamage(8);
        itemArr[1] = new Accessories("Gun", "A Gun that has a high damage on x type of enemy");
        itemArr[1].setDamage(10);
        itemArr[2] = new Accessories("Heal Potion", "Heals player");
        itemArr[2].setHeal(10);
        
        return itemArr;   
    }
}
