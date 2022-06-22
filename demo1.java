package Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String newInput = input.replaceAll("\\s+", "");

        int[] array = Arrays.stream(newInput.split("\\|+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String newString = "";
        String lastResult = "";

        for (int i = array.length - 1; i >= 0; i--) {
            newString += array[i];
        }
        for (int i = 0; i < newString.length(); i++) {
            lastResult += newString.charAt(i) + " ";
        }
        System.out.println(newString);
        System.out.println(lastResult);
    }
}

