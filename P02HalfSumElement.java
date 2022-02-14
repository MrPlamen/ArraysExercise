package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P02HalfSumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int sum = 0;
        int max = Integer.MIN_VALUE;

        int i = 0;
        for (i = 1; i <= n; i++) {
            int userInput = Integer.parseInt(sc.nextLine());
            if (userInput > max) {
                max = userInput;
            }
            sum = sum+userInput;
        }
        if ((sum-max) == max) {
            System.out.printf("Yes%nSum = %d", max);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(max-(sum-max)));
        }
    }
}
