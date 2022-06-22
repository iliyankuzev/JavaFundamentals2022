package Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> givenNumbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] commands = input.split("\\s+");


            if ("Add".contains(commands[0])) {
                givenNumbers.add(commands[1]);

            } else if ("Insert".contains(commands[0])) {

                if (Integer.parseInt(commands[2]) < 0 || Integer.parseInt(commands[2]) >= givenNumbers.size()) {
                    System.out.println("Invalid index");
                } else {
                    givenNumbers.add(Integer.parseInt(commands[2]), (commands[1]));
                }

            } else if ("Remove".contains(commands[0])) {

                if (Integer.parseInt(commands[1]) < 0 || Integer.parseInt(commands[1]) >= givenNumbers.size()) {
                    System.out.println("Invalid index");
                } else {
                    givenNumbers.remove(Integer.parseInt(commands[1]));
                }

            } else if ("Shift".contains(commands[0])) {

                if ("left".contains(commands[1])) {

                    for (int i = 0; i < Integer.parseInt(commands[2]); i++) {
                        givenNumbers.add(givenNumbers.get(0));
                        givenNumbers.remove(0);
                    }

                } else {
                    for (int i = 0; i < Integer.parseInt(commands[2]); i++) {
                        givenNumbers.add(0, givenNumbers.get(givenNumbers.size() - 1));
                        givenNumbers.remove(givenNumbers.size() - 1);
                    }

                }
            }
            input = scanner.nextLine();
        }
        givenNumbers.forEach(el -> System.out.print(el + " "));
    }
}
