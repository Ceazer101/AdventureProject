package com.company;

public class ShootingWeapon extends Weapon {
    private int usesLeft;

    public ShootingWeapon(String itemName, String itemDescription, int weaponDamage) {
        super(itemName, itemDescription, weaponDamage);
        this.usesLeft = usesLeft;
    }

    public int getUsesLeft() {
        return usesLeft;
    }

}



