package BasicSyntaxConditionalStatementsLoops.Exercise;

import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        String bounder = "";
        if (0 <= age && age <= 2) {
            bounder = "baby";
        } else if (3 <= age && age <= 13) {
            bounder = "child";
        } else if (14 <= age && age <= 19) {
            bounder = "teenager";
        } else if (20 <= age && age <= 65) {
            bounder = "adult";
        } else if (age >= 66) {
            bounder = "elder";
        }
        System.out.println(bounder);
    }
}
