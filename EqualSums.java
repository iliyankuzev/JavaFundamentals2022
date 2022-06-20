package Arrays.Exercise;

import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int possition = 0;
        boolean isFound = false;
        boolean isZero;
        if (input.length < 2) {
            isZero = true;
        } else {
            isZero = false;
        }
        for (int i = 1; i < input.length - 1; i++) {
            int leftsum = 0;
            int rightsum = 0;
            int current = 0;
            current = Integer.parseInt(input[i]);
            for (int l = i - 1; l >= 0; l--) {
                leftsum += Integer.parseInt(input[l]);
            }
            for (int r = i + 1; r < input.length; r++) {
                rightsum+= Integer.parseInt(input[r]);
            }
            if (leftsum == rightsum) {
                possition = i;
                isFound = true;
            }
        }
        if (isZero) {
            System.out.println("0");
        } else {
            if (isFound) {
                System.out.println(possition);
            } else {
                System.out.println("no");
            }
        }
    }
}
