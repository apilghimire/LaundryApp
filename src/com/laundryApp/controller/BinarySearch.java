/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.laundryApp.controller;
import com.laundryApp.model.User;

/**
 *
 * @author apilghimire
 */
import java.util.List;

public class BinarySearch {

    public static User searchByName(List<User> userList, String searchTerm) {
        // Ensure the userList is sorted by User Name before binary search
        userList.sort((u1, u2) -> u1.getUserName().compareToIgnoreCase(u2.getUserName()));

        int low = 0;
        int high = userList.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            User midUser = userList.get(mid);

            int comparison = midUser.getUserName().compareToIgnoreCase(searchTerm);

            if (comparison == 0) {
                return midUser; // Match found
            } else if (comparison < 0) {
                low = mid + 1; // Search right half
            } else {
                high = mid - 1; // Search left half
            }
        }

        return null; // No match found
    }
}
