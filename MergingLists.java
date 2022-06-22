package Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstNumbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondNumbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> mergingList = new ArrayList<>();

        for (int i = 0; i < Math.min(firstNumbers.size(), secondNumbers.size()); i++) {
            mergingList.add(secondNumbers.get(i));

            if (firstNumbers.size() > secondNumbers.size()) {
                mergingList.addAll(getRemainingElements(firstNumbers, secondNumbers));
            } else if (secondNumbers.size() > firstNumbers.size()) {
                mergingList.addAll(getRemainingElements(secondNumbers, firstNumbers));
            }
        }
        System.out.println(mergingList.toString().replaceAll("[\\[\\],]", ""));
    }

    private static List<Integer> getRemainingElements(List<Integer> longerList, List<Integer> shorterList) {
        List<Integer> nums = new ArrayList<>();
        for (int i = shorterList.size(); i < longerList.size(); i++) {
            nums.add(longerList.get(i));
        }
        return nums;
    }
}