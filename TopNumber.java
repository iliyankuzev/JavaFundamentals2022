package Exercise;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        PrintTopNumbersUpTo(number);
    }

    private static void PrintTopNumbersUpTo(int number) {
        for (int i = 1; i <= number; i++) {
            if (IsDigitSumDivisibleBy8(i) && HasOddDigit(i))
                System.out.println(i);
            ;
        }
    }

    private static boolean HasOddDigit(int number) {
        while (number > 0) {
            if ((number % 10) % 2 == 1)
                return true;
            number /= 10;
        }

        return false;
    }

    private static boolean IsDigitSumDivisibleBy8(int number) {
        int digitSum = 0;
        while (number > 0) {
            digitSum += number % 10;
            number /= 10;
        }

        if (digitSum % 8 == 0)
            return true;

        return false;
    }
}

