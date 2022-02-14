package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P06NumberInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double userInput = Double.parseDouble(sc.nextLine());
        if (userInput >= -100 && userInput <= 100 && userInput != 0) {
            System.out.printf("Yes");
        } else {
            System.out.println("No");
        }
    }
}
