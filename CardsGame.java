package Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayer = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondPlayer = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());


        int sum = 0;
        // замених for с while и се получи
        while (0 < firstPlayer.size()) {

            if (Objects.equals(firstPlayer.get(0), secondPlayer.get(0))) {
                firstPlayer.remove(0);
                secondPlayer.remove(0);

            } else if (firstPlayer.get(0) > secondPlayer.get(0)) {
                firstPlayer.add(firstPlayer.get(0));
                firstPlayer.add(secondPlayer.get(0));
                firstPlayer.remove(0);
                secondPlayer.remove(0);

            } else if (secondPlayer.get(0) > firstPlayer.get(0)) {
                secondPlayer.add(secondPlayer.get(0));
                secondPlayer.add(firstPlayer.get(0));
                secondPlayer.remove(0);
                firstPlayer.remove(0);
            }
            if (firstPlayer.size() == 0) {
                for (int j = 0; j < secondPlayer.size(); j++) {
                    sum += secondPlayer.get(j);
                }
                System.out.printf("Second player wins! Sum: %d", sum);
                break;
            } else if (secondPlayer.size() == 0) {
                for (int j = 0; j < firstPlayer.size(); j++) {
                    sum += firstPlayer.get(j);
                }
                System.out.printf("First player wins! Sum: %d", sum);
                break;
            }
            firstPlayer.size();
        }
    }
}
