package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P05SmallShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String product = sc.nextLine();
        String city = sc.nextLine();
        Double quantity = Double.parseDouble(sc.nextLine());
        double coffeePrice = 0, waterPrice = 0, beerPrice = 0, sweetsPrice = 0, peanutsPrice = 0;
        double price = 0, totalPrice = 0;
        switch (city) {
            case "Sofia":
                coffeePrice = 0.5;
                waterPrice = 0.8;
                beerPrice = 1.2;
                sweetsPrice = 1.45;
                peanutsPrice = 1.6;
                break;
            case "Plovdiv":
                coffeePrice = 0.4;
                waterPrice = 0.7;
                beerPrice = 1.15;
                sweetsPrice = 1.3;
                peanutsPrice = 1.5;
                break;
            case "Varna":
                coffeePrice = 0.45;
                waterPrice = 0.7;
                beerPrice = 1.1;
                sweetsPrice = 1.35;
                peanutsPrice = 1.55;
                break;
        }
        if (product.equals("coffee")) {
            price = coffeePrice;
        } else if (product.equals("water")) {
            price = waterPrice;
        } else if (product.equals("beer")) {
            price = beerPrice;
        } else if (product.equals("sweets")) {
            price = sweetsPrice;
        } else if (product.equals("peanuts")) {
            price = peanutsPrice;
        }
        totalPrice = quantity*price;
        System.out.println(totalPrice);
    }
}

