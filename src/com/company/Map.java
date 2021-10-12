package com.company;

public class Map {
    private final Room starterRoom;

    public Map() {
        Room room1 = new Room(" Room1: Classroom 436", """
                You find yourself in a cold and dark room,
                that enhances your anxiety by the minute, you're in classroom 436
                you have to move with haste""");
        Room room2 = new Room("Room2: Restrooms", """
                You hit a wall of a terrible stench,
                you look up and see a ceiling barraged by wet paper balls, you're in the restroom
                GET OUT NOW!!!""");
        Room room3 = new Room("Code Lab", """
                You come across another soul trapped in a room called Code lab,
                the kind soul informs you that he is a student guide,
                and tells you the treasure is located in the middle of the maze""");
        Room room4 = new Room("Cafeteria", "Already from a far distance you smell something pleasant for once, \n" +
                "you're now arriving in the cafeteria where you replenish your strength with delicious food");
        Room room5 = new Room("Guld Bar", "You have done it, you found the golden beverages of Guld bar - \n" +
                "you won! stay here for as long as you want or till 10 o'clock");
        Room room6 = new Room("Library", """
                You are overwhelmed by all the wisdom and knowledge of this place,
                you are in the library, you feel relaxed, you could stay here for hours,
                but you have to keep moving""");
        Room room7 = new Room("Cafe", "You take a break and restore your energy \n" +
                "with cup of coffee from 'nespresso what else' and maybe some cake");
        Room room8 = new Room("Smoking area", """
                This is the smoking area,
                you feel your lungs being filled with fumes of tar and other nasty chemicals,
                you feel strangely social but for health reasons we recommend leaving the heavy cloud immediately""");
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

        room1.addRoomItem(new Item("light", "it's a flashlight that looks worn but still works"));
        room4.addRoomItem(new Item("food", "delicous footlong sandwich"));
        room7.addRoomItem(new Item("beans", "A big bag of coffeebeans"));
        room5.addRoomItem(new Item("beer", "cold refreshment of goldbeer"));
        room5.addRoomItem(new Item("soda", "cold refreshment of fizzy drink"));
        room6.addRoomItem(new Item("book", "political book of various propaganda's"));
        room9.addRoomItem(new Item("cat", "a small and timid furry friend"));

        room1.addRoomItem(new ShootingWeapon("gun","a classis revolver", 10, 15));
        room2.addRoomItem(new MeleeWeapon("knife", "a very sharp japanese knife with silver blade", 25));

        room1.addRoomItem(new Food("sandwich", "Chicken Sandwich from the cantine", 20));

        room2.addRoomEnemy(new Enemy("Orc", " a nastly looking ugly smeagol", " knife", 10));
        room1.addRoomEnemy(new Enemy("Peter", " a gentle catloving person", "Mac", 50));
        room3.addRoomEnemy(new Enemy("Hulk", "a green giant ", "fist", 100));

    }
    public Room getStarterRoom() {
        return starterRoom;
    }

}
