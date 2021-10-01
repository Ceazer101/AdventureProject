package com.company;

import java.util.ArrayList;

public class Room {
    private String name;
    private String description;
    private Room north;
    private Room east;
    private Room south;
    private Room west;
    private ArrayList<Item> items = new ArrayList<>();

    public Room (String name, String description){
        this.name = name;
        this.description = description;
    }

    public ArrayList<Item> getItems(){
        return items;
    }

    public void addRoomItem (Item item){
        this.items.add(item);
    }

    public ArrayList removeRoomItem (String item){
        items.remove(item);
        return items;
    }

    public String getDescription(){
        return description;
    }

    public String getName(){
        return name;
    }

    public void setNorth(Room north){
        if (this.north == null){
            this.north = north;
            north.setSouth(this);
        }
    }
    public void setEast(Room east){
        if (this.east == null){
            this.east = east;
            east.setWest(this);
        }
    }
    public void setSouth(Room south){
        if (this.south == null){
            this.south = south;
            south.setNorth(this);
        }
    }
    public void setWest(Room west){
        if (this.west == null){
            this.west = west;
            west.setEast(this);
        }
    }

    public Room getNorth(){
        return north;
    }

    public Room getEast(){
        return east;
    }

    public Room getSouth(){
        return south;
    }

    public Room getWest(){
        return west;
    }

}
