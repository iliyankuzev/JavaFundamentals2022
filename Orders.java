package Lab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String order = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        double price; // price = 0;
        if (order.equals("coffee")) {
            price = 1.50;
            printResult(quantity, price);
        } else if (order.equals("water")) {
            price = 1.00;
            printResult(quantity, price);
        } else if (order.equals("coke")) {
            price = 1.40;
            printResult(quantity, price);
        } else if (order.equals("snacks")) {
            price = 2.00;
            printResult(quantity, price); {

            }
        }
    }

    public static void printResult(int quantity, double price){
        System.out.printf("%.2f",quantity * price);
    }
}
