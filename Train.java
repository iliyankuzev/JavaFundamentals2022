package Arrays.Exercise;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagons = Integer.parseInt(scanner.nextLine());
        int[] train = new int[wagons];

        int allPassengers = 0;

        for (int i = 0; i <= train.length - 1; i++) {
            train[i] = Integer.parseInt(scanner.nextLine());
            allPassengers += train[i];
            System.out.print(train[i] + " ");

        }
        System.out.println();
        System.out.println(allPassengers);

    }
}
