package com.company;

public  class Item {

    private String itemName;
    private  String itemDescription;
    private int itemWeight;

    public Item(String itemName, String itemDescription){
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemWeight = itemWeight;
    }

    public String getItemName(){
        return itemName;
    }
    @Override
    public String toString() {

        return itemName + ", " + itemDescription;
    }
}
