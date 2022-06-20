package Arrays.Lab;

import java.util.Scanner;

public class ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split(" ");

        for (int i = 0; i < strings.length; i++) {
        }
        for (int i = strings.length - 1; i >= 0; i--) {
            System.out.print(strings[i] + " ");

        }
    }
}
