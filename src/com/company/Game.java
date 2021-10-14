package com.company;

import java.util.Scanner;

public class Game {

    Scanner scanner = new Scanner(System.in);

    private String userInput;
    private final Player player;
    private Map map;

    public Game() {
        map = new Map();
        player = new Player(userInput, 100);
        player.setCurrentRoom(map.getStarterRoom());
    }

    public void play() {
        System.out.println(Colour.cyan + "Welcome to KEAdventure.\n" + Colour.purple);
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
                lookCommand();

            } else if ("help".equals(userInput) || "h".equals(userInput)) {
                helpInfo();

            } else if ("exit".equals(userInput) || "x".equals(userInput)) {
                gameOn = false;
                exitText();

            } else if (userInput.startsWith("take ")) {
                take(userInput);

            } else if (userInput.startsWith("drop ")) {
                drop(userInput);

            } else if (userInput.startsWith("eat ")) {
                eat(userInput);

            } else if ("i".equals(userInput)) {
                checkInventory();

            } else if (userInput.startsWith("equip ")) {
                equip(userInput);

            } else if (userInput.startsWith("unequip ")) {
                unequip(userInput);

            } else {
                System.out.println("What do you mean? I dont know what '" + userInput + "' is");
            }
        }
    }

    public void lookCommand() {
        System.out.println(player.getCurrentRoom().getDescription());
        System.out.println(player.getCurrentRoom().getItems());
        System.out.println(player.getCurrentRoom().getEnemy());
    }

    public void checkInventory() {
        if (player.getInventory().size() > 0)
            for (int i = 0; i < player.getInventory().size(); i++) {
                System.out.println("your inventory contains: " + player.getInventory().get(i).getItemName());
            }
        else {
            System.out.println("Currently you have no items in your inventory");
        }
        if (player.getEquippedWeapon() != null) {
            System.out.println("Equipped Weapon: <" + player.getEquippedWeapon().getItemName() + ">");
        } else {
            System.out.println("You dont have anything equipped right now");
        }
    }

    public void take(String userInput) {
        String itemName = userInput.substring(5);
        if (player.takeItem(itemName)) {
            System.out.println(itemName + " has been added to your inventory");
        } else {
            System.out.println("This item: " + itemName + " does not exist here");
        }
    }

    public void drop(String userInput) {
        String itemName = userInput.substring(5);
        if (player.dropItem(itemName)) {
            System.out.println(itemName + " has been removed from your inventory");
        } else {
            System.out.println("This item: " + itemName + " does not exist in inventory");
        }
    }

    public void eat(String userInput) {
        String itemName = userInput.substring(4);
        if (player.eatFood(itemName) == ItemStatus.ALLGOOD) {
            System.out.println(itemName + " has been eatin");
            System.out.println("After eating your Health points has been increased to: "
                    + player.getPlayerHealth());
        } else if (player.eatFood(itemName) == ItemStatus.NOTGOOD) {
            System.out.println("You can't eat a '" + itemName + "'. You fool.");
        } else if (player.eatFood(itemName) == ItemStatus.DOESNOTEXIST) {
            System.out.println("This item '" + itemName + "' is not in your inventory");
        }
    }

    public void equip(String userInput) {
        String weaponName = userInput.substring(6);
        if (player.equipWeapon(weaponName) == ItemStatus.ALLGOOD) {
            System.out.println("'" + weaponName + "'" + " has been equipped");
        } else if (player.equipWeapon(weaponName) == ItemStatus.NOTGOOD) {
            System.out.println("You can't equip '" + weaponName + "'. It's not a weapon");
        } else if (player.equipWeapon(weaponName) == ItemStatus.DOESNOTEXIST) {
            System.out.println("This weapon '" + weaponName + "' is not in your inventory");
        }
    }

    public void unequip(String userInput) {
        String weaponName = userInput.substring(8);
        player.setEquippedWeapon(null);
        System.out.println(weaponName + " has been unequipped!");
    }


    public void movePlayer(String userInput) {
        Room requestedRoom = player.playerMovement(userInput);
        printResult(requestedRoom);
        player.getCurrentRoom().enteredRoom();
    }

    public void printResult(Room requestedRoom) {
        if (requestedRoom == null) {
            System.out.println(Colour.red + "You cannot go that way \uD83D\uDED1" + Colour.green);
        } else {
            if (player.getCurrentRoom().getRoomCounter() < 1) {
                System.out.println(requestedRoom.getDescription());
            } else {
                System.out.println(requestedRoom.getName());
                System.out.println(requestedRoom.getItems());
                System.out.println(requestedRoom.getEnemy());
            }
        }
    }

    public void helpInfo() {
        System.out.println(Colour.yellow + """
                You can use the following commands:
                go North / go N
                go East / go E
                go South / go S
                go West / go W
                look / L
                Take (name of wished item)
                Drop (name of wished item)
                eat (for food)
                I (for inventory)
                equip (for weapons)
                unequip (for weapons)
                help / H
                exit / X
                """ + Colour.green);
    }

    public void exitText() {
        System.out.println(Colour.resetColour + "Couldn´t resist the urge to leave early? \n" +
                "see you tomorrow \uD83D\uDE31");
    }

}
