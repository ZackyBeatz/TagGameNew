
package tagver3;

/**
 *
 * @author Zack
 */
public class Items {
    
    private int use;
    private int amount;
    private int damage;
    private int heal;
    
    
    
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    
    public void use(Enemy e1){
        e1.setHealth(e1.getHealth()-damage);
    }
    
    public void heal(Player n1){
        n1.setHealth(n1.getHealth()+heal);
    }
    
    
    
}
