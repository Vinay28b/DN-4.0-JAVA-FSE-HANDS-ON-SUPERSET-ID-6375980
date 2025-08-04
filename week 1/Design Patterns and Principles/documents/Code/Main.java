package com.documents;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type;

        while (true) {
            System.out.print("Enter document type (word/pdf/excel) or 'exit' to quit: ");
            type = scanner.nextLine().toLowerCase();

            if (type.equals("exit")) {
                System.out.println("Program ended.");
                break;
            }

            DocumentFactory factory = switch (type) {
                case "word" -> new WordFactory();
                case "pdf" -> new PdfFactory();
                case "excel" -> new ExcelFactory();
                default -> null;
            };

            if (factory == null) {
                System.out.println("Unsupported document type. Try again.\n");
                continue;
            }

            Document doc = factory.createDocument();
            doc.open();
            System.out.println();
        }

        scanner.close();
    }
}
