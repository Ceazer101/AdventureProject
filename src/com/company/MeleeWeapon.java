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

    public void setUsesLeft(int usesLeft) {
        this.usesLeft = usesLeft;
    }

    public boolean isMelee(){
        if(true){
            setUsesLeft(9999);
        } else if (false){
            setUsesLeft(10);
        }
        return true;
    }
}
