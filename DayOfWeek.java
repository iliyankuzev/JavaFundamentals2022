package Arrays.Lab;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for (int i = 0; i < weekDays.length; i++) {
            if(input < 1 || input > 7 ){
                System.out.println("Invalid day!");
                break;
            }
                System.out.println(weekDays[input-1]);
                break;
        }
    }
}
