package com.company;

public class Food extends Item{
    private int foodHP;

    public Food(String itemName, String itemDescription, int foodHP){
        super(itemName,itemDescription);
        this.foodHP = foodHP;
    }

    public int getFoodHP(){
        return foodHP;
    }

    @Override
    public String toString() {
        return "\n" + getItemName() + ", " + getItemDescription() + ", restores " + getFoodHP() + "HP";
    }
}
