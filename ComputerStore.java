package MidExamPrep;

import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = (scanner.nextLine());

        double totalPriceWithoutTaxes = 0;
        double taxes = 0;
        double totalPriceWithTaxes = 0;

        while (!"regular".equals(input)) {

            if ("special".equals(input)) {
                totalPriceWithTaxes *= 0.9;
                break;
            }
            double price = Double.parseDouble(input);
            if (price < 0) {
                System.out.println("Invalid price!");

            } else {
                totalPriceWithoutTaxes += price;
                taxes += (price * 1.2) - price;
                totalPriceWithTaxes = totalPriceWithoutTaxes + taxes;
            }

            input = scanner.nextLine();

        }
        if (totalPriceWithoutTaxes == 0) {
            System.out.println("Invalid order!");
        }else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", totalPriceWithoutTaxes);
            System.out.printf("Taxes: %.2f$%n", taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", totalPriceWithTaxes);
        }
    }
}
