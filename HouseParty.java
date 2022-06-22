package Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> namesList = new ArrayList<>();

        int command = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < command; i++) {
            String input = scanner.nextLine();
            String[] data = input.split("\\s+");
            String name = data[0];

            if(!input.contains("not")){
                if(namesList.contains(name)){
                    System.out.printf("%s is already in the list!%n", name);
                }else {
                    namesList.add(name);
                }
            }else {
                if(namesList.contains(name)){
                    namesList.remove(name);
                }else{
                    System.out.printf("%s is not in the list!%n", name);
                }
            }
        }
        namesList.forEach(System.out::println);
    }
}