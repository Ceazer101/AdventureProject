package com.company;

public abstract class Weapon extends Item {

    private int damage;

    public Weapon(String itemName, String itemDescription, int damage) {
        super(itemName, itemDescription);
        this.damage = damage;
    }

    public void getWeaponDamage(int damage) {
        this.damage = damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public abstract int getUses();

    public String toString(){
        return "\n" + getItemName() + ", " + getItemDescription() + ".";
    }

}


