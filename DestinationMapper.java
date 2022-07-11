package FinalExamPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<String> country = new ArrayList<>();
        int travelPoints = 0;

        String regex = "([=/])(?<destination>[A-Z][A-Za-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            String destination = matcher.group("destination");
            country.add(destination);
            travelPoints += destination.length();
        }
        System.out.println("Destinations: " + String.join(", ", country));
        System.out.println("Travel Points: " + travelPoints);
    }
}
