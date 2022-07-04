package Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students2 {

    // Клас
    public static class Student {

        //Полета
        private String firstName;
        private String lastName;
        private int age;
        private String city;

        public Student() {

        }


        // Гетъри и Сетъри
        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }


        //Конструктор
        public Student(String firstName, String lastName, int age, String city) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.city = city;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        String line = scanner.nextLine();

        while (!"end".equals(line)) {
            String[] data = line.split("\\s+");

            String firstname = data[0];
            String lastName = data[1];
            int age = Integer.parseInt(data[2]);
            String city = data[3];

            Student student = new Student(firstname, lastName, age, city);

            if (IsStudentExisting(students, firstname, lastName)) {
                student = getStudent(students, firstname, lastName);
            }else {
                student = new Student(firstname, lastName, age, city);
                students.add(student);
            }
            student = students.stream()
                    .filter(s -> s.getFirstName().equals(firstname) && s.getLastName().equals(lastName))
                    .findFirst().orElse(null);
            if(student==null){
                Student studentToAdd = new Student();
                studentToAdd.setFirstName(firstname);
                studentToAdd.setLastName(lastName);
                studentToAdd.setAge(age);
                studentToAdd.setCity(city);
                students.add(studentToAdd);
            }else{
                student.setFirstName(firstname);
                student.setLastName(lastName);
                student.setAge(age);
                student.setCity(city);
            }
            line = scanner.nextLine();
        }
        line = scanner.nextLine();
        for (Student student:students) {

            if(student.getCity().equals(line)){
                System.out.printf("%s %s is %d years old%n",student.getFirstName()
                        ,student.getLastName(),student.getAge(),student.getCity());
            }
        }
    }

    private static Student getStudent(List<Student> students, String firstname, String lastName) {
        Student existingStudent = null;

        for (Student student : students) {
            if (student.getFirstName().equals(firstname) && student.getLastName().equals(lastName)) {
                existingStudent = student;
            }

        }
        return existingStudent;
    }

    private static boolean IsStudentExisting(List<Student> students, String firstName, String LastName) {
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(student.lastName)) {
                return true;
            }
        }
        return false;
    }
}
