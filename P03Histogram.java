package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P03Histogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = Integer.parseInt(sc.nextLine());
        double counter200 = 0;
        double counter400 = 0;
        double counter600 = 0;
        double counter800 = 0;
        double counter1000 = 0;

        for (int i=1; i<=n; i++) {
            double currentNum = Integer.parseInt(sc.nextLine());
            if (currentNum<200) {
                counter200 += 1;
            } if (currentNum<400 && currentNum>199) {
                counter400 += 1;
            } if (currentNum>399 && currentNum<600) {
                counter600 += 1;
            } if (currentNum>599 && currentNum<800) {
                counter800 += 1;
            } if (currentNum>799) {
                counter1000 +=1;
            }
        }
        double p1 = (counter200/n)*100;
        double p2 = (counter400/n)*100;
        double p3 = (counter600/n)*100;
        double p4 = (counter800/n)*100;
        double p5 = (counter1000/n)*100;
        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n", p1, p2, p3, p4, p5);
    }
}
