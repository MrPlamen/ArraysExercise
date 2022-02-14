package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P11FruitShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.nextLine();
        String day = sc.nextLine();
        double quantity = Double.parseDouble(sc.nextLine());
        double price1 = 0;
        double price2 = 0;
        switch (fruit) {
            case "banana":
                price1 = 2.50;
                price2 = 2.70;
                break;
            case "apple":
                price1 = 1.20;
                price2 = 1.25;
                break;
            case "orange":
                price1 = 0.85;
                price2 = 0.90;
                break;
            case "grapefruit":
                price1 = 1.45;
                price2 = 1.60;
                break;
            case "kiwi":
                price1 = 2.70;
                price2 = 3.00;
                break;
            case "pineapple":
                price1 = 5.50;
                price2 = 5.60;
                break;
            case "grapes":
                price1 = 3.85;
                price2 = 4.20;
                break;
            default:
                day = " ";
                break;
        }
        if (day.equals(" ")) {
            System.out.println("error");
        } else if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") ||
                day.equals("Thursday") || day.equals("Friday")) {
            System.out.printf("%.2f", price1 * quantity);
        } else if (day.equals("Saturday") || day.equals("Sunday")) {
            System.out.printf("%.2f", price2 * quantity);
        } else {
            System.out.println("error");
        }
    }
}
