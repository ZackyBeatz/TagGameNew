
package tagver3.ItemsFactories;

import tagver3.Items;

/**
 *
 * @author Ticondrus
 */
public class Weapons extends Items {
    private int weapons;
    String descriptionweapons;
    String weaponsname;
  
    public String getWeaponsname() {
        return weaponsname;
    }

    public void setWeaponsname(String weaponsname) {
        this.weaponsname = weaponsname;
    }

    public Weapons(int weapons, String descriptionweapons, String weaponsname) {
        this.weapons = weapons;
        this.descriptionweapons = descriptionweapons;
        this.weaponsname = weaponsname;
    }

    
    public String getDescriptionweapons() {
        return descriptionweapons;
    }

    public void setDescriptionweapons(String descriptionweapons) {
        this.descriptionweapons = descriptionweapons;
    }
    
    
    public int getWeapons() {
        return weapons;
    }

    public void setWeapons(int weapons) {
        this.weapons = weapons;
    }

  
      @Override
    public String toString() {
        return"  " +weaponsname + "  " + descriptionweapons  +  "Damage:" + weapons;
    }


}
