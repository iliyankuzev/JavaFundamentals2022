package Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());


        // този тип принтиране е посочено в условието на задачата
        System.out.println(new DecimalFormat("0.####").format(mathPower(number, power)));

    }
    public static double mathPower(double number, int power){
        double result;
        result = Math.pow(number,power);
        return result;
    }
}
