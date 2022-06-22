package Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!"end".equals(command)) {

            String[] commands = command.split(" ");
            if (commands[0].equals("Delete")) {
                int element = Integer.parseInt(commands[1]);
                for (int i = 0; i < numbers.size(); i++) {
                    if (element == numbers.get(i)) {
                        numbers.remove(i);
                        i--;
                    }
                }
            } else if (commands[0].equals("Insert")) {
                int element = Integer.parseInt(commands[1]);
                int index = Integer.parseInt(commands[2]);
                numbers.add(index, element);


            }
            command = scanner.nextLine();
        }

        numbers.forEach(el -> System.out.print(el + " "));
    }
}


