package com.company;

import java.util.Scanner;

public class Adventure {


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

        public void play() {
            System.out.println(cyan + "Welcome to Adventure.\n" + purple +
                    "You'll be traveling through maze of rooms,\n" +
                    "you're objective is to locate the treasure room\n" +
                    "Be careful not to get lost, in case you get lost on you're travels,\n" +
                    "you use the spell word called 'help' or foresee the map from the Fronter realm");
            System.out.println("");
            helpInfo();
            System.out.println(green + currentRoom.getDescription());
            System.out.println(blue + "Which direction will you take?" + green);

            boolean gameOn = true;
            while (gameOn) {
                userInput = scanner.nextLine().toLowerCase();
                if ("go north".equals(userInput) || "n".equals(userInput)) {
                    if (currentRoom.getNorth() == null) {
                        System.out.println(red + "You cannot go that way \uD83D\uDED1" + green);
                    } else {
                        System.out.println("Going north");
                        currentRoom = currentRoom.getNorth();
                        System.out.println(currentRoom.getDescription());
                    }

                } else if ("go east".equals(userInput) || "e".equals(userInput)) {
                    if (currentRoom.getEast() == null) {
                        System.out.println(red + "You cannot go that way \uD83D\uDED1" + green);
                    } else {
                        System.out.println("Going east");
                        currentRoom = currentRoom.getEast();
                        System.out.println(currentRoom.getDescription());
                    }

                } else if ("go south".equals(userInput) || "s".equals(userInput)) {
                    if (currentRoom.getSouth() == null) {
                        System.out.println(red + "You cannot go that way \uD83D\uDED1" + green);
                    } else {
                        System.out.println("Going south");
                        currentRoom = currentRoom.getSouth();
                        System.out.println(currentRoom.getDescription());
                    }

                } else if ("go west".equals(userInput) || "w".equals(userInput)) {
                    if (currentRoom.getWest() == null) {
                        System.out.println(red + "You cannot go that way \uD83D\uDED1" + green);
                    } else {
                        System.out.println("Going west");
                        currentRoom = currentRoom.getWest();
                        System.out.println(currentRoom.getDescription());
                    }

                    // andre handlinger
                } else if ("look".equals(userInput) || "l".equals(userInput)) {
                    System.out.println(currentRoom.getDescription());

                } else if ("help".equals(userInput) || "h".equals(userInput)) {
                    helpInfo();

                } else if ("exit".equals(userInput) || "x".equals(userInput)) {
                    gameOn = false;
                    exitText();

                } else {
                    System.out.println("What do you mean? I dont know what " + userInput + " is");
                }
            }
        }

        public void helpInfo(){
            System.out.println(yellow + """
                            You can use the following commands: 
                            go North / N
                            go East / E
                            go South / S
                            go West / W
                            look / L
                            help / H
                            exit / X
                            """ + green);
        }

        public void exitText(){
            System.out.println(resetColour + "Couldn´t resist the urge to leave early? \n" +
                    "see you tomorrow \uD83D\uDE31");
        }

        public static void main(String[] args) {
            Adventure newGame = new Adventure();
            newGame.play();
        }

    }
