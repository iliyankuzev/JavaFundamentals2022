package MapsLambdaAndStreamAPI.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class CountCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> textList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        Map<String, Integer> countCharsMap = new LinkedHashMap<>();

        for (int i = 0; i < textList.size(); i++) {
            String word = textList.get(i);
            for (int j = 0; j < word.length(); j++) {
                char symbol = word.charAt(j);

                if (countCharsMap.containsKey(String.valueOf(symbol))) {

                    countCharsMap.replace(String.valueOf(symbol), countCharsMap.get(String.valueOf(symbol)) +1);
                } else {
                    countCharsMap.put(String.valueOf(symbol), 1);
                }
            }
        }

        for (Map.Entry<String, Integer> entry : countCharsMap.entrySet()) {
            System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
        }
    }
}
