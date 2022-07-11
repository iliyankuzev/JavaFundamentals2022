package FinalExamPrep;

import java.util.Scanner;

public class PasswordReset2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stops = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Travel")) {
            String[] data = command.split(":");
            String commandName = data[0];
            switch (commandName) {
                case "Add Stop":
                    int index = Integer.parseInt(data[1]);
                    String stopName = data[2];
                    //метод с който проверяваме дали индекса ни е валиден
                    if (isValidIndex(index, stops)) {
                        //със събстринг взимаме първата част на стрига
                        String firstPart = stops.substring(0, index);
                        //със събстринг взимаме втората част на стрига
                        String secondPart = stops.substring(index);
                        //конкатенираме новия стринг
                        stops = firstPart + stopName + secondPart;
                    }
                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(data[1]);
                    int endIndex = Integer.parseInt(data[2]);
                    if (isValidIndex(startIndex, stops) && isValidIndex(endIndex, stops)) {
                        String firstPart = stops.substring(0, startIndex);
                        String secondPart = stops.substring(endIndex + 1);
                        stops = firstPart + secondPart;
                    }
                    break;
                case "Switch":
                    String oldStop = data[1];
                    String newStop = data[2];

                    if(stops.contains(oldStop)){
                        stops = stops.replace(oldStop,newStop);
                    }


                    break;
            }


            System.out.println(stops);
            command = scanner.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: " + stops);

    }

    private static boolean isValidIndex(int index, String stops) {
        return index >= 0 && index < stops.length();
    }
}
