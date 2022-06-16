package DataTypeAndVariables;

import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        int num1 = 0;
        for (int i = 1; i <= N; i++) {
            String input = scanner.nextLine();

            String number1 = String.valueOf(input.length());
            if (input.length() <= 4) {
                System.out.println(input);

            }
        }
    }
}
