package org.example;

import org.example.services.ContactService;
import org.example.services.impl.ContactServiceImpl;

import java.util.Scanner;

public class Main {
    private static ContactService contactService;

    public static void main(String[] args) {
        contactService = new ContactServiceImpl();
        displayMenu();
        private static void displayMenu () {
            Scanner scanner = new Scanner(System.in);
            int choice;
            do {
                System.out.println("---Menu---");
                System.out.println("1. List All Contcats");
                System.out.println("2. Filter contacts by category");
                System.out.println("3. Count all contacts of an specific category");
                System.out.println("4. Filter contacts by name and phone");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1 ->{
                        System.out.println(contactService.ListAllContacts());
                    }
                    case 2 ->{
                        System.out.println(contactService.FilterContactsByCategory());
                    }
                    case 3->{
                        System.out.println(contactService.CountAllContactsByCategory());
                    }
                    case 4 ->{
                        System.out.println(contactService.FilterCategoryByNameAndPhone());
                    }
                    default -> {
                        System.out.println("Wrong option, please try again");
                    }
                }

            }while (choice != 4);
        }
    }
}