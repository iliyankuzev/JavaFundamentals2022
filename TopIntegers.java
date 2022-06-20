package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int[] numbers = Arrays.stream(input.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int bigNumber = 0;

        for (int i = 0; i < numbers.length; i++) {
            boolean isBigger = false;

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] > numbers[j]) {
                    bigNumber = numbers[i];
                    isBigger = true;

                } else {
                    isBigger = false;
                    break;
                }
            }
            if (isBigger && bigNumber != 0) {
                System.out.print(bigNumber + " ");
            }
        }
        System.out.print(numbers[numbers.length-1]);
    }
}
