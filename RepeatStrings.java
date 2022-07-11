package Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");
        List<String> repeatedList = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            for (int j = 0; j < currentWord.length(); j++) {
                repeatedList.add(words[i]);

            }
        }
        System.out.println(String.join("", repeatedList));
    }
}
