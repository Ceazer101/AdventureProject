package com.company;

import java.util.ArrayList;

public class Player {

    private Room currentRoom;
    private ArrayList<Item> inventory = new ArrayList<>();


    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void playerMovement(String userInput) {
        if ("go north".equals(userInput) || "n".equals(userInput)) {
            moveTo(currentRoom.getNorth());


        } if ("go east".equals(userInput) || "e".equals(userInput)) {
            moveTo(currentRoom.getEast());


        } if ("go south".equals(userInput) || "s".equals(userInput)) {
            moveTo(currentRoom.getSouth());


        } if ("go west".equals(userInput) || "w".equals(userInput)) {
                moveTo(currentRoom.getWest());

        }

    }

    public void moveTo(Room requestedRoom) {
        if (requestedRoom == null) {
            System.out.println(Colour.red + "You cannot go that way \uD83D\uDED1" + Colour.green);
        } else {
            currentRoom = requestedRoom;
            System.out.println(currentRoom.getDescription());
        }
    }

    public void takeItem (String item){
        for (int i = 0; i < currentRoom.getItems().size(); i++) {
            Item itemSearch = currentRoom.getItems().get(i);
            if (itemSearch.getItemName().equals(item)){
                inventory.add(itemSearch);
                currentRoom.getItems().remove(item);
            }
        }
    }

    public ArrayList dropItem (String item){
        inventory.remove(item);
        return inventory;
    }
}
