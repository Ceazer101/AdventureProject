package com.company;

public  class Item {

    private final String itemName;
    private final String itemDescription;
    //(private int itemWeight;

    public Item(String itemName, String itemDescription){
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        //this.itemWeight = itemWeight;
    }

    public String getItemName(){
        return itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    @Override
    public String toString() {

        return itemName + ", " + itemDescription + ".";
    }

}
