package Exercise;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        printFactorialDivision(firstNum, secondNum);
    }

    public static void printFactorialDivision(int firstNum, int secondNum) {

        double factorialFirstNum = 1;
        double factorialSecondNum = 1;
        for (int i = 1; i <= firstNum; i++) {
            factorialFirstNum *= i;
        }
        for (int i = 1; i <= secondNum; i++) {
            factorialSecondNum *= i;
        }
        double divide = factorialFirstNum / factorialSecondNum;
        System.out.printf("%.2f", divide);
    }
}
