package DataTypeAndVariables;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double maxKeg = 0;
        String maxModel = "";

        for (int i = 0; i < n; i++) {

            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double currentKeg = Math.PI * radius * radius * height;

            if (currentKeg > maxKeg){
                maxKeg = currentKeg;
                maxModel = model;
            }

        }
        System.out.println(maxModel);
    }
}
