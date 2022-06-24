package MapsLambdaAndStreamAPI.Exercise;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countStudents = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentGradesMap = new LinkedHashMap<>();

        for (int i = 0; i < countStudents; i++) {
            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!studentGradesMap.containsKey(studentName)) {
                studentGradesMap.put(studentName, new ArrayList<>());

            }
                studentGradesMap.get(studentName).add(grade);

        }

        Map<String, Double> averageGradeMap = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : studentGradesMap.entrySet()) {

            String studentName = entry.getKey();
            List<Double> gradesList = entry.getValue();
            double averageGrades = 0;
            double sumGrades =0;
            for (double grade : gradesList) {
                sumGrades += grade;
            }
            averageGrades = sumGrades / gradesList.size();

            if (averageGrades >= 4.50) {
                averageGradeMap.put(studentName, averageGrades);
            }
        }

        averageGradeMap.entrySet().stream()
                .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));
    }
}

