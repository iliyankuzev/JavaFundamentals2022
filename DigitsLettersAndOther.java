package Lab;

import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder letters = new StringBuilder();
        StringBuilder specialSymbol = new StringBuilder();
        StringBuilder digits = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);

            if (Character.isDigit(symbol)) {
                digits.append(symbol);
            } else if (Character.isAlphabetic(symbol)) {
                letters.append(symbol);
            } else {
                specialSymbol.append(symbol);
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(specialSymbol);
    }
}
