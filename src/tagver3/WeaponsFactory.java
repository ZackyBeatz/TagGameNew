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
public class WeaponsFactory {
    
        public Weapons[] defineWeapons() {
        Weapons DefineWeapons[] = new Weapons[2];

        DefineWeapons[0] = new Weapons(1, "Sword is a standard mele weapon.", "Sword");

        DefineWeapons[1] = new Weapons(2, "Petriot Rocket Luncher is a powerful focket luncher wich do a hevy amount of damage.", "Petriot Misle Luncher");

        return DefineWeapons;

    }
       
        
}

