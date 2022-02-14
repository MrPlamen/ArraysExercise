package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P10InvalidNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double userInput = Double.parseDouble(sc.nextLine());
        if ((userInput >= 100 && userInput <=200) || userInput == 0) {
            System.out.println("");
        } else {
            System.out.println("invalid");
        }
    }
}
