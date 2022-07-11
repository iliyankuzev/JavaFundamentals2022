package FinalExamPrep;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "([@]+|[#]+)(?<color>[a-z]{3,})([@]+|[#]+)[\\W]+[\\/]+(?<amount>[\\d]+)[\\/]+";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(scanner.nextLine());
        List<Second.Easter> eggsList = new LinkedList<>();
        while (matcher.find()) {
            String color = matcher.group("color");

            int eggs = Integer.parseInt(matcher.group("amount"));

            Second.Easter easter = new Second.Easter(color, eggs);
            eggsList.add(easter);
        }
        int days = eggsList.stream().mapToInt(Second.Easter::getEggs).sum();
        //System.out.printf("You have food to last you for: %d days!%n", days);
        eggsList.forEach(System.out::println);
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
            return String.format("You found %d %s eggs!%n", this.eggs, this.color);
        }
    }
}

