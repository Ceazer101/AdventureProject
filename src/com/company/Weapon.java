package com.company;

public class Weapon extends Item {

    private int weaponDamage;


    public Weapon(String itemName, String itemDescription, int weaponDamage) {
        super(itemName, itemDescription);
        this.weaponDamage = weaponDamage;
    }

    public void getWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }
    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

}
