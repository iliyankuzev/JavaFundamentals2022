package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int givenNumber = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (givenNumber == input[i] + input[j]) {
                        System.out.print(input[i] + " " + input[j]);
                    System.out.println();
                        break;

                }
            }
        }
    }
}
