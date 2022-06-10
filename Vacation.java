package BasicSyntaxConditionalStatementsLoops.Exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int persons = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String day = scanner.nextLine();
        double pricePerNight = 0;
        double totalPrice = 0;

        switch (typeOfGroup) {
            case "Students":
                switch (day) {
                    case "Friday":
                        pricePerNight = 8.45;
                        break;
                    case "Saturday":
                        pricePerNight = 9.80;
                        break;
                    case "Sunday":
                        pricePerNight = 10.46;
                        break;
                }
                break;
            case "Business":
                switch (day) {
                    case "Friday":
                        pricePerNight = 10.90;
                        break;
                    case "Saturday":
                        pricePerNight = 15.60;
                        break;
                    case "Sunday":
                        pricePerNight = 16.00;
                        break;
                }
                break;
            case "Regular":
                switch (day) {
                    case "Friday":
                        pricePerNight = 15.00;
                        break;
                    case "Saturday":
                        pricePerNight = 20.00;
                        break;
                    case "Sunday":
                        pricePerNight = 22.50;
                        break;
                }
                break;
        }
        if ("Students".equals(typeOfGroup)) {
            if (persons >= 30) {
                totalPrice = persons * pricePerNight * 0.85;
            } else {
                totalPrice = persons * pricePerNight;
            }
        } else if ("Business".equals(typeOfGroup)) {
            if (persons >= 100) {
                totalPrice = (persons - 10) * pricePerNight;
            } else {
                totalPrice = persons * pricePerNight;
            }
        } else if ("Regular".equals(typeOfGroup)) {
            if (10 <= persons && persons <= 20) {
                totalPrice = persons * pricePerNight * 0.95;
            } else {
                totalPrice = persons * pricePerNight;
            }
        }
        System.out.printf("Total price: %.2f",totalPrice);
    }
}
