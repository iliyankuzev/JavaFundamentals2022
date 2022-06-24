package MidExam;

import java.util.Scanner;

public class TheHuntingGames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int days = Integer.parseInt(scanner.nextLine());
        int theNumberOfPlayers = Integer.parseInt(scanner.nextLine());
        double theGroupsEnergy = Double.parseDouble(scanner.nextLine());
        double waterForOnePerson = Double.parseDouble(scanner.nextLine());
        double foodForOnePerson = Double.parseDouble(scanner.nextLine());

        double sumForWater = days * theNumberOfPlayers *waterForOnePerson;
        double sumForFood = foodForOnePerson * days * theNumberOfPlayers;


        for (int i = 1; i <= days; i++) {
            double theAmountOfEnergyLoss = Double.parseDouble(scanner.nextLine());
            theGroupsEnergy -=theAmountOfEnergyLoss;
            if(theGroupsEnergy<=0){
                break;
            }
            if(i % 3 == 0) {
                double sumForFoodsum = sumForFood / theNumberOfPlayers;
                sumForFood = sumForFood - sumForFoodsum;
                theGroupsEnergy += theGroupsEnergy * 0.10;
            } if(i % 2 == 0) {
                theGroupsEnergy += theGroupsEnergy * 0.05;
                sumForWater -= sumForWater * 0.3;

            }
        }
        if(theGroupsEnergy > 0){
            System.out.printf("You are ready for the quest. You will be left with - %.2f energy!", theGroupsEnergy);
        }else{
            System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.", sumForFood, sumForWater);
        }
    }
}
