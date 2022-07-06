package RegularExpressionsREGEX.Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//String regex = "^%(?<name>[A-Z][a-z]+)%(?:[^.|<>$%]+)?<(?<product>\\w+)>(?:[^.|<>$%]+)?\\|(?<count>\\d+)\\|(?:[^.|<>$%\\d]+)?(?<price>\\d+(\\.\\d+)?)\\$$";
        List<String> racers = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());
        Map<String, Integer> racersDistance = new LinkedHashMap<>();
        racers.forEach(racer -> racersDistance.put(racer, 0));
        //регекс за името
        String regexName = "[A-Za-z]+";
        Pattern patternName = Pattern.compile(regexName);
        //регекс за цифрите
        String regexDigit = "[0-9]";
        Pattern patternDigit = Pattern.compile(regexDigit);

        String input = scanner.nextLine();

        while (!input.equals("end of race")) {

            StringBuilder nameBuilder = new StringBuilder();
            Matcher matcherName = patternName.matcher(input); // тук се съхраняват всички букви
            while (matcherName.find()) {
                nameBuilder.append(matcherName.group());
            }
            int distance = 0;
            Matcher matcherDigits = patternDigit.matcher(input);
            while (matcherDigits.find()) {
                distance += Integer.parseInt(matcherDigits.group());
            }

            String racerName = nameBuilder.toString();
            if (racersDistance.containsKey(racerName)) {
                int currentDistance = racersDistance.get(racerName);
                racersDistance.put(racerName, currentDistance + distance);
            }
            input = scanner.nextLine();
        }

        List<String> firstThreeNames = racersDistance.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());

        System.out.println("1st place: " + firstThreeNames.get(0));
        System.out.println("2nd place: " + firstThreeNames.get(1));
        System.out.println("3rd place: " + firstThreeNames.get(2));
    }
}
