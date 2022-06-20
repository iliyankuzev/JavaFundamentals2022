package Arrays.Exercise;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");

        for (int i = 0; i < secondArray.length; i++) {
            String secondElement = secondArray[i];
            for (int j = 0; j < firstArray.length; j++) {
                String firstElement = firstArray[j];
                if (firstElement.equals(secondElement)) {
                    System.out.print(firstElement + " ");
                }
            }
        }
    }
}
