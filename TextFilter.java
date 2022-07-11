package Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();


        for (int i = 0; i < bannedWords.length; i++) {
            if (text.contains(bannedWords[i])) {
                text = text.replace(bannedWords[i], "*".repeat(bannedWords[i].length()));
            }
        }
        System.out.println(text);
    }
}
