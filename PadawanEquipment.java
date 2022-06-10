package BasicSyntaxConditionalStatementsLoops.Exercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double sabresPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());
        double sabresUnits = Math.ceil(countStudents * 1.10);
        int freeBelt = countStudents / 6;


        double equipmentPrice = sabresPrice * sabresUnits + robesPrice * countStudents + beltPrice * (countStudents - freeBelt);
        if (equipmentPrice <= budget) {
            System.out.printf("The money is enough - it would cost %.2flv.", equipmentPrice);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", (equipmentPrice - budget));
        }
    }
}
