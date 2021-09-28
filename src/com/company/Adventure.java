package com.company;

import java.util.Scanner;

public class Adventure {


    Scanner scanner = new Scanner(System.in);
    String userInput;

    Map map = new Map();

    Room currentRoom = map.getStarterRoom();

        public void play() {
            System.out.println(Colours.cyan + "Welcome to Adventure.\n" + Colours.purple +
                    "You'll be traveling through maze of rooms,\n" +
                    "you're objective is to locate the treasure room\n" +
                    "Be careful not to get lost, in case you get lost on you're travels,\n" +
                    "you use the spell word called 'help' or foresee the map from the Fronter realm");
            System.out.println("");
            helpInfo();
            System.out.println(Colours.green + currentRoom.getDescription());
            System.out.println(Colours.blue + "Which direction will you take?" + Colours.green);

            boolean gameOn = true;
            while (gameOn) {
                userInput = scanner.nextLine().toLowerCase();
                if ("go north".equals(userInput) || "n".equals(userInput)) {
                    moveTo(currentRoom.getNorth());

                } else if ("go east".equals(userInput) || "e".equals(userInput)) {
                    moveTo(currentRoom.getEast());

                } else if ("go south".equals(userInput) || "s".equals(userInput)) {
                    moveTo(currentRoom.getSouth());

                } else if ("go west".equals(userInput) || "w".equals(userInput)) {
                    moveTo(currentRoom.getWest());

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

        public void moveTo(Room requestedRoom) {
            if (requestedRoom == null) {
                System.out.println(Colours.red + "You cannot go that way \uD83D\uDED1" + Colours.green);
            } else {
                currentRoom = requestedRoom;
                System.out.println(currentRoom.getDescription());
            }
        }

        public void helpInfo(){
            System.out.println(Colours.yellow + """
                            You can use the following commands: 
                            go North / N
                            go East / E
                            go South / S
                            go West / W
                            look / L
                            help / H
                            exit / X
                            """ + Colours.green);
        }

        public void exitText(){
            System.out.println(Colours.resetColour + "Couldn´t resist the urge to leave early? \n" +
                    "see you tomorrow \uD83D\uDE31");
        }

        public static void main(String[] args) {
            Adventure newGame = new Adventure();
            newGame.play();
        }

    }
