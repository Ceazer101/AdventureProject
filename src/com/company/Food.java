package com.company;

public class Food extends Item{
    private int foodHP;

    public Food(String itemName, String itemDescription, int foodHP){
        super(itemName,itemDescription);
        this.foodHP = foodHP;
    }

}
