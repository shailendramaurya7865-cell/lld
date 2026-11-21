package org.example.StrategyDesignPattern.Discount;

import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Map<Integer, DiscountStrategy> strategyMap = Map.of(
                1, new PremiumDiscount(),
                2, new RegularDiscount(),
                3, new FestiveDiscount()
        );

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Market Price: ");
        double marketPrice = sc.nextDouble();

        System.out.println("""
                Select Discount Strategy:
                1. Premium (20%)
                2. Regular (Rs 300 Flat)
                3. Festive (25%)
                """);

        int selected = sc.nextInt();

        DiscountStrategy strategy = strategyMap.get(selected);

        if(strategy == null) {
            System.out.println("Invalid Strategy Selected");
            return;
        }

        DiscountContext context = new DiscountContext();
        context.setStrategy(strategy);

        double finalAmount = context.calculateDiscount(marketPrice);

        System.out.println("Original Amount : " + marketPrice);
        System.out.println("Final Amount    : " + finalAmount);
        System.out.println("Discount Saved  : " + (marketPrice - finalAmount));
    }
}