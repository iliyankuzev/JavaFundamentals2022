package Lab;

public class demo {

    static class Student {
        String name;
        int id;
        int age;

        Student(String name, int id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        void setName(String name) {
            this.name = name;
        }

        String getName() {   // това се нарича "Гетър"
            return this.name;
        }

        String getInfo() {
            return "ID: " + this.id + ", " + "age: " + this.age + ", " + "name: " + this.name;
        }
    }

    public static void main(String[] args) {

        Student a = new Student("Joro", 12345678, 30);
        a.setName("Iliyan");
        System.out.println(a.getInfo());

        Student b = new Student("Pesho", 10101010, 25);
        System.out.println(b.getInfo());

    }
}
