package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Contacts contacts = new Contacts("Dummy");

    public static void main(String[] args) {
	// write your code here

        boolean quit = false;
        int choice = 0;

        printmenu();
        while(!quit){
            choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice){
                case 1:
                    printmenu();
                    break;
                case 2:
                    listcontacts();
                    break;
                case 3:
                    addcontacts();
                    break;
                case 4:
                    modifycontacts();
                    break;
                case 5:
                    removecontacts();
                    break;
                case 6:
                    searchcontacts();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }

    }

    public static void printmenu(){
        System.out.println("\nAvailable actions:\npress");
        System.out.println(
                "1  - to print contacts\n" +
                "2  - to list contacts\n" +
                        "3  - to add a new contact\n" +
                "4  - to update existing an existing contact\n" +
                "5  - to remove an existing contact\n" +
                "6  - query if an existing contact exists\n" +
                "7  -  Quit");
        System.out.println("Choose your action: ");

    }

    public static void listcontacts(){
        contacts.listcontacts();
    }

    public static void addcontacts(){

        System.out.println("Enter Name");
        String name = scanner.nextLine();
        System.out.println("Enter Mobile number");
        String number = scanner.nextLine();
        Class1 newcontact =  Class1.add(name,number);
        contacts.addcontacts(newcontact);
    }

    public static void modifycontacts(){
        System.out.println("Enter the Existing Contact Name");
        String oldname = scanner.nextLine();
        Class1 oldcontact = contacts.searchcontacts(oldname);
        if(oldcontact == null){
            System.out.println("No Contacts in this name");
            return;
        }
        System.out.println("Enter the new Name");
        String newname = scanner.nextLine();
        System.out.println("Enter the new number");
        String newnumber = scanner.nextLine();
        Class1 newcontact = Class1.add(newname,newnumber);
        if(contacts.updatecontacts(oldcontact,newcontact)){
            System.out.println("Updated Successfully");
        }else {
            System.out.println("Not updated");
        }


    }

    public static void removecontacts(){

        System.out.println("Enter the Contact Name to be removed");
        String rmname = scanner.nextLine();
        Class1 rmcontact = contacts.searchcontacts(rmname);
        if(rmcontact == null){
            System.out.println("No Contacts in this name");
            return;
        }
        contacts.removecontacts(rmcontact);

    }

    public static void searchcontacts(){
        System.out.println("Enter the Contact Name to be Searched");
        String findname = scanner.nextLine();
        Class1 findcontact = contacts.searchcontacts(findname);
        if(findcontact == null){
            System.out.println("No Contacts in this name");
            return;
        }
        System.out.println("Contact Name is : "+findcontact.getName()+" : Mobile is :"+findcontact.getNumber());

    }
}
