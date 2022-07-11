package FinalExamPrep;

import java.util.*;

public class Pianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> piecesMap = new TreeMap<>();

        int countPieces = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < countPieces; i++) {
            String[] piecePart = scanner.nextLine().split("\\|");

            String pieceName = piecePart[0];
            String composer = piecePart[1];
            String key = piecePart[2];
            // Лист за текущата пиеса
            List<String> pieceInfo = new ArrayList<>();
            //добавяме ги първо в листа
            pieceInfo.add(composer);
            pieceInfo.add(key);
            //добавяме ги в мапа
            piecesMap.put(pieceName, pieceInfo);

        }
        String command = scanner.nextLine();
        while (!"Stop".equals(command)) {
            String[] commandParts = command.split("\\|");
            String commandName = commandParts[0];
            switch (commandName) {
                case "Add":
                    String newPieceName = commandParts[1];
                    String composer = commandParts[2];
                    String key = commandParts[3];

                    //ако пиесата я има
                    if (piecesMap.containsKey(newPieceName)) {
                        System.out.printf("%s is already in the collection!%n", newPieceName);

                    }// ако пиесата я няма
                    else {
                        List<String> newPieceInfo = new ArrayList<>();
                        newPieceInfo.add(composer);
                        newPieceInfo.add(key);
                        piecesMap.put(newPieceName, newPieceInfo);
                        System.out.printf("%s by %s in %s added to the collection!%n", newPieceName, composer, key);

                    }
                    break;
                case "Remove":
                    String pieceForRemove = commandParts[1];
                    //ако я има
                    if (piecesMap.containsKey(pieceForRemove)) {
                        piecesMap.remove(pieceForRemove);
                        System.out.printf("Successfully removed %s!%n", pieceForRemove);
                    }
                    //ако я няма
                    else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceForRemove);
                    }
                    break;
                case "ChangeKey":
                    String pieceName = commandParts[1];
                    String newKey = commandParts[2];
                    // ако нямаме такава пиеса
                    if (!piecesMap.containsKey(pieceName)) {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceName);
                    }
                    //ако имаме такава пиеса
                    else {
                        List<String> currentPiesInfo = piecesMap.get(pieceName);
                        currentPiesInfo.remove(1);
                        currentPiesInfo.add(newKey);
                        piecesMap.put(pieceName, currentPiesInfo);
                        System.out.printf("Changed the key of %s to %s!%n", pieceName, newKey);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        piecesMap.entrySet().stream().sorted((e1, e2)-> {
            if(e1.getKey().compareTo(e2.getKey())==0){
                return e1.getValue().get(0).compareTo(e2.getValue().get(0));
            }
            return e1.getKey().compareTo(e2.getKey());
                })
                .forEach(entry -> System.out.printf("%s -> Composer: %s, Key: %s%n",entry.getKey(),entry.getValue().get(0),entry.getValue().get(1)));
    }
}
