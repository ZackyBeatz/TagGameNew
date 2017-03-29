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
public class Accessories extends Items{
    private String Name;
    private String description;
    private int heal;

    public Accessories(String Name, String description) {
        this.Name = Name;
        this.description = description;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHeal() {
        return heal;
    }

    public void setHeal(int heal) {
        this.heal = heal;
    }

        
    // heals player method
    public void heal(Player n1){
        n1.setHealth(n1.getHealth()+heal);
    }
    
    
    @Override
    public void setDamage(int damage) {
        super.setDamage(damage); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getDamage() {
        return super.getDamage(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
