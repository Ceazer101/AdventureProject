package com.company;

public class ShootingWeapon extends Weapon {

    private int usesLeft;

    public ShootingWeapon(String itemName, String itemDescription, int damage, int usesLeft) {
        super(itemName, itemDescription, damage);
        this.usesLeft = usesLeft;
    }

    public void setUsesLeft(int usesLeft) {
        this.usesLeft = usesLeft;
    }

    @Override
    public int getUses() {
        return usesLeft;
    }

    @Override
    public boolean isMelee(){
        if(true){
            setUsesLeft(9999);
        } else if (false){
            setUsesLeft(10);
        }
        return false;
    }


}





