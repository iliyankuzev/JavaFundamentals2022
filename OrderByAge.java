package Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<People> person = new ArrayList<>();
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] data = input.split("\\s+");
            People people = new People(data[0], data[1], Integer.parseInt(data[2]));
            person.add(people);
            input = scanner.nextLine();
        }
        person.stream()
                .sorted((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()))
                .forEach(people -> System.out.println(people.toString()));
    }

    static class People {
        String name;
        String id;
        int age;

        public People(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return String.format("%s with ID: %s is %d years old.", this.name, this.id, this.age);
        }
    }
}
