package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P05Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tabsNumber = Integer.parseInt(sc.nextLine());
        int salary = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= tabsNumber; i++) {
            String siteName = sc.nextLine();
            if (siteName.equals("Facebook")) {
                salary = salary - 150;
            } else if (siteName.equals("Instagram")) {
                salary = salary - 100;
            } else if (siteName.equals("Reddit")) {
                salary = salary - 50;
            } else {
                continue;
            }
            if (salary == 0) {
                System.out.println("You have lost your salary.");
            } else {
                continue;
            }
        }
        System.out.printf("%n%d", salary);
    }
}
