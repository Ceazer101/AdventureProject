package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        Map map = new Map();

        Room currentRoom = map.getStarterRoom();

        String resetColour = "\u001B[0m";
        String black = "\u001B[30m";
        String red = "\u001B[31m";
        String green = "\u001B[32m";
        String yellow = "\u001B[33m";
        String blue = "\u001B[34m";
        String purple = "\u001B[35m";
        String cyan = "\u001B[36m";
        String white = "\u001B[37m";

        //  til skriv tekst
        System.out.println("Welcome to Adventure");
        System.out.println("");
        System.out.println("introduction: ");
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
            } else if ("look".equals(userInput) || "l".equals(userInput)) {
                System.out.println(currentRoom.getDescription());

            } else if ("help".equals(userInput) || "h".equals(userInput)) {
                System.out.println("""
                        You can use the following commands: 
                        go North / N
                        go East / E
                        go South / S
                        go West / W
                        Look / L
                        Help / H
                        Exit / E
                        """);

            } else if ("exit".equals(userInput) || "e".equals(userInput)) {
                gameOn = false;
                System.out.println("farvel");
            } else {
                System.out.println("What do you mean? I dont know what " + userInput + " is");
            }
        }
    }
}


