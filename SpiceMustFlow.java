package DataTypeAndVariables;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingYield = Integer.parseInt(scanner.nextLine());

        int days = 0;
        int spice;
        int realSpice = 0;
        while (startingYield >= 100) {
            spice = startingYield;
            days += 1;
            spice -= 26;
            realSpice += spice;
            startingYield -= 10;
        }
        if (realSpice >= 26) {
            realSpice -= 26;
        }
        System.out.println(days);
        System.out.println(realSpice);

    }
}

