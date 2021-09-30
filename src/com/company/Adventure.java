package com.company;

import java.util.Scanner;

public class Adventure {

    Scanner scanner = new Scanner(System.in);
    String userInput;
    Player player;
    Map map;


    public Adventure() {
        map = new Map();
        player = new Player();
        player.setCurrentRoom(map.getStarterRoom());
    }

        public void play() {
            System.out.println(Colours.cyan + "Welcome to Adventure.\n" + Colours.purple +
                    "You'll be traveling through maze of rooms,\n" +
                    "your objective is to locate the treasure room\n" +
                    "Be careful not to get lost, in case you get lost on your travels,\n" +
                    "you use the spell word called 'help' or foresee the map from the Fronter realm");
            System.out.println("");
            helpInfo();
            System.out.println(Colours.green + player.getCurrentRoom().getDescription());
            System.out.println(Colours.blue + "Which direction will you take?" + Colours.green);

            boolean gameOn = true;
            while (gameOn) {
                userInput = scanner.nextLine().toLowerCase();
                if (userInput.startsWith("go")){
                    userInput = userInput.substring(3);
                    player.playerMovement(userInput);

                    // andre handlinger
                } else if ("look".equals(userInput) || "l".equals(userInput)) {
                    System.out.println(player.getCurrentRoom().getDescription());

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
