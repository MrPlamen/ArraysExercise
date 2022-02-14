package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P04CleverLily {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = Integer.parseInt(sc.nextLine());
        double mashinePrice = Double.parseDouble(sc.nextLine());
        int toyPrice = Integer.parseInt(sc.nextLine());
        double money = 0;
        int toys = 0;
        int moneyTaken = 0;

        for (int i=1; i<=age; i++) {
            if (i%2==0) {
                money = money+(10*i/2);
                moneyTaken ++;
            } else {
                toys = toys+1;
            }
        }
        money = (money+(toyPrice*toys))-moneyTaken;
        if (money >= mashinePrice) {
            System.out.printf("Yes! %.2f", money-mashinePrice);
        } else {
            System.out.printf("No! %.2f", mashinePrice-money);
        }
    }
}
