package FinalExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        StringBuilder code = new StringBuilder(line);


        String command = scanner.nextLine();


        while (!command.equals("Generate")) {
            List<String> commandList = Arrays.stream(command.split(">>>+"))
                    .collect(Collectors.toList());
            if (commandList.get(0).equals("Contains")) {
                String contains = commandList.get(1);
                if (code.toString().contains(contains)) {
                    System.out.printf("%s contains %s%n", line, contains);
                } else {
                    System.out.println("Substring not found!");
                }
            }
            if (commandList.get(1).equals("Upper")) {
                int start = Integer.parseInt(commandList.get(2));
                int end = Integer.parseInt(commandList.get(3));
                String replace = (code.substring(start, end)).toUpperCase();
                code.replace(start, end, replace);
                System.out.println(code);

            }
            if (commandList.get(1).equals("Lower")) {
                int start = Integer.parseInt(commandList.get(2));
                int end = Integer.parseInt(commandList.get(3));
                String replace = (code.substring(start, end)).toLowerCase();
                code.replace(start, end, replace);
                System.out.println(code);

            }
            if (commandList.get(0).equals("Slice")){
                int start = Integer.parseInt(commandList.get(1));
                int end = Integer.parseInt(commandList.get(2));
                String slice = "";
                code.replace(start, end, slice);
                System.out.println(code);
            }


            command = scanner.nextLine();
        }

        System.out.printf("Your activation key is: %s",code.toString());
    }
}
