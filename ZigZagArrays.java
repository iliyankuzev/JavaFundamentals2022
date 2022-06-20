package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = parseInt(scanner.nextLine());

        int[] firstArr = new int[n];
        int[] secondArr = new int[n];

        for (int i = 1; i <= n; i++) {
            int[] input = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(e -> Integer.parseInt(e))
                    .toArray();
            if (i % 2 == 0) {
                firstArr[i - 1] = input[0];
                secondArr[i - 1] = input[1];

            } else {
                firstArr[i - 1] = input[1];
                secondArr[i - 1] = input[0];

            }
        }
        for (int i = 0; i < secondArr.length; i++) {
            System.out.print(secondArr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < firstArr.length; i++) {
            System.out.print(firstArr[i] + " ");
        }
    }
}
