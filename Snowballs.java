package DataTypeAndVariables;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double maxSnowballValue = 0;
        double maxSnowballSnow = 0;
        double maxSnowballTime = 0;
        double maxSnowballQuality = 0;

        for (int i = 0; i < n; i++) {

            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            double currentSnowballValue = Math.pow((snowballSnow / snowballTime), snowballQuality);

            if (currentSnowballValue > maxSnowballValue) {
                maxSnowballValue = currentSnowballValue;
                maxSnowballSnow = snowballSnow;
                maxSnowballTime = snowballTime;
                maxSnowballQuality = snowballQuality;

            }
        }
        System.out.printf("%.0f : %.0f = %.0f (%.0f)",
                maxSnowballSnow,maxSnowballTime,maxSnowballValue,maxSnowballQuality);
    }
}
