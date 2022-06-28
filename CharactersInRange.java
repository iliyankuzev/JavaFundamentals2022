package Exercise;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbolStart = scanner.nextLine().charAt(0);
        char symbolEnd = scanner.nextLine().charAt(0);
        printCharRange(symbolStart, symbolEnd);
    }

    private static void printCharRange(char symbolStart, char symbolEnd) {
        if (symbolStart > symbolEnd) {
            for (int i = symbolEnd + 1; i <= symbolStart - 1; i++) {
                System.out.print(((char) i) + " ");
            }
        } else {
            for (int i = symbolStart + 1; i < symbolEnd; i++) {
                System.out.print(((char) i) + " ");
            }
        }

    }
}
