package com.company;

public class ShootingWeapon extends Weapon {

    private int usesLeft;

    public ShootingWeapon(String itemName, String itemDescription, int damage, int usesLeft) {
        super(itemName, itemDescription, damage);
        this.usesLeft = usesLeft;
    }

    @Override
    public int getUses() {
        return usesLeft;
    }

}





