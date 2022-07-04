package Lab;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        Random rnd = new Random();

        for (int i = 0; i < input.length; i++) {
            int randomIndex1 = rnd.nextInt(input.length);
            int randomIndex2 = rnd.nextInt(input.length);

            String oldInputPosition = input[randomIndex1];
            input[randomIndex1]=input[randomIndex2];
            input[randomIndex2] = oldInputPosition;
        }
        System.out.println(String.join(System.lineSeparator(),input));
    }
}