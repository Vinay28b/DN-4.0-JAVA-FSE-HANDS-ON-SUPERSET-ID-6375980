package com.ecommerce;

import java.util.Arrays;
import java.util.Comparator;

public class SearchEngine {

    public static Product linearSearch(Product[] products, String name) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String name) {
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));
        int left = 0, right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(name);

            if (cmp == 0) return products[mid];
            else if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }

        return null;
    }

    public static void searchByCategory(Product[] products, String category) {
        System.out.println("\nProducts in category: " + category);
        boolean found = false;
        for (Product p : products) {
            if (p.category.equalsIgnoreCase(category)) {
                System.out.println(p);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No products found in this category.");
        }
    }

    public static void searchByNameContains(Product[] products, String keyword) {
        System.out.println("\nProducts containing '" + keyword + "' in name:");
        boolean found = false;
        for (Product p : products) {
            if (p.productName.toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(p);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No products found with that keyword.");
        }
    }
}

