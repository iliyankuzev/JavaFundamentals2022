package Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> arraysOfStrings = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        Collections.reverse(arraysOfStrings);

        List<String> appendedStrings = new ArrayList<>();

        for (String StringOfNumbers : arraysOfStrings) {
            if (!StringOfNumbers.trim().isEmpty()) {
                List<String> arrayOfNumbers = Arrays.stream(StringOfNumbers.trim().split("\\s+")).toList();
                appendedStrings.addAll(arrayOfNumbers);
            }
        }
        appendedStrings.forEach(el -> System.out.print(el + " "));
    }
}
