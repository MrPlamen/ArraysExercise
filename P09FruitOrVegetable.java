package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P09FruitOrVegetable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        String result = "";
        switch (userInput) {
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                result = "fruit";
                System.out.println(result);
                break;
            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                result = "vegetable";
                System.out.println(result);
                break;
            default:
                result = "unknown";
                System.out.println(result);
                break;
        }
    }
}
