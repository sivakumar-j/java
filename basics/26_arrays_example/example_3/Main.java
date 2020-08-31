package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;

        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To check the process array functionality.");
        System.out.println("\t 7 - To quit the application.");
    }

    public static void addItem() {
        System.out.print("Enter the grocery item to be added : ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Current item name: ");
        String currentItem = scanner.nextLine();
        System.out.print("Enter new item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(currentItem, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();
        groceryList.removeGroceryItem(itemName);
    }

    public static void searchForItem() {
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem);
        } else {
            System.out.println(searchItem + ", not on file.");
        }
    }

    public static void processArrayList() {
        ArrayList<String> groceryList_1 = new ArrayList<String>();
        groceryList_1.addAll(groceryList.getGroceryList());

        System.out.println("You have " + groceryList_1.size() + " items in your grocery_1 list");
        for(int i=0; i< groceryList_1.size(); i++) {
            System.out.println((i+1) + ". " + groceryList_1.get(i));
        }

        ArrayList<String> groceryList_2 = new ArrayList<String>(groceryList.getGroceryList());

        System.out.println("You have " + groceryList_2.size() + " items in your groceryList_2 list");
        for(int i=0; i< groceryList_2.size(); i++) {
            System.out.println((i+1) + ". " + groceryList_2.get(i));
        }

        System.out.println("Grocery List size is : " + groceryList.getGroceryList().size());
        String[] myArray = new String[groceryList.getGroceryList().size()];
        //check laterSystem.out.println("myArray value before toArray conversion : " + myArray);
        myArray = groceryList.getGroceryList().toArray(myArray);
        //check later System.out.println("myArray value after toArray conversion  : " + myArray);

    }
}
