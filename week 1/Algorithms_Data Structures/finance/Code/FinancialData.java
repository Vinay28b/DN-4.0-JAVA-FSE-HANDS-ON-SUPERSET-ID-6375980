package com.finance;

import java.util.ArrayList;
import java.util.List;

public class FinancialData {
    private List<Double> monthlyRevenue;

    public FinancialData() {
        monthlyRevenue = new ArrayList<>();
    }

    public void addRevenue(double amount) {
        monthlyRevenue.add(amount);
    }

    public double calculateAverage() {
        if (monthlyRevenue.isEmpty()) return 0;
        double sum = 0;
        for (double rev : monthlyRevenue) {
            sum += rev;
        }
        return sum / monthlyRevenue.size();
    }

    public double calculateGrowthRate() {
        int n = monthlyRevenue.size();
        if (n < 2) return 0;
        double first = monthlyRevenue.get(0);
        double last = monthlyRevenue.get(n - 1);
        return ((last - first) / first) * 100;
    }

    public double forecastNextMonth() {
        if (monthlyRevenue.size() < 2) return 0;

        int n = monthlyRevenue.size();
        double sumGrowth = 0;

        for (int i = 1; i < n; i++) {
            double prev = monthlyRevenue.get(i - 1);
            double curr = monthlyRevenue.get(i);
            double growth = (curr - prev) / prev;
            sumGrowth += growth;
        }

        double avgGrowthRate = sumGrowth / (n - 1);
        double lastMonth = monthlyRevenue.get(n - 1);
        return lastMonth * (1 + avgGrowthRate);
    }

    public void printData() {
        System.out.println("Monthly Revenues: " + monthlyRevenue);
    }
}
