package Exercise;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

       // sumOfTheFirstTwoNumbers(num1, num2);
        subtractSumAndNum3(num1, num2, num3);
    }

    private static void subtractSumAndNum3(int num1, int num2, int num3) {
        System.out.println((num1+num2)-num3);
    }

   // private static int sumOfTheFirstTwoNumbers(int num1, int num2) {
    //    return num1 + num2;
   // }
}
