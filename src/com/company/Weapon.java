package com.company;

public class Weapon extends Item{
    private int weaponDMG;

    public Weapon(String itemName, String itemDesription, int weaponDMG){
        super(itemName,itemDesription);
        this.weaponDMG = weaponDMG;
    }

}
