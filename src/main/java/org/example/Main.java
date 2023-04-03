package org.example;

public class Main {
    public static void main(String[] args) {
        long[] price = {100L, 2000L, 300000L, 4000000L, 500L, 55500L, 4337L, 5554888L, 450088L};
        SalesManager sales = new SalesManager(price);
        System.out.printf("Sale max = %,d руб. \n", sales.max());
        System.out.printf("Sale min = %,d руб. \n", sales.min());
        System.out.printf("Sale statistics = %,d руб. \n", sales.statistics());
        System.out.println("\nProgram completed");
    }
}