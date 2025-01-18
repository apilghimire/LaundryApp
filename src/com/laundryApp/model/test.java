package com.laundryApp.model;

import com.laundryApp.model.Admin;
import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        ArrayList<Admin> adminList = new ArrayList<>();

        // Adding Admin objects
        adminList.add(new Admin(1, "Alice Johnson", 1234567890, "alice.johnson@example.com", "123 Elm Street", "password123"));
        adminList.add(new Admin(2, "Bob Smith", 987654321, "bob.smith@example.com", "456 Oak Avenue", "securePass456"));
        adminList.add(new Admin(3, "Charlie Brown", 555123456, "charlie.brown@example.com", "789 Pine Road", "adminPass789"));
        adminList.add(new Admin(4, "Diana Prince", 777888999, "diana.prince@example.com", "321 Maple Lane", "wonderWoman"));
        adminList.add(new Admin(5, "Ethan Hunt", 111222333, "ethan.hunt@example.com", "654 Cedar Boulevard", "missionImpossible"));

        // Display Admins
        System.out.println("Admin Details:");
        for (Admin admin : adminList) {
            System.out.println(admin);
        }

        // Dynamic password validation
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter Admin ID: ");
        int adminId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        boolean found = false;
        for (Admin admin : adminList) {
            if (admin.getUserID()== adminId) {
                found = true;
                if (admin.checkPassword(password)) {
                    System.out.println("Login successful!");
                } else {
                    System.out.println("Invalid password.");
                }
                break;
            }
        }
        if (!found) {
            System.out.println("Admin not found.");
        }
    }
}
