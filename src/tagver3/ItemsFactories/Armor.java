/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tagver3.ItemsFactories;

import tagver3.Items;

/**
 *
 * @author Ticondrus
 */
public class Armor extends Items {

   
    private int protect;
    String descriptionarmor;
    String armorname;
    
    
    public int getProtect() {
        return protect;
    }

    public void setProtect(int protect) {
        this.protect = protect;
    }
   
   
    public String getDescriptionarmor() {
        return descriptionarmor;
    }

    public void setDescriptionarmor(String descriptionarmor) {
        this.descriptionarmor = descriptionarmor;
    }

    public Armor(int protect, String descriptionarmor, String armorname) {
        this.protect = protect;
        this.descriptionarmor = descriptionarmor;
        this.armorname = armorname;
    }

  

    public String getArmorname() {
        return armorname;
    }

    public void setArmorname(String armorname) {
        this.armorname = armorname;
    }
 @Override
    public String toString() {
        return "  " + descriptionarmor + "  " + armorname + "Decrease attack by:  " + protect;
    }
  

 


  
}
