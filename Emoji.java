package FinalExamPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Emoji {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String digitRegex = "(?<d>[0-9]+)";
        Pattern digitPattern = Pattern.compile(digitRegex);
        Matcher digitMatcher = digitPattern.matcher(line);

        StringBuilder digits = new StringBuilder();

        while (digitMatcher.find()) {
            digits.append(digitMatcher.group("d"));
        }
//        System.out.println(digits);
        int coolThresholdSum = 1;

        for (int i = 0; i < digits.length(); i++) {
            char ch = digits.charAt(i);
            int dig = Character.getNumericValue(ch);

            coolThresholdSum *= dig;
        }
        System.out.printf("Cool threshold: %d %n", coolThresholdSum);

        String emojiRegex = "([\\:]{2}|[*]{2})(?<emoji>[A-Z][a-z]{2,})\\1";
        Pattern emojiPattern = Pattern.compile(emojiRegex);
        Matcher emojiMatcher = emojiPattern.matcher(line);

        List<String> emojis = new ArrayList<>();
        List<String> emojis1 = new ArrayList<>();

        while (emojiMatcher.find()) {


            emojis.add(emojiMatcher.group("emoji"));
            emojis1.add(emojiMatcher.group());
        }
//        System.out.println(emojis.toString());
//        System.out.println(emojis1.toString());
        System.out.printf("%d emojis found in the text. The cool ones are: %n", emojis.size());

        for (int i = 0; i < emojis.size(); i++) {
            int emojiSum = 0;
            String currentEmoji = emojis.get(i);
            String printEmoji = emojis1.get(i);
            for (int j = 0; j < currentEmoji.length(); j++) {
                int letter = currentEmoji.charAt(j);
                emojiSum += letter;

            }
            if (emojiSum > coolThresholdSum) {
                System.out.println(printEmoji);
            }
        }
    }
}
