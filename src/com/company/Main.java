package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;
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

        Room currentRoom = room1;

        String userActions = """
                        You can use the following commands: 
                        go north
                        go east
                        go south
                        go west
                        look
                        help
                        exit
                        """;

        //  til skriv tekst
        System.out.println("Welcome to Adventure");
        System.out.println("introduction: " + userActions);
        System.out.println(currentRoom.getDescription());
        System.out.println("what do you want to do?");


        // Direktion handlinger
        boolean gameOn = true;
        while (gameOn) {
            userInput = scanner.nextLine().toLowerCase();
            if ("go north".equals(userInput) || "n".equals(userInput)) {
                if (currentRoom.getNorth() == null) {
                    System.out.println("You cannot go that way");
                } else {
                    System.out.println("Going north");
                    currentRoom = currentRoom.getNorth();
                    System.out.println(currentRoom.getDescription());

                }

            } else if ("go east".equals(userInput) || "e".equals(userInput)) {
                if (currentRoom.getEast() == null) {
                    System.out.println("You cannot go that way");
                } else {
                    System.out.println("Going east");
                    currentRoom = currentRoom.getEast();
                    System.out.println(currentRoom.getDescription());
                }
                // tilføj flere input choices som "n, e, s, w"
            } else if ("go south".equals(userInput) || "s".equals(userInput)) {
                if (currentRoom.getSouth() == null) {
                    System.out.println("You cannot go that way");
                } else {
                    System.out.println("Going south");
                    currentRoom = currentRoom.getSouth();
                    System.out.println(currentRoom.getDescription());
                }

            } else if ("go west".equals(userInput) || "w".equals(userInput)) {
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
                System.out.println(userActions);

            } else if ("exit".equals(userInput)) {
                gameOn = false;
                // tilføj farvel tekst
            } else {
                System.out.println("What do you mean? I dont know what " + userInput + " is");
            }

        }

    }


}


