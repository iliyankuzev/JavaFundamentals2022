package DataTypeAndVariables;

import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int divideNum = Integer.parseInt(scanner.nextLine());
        int multiplyNum = Integer.parseInt(scanner.nextLine());

        int result = (num1 + num2) / divideNum * multiplyNum;
        System.out.println(result);
    }
}
