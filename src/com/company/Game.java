package com.company;

import java.util.Scanner;

public class Game {

    Scanner scanner = new Scanner(System.in);
    private String userInput;
    private Player player;
    private Map map;

    public Game() {
        map = new Map();
        player = new Player(userInput, 100);
        player.setCurrentRoom(map.getStarterRoom());
    }

    public void play() {
        System.out.println(Colour.cyan + "Welcome to Adventure.\n" + Colour.purple);
        System.out.print("Before we start the game please enter your name: ");
        userInput = scanner.nextLine();
        player.setPlayerName(userInput);
        System.out.println("Welcome " + Colour.resetColour + player.getPlayerName() + Colour.purple);
        System.out.println(
                "You'll be traveling through maze of rooms,\n" +
                        "your objective is to locate the treasure room\n" +
                        "Be careful not to get lost, in case you get lost on your travels,\n" +
                        "you use the spell word called" + Colour.resetColour + " 'help'" +
                        Colour.purple + " or foresee the map from the Fronter realm");
        System.out.println();
        System.out.println(Colour.green + player.getCurrentRoom().getDescription());
        System.out.println(Colour.blue + "Which direction will you take?" + Colour.green);

        boolean gameOn = true;
        while (gameOn) {
            userInput = scanner.nextLine().toLowerCase();
            if (userInput.startsWith("go ")) {
                userInput = userInput.substring(3);
                movePlayer(userInput);

            } else if ("look".equals(userInput) || "l".equals(userInput)) {
                System.out.println(player.getCurrentRoom().getDescription());
                System.out.println(player.getCurrentRoom().getItems());

            } else if ("help".equals(userInput) || "h".equals(userInput)) {
                helpInfo();

            } else if ("exit".equals(userInput) || "x".equals(userInput)) {
                gameOn = false;
                exitText();

            } else if (userInput.startsWith("take ")) {
                player.take(userInput);

            } else if (userInput.startsWith("drop ")) {
                player.drop(userInput);

            }else if (userInput.startsWith("eat ")){
                player.eat(userInput);
                System.out.println(player.getPlayerHealth());

            } else if ("i".equals(userInput)){
                checkInventory();

            } else {
                System.out.println("What do you mean? I dont know what " + userInput + " is");
            }
        }
    }

    public void checkInventory(){
        if (player.getInventory().size() > 0)
        for (int i = 0; i < player.getInventory().size(); i++) {
            System.out.println("your inventory contains: " + player.getInventory().get(i).getItemName());
        }else {
            System.out.println("empty");
        }
    }

    public void movePlayer(String userInput){
        Room requestedRoom = player.playerMovement(userInput);
        printResult(requestedRoom);
    }

    public void printResult(Room requestedRoom) {
        if (requestedRoom == null) {
            System.out.println(Colour.red + "You cannot go that way \uD83D\uDED1" + Colour.green);
        } else {
            System.out.println(requestedRoom.getDescription());
        }
    }

    public void helpInfo(){
        System.out.println(Colour.yellow + """
                            You can use the following commands:
                            go North / go N
                            go East / go E
                            go South / go S
                            go West / go W
                            look / L
                            Take (name of wished item)
                            Drop (name of wished item)
                            I (for inventory)
                            help / H
                            exit / X
                            """ + Colour.green);
    }

    public void exitText(){
        System.out.println(Colour.resetColour + "Couldn´t resist the urge to leave early? \n" +
                "see you tomorrow \uD83D\uDE31");
    }


}
