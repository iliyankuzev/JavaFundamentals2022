package FinalExamPrep;

import java.util.Locale;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String input = scanner.nextLine();

        while (!"Finish".equals(input)) {
            String[] data = input.split(" ");
            String command = data[0];
            switch (command) {
                case "Replace":
                    String currentChar = data[1];
                    String newChar = data[2];
                    word = word.replace(currentChar, newChar);
                    System.out.println(word);

                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(data[1]);
                    int endIndex = Integer.parseInt(data[2]);
                    if (isValidIndex(startIndex, word) && isValidIndex(endIndex, word)) {
                        String firstPart = word.substring(0, startIndex);
                        String secondPart = word.substring(endIndex + 1);
                        word = firstPart + secondPart;
                        System.out.println(word);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;
                case "Make":
                    String massage = data[1];
                    if (massage.equals("Upper")) {
                        word = word.toUpperCase();

                    } else {
                        word = word.toLowerCase();
                    }
                    System.out.println(word);
                    break;
                case "Check":
                    String massageCheck = data[1];
                    if (word.contains(massageCheck)) {
                        System.out.printf("Message contains %s%n", massageCheck);
                    } else {
                        System.out.printf("Message doesn't contain %s%n", massageCheck);
                    }
                    break;
                case "Sum":

                    int startIndex1 = Integer.parseInt(data[1]);
                    int endIndex1 = Integer.parseInt(data[2]);
                    if (isValidIndex(startIndex1, word) && isValidIndex(endIndex1, word)) {
                        String newString = word.substring(startIndex1, endIndex1 + 1);

                        int sum = 0;
                        for (int i = 0; i < newString.length(); i++) {
                            char digit = newString.charAt(i);
                            sum += digit;
                        }
                        System.out.println(sum);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;
            }


            input = scanner.nextLine();
        }

    }

    private static boolean isValidIndex(int index, String word) {
        return index >= 0 && index < word.length();
    }
}
