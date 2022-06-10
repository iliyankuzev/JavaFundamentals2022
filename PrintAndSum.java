package BasicSyntaxConditionalStatementsLoops.Exercise;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();

        int sum = 0;
        for (int i = firstNum; i <= secondNum; i++) {
            System.out.printf("%d ",i);
            sum += i;

        }
        System.out.printf("%nSum: %d",sum);
    }
}
