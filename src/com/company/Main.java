package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;
        Room room1 = new Room("room1");
        Room room2 = new Room("room2");
        Room room3 = new Room("room3");
        Room room4 = new Room("room4");
        Room room5 = new Room("room5");
        Room room6 = new Room("room6");
        Room room7 = new Room("room7");
        Room room8 = new Room("room8");
        Room room9 = new Room("room9");

        room1.setEast(room2);
        room1.setSouth(room4);
        room2.setWest(room1);
        room2.setEast(room3);
        room3.setWest(room2);
        room3.setSouth(room6);
        room4.setNorth(room1);
        room4.setSouth(room7);
        room5.setSouth(room8);
        room6.setNorth(room3);
        room6.setSouth(room9);
        room7.setNorth(room4);
        room7.setEast(room8);
        room8.setNorth(room5);
        room8.setEast(room9);
        room8.setWest(room7);
        room9.setNorth(room6);
        room9.setWest(room8);

        Room currentRoom = room1;

        //  print velkomst
        System.out.println("Welcome to Adventure");
        System.out.println("introduction, go north, go south, go east, go west");
        System.out.println("Room intro"); //Room1 intro lav variabel
        System.out.println("what do you want to do?");


        // Direktion handlinger
        boolean gameOn = true;
        while (gameOn) {
            userInput = scanner.nextLine();
            if ("go north".equals(userInput)) {
                if (currentRoom.getNorth() == null) {
                    System.out.println("You cannot go that way");
                } else {
                    System.out.println("Going north");
                    currentRoom = currentRoom.getNorth();
                    System.out.println(currentRoom.getDescription());

                }

            } else if ("go east".equals(userInput)) {
                if (currentRoom.getEast() == null) {
                    System.out.println("You cannot go that way");
                } else {
                    System.out.println("Going east");
                    currentRoom = currentRoom.getEast();
                    System.out.println(currentRoom.getDescription());
                }

            } else if ("go south".equals(userInput)) {
                if (currentRoom.getSouth() == null) {
                    System.out.println("You cannot go that way");
                } else {
                    System.out.println("Going south");
                    currentRoom = currentRoom.getSouth();
                    System.out.println(currentRoom.getDescription());
                }

            } else if ("go west".equals(userInput)) {
                if (currentRoom.getWest() == null) {
                    System.out.println("You cannot go that way");
                } else {
                    System.out.println("Going west");
                    currentRoom = currentRoom.getWest();
                    System.out.println(currentRoom.getDescription());
                }

                // andre handlinger
            } else if ("look".equals(userInput)) {
                System.out.println(currentRoom.getDescription());

            } else if ("help".equals(userInput)) {
                System.out.println("""
                        You can use the following commands: 
                        go north
                        go east
                        go south
                        go west
                        look
                        help
                        exit
                        """);

            } else if ("exit".equals(userInput)) {
                gameOn = false;
            } else {
                System.out.println("What do you mean? I dont know what " + userInput + " is");
            }

        }

    }


}


