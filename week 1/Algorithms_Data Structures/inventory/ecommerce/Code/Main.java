package com.ecommerce;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(201, "Laptop", "Electronics"),
            new Product(202, "Shirt", "Clothing"),
            new Product(203, "Mouse", "Electronics"),
            new Product(204, "Book", "Stationery"),
            new Product(205, "Camera", "Electronics"),
            new Product(206, "Notebook", "Stationery"),
            new Product(207, "Sketchbook", "Stationery"),
            new Product(208, "Guide Book", "Stationery"),
            new Product(209, "Pen", "Stationery")
        };

        Product result1 = SearchEngine.linearSearch(products, "Book");
        System.out.println("Linear Search Result: " + (result1 != null ? result1 : "Not found"));

        Product result2 = SearchEngine.binarySearch(products, "Book");
        System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Not found"));

        SearchEngine.searchByCategory(products, "Stationery");

        SearchEngine.searchByNameContains(products, "book");
    }
}
