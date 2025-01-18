/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.laundryApp.controller;
import com.laundryApp.model.Laundry;
import java.util.List;

public class SortAlgorithms {


    public static void sortLaundryList(List<Laundry> laundryList, String sortType) {
        switch (sortType) {
            case "by ID Ascending":
                insertionSortByIdAscending(laundryList);
                break;

            case "by ID Descending":
                insertionSortByIdDescending(laundryList);
                break;

            case "by Weight Ascending":
                selectionSortByWeightAscending(laundryList);
                break;

            case "by Weight Descending":
                selectionSortByWeightDescending(laundryList);
                break;

            case "by Status Ascending":
                recursiveSortByStatusAscending(laundryList, laundryList.size());
                break;

            case "by Status Descending":
                recursiveSortByStatusDescending(laundryList, laundryList.size());
                break;

            default:
                throw new IllegalArgumentException("Invalid sort type: " + sortType);
        }
    }

    // Recursive insertion sort for status in ascending order (only "Active" items)
    private static void recursiveSortByStatusAscending(List<Laundry> laundryList, int n) {
        if (n <= 1) return;

        recursiveSortByStatusAscending(laundryList, n - 1);

        Laundry last = laundryList.get(n - 1);
        if (!"Active".equals(last.getLaundryCondition())) return;

        int j = n - 2;

        while (j >= 0 && "Active".equals(laundryList.get(j).getLaundryCondition()) &&
               compareStatus(laundryList.get(j).getLaundryStatus(), last.getLaundryStatus()) > 0) {
            laundryList.set(j + 1, laundryList.get(j));
            j--;
        }

        laundryList.set(j + 1, last);
    }

    // Recursive insertion sort for status in descending order (only "Active" items)
    private static void recursiveSortByStatusDescending(List<Laundry> laundryList, int n) {
        if (n <= 1) return;

        recursiveSortByStatusDescending(laundryList, n - 1);

        Laundry last = laundryList.get(n - 1);
        if (!"Active".equals(last.getLaundryCondition())) return;

        int j = n - 2;

        while (j >= 0 && "Active".equals(laundryList.get(j).getLaundryCondition()) &&
               compareStatus(laundryList.get(j).getLaundryStatus(), last.getLaundryStatus()) < 0) {
            laundryList.set(j + 1, laundryList.get(j));
            j--;
        }

        laundryList.set(j + 1, last);
    }

    // Helper method to compare statuses based on priority
    private static int compareStatus(String status1, String status2) {
        int priority1 = getStatusPriority(status1);
        int priority2 = getStatusPriority(status2);
        return Integer.compare(priority1, priority2);
    }

    // Assign priority values to statuses
    private static int getStatusPriority(String status) {
        switch (status) {
            case "Sort Clothes":
                return 1;
            case "Clean":
                return 2;
            case "Fold":
                return 3;
            default:
                throw new IllegalArgumentException("Unknown status: " + status);
        }
    }

    // Selection sort for weight in ascending order (only "Active" items)
    private static void selectionSortByWeightAscending(List<Laundry> laundryList) {
        int n = laundryList.size();
        for (int i = 0; i < n - 1; i++) {
            if (!"Active".equals(laundryList.get(i).getLaundryCondition())) continue;

            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if ("Active".equals(laundryList.get(j).getLaundryCondition()) &&
                    laundryList.get(j).getLaundryWeight() < laundryList.get(minIndex).getLaundryWeight()) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                Laundry temp = laundryList.get(minIndex);
                laundryList.set(minIndex, laundryList.get(i));
                laundryList.set(i, temp);
            }
        }
    }

    // Selection sort for weight in descending order (only "Active" items)
    private static void selectionSortByWeightDescending(List<Laundry> laundryList) {
        int n = laundryList.size();
        for (int i = 0; i < n - 1; i++) {
            if (!"Active".equals(laundryList.get(i).getLaundryCondition())) continue;

            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if ("Active".equals(laundryList.get(j).getLaundryCondition()) &&
                    laundryList.get(j).getLaundryWeight() > laundryList.get(maxIndex).getLaundryWeight()) {
                    maxIndex = j;
                }
            }

            if (maxIndex != i) {
                Laundry temp = laundryList.get(maxIndex);
                laundryList.set(maxIndex, laundryList.get(i));
                laundryList.set(i, temp);
            }
        }
    }

    // Insertion sort for ID in ascending order (only "Active" items)
    private static void insertionSortByIdAscending(List<Laundry> laundryList) {
        for (int i = 1; i < laundryList.size(); i++) {
            Laundry key = laundryList.get(i);
            if (!"Active".equals(key.getLaundryCondition())) continue;

            int j = i - 1;

            while (j >= 0 && "Active".equals(laundryList.get(j).getLaundryCondition()) &&
                   laundryList.get(j).getLaundryId() > key.getLaundryId()) {
                laundryList.set(j + 1, laundryList.get(j));
                j--;
            }

            laundryList.set(j + 1, key);
        }
    }

    // Insertion sort for ID in descending order (only "Active" items)
    private static void insertionSortByIdDescending(List<Laundry> laundryList) {
        for (int i = 1; i < laundryList.size(); i++) {
            Laundry key = laundryList.get(i);
            if (!"Active".equals(key.getLaundryCondition())) continue;

            int j = i - 1;

            while (j >= 0 && "Active".equals(laundryList.get(j).getLaundryCondition()) &&
                   laundryList.get(j).getLaundryId() < key.getLaundryId()) {
                laundryList.set(j + 1, laundryList.get(j));
                j--;
            }

            laundryList.set(j + 1, key);
        }
    }
}
