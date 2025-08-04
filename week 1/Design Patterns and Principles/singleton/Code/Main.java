package com.singleton;

public class Main {
    public static void main(String[] args) {
    	
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Application started.");
        logger2.log("Processing request...");


        if (logger1 == logger2) {
            System.out.println("Same logger instance is used.");
        } else {
            System.out.println("Different logger instances found! (Error)");
        }
    }
}
