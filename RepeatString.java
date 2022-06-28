package Lab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        repeatString(word, n);
    }
    private static String repeatString(String word, int n){
        String result = "";
        for (int i = 0; i < n; i++) {
            result += word;
        }
        System.out.println(result);
        return result;
    }
}
