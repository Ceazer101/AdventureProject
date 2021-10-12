package com.company;

import java.util.ArrayList;

public class Player {

    private Room currentRoom;
    private ArrayList<Item> inventory;
    private String playerName;
    private int playerHealth;
    private Weapon equippedWeapon;


    public Player(String playerName, int playerHealth) {
        this.playerName = playerName;
        this.playerHealth = playerHealth;
        inventory = new ArrayList<>();
    }

    public Weapon getEquippedWeapon() {
        return equippedWeapon;
    }

    public void setEquippedWeapon(Weapon equippedWeapon) {
        this.equippedWeapon = equippedWeapon;
    }

    public int getPlayerHealth() {
        return playerHealth;
    }

    public void addPlayerHealth(int playerHealth) {
        this.playerHealth = playerHealth;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public ArrayList<Item> getInventory() {
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
        if (requestedRoom != null) {
            currentRoom = requestedRoom;
        }
        return requestedRoom;

    }


    private Item findItem(String item) {
        for (int i = 0; i < currentRoom.getItems().size(); i++) {
            Item itemSearch = currentRoom.getItems().get(i);
            if (itemSearch.getItemName().equals(item)) {
                return itemSearch;
            }
        }
        return null;
    }


    public boolean takeItem(String itemName) {
        Item item = findItem(itemName);
        if (item != null) {
            inventory.add(item);
            currentRoom.getItems().remove(item);
            return true;
        }
        return false;
    }

    public boolean dropItem(String itemName) {
        Item item = findInventoryitem(itemName);
        if (item != null) {

            if(item == equippedWeapon) {
                setEquippedWeapon(null);
            }
                currentRoom.addRoomItem(item);
                inventory.remove(item);
                return true;
            
        }
        return false;
    }

    private Item findInventoryitem(String item) {
        for (Item itemSearch : inventory) {
            if (itemSearch.getItemName().equals(item)) {
                return itemSearch;
            }
        }
        return null;
    }

    public ItemStatus eatFood(String itemName) {
        Item item = findInventoryitem(itemName);
        int HP = getPlayerHealth();

        if (item != null) {
            if (item instanceof Food) {
                inventory.remove(item);
                addPlayerHealth(HP + ((Food) item).getFoodHP());
                return ItemStatus.ALLGOOD;
            } else {
                return ItemStatus.NOTGOOD;
            }
        } else {
            return ItemStatus.DOESNOTEXIST;
        }
    }

    public ItemStatus equipWeapon(String weaponName) {
        Item weapon = findInventoryitem(weaponName);

        if (weapon != null) {
            if (weapon instanceof Weapon) {
                setEquippedWeapon((Weapon) weapon);
                return ItemStatus.ALLGOOD;
            } else {
                return ItemStatus.NOTGOOD;
            }
        } else {
            return ItemStatus.DOESNOTEXIST;
        }
    }





}
