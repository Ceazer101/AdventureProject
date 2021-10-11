package com.company;

import java.util.ArrayList;

public class Player {

    private Room currentRoom;
    private ArrayList<Item> inventory;
    private String playerName;
    private int playerHealth;

    public Player (String playerName, int playerHealth){
        this.playerName = playerName;
        this.playerHealth= playerHealth;
        inventory = new ArrayList<>();
    }

    public int getPlayerHealth() {
        return playerHealth;
    }

    public void setPlayerHealth(int playerHealth) {
        this.playerHealth = playerHealth;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
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

    public Room playerMovement(String userInput) {
        Room requestedRoom = null;
        if ("north".equals(userInput) || "n".equals(userInput)) {
            requestedRoom = currentRoom.getNorth();



        } else if ("east".equals(userInput) || "e".equals(userInput)) {
            requestedRoom = currentRoom.getEast();


        } else if ("south".equals(userInput) || "s".equals(userInput)) {
            requestedRoom = currentRoom.getSouth();


        } else if ("west".equals(userInput) || "w".equals(userInput)) {
            requestedRoom = currentRoom.getWest();

        }
        if(requestedRoom != null) {
            currentRoom = requestedRoom;
        }
            return requestedRoom;

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
