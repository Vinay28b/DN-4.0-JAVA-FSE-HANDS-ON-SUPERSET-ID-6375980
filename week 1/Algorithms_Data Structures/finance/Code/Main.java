package com.finance;

public class Main {
    public static void main(String[] args) {
        FinancialData data = new FinancialData();

        data.addRevenue(100);
        data.addRevenue(110);
        data.addRevenue(115);
        data.addRevenue(120);
        data.addRevenue(125);
        data.addRevenue(130);

        data.printData();

        System.out.printf("Average Revenue: ₹%.2fK\n", data.calculateAverage());
        System.out.printf("Growth Rate: %.2f%%\n", data.calculateGrowthRate());
        System.out.printf("Forecast for Next Month: ₹%.2fK\n", data.forecastNextMonth());
    }
}

