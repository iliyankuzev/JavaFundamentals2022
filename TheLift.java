package MidExamPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tourists = Integer.parseInt(scanner.nextLine());
        int[] wagons = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int maxCapacity = 4;
        int touristCount = 0;
        for (int i = 0; i < wagons.length; i++) {

            for (int j = 1; j < tourists; j++) {
                if (wagons[i] < maxCapacity) {
                    wagons[i] += 1;
                } else {
                    break;
                }
                touristCount++;
                if(tourists == touristCount){
                    break;
                }
            }
        }

        if (tourists == touristCount) {
            System.out.println("The lift has empty spots!");
        } else if (tourists - touristCount > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", tourists - touristCount);
        }

        for (int i = 0; i < wagons.length; i++) {
            System.out.print(wagons[i] + " ");
        }
    }
}
