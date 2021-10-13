package com.company;

public class MeleeWeapon extends Weapon {
    private int usesLeft;

    @Override
    public int getUses() {
        return usesLeft;
    }

    public MeleeWeapon(String itemName, String itemDescription, int damage){
        super(itemName,itemDescription,damage);
    }
}
