package DataTypeAndVariables;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double N = Integer.parseInt(scanner.nextLine());
        double P = Integer.parseInt(scanner.nextLine());

        int courses = (int) Math.ceil(N / P);
        System.out.println(courses);
    }
}
