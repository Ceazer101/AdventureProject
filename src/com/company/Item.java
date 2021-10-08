package com.company;

public class Item {

    private final String itemName;
    private final String itemDescription;
    private int itemWeight;

    public Item(String itemName, String itemDescription){
        this.itemName = itemName;
        this.itemDescription = itemDescription;
    }

    public String getItemName(){
        return itemName;
    }

    @Override
    public String toString() {

        return itemName + ", " + itemDescription;
    }
}
