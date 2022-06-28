package Lab;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        area(width,length);
    }
    public static int area(int width, int length){
        int result = width * length;
        System.out.println(result);
        return result;
    }
}
