package RegularExpressionsREGEX.Exercise;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "^%(?<name>[A-Z][a-z]+)%(?:[^.|<>$%]+)?<(?<product>\\w+)>(?:[^.|<>$%]+)?\\|(?<count>\\d+)\\|(?:[^.|<>$%\\d]+)?(?<price>\\d+(\\.\\d+)?)\\$";
         //String regex = "(%(?<name>[A-Za-z]+)%)(<(?<product>[A-Za-z]+)>)(\\|(?<count>[0-9])\\|)((?<price>[0-9]+.?[0-9]*)\\$)";
        Pattern pattern = Pattern.compile(regex);

        double sum = 0;

        while (!"end of shift".equals(input)) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                double price = Double.parseDouble(matcher.group("price"))
                        * Integer.parseInt(matcher.group("count"));

                System.out.printf("%s: %s - %.2f%n"
                        , matcher.group("name")
                        , matcher.group("product")
                        , price);
                sum += price;

            }

            input = scanner.nextLine();
        }

        System.out.printf("Total income: %.2f", sum);
    }
}
