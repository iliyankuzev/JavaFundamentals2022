package FinalExamPrep;

import java.util.*;

public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        Map<String, Integer> animalsMap = new LinkedHashMap<>();
        Map<String, List<String>> areaMap = new LinkedHashMap<>();
        while (!"EndDay".equals(line)) {
            String place = "";
            List<String> nameList = new ArrayList<>();

            String[] data = line.split("[:\\s+-]+");
            String command = data[0];
            String name = data[1];
            int food = Integer.parseInt(data[2]);
            switch (command) {
                case "Add":
                    String area = data[3];
                    place=area;
                    if (!animalsMap.containsKey(name)) {
                        nameList.add(area);
                        nameList.add(name);
                        animalsMap.put(name, food);
                        areaMap.put(area, nameList);
                    } else {
                        animalsMap.put(name, animalsMap.get(name) + food);
                        areaMap.put(area, nameList);
                    }
                    break;
                case "Feed":

                    if (animalsMap.containsKey(name)) {
                        animalsMap.put(name, animalsMap.get(name) - food);
                        if (animalsMap.get(name) <= 0) {
                            System.out.printf("%s was successfully fed%n", name);
                            animalsMap.remove(name);
                            areaMap.remove(place);
                        }

                    }
                    break;
            }


            line = scanner.nextLine();
        }
        System.out.println("Animals:");
        animalsMap.entrySet().stream().forEach(entry ->
                System.out.printf(" %s -> %dg%n"
                        , entry.getKey(), entry.getValue()));
        System.out.println("Areas with hungry animals:");
        areaMap.entrySet().stream().forEach(entry ->
                System.out.printf(" %s: %d%n"
                        , entry.getKey(), entry.getValue().size()));

        ;
//        for (int i = 0; i < animalsMap.size(); i++) {
//            String name = animalsMap.
//            System.out.printf(" %s -> %dg%n", animalsMap.get());
//        }


    }
}
