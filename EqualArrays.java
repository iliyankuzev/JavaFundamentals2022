package Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int[] secondArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        boolean isEqual = false;
        for (int i = 0; i < firstArray.length; i++) {

            if (firstArray[i] == secondArray[i]) {
                sum += firstArray[i];
                isEqual = true;
            } else {
                System.out.printf("Arrays are not identical. Found difference at %s index.", i);
                isEqual = false;
                break;
            }
        }
        if (isEqual) {
            System.out.printf("Arrays are identical. Sum: %d", sum);

        }
    }
}
