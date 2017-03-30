/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tagver3;

/**
 *
 * @author Ticondrus
 */
public class Weapons extends Items {

    private int weapons;
    
    String descriptionweapons;
    
    String weaponsname;

    public String getDescriptionweapons() {
        return descriptionweapons;
    }

    public void setDescriptionweapons(String descriptionarmor) {
        this.descriptionweapons = descriptionweapons;
    }
    
    public Weapons(int weapons, String descriptionweapons, String weaponsname) {
        
        this.weapons = weapons;
        this.descriptionweapons = descriptionweapons;
        this.weaponsname = weaponsname;
    }
    
    

    public Weapons(int weapons) {
        this.weapons = weapons;
    }

    @Override
    public String toString() {
        return "Weapons{" + "weapons=" + weapons + '}';
    }

    public int getWeapons() {
        return weapons;
    }

    public void setWeapons(int weapons) {
        this.weapons = weapons;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }


}
