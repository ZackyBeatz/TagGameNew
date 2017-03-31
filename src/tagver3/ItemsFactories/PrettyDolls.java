/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tagver3.ItemsFactories;

import tagver3.Items;

/**
 *
 * @author BenedikteEva
 */
public class PrettyDolls  extends Items {

   
    String name;
    String description;
    int stressrelease;
    
    
 public PrettyDolls(String name, String description, int stressrelease) {
        this.name = name;
        this.description = description;
        this.stressrelease = stressrelease;
    }

    PrettyDolls() {
      
    }

  
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStressrelease() {
        return stressrelease;
    }

    public void setStressrelease(int stressrelease) {
        this.stressrelease = stressrelease;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    @Override
    public String toString() {
        return "  " + name + "  " + description + "  Increases health by:  " + stressrelease;
    }


  
    
}
