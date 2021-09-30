package com.company;

public class Player {

    private Room currentRoom;

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
            System.out.println(Colours.red + "You cannot go that way \uD83D\uDED1" + Colours.green);
        } else {
            currentRoom = requestedRoom;
            System.out.println(currentRoom.getDescription());
        }
    }
}
