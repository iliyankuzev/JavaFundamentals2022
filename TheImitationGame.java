package FinalExamPrep;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();

        String input = scanner.nextLine();

        while (!"Decode".equals(input)) {
            String[] data = input.split("\\|");
            String command = data[0];

            switch (command) {
                case "Move":
                    int numOfLetters = Integer.parseInt(data[1]);
                    stringBuilder.append(message, 0, numOfLetters);
                    message = message.substring(numOfLetters).concat(stringBuilder.toString());
                    stringBuilder.setLength(0);
                    break;
                case "Insert":
                    int index = Integer.parseInt(data[1]);
                    String value = data[2];
                    stringBuilder.append(message);
                    message = stringBuilder.insert(index, value).toString();
                    stringBuilder.setLength(0);
                    break;
                case "ChangeAll":
                    String substring = data[1];
                    String replacement = data[2];
                    if (message.contains(substring)) {
                        message = message.replace(substring, replacement);
                    }
                    break;

            }
            input = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s", message);
    }
}
