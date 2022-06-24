package MidExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChatLogger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> chat = new ArrayList<>();
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] command = input.split(" ");
            if (command[0].equals("Chat")) {
                String chatToAdd = command[1];
                chat.add(chat.size(), chatToAdd);
            } else if (command[0].equals("Delete")) {
                String massage = command[1];
                if (chat.contains(massage)) {
                    chat.remove(massage);
                }
            } else if (command[0].equals("Edit")) {
                String massage = command[1];
                String updatedMassage = command[2];
                if (chat.contains(massage)) {
                    chat.add(chat.indexOf(massage), updatedMassage);
                    chat.remove(massage);
                }
            } else if (command[0].equals("Pin")) {
                String massage = command[1];
                if (chat.contains(massage)) {
                    chat.remove(massage);
                    chat.add(chat.size(), massage);
                }
            } else if (command[0].equals("Spam")) {
                for (int i = 1; i < command.length; i++) {
                    chat.add(command[i]);
                }
            }
            input = scanner.nextLine();
        }
        for (String s : chat) {
            System.out.println(s);
        }
    }
}
