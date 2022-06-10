package BasicSyntaxConditionalStatementsLoops.Exercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String input = scanner.nextLine();
        double sum = 0;
        while (!"Start".equals(input)) {
            double coins = Double.parseDouble(input);
            if (coins == 0.1) {
                sum += coins;
            } else if (coins == 0.2) {
                sum += coins;
            } else if (coins == 0.5) {
                sum += coins;
            } else if (coins == 1) {
                sum += coins;
            } else if (coins == 2) {
                sum += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }
            input = scanner.nextLine();
        }

        String product = scanner.nextLine();
        double price = 0;
        boolean isProduct = false;

        while (!"End".equals(product)){
            switch (product){
                case "Nuts":
                    price = 2.0;
                    isProduct = true;
                    break;
                case "Water":
                    price = 0.7;
                    isProduct = true;
                    break;
                case "Crisps":
                    price = 1.5;
                    isProduct = true;
                    break;
                case "Soda":
                    price = 0.8;
                    isProduct = true;
                    break;
                case "Coke":
                    price = 1.0;
                    isProduct = true;
                    break;
            }
            if (sum<price){
                System.out.println("Sorry, not enough money");
            }else if (isProduct){
                System.out.printf("Purchased %s%n", product);
                sum -= price;
            }else {
                System.out.println("Invalid product");
            }

            product = scanner.nextLine();
        }

        System.out.printf("Change: %.2f", sum);
    }
}
