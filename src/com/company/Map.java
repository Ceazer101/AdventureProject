package com.company;

public class Map {
    private Room starterRoom;

    public Map() {
        Room room1 = new Room("room1", "in room 1");
        Room room2 = new Room("room2", "in room 2");
        Room room3 = new Room("room3", "in room 3");
        Room room4 = new Room("room4", "in room 4");
        Room room5 = new Room("room5", "in room 5");
        Room room6 = new Room("room6", "in room 6");
        Room room7 = new Room("room7", "in room 7");
        Room room8 = new Room("room8", "in room 8");
        Room room9 = new Room("room9", "in room 9");

        room1.setEast(room2);
        room1.setSouth(room4);
        room2.setEast(room3);
        room3.setSouth(room6);
        room4.setSouth(room7);
        room5.setSouth(room8);
        room6.setSouth(room9);
        room7.setEast(room8);
        room8.setEast(room9);

        starterRoom = room1;
    }

    public Room getStarterRoom() {
        return starterRoom;
    }
}
