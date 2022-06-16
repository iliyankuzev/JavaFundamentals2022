package DataTypeAndVariables;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePowers = Integer.parseInt(scanner.nextLine());
        int distances = Integer.parseInt(scanner.nextLine());
        int factorOfExhaustion = Integer.parseInt(scanner.nextLine());

        int nowPokePower = pokePowers;
        int targets = 0;


        while (nowPokePower >= distances) {
            nowPokePower -= distances;
            targets++;

            if (nowPokePower == pokePowers * 0.5 && factorOfExhaustion != 0) {
                nowPokePower /= factorOfExhaustion;
            }
        }
        System.out.println(nowPokePower);
        System.out.println(targets);

    }
}
