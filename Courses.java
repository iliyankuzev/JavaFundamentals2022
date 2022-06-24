package MapsLambdaAndStreamAPI.Exercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, ArrayList<String>> listMap = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while(!input.equals("end")){

            String[] data = input.split(" : ");

            String course = data[0];

            String user = data[1];


            if(listMap.containsKey(course)){
                listMap.get(course).add(user);
            } else {
                listMap.put(course, new ArrayList<>());
                listMap.get(course).add(user);
            }


            input = scanner.nextLine();
        }


        for (Map.Entry<String, ArrayList<String>> entry : listMap.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());

            for (String human: entry.getValue()) {
                System.out.printf("-- %s%n",human);
            }

        }
    }
}
