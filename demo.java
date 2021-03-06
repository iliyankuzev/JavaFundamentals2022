package FinalExamPrep;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex ="[@#]+(?<color>[a-z]{3,})[@#]+[^\\w]{0,}\\/+(?<amount>[0-9]+)\\/+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        List<Easter> eggsList = new LinkedList<>();
        while (matcher.find()) {
            String color = matcher.group("color");

            int eggs = Integer.parseInt(matcher.group("amount"));

            Easter easter = new Easter(color, eggs);
            eggsList.add(easter);
        }
//        int days = eggsList.stream().mapToInt(Easter::getEggs).sum();
//        //System.out.printf("You have food to last you for: %d days!%n", days);
       // eggsList.forEach(System.out::println);
        for (int i = 0; i < eggsList.size(); i++) {

            System.out.println(eggsList.get(i));
        }
    }

    static class Easter {
        String color;

        int eggs;

        public Easter(String color, int eggs) {
            this.color = color;
            this.eggs = eggs;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }


        public int getEggs() {
            return eggs;
        }

        public void setEggs(int eggs) {
            this.eggs = eggs;
        }

        @Override
        public String toString() {
            return String.format("You found %d %s eggs!", this.eggs, this.color);
        }
    }
}



