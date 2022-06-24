package MapsLambdaAndStreamAPI.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resource = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> resourceQuantityMap = new LinkedHashMap<>();

        while (!"stop".equals(resource)) {

            if (!(resourceQuantityMap.containsKey(resource))) {
                resourceQuantityMap.put(resource, quantity);

            }else{
                resourceQuantityMap.replace(resource, resourceQuantityMap.get(resource) + quantity);

            }


            resource = scanner.nextLine();
            if(!("stop".equals(resource))) {
                quantity = Integer.parseInt(scanner.nextLine());
            }
        }
        for (Map.Entry<String, Integer> entry : resourceQuantityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
