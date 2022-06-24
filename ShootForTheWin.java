package MidExamPrep;

import java.util.Arrays;
import java.util.Scanner;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] targets = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        String lines = scanner.nextLine();

        int totalShot = 0;
        while (!"End".equals(lines)) {
            int index = Integer.parseInt(lines);
            if (index >= 0 && index < targets.length) {
                int shotTarget = targets[index];
                if (shotTarget != -1) {
                    totalShot++;
                    targets[index] = -1;
                    for (int i = 0; i < targets.length; i++) {
                        if(targets[i] != -1) {
                            if (targets[i] > shotTarget) {
                                targets[i] -= shotTarget;
                            } else {
                                targets[i] += shotTarget;
                            }
                        }
                    }
                }
            }

            lines = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ", totalShot);
        for (int i = 0; i < targets.length; i++) {
            System.out.print(targets[i] + " ");
        }
    }
}


