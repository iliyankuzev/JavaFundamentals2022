package DataTypeAndVariables;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int sum = 0;
        int num = Integer.parseInt(input);

        for (int i = 0; i < input.length(); i++) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }
}
