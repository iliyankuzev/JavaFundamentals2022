package Exercise;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //C:\Internal\training-internal\Template.pptx
        String input = scanner.nextLine();
        String fileName = input.substring(input.lastIndexOf("\\") + 1, input.indexOf("."));
        String extension = input.substring(input.indexOf(".") + 1);

        System.out.println("File name: " + fileName);
        System.out.println("File extension: ".concat(extension));
    }
}
