package Exercise;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scanner.nextLine());
        for (int i = 0; i < sb.length()-1; i++) {
            char currentSymbol = sb.charAt(i);
            char nextSymbol = sb.charAt(i+1);
            if(currentSymbol == nextSymbol){
                sb.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(sb);
    }
}
