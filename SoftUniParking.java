package MapsLambdaAndStreamAPI.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> carsMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {

            String[] data = scanner.nextLine().split("\\s+");
            String command = data[0];
            String name = data[1];

            switch (command) {

                case "register":
                    String plateNumber = data[2];
                    if (!carsMap.containsKey(name)) {
                        carsMap.put(name, plateNumber);
                        System.out.printf("%s registered %s successfully%n", name, plateNumber);
                    }else{
                        System.out.printf("ERROR: already registered with plate number %s%n", plateNumber);
                    }
                    break;
                case "unregister":
                    if(carsMap.containsKey(name)){
                        carsMap.remove(name);
                        System.out.printf("%s unregistered successfully%n", name);
                    }else{
                        System.out.printf("ERROR: user %s not found%n",name);
                    }
                    break;
            }


        }

        for (Map.Entry<String, String> entry : carsMap.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }

    }
}
