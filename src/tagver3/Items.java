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
public class Items {
    
    private int use;
    private int amount;
    private int damage;
    
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    
    public void use(Enemy e1){
        e1.setHealth(e1.getHealth()-damage);
    }
    
    
}
