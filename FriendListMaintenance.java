package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FriendListMaintenance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> friendList = Arrays.stream(scanner.nextLine().split(",\\s+")).collect(Collectors.toList());
        String input = scanner.nextLine();
        int countBlacklisted = 0;
        int countLost = 0;

        while (!input.equals("Report")) {
            String [] commandString = input.split("\\s+");
            String command = commandString[0];

            switch (command) {
                case "Blacklist":
                    if (friendList.contains(commandString[1])) {
                        friendList.set(friendList.indexOf(commandString[1]), "Blacklisted");
                        System.out.printf("%s was blacklisted.%n", commandString[1]);
                        countBlacklisted ++;
                    } else {
                        System.out.printf("%s was not found.%n", commandString[1]);
                    }
                    break;
                case "Error":
                    int index = Integer.parseInt(commandString[1]);
                    if (index >= 0 && index <= friendList.size()-1) {
                        String username = friendList.get(index);
                        if (!username.contains("Blacklisted") && !username.equals("Lost")) {
                            friendList.set(index, "Lost");
                            System.out.printf("%s was lost due to an error.%n", username);
                            countLost++;
                        }
                    }
                    break;
                case "Change":
                    index = Integer.parseInt(commandString[1]);
                    String newName = commandString[2];
                    if (index >= 0 && index <= friendList.size()-1) {
                        String nameHolder = friendList.get(index);
                        friendList.set(index, newName);
                        System.out.printf("%s changed his username to %s.%n", nameHolder, newName);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Blacklisted names: %s%n", countBlacklisted);
        System.out.printf("Lost names: %s%n", countLost);
        friendList.forEach(friend -> System.out.print(friend + " "));
    }
}
