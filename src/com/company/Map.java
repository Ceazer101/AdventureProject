package com.company;

import java.util.ArrayList;

public class Map {
    private Room starterRoom;

    public Map() {
        Room room1 = new Room("Classroom 436", "You find yourself in a cold and dark room, \n" +
                "that enhances your anxiety by the minute, you're in classroom 436\n" +
                "you have to move with haste");
        Room room2 = new Room("Restrooms", "You hit a wall of a terrible stench, \n" +
                "you look up and see a ceiling barraged by wet paper balls, you're in the restroom\n" +
                "GET OUT NOW!!!");
        Room room3 = new Room("Code Lab", "You come across another soul trapped in a room called Code lab, \n" +
                "the kind soul informs you that he is a student guide, \n" +
                "and tells you the treasure is located in the middle of the maze");
        Room room4 = new Room("Cafeteria", "Already from a far distance you smell something pleasant for once, \n" +
                "you're now arriving in the cafeteria where you replenish your strength with delicious food");
        Room room5 = new Room("Guld Bar", "You have done it, you found the golden beverages of Guld bar - \n" +
                "you won! stay here for as long as you want or till 10 o'clock");
        Room room6 = new Room("Libary", "You are overwhelmed by all the wisdom and knowledge of this place, \n" +
                "you are in the libary, you feel relaxed, you could stay here for hours, \n" +
                "but you have to keep moving");
        Room room7 = new Room("Café", "You take a break and restore your energy \n" +
                "with cup of coffee from 'nespresso what else' and maybe some cake");
        Room room8 = new Room("Smoking area", "This is the smoking area, \n" +
                "you feel your lungs being filled with fumes of tar and other nasty chemicals, \n" +
                "you feel strangly social but for health reasons we recommend leaving the heavy cloud immediately");
        Room room9 = new Room("Cinema", "You're in something called the cinema, \n" +
                "you could take a nap or fight your way through this new Micheal Bay movie");

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

        room1.addRoomItem(new Item("flashlight", "There is a small flashlight on a desk"));
    }

    public Room getStarterRoom() {
        return starterRoom;
    }

}
