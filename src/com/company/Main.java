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
        Room currentRoom = null;
        //  print velkomst
        System.out.println("Welcome to Adventure");
        System.out.println("introduction, go north, go south, go east, go west");
        System.out.println("Room intro"); //Room1 intro lav variabel
        System.out.println("what do you want to do?");

        userInput  = scanner.nextLine();
        //rum1
        if ("go north".equals(userInput)){
            System.out.println("you hit a wall");
        } else if( "go east".equals(userInput)){
            System.out.println("going east");// lave koden til at gå til rum 2
        } else if( "go south".equals(userInput)){
            System.out.println("going south");// lave koden til at gå til rum 4
        } else if("go west".equals(userInput)){
            System.out.println("you hit a wall");

            //rum2
        } else if ("go north".equals(userInput)){
            System.out.println("you hit a wall");
        } else if( "go east".equals(userInput)){
            System.out.println("going east");// lave koden til at gå til rum 3
        } else if( "go south".equals(userInput)){
            System.out.println("you hit a wall");
        } else if("go west".equals(userInput)){
            System.out.println("going west");// lave koden til at gå til rum 1

            //rum3
        } else if ("go north".equals(userInput)){
            System.out.println("you hit a wall");
        } else if( "go east".equals(userInput)){
            System.out.println("you hit a wall");
        } else if( "go south".equals(userInput)){
            System.out.println("going south");// lave koden til at gå til rum 6
        } else if("go west".equals(userInput)){
            System.out.println("going west");// lave koden til at gå til rum 2

            //rum4
        } else if ("go north".equals(userInput)){
            System.out.println("going north");// lave koden til at gå til rum 1
        } else if( "go east".equals(userInput)){
            System.out.println("you hit a wall");
        } else if( "go south".equals(userInput)){
            System.out.println("going south");// lave koden til at gå til rum 7
        } else if("go west".equals(userInput)){
            System.out.println("you hit a wall");

            //rum5
        } else if ("go north".equals(userInput)){
            System.out.println("you hit a wall");
        } else if( "go east".equals(userInput)){
            System.out.println("you hit a wall");
        } else if( "go south".equals(userInput)){
            System.out.println("going south");// lave koden til at gå til rum 8
        } else if("go west".equals(userInput)){
            System.out.println("you hit a wall");

            //rum6
        } else if ("go north".equals(userInput)){
            System.out.println("going north");// lave koden til at gå til rum 3
        } else if( "go east".equals(userInput)){
            System.out.println("you hit a wall");
        } else if( "go south".equals(userInput)){
            System.out.println("going south");// lave koden til at gå til rum 9
        } else if("go west".equals(userInput)){
            System.out.println("you hit a wall");

            //rum7
        } else if ("go north".equals(userInput)){
            System.out.println("going north");// lave koden til at gå til rum 4
        } else if( "go east".equals(userInput)){
            System.out.println("going east");// lave koden til at gå til rum 8
        } else if( "go south".equals(userInput)){
            System.out.println("you hit a wall");
        } else if("go west".equals(userInput)){
            System.out.println("you hit a wall");

            //rum8
        } else if ("go north".equals(userInput)){
            System.out.println("going north");// lave koden til at gå til rum 5
        } else if( "go east".equals(userInput)){
            System.out.println("going east");// lave koden til at gå til rum 9
        } else if( "go south".equals(userInput)){
            System.out.println("you hit a wall");
        } else if("go west".equals(userInput)){
            System.out.println("going west");// lave koden til at gå til rum 7

            //rum9
        } else if ("go north".equals(userInput)){
            System.out.println("going north");// lave koden til at gå til rum 6
        } else if( "go east".equals(userInput)){
            System.out.println("you hit a wall");
        } else if( "go south".equals(userInput)){
            System.out.println("you hit a wall");
        } else if("go west".equals(userInput)){
            System.out.println("going west");// lave koden til at gå til rum 8

            // andre handlinger
        } else if ("look".equals(userInput)){
            // print room intro variabel
        } else if ("help".equals(userInput)){
            // print handlinge beskrivelse variabel
        } else if ("exit".equals(userInput)){
            // lav exit program
        } else {
            // print ved ikke hvad brugeren mener
        }







    }
}
