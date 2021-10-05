package com.company;

import java.util.ArrayList;

public class Player {

    private Room currentRoom;
    private ArrayList<Item> inventory;

    public Player (){
        inventory = new ArrayList<>();
    }

    public ArrayList<Item> getInventory(){
        return inventory;
    }


    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void playerMovement(String userInput) {
        if ("north".equals(userInput) || "n".equals(userInput)) {
            moveTo(currentRoom.getNorth());


        } if ("east".equals(userInput) || "e".equals(userInput)) {
            moveTo(currentRoom.getEast());


        } if ("south".equals(userInput) || "s".equals(userInput)) {
            moveTo(currentRoom.getSouth());


        } if ("west".equals(userInput) || "w".equals(userInput)) {
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

    public boolean takeItem (String item){
        for (int i = 0; i < currentRoom.getItems().size(); i++) {
            Item itemSearch = currentRoom.getItems().get(i);
            if (itemSearch.getItemName().equals(item)){
                inventory.add(itemSearch);
                currentRoom.getItems().remove(itemSearch);
                return true;
            }
        }
        return false;
    }

    public void take(String userInput){
        String itemName = userInput.substring(5);
        if (takeItem(itemName)){
            System.out.println(itemName + " has been added to your inventory");
        } else {
            System.out.println("This item: " + itemName + " does not exist here");
        }
    }

    public boolean dropItem (String item){
        for (int i = 0; i < inventory.size(); i++) {
            Item itemSearch = inventory.get(i);
            if (inventory.get(i).getItemName().equals(item)){
                currentRoom.addRoomItem(itemSearch);
                inventory.remove(itemSearch);
                return true;
            }
        }
        return false;
    }

    public void drop(String userInput){
        String itemName = userInput.substring(5);
        if (dropItem(itemName)){
            System.out.println(itemName + " has been removed from your inventory");
        } else {
            System.out.println("This item: " + itemName + " does not exist in inventory");
        }
    }


}
